package com.qfedu.dao;

import com.qfedu.entity.t_menstruation;

import java.util.List;
import java.util.Map;

public interface t_menstruationMapper {
    int deleteByPrimaryKey(Long mid);

    int insert(t_menstruation record);

    int insertSelective(t_menstruation record);

    t_menstruation selectByPrimaryKey(Long mid);

    int updateByPrimaryKeySelective(t_menstruation record);

    int updateByPrimaryKey(t_menstruation record);

    List<t_menstruation> selectAll(Map<String,Object> param);

    int selectCount();

}