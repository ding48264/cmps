package com.example.gllg.isp.cmps.model.controller;

import com.example.gllg.isp.cmps.model.entity.TbGasfee;
import com.example.gllg.isp.cmps.model.service.TbGasfeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbGasfee)表控制层
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
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