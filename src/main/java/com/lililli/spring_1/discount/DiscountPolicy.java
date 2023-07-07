package com.lililli.spring_1.discount;


import com.lililli.spring_1.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
