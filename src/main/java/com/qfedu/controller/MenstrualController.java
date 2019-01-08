package com.qfedu.controller;

import com.qfedu.entity.t_menstruation;
import com.qfedu.service.MenstruationService;
import com.qfedu.vo.PageBeanVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MenstrualController {

    @Autowired
    private MenstruationService menstruationService;

    @GetMapping("/menstruation.do")
    public PageBeanVo<t_menstruation> all(int page, int limit) {
        return menstruationService.queryPage(page, limit);
    }

}
