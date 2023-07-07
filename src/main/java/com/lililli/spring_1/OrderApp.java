package com.lililli.spring_1;

import com.lililli.spring_1.member.Grade;
import com.lililli.spring_1.member.Member;
import com.lililli.spring_1.member.MemberSericeImpl;
import com.lililli.spring_1.member.MemberService;
import com.lililli.spring_1.order.Order;
import com.lililli.spring_1.order.OrderService;
import com.lililli.spring_1.order.OrderServiceImpl;

public class OrderApp {


    public static void main(String[] args) {
        MemberService memberService = new MemberSericeImpl();
        OrderService orderService = new OrderServiceImpl();

        Member member = new Member(1L, "mkp", Grade.VIP);
        memberService.join(member);

        Order order1 = orderService.createOrder(1L, "아이템1", 1000);
        System.out.println("🍟 Order: " + order1);
    }
}
