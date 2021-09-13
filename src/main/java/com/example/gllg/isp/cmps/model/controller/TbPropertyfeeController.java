package com.example.gllg.isp.cmps.model.controller;

import com.example.gllg.isp.cmps.model.entity.TbPropertyfee;
import com.example.gllg.isp.cmps.model.service.TbPropertyfeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbPropertyfee)表控制层
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
@RestController
@RequestMapping("tbPropertyfee")
public class TbPropertyfeeController {
    /**
     * 服务对象
     */
    @Resource
    private TbPropertyfeeService tbPropertyfeeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbPropertyfee selectOne(Integer id) {
        return this.tbPropertyfeeService.queryById(id);
    }

}