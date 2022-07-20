package com.shop.controller;

import com.shop.dto.MemberFormDto;
import com.shop.entity.Member;
import com.shop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    public Member createMember(){
        MemberFormDto memberFormDto=new MemberFormDto();
        memberFormDto.setEmail("testemail.com");
        memberFormDto.setName("홍길동");
        memberFormDto.setAddress("서울시 마포구 합정동");
        return Member.createMember(memberFormDto);
    }
    @RequestMapping(value="/membertest", method= RequestMethod.GET)
    public void membertest(){
        Member member=createMember();
        Member savedMember=memberService.saveMember(member);

        System.out.println(member);
        System.out.println(savedMember);
    }
}
