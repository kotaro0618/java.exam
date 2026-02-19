package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("/findAll")
	public String index() {
		List<Member>memberList=repository.findAll();
		for(Member member:memberList){
			System.out.println(member);
		}
		
		return "member";
	}
	@RequestMapping("/load")
	public String index2() {
		Member member=repository.load(2);
		System.out.println(member);
		
		return "member";
	}
	@RequestMapping("/insert")
	public String index3() {
		Member member=new Member();
		member.setName("伊藤晃太朗");
		member.setAge(25);
		member.setDepId(2);
		repository.save(member);
		return "member";
	}
	@RequestMapping("/update")
	public String index4() {
		Member member=repository.load(2);
		member.setName("シロー");
		repository.save(member);
		return "member";
	}

}
