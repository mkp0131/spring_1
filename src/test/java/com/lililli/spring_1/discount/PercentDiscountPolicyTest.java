package com.lililli.spring_1.discount;

import com.lililli.spring_1.member.Grade;
import com.lililli.spring_1.member.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PercentDiscountPolicyTest {

    DiscountPolicy discountPolicy = new PercentDiscountPolicy();

    @Test
    @DisplayName("VIP 는 10% 할인이 적용되어야 한다.")
    void vip_o() {
        Member vip = new Member(1L, "mkp", Grade.VIP);
        int discount = discountPolicy.discount(vip, 1000);
        Assertions.assertEquals(discount, 100);
    }

    @Test
    @DisplayName("일반 회원은 할인이 적용되면 안된다.")
    void vip_x() {
        Member basicUser = new Member(1L, "mkp", Grade.BASIC);
        int discount = discountPolicy.discount(basicUser, 1000);
        Assertions.assertEquals(discount, 0);
    }
}