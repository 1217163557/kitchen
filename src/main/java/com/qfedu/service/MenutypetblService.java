package com.qfedu.service;

import com.qfedu.utils.ResultVo;

public interface MenutypetblService {

    ResultVo findAllMenu(int mFlag,int mType,Integer page, Integer limit);
}
