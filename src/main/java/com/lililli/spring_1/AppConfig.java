package com.lililli.spring_1;

import com.lililli.spring_1.discount.DiscountPolicy;
import com.lililli.spring_1.discount.FixDiscountPolicy;
import com.lililli.spring_1.discount.PercentDiscountPolicy;
import com.lililli.spring_1.member.MemberSericeImpl;
import com.lililli.spring_1.member.MemberService;
import com.lililli.spring_1.member.MemoryMemberRepository;
import com.lililli.spring_1.order.OrderService;
import com.lililli.spring_1.order.OrderServiceImpl;

public class AppConfig {
   public MemberService memberService() {
       return new MemberSericeImpl(memberRepository());
   }

    private static MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
       return new OrderServiceImpl(memberRepository(), getDiscountPolicy());
    }

    private static DiscountPolicy getDiscountPolicy() {
        return new FixDiscountPolicy();
    }
}
