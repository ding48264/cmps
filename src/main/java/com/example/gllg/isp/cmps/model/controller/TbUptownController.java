package com.example.gllg.isp.cmps.model.controller;

import com.example.gllg.isp.cmps.model.entity.TbUptown;
import com.example.gllg.isp.cmps.model.service.TbUptownService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbUptown)表控制层
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
@RestController
@RequestMapping("tbUptown")
public class TbUptownController {
    /**
     * 服务对象
     */
    @Resource
    private TbUptownService tbUptownService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbUptown selectOne(Integer id) {
        return this.tbUptownService.queryById(id);
    }

}