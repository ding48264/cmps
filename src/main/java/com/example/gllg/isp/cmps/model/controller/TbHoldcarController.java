package com.example.gllg.isp.cmps.model.controller;

import com.example.gllg.isp.cmps.model.entity.TbHoldcar;
import com.example.gllg.isp.cmps.model.service.TbHoldcarService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbHoldcar)表控制层
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
@RestController
@RequestMapping("tbHoldcar")
public class TbHoldcarController {
    /**
     * 服务对象
     */
    @Resource
    private TbHoldcarService tbHoldcarService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbHoldcar selectOne(Integer id) {
        return this.tbHoldcarService.queryById(id);
    }

}