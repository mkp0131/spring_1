package com.lililli.spring_1;

import com.lililli.spring_1.member.Grade;
import com.lililli.spring_1.member.Member;
import com.lililli.spring_1.member.MemberSericeImpl;
import com.lililli.spring_1.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberSericeImpl();

        Member mkp = new Member(1L, "mkp", Grade.VIP);

        memberService.join(mkp);

        Member findMember = memberService.findMember(1L);

        System.out.println("📌 찾은 회원: " + findMember);
    }
}
