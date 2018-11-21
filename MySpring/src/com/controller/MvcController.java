package com.controller;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Student;

@Controller
@RequestMapping("/mvc")
public class MvcController {
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("helloWord");
		return "helloWord";
	}
	@RequestMapping("/login")
	public String login(Student stu){
		System.out.println(stu.getUsername()+"\t"+stu.getPwd()+"\t"+stu.getBirthday());
		return "helloWord";
	}
	@RequestMapping("/testMap")
	public String testMap(Map<String, Object> m){
		m.put("mess", "�û��������");
		return "helloWord";
	}
	@RequestMapping("/testMav")
	public ModelAndView testMav(){
		ModelAndView model = new ModelAndView();
		//��requset���б�������
		model.addObject("stu",new Student("����","123456",new Date()));
		//������ͼ·��
		model.setViewName("helloWord");
		return model;
		
	}
	@RequestMapping("/servletApi")
	public String servletApi(HttpServletRequest req,HttpServletResponse resp){
		HttpSession session = req.getSession();
		session.setAttribute("stu", new Student("��2��2","123456",new Date()));
		ServletContext app = req.getServletContext();
		app.setAttribute("stu", new Student("��1��1","123456",new Date()));
		return "helloWord";
	}
	
//	�ļ��ϴ�����
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public String upload(HttpServletRequest req) throws IOException{
		MultipartHttpServletRequest mreq =(MultipartHttpServletRequest) req;
		MultipartFile file = mreq.getFile("file");
		//��ȡ��ͨ��Ԫ����Ϣ
		String miaoshu = mreq.getParameter("miaoshu");
		System.out.println(miaoshu);
		String fileName = file.getOriginalFilename();
		FileOutputStream fos = new FileOutputStream(req.getSession().getServletContext().getRealPath("/")+
				"upload/"+fileName);
		fos.write(file.getBytes());
		fos.flush();
		fos.close();
		return "helloWord";
		
	}
	/**
	 * ��ҳ���������͵Ĳ���
	 * @param binder
	 */
	@InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
                true));
    }
	
	
	
	
	
}













