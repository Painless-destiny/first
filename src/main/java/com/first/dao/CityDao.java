package com.first.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.first.domain.City;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityDao extends BaseMapper<City> {
}
