package com.example.gllg.isp.cmps.controller;

import com.example.gllg.isp.cmps.entity.TbUptown;
import com.example.gllg.isp.cmps.service.TbUptownService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbUptown)表控制层
 *
 * @author makejava
 * @since 2021-09-14 16:05:29
 */
@RestController
@RequestMapping("tbUptown")
@Slf4j
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
    @RequestMapping
    public ModelAndView MyUptown(){
        List<TbUptown> tbUptowns = this.tbUptownService.queryAllUptown();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("tbUptowns",tbUptowns);
        modelAndView.setViewName("uptown/Uptown");
        return modelAndView;
    }
    //异步更新
    @GetMapping("/async/update/{itemid}")
    public ModelAndView  selectByAsync(Model model,
                                 ModelAndView modelAndView,
                                @PathVariable Integer itemid){
        final TbUptown tbUptown=this.tbUptownService.queryById(itemid);
        model.addAttribute("tbUptown",tbUptown);
        modelAndView.addObject("tbUptown",tbUptown);
        modelAndView.setViewName("uptown/Uptown");
        modelAndView.setViewName("uptown/update-content");
        return modelAndView;
//        return "uptown/update-content";
    }
}