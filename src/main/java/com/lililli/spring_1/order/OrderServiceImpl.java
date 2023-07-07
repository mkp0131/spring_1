package com.lililli.spring_1.order;

import com.lililli.spring_1.discount.DiscountPolicy;
import com.lililli.spring_1.discount.FixDiscountPolicyImpl;
import com.lililli.spring_1.member.Member;
import com.lililli.spring_1.member.MemberRepository;
import com.lililli.spring_1.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicyImpl();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
