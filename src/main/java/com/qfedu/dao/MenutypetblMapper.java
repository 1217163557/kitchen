package com.qfedu.dao;

import com.qfedu.entity.Menutypetbl;

public interface MenutypetblMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Menutypetbl record);

    int insertSelective(Menutypetbl record);

    Menutypetbl selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Menutypetbl record);

    int updateByPrimaryKey(Menutypetbl record);
}