package com.first.dao;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.first.domain.City;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class cityDaoTest {

    @Autowired
    private CityDao cityDao;

    @Test
    void testGet() {
        System.out.println(cityDao.selectById(11));
    }

    @Test
    void testPage() {
        IPage page = new Page(2, 10);
        cityDao.selectPage(page, null);
        System.out.println(page.getPages());
    }

    @Test
    void testGetBy() {
        QueryWrapper <City> qw = new QueryWrapper<>();
        qw.like("Name", "San Miguel");
        cityDao.selectList(qw);
    }

    @Test
    void testGetBy2() {

        String name = null;
        LambdaQueryWrapper <City> lqw = new LambdaQueryWrapper<City>();
        lqw.like(name!=null, City::getName, name);
        cityDao.selectList(lqw);
    }

}
