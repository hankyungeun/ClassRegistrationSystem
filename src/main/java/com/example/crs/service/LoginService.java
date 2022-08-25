package com.example.crs.service;

import com.example.crs.dao.LoginRepo;
import com.example.crs.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginRepo loginRepo;
    /**
     * @return null이면 로그인 실패
     */
    public Member login(String id, String passwd) {

        return loginRepo.findById(id)
                .filter(m -> m.getPasswd().equals(passwd))
                .orElse(null);
    }

}
