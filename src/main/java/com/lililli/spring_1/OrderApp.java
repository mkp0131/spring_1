package com.lililli.spring_1;

import com.lililli.spring_1.member.Grade;
import com.lililli.spring_1.member.Member;
import com.lililli.spring_1.member.MemberSericeImpl;
import com.lililli.spring_1.member.MemberService;
import com.lililli.spring_1.order.Order;
import com.lililli.spring_1.order.OrderService;
import com.lililli.spring_1.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Member member = new Member(1L, "mkp", Grade.VIP);
        memberService.join(member);

        Order order1 = orderService.createOrder(1L, "아이템1", 1000);
        System.out.println("🍟 Order: " + order1);
    }
}
