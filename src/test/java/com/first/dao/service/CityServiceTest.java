package com.first.dao.service;

import com.first.service.CityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CityServiceTest {

    @Autowired
    private CityService cityServiceTest;

    @Test
    void getById(int i) {
        System.out.println(cityServiceTest.getById(1));
    }

}
