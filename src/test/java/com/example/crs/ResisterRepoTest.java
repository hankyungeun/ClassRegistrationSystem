package com.example.crs;


import com.example.crs.dao.RegisterRepo;
import com.example.crs.model.RegisterEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@Transactional
public class ResisterRepoTest {
    @Autowired
    RegisterRepo registerRepo;
    @Test
    public void findByMemberId()throws Exception{
        Optional<RegisterEntity> byMemberId = registerRepo.findByMemberId("11");
    }
}
