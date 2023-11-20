package com.hyxgz.springbootmybatis.controller;

import com.hyxgz.springbootmybatis.pojo.TbHotel;
import com.hyxgz.springbootmybatis.service.TbHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TbHotelController {

    @Autowired
    private TbHotelService tbHotelService;

    @RequestMapping("/getById")
    public TbHotel getById(Long id){
        return tbHotelService.getById(id);
    }
}

