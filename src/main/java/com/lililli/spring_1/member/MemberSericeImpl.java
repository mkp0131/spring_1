package com.lililli.spring_1.member;

public class MemberSericeImpl implements MemberService {

    private final MemberRepository repository;

    public MemberSericeImpl(MemberRepository repository) {
        this.repository = repository;
    }

    @Override
    public void join(Member member) {
        repository.save(member);
    }

    @Override
    public Member findMember(Long id) {
        return repository.findById(id);
    }
}
