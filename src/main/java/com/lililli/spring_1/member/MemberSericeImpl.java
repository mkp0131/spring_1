package com.lililli.spring_1.member;

public class MemberSericeImpl implements MemberService {

    private static MemberRepository repository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        repository.save(member);
    }

    @Override
    public Member findMember(Long id) {
        return repository.findById(id);
    }
}
