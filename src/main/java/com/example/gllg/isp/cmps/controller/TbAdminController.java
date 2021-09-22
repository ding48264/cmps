package com.example.gllg.isp.cmps.controller;

import com.example.gllg.isp.cmps.entity.TbAdmin;
import com.example.gllg.isp.cmps.entity.TbHold;
import com.example.gllg.isp.cmps.entity.TbUptown;
import com.example.gllg.isp.cmps.service.TbAdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbAdmin)表控制层
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Slf4j
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
    @RequestMapping
    public ModelAndView LoginAdmin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/login");
        return modelAndView;
    }
    @RequestMapping("tbUptown")
    public ModelAndView CheckAdmin(TbAdmin loginadmin){
        System.out.println("login"+loginadmin );
        ModelAndView modelAndView = new ModelAndView();
        TbAdmin tbAdmin=this.tbAdminService.ckeckLogin(loginadmin.getAdminid(),loginadmin.getPassword());
        if(tbAdmin!=null){
        modelAndView.addObject("tbAdmins",tbAdmin);
        modelAndView.setViewName("uptown/Uptown");
        return modelAndView;
        }
        System.out.println("error");
        modelAndView.setViewName("admin/login");
        return modelAndView;
    }
    @RequestMapping("losspassword")
    public ModelAndView lossAdmin(TbAdmin lossadmin){
        ModelAndView modelAndView = new ModelAndView();
        TbAdmin tbAdmin=this.tbAdminService.lossAdmin(lossadmin.getAdminid(),lossadmin.getPassword());
        modelAndView.setViewName("admin/losspassword");
        return modelAndView;
    }
}