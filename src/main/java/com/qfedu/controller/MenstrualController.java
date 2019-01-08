package com.qfedu.controller;

import com.qfedu.entity.t_menstruation;
import com.qfedu.service.MenstruationService;
import com.qfedu.vo.PageBeanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MenstrualController {

    @Autowired
    private MenstruationService menstruationService;

    @GetMapping("menstruationall.do")
    public PageBeanVo<t_menstruation> all(int page, int limit) {
        return menstruationService.queryPage(page, limit);
    }

}
