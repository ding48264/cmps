package com.example.gllg.isp.cmps.model.controller;

import com.example.gllg.isp.cmps.model.entity.TbElectfee;
import com.example.gllg.isp.cmps.model.service.TbElectfeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbElectfee)表控制层
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
@RestController
@RequestMapping("tbElectfee")
public class TbElectfeeController {
    /**
     * 服务对象
     */
    @Resource
    private TbElectfeeService tbElectfeeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbElectfee selectOne(Integer id) {
        return this.tbElectfeeService.queryById(id);
    }

}