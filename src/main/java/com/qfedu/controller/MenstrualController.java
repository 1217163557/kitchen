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

@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class MenstrualController {

    @Autowired(required = true)
    private MenstruationService menstruationService;

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"起止行","每页数量"},value = "获取名次接口")
    @GetMapping("/menstruation.do")
    public PageBeanVo<t_menstruation> all(@ApiParam(value = "起止行")int page,@ApiParam(value = "每页数量") int limit) {
        return menstruationService.queryPage(page, limit);
    }

}
