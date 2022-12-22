package com.multi.mongoDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberServiceImpl memberService;
	
	@RequestMapping("insert2.member")
	public String insert(MemberVO vo) {
		memberService.insert(vo);
		return "redirect:mongo_member.jsp";
	}
	
	@RequestMapping("update2.member")
	public String update(String _id, String tel) {
		MemberVO vo = new MemberVO();
		vo.set_id(_id);
		vo.setTel(tel);
		memberService.update(vo);
		return "redirect:mongo_member.jsp";
	}
	
	@RequestMapping("delete2.member")
	public String delete(String _id) {
		memberService.delete(_id);
		return "redirect:mongo_member.jsp";
	}
	
	@RequestMapping("one2.member")
	public void one(String _id, Model model) {
		MemberVO vo = memberService.one(_id);
		System.out.println("하나의 document검색 결과>> " + vo);
		model.addAttribute("vo", vo);
		// ModelAndView
		// model ==> 처리 결과를 넣음.
		// view ==> views아래에 어떤 파일에 넣을지를 결정.
	}
	
	@RequestMapping("list2.member")
	public void lsit(Model model) {
		List<MemberVO> list = memberService.list();
		System.out.println("여러개의 documents검색 결과>> " + list);
		model.addAttribute("list", list);
	}
}
