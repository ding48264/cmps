package com.example.gllg.isp.cmps.model.controller;

import com.example.gllg.isp.cmps.model.entity.TbParkinglot;
import com.example.gllg.isp.cmps.model.service.TbParkinglotService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbParkinglot)表控制层
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
@RestController
@RequestMapping("tbParkinglot")
public class TbParkinglotController {
    /**
     * 服务对象
     */
    @Resource
    private TbParkinglotService tbParkinglotService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbParkinglot selectOne(Integer id) {
        return this.tbParkinglotService.queryById(id);
    }

}