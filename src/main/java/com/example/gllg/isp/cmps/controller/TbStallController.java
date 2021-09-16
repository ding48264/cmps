package com.example.gllg.isp.cmps.controller;

import com.example.gllg.isp.cmps.entity.TbStall;
import com.example.gllg.isp.cmps.service.TbStallService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TbStall)表控制层
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@RestController
@RequestMapping("tbStall")
public class TbStallController {
    /**
     * 服务对象
     */
    @Resource
    private TbStallService tbStallService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbStall selectOne(Integer id) {
        return this.tbStallService.queryById(id);
    }

}