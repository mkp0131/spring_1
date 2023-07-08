package com.lililli.spring_1;

import com.lililli.spring_1.member.Grade;
import com.lililli.spring_1.member.Member;
import com.lililli.spring_1.member.MemberSericeImpl;
import com.lililli.spring_1.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);


        Member mkp = new Member(1L, "mkp", Grade.VIP);

        memberService.join(mkp);

        Member findMember = memberService.findMember(1L);

        System.out.println("📌 찾은 회원: " + findMember);
    }
}
