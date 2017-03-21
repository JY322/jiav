package com.accp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accp.bean.Classes;
import com.accp.bean.Faqs;
import com.accp.bean.PageBean;
import com.accp.service.ClassesService;
import com.accp.service.FaqsService;

@Controller
@RequestMapping("/faqs")
public class FaqsController {
	
	@Autowired
	private FaqsService faqsService;
	public void setFaqsService(FaqsService faqsService) {
		this.faqsService = faqsService;
	}
	@Autowired
	private ClassesService claService;
	public void setClaService(ClassesService claService) {
		this.claService = claService;
	}


	
	@RequestMapping(value="/toAdd")
	public ModelAndView toAdd(Integer page){
		ModelAndView mv = new ModelAndView("/faqs/add");
		List<Classes>cla = this.claService.findClasses();
		mv.addObject("cla", cla);
		return mv;
	}


	
	@RequestMapping(value="/faqsfind")
	public ModelAndView faqsfind(Integer page){
		ModelAndView mv = new ModelAndView("/faqs/list");
		Integer currPage = (page==null||page<=0)?1:page;
		PageBean<Faqs> pageBean = this.faqsService.findPageFaqs(currPage);
		mv.addObject("pageBean", pageBean);
		return mv;
	}
	
	
	@RequestMapping(value="/addFaqs",method=RequestMethod.POST)
	public void addFaqs(HttpServletResponse response,Faqs faqs) throws IOException{
		PrintWriter pw = response.getWriter();
		if(faqs != null){
			this.faqsService.addFaqs(faqs);
			pw.print("<script>alert('³É¹¦');location.href='faqsfind.do'</script>");
		}else{
			pw.print("<script>alert('Ê§°Ü');location.href='toAdd.do'</script>");
		}
	}
	

	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public void delFaqsById(HttpServletResponse response,Integer id) throws IOException{
		PrintWriter pw = response.getWriter();
		if(id != null){
			this.faqsService.delFaqsById(id);
			pw.print("<script>alert('cg');location.href='faqsfind.do'</script>");
		}else{
			pw.print("<script>alert('sb');location.href='faqsfind.do'</script>");
		}
	}
}
