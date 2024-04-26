package com.green.evalBbs.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.evalBbs.dao.IEvalBbsDao;

@Controller
public class EvalBbsController {
	
	@Autowired
	private IEvalBbsDao dao;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", dao.getList());
		return "list";
	}
	
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	@RequestMapping("/write")
	public String write(@RequestParam("title") String title, @RequestParam("content") String content, @RequestParam("writer") String writer, @RequestParam("regdate") Date regdate) {
		
		dao.write(title, content, writer, regdate);
		
		return "redirect:list";
	}
	
	@RequestMapping("/detail")
	public String detail(String bno, Model model) {
		model.addAttribute("dto", dao.getDto(bno));
		return "detail";
	}
	
}
