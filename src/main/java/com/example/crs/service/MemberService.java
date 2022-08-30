package com.example.crs.service;

import com.example.crs.dao.LoginRepo;
import com.example.crs.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final LoginRepo loginRepo;

    @Transactional
    public boolean updateNowCredits(String memberId, int credits) {
        Member member = loginRepo.findById(memberId).get();
        if (member.getNowCredits() + credits <= member.getMaxCredits()) {
            member.setNowCredits(member.getNowCredits() + credits);
            return true;
        } else {
            return false;
        }
    }

    @Transactional
    public Member getMember(String memberId) {
        return loginRepo.findById(memberId).get();
    }
}
