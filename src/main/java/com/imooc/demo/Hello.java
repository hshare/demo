package com.imooc.demo;

import generator.TbArea;
import generator.TbAreaDao;
import generator.TbAreaExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Hello {

    @Autowired
    private TbAreaDao tbAreaDao;

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String hello(){
        TbAreaExample tbAreaExample = new TbAreaExample();
        tbAreaExample.createCriteria().andAreaIdEqualTo(1);
        List<TbArea> tbAreas = tbAreaDao.selectByExample(tbAreaExample);
        return "Hello SpringBoot!!!" + tbAreas.get(0);
    }
}
