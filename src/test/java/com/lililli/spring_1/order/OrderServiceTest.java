package com.lililli.spring_1.order;

import com.lililli.spring_1.member.Grade;
import com.lililli.spring_1.member.Member;
import com.lililli.spring_1.member.MemberSericeImpl;
import com.lililli.spring_1.member.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberSericeImpl();
    OrderService orderService = new OrderServiceImpl();
    @Test
    void createOrder() {
        Member member = new Member(1L, "mkp", Grade.VIP);
        memberService.join(member);
        Order order1 = orderService.createOrder(1L, "아이템1", 1000);
        Assertions.assertEquals(order1.calculatePrice(), 0);
    }
}
