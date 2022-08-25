package com.example.crs;

import com.example.crs.model.Register;
import com.example.crs.service.RegisterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class RegisterServiceTest {
    @Autowired
    RegisterService registerService;

    @Test
    public void all() throws Exception {
        for (Register register : registerService.getRegisters()) {
            System.out.println("-------------");
            System.out.println(register.toString());
            System.out.println("-------------");
        }
    }
}
