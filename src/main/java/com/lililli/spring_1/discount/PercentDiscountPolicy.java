package com.lililli.spring_1.discount;

import com.lililli.spring_1.member.Grade;
import com.lililli.spring_1.member.Member;

public class PercentDiscountPolicy implements DiscountPolicy {

    int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        }
        return 0;
    }
}
