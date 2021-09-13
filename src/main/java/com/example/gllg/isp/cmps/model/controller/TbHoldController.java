package com.example.gllg.isp.cmps.model.controller;

import com.example.gllg.isp.cmps.model.entity.TbHold;
import com.example.gllg.isp.cmps.model.service.TbHoldService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbHold)表控制层
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
@RestController
@RequestMapping("tbHold")
public class TbHoldController {
    /**
     * 服务对象
     */
    @Resource
    private TbHoldService tbHoldService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbHold selectOne(Integer id) {
        return this.tbHoldService.queryById(id);
    }

}