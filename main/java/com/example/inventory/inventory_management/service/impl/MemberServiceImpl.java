package com.example.inventory.inventory_management.service.impl;

import java.util.Date;
import java.util.UUID;

import com.example.inventory.inventory_management.dao.MemberRepository;
import com.example.inventory.inventory_management.model.Member;
import com.example.inventory.inventory_management.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member saveMember(Member member) {
        // member.setMid(UUID.randomUUID().toString().replaceAll("-", ""));
        member.setCreateTime(new Date());
        memberRepository.save(member);
        return member;
    }

}
