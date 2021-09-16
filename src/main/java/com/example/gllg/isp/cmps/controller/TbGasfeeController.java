package com.example.gllg.isp.cmps.controller;

import com.example.gllg.isp.cmps.entity.TbGasfee;
import com.example.gllg.isp.cmps.service.TbGasfeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TbGasfee)表控制层
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@RestController
@RequestMapping("tbGasfee")
public class TbGasfeeController {
    /**
     * 服务对象
     */
    @Resource
    private TbGasfeeService tbGasfeeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbGasfee selectOne(Integer id) {
        return this.tbGasfeeService.queryById(id);
    }

}