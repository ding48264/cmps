package com.example.gllg.isp.cmps.controller;

import com.example.gllg.isp.cmps.entity.TbAdmin;
import com.example.gllg.isp.cmps.service.TbAdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbAdmin)表控制层
 *
 * @author makejava
 * @since 2021-09-13 10:59:05
 */
@RestController
@RequestMapping("tbAdmin")
public class TbAdminController {
    /**
     * 服务对象
     */
    @Resource
    private TbAdminService tbAdminService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbAdmin selectOne(Integer id) {
        return this.tbAdminService.queryById(id);
    }

}