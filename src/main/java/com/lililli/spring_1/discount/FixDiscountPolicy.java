package com.lililli.spring_1.discount;

import com.lililli.spring_1.member.Grade;
import com.lililli.spring_1.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private final int discountPrice = 1000;


    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discountPrice;
        }
        return 0;
    }
}
