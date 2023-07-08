package com.lililli.spring_1.member;

import com.lililli.spring_1.AppConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        memberService = new AppConfig().memberService();
    }

    @Test
    void join() {
        // given
        Member member = new Member(1L, "mkp", Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then
        Assertions.assertEquals(member, findMember);
    }
}
