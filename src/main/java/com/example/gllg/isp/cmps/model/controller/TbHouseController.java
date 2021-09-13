package com.example.gllg.isp.cmps.model.controller;

import com.example.gllg.isp.cmps.model.entity.TbHouse;
import com.example.gllg.isp.cmps.model.service.TbHouseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbHouse)表控制层
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
@RestController
@RequestMapping("tbHouse")
public class TbHouseController {
    /**
     * 服务对象
     */
    @Resource
    private TbHouseService tbHouseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbHouse selectOne(Integer id) {
        return this.tbHouseService.queryById(id);
    }

}