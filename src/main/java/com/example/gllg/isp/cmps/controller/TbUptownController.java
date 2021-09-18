package com.example.gllg.isp.cmps.controller;

import com.example.gllg.isp.cmps.entity.TbUptown;
import com.example.gllg.isp.cmps.service.TbUptownService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
        tbUptown.getDistrict();
        modelAndView.addObject("tbUptown",tbUptown);
        modelAndView.setViewName("uptown/Uptown");
        modelAndView.setViewName("uptown/update-content");
        return modelAndView;
//        return "uptown/update-content";
    }
    @PostMapping("/doUpdateUptown")
    @ResponseBody
    public String doUpdateUptown(TbUptown tbUptown){
        TbUptown update = this.tbUptownService.update(tbUptown);
        if(update==null){
            return "[{\"status\":\"failed\",\"message\":\"更新失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"更新成功!\"}]";
    }
    @PostMapping("/delete")
    @ResponseBody
    public String doDeleteUptown(@RequestParam("itemid")Integer itemid){
        boolean b = this.tbUptownService.deleteById(itemid);
        log.error("error",b);
        if(b==false){
            return "[{\"status\":\"failed\",\"message\":\"删除失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"删除成功!\"}]";
    }
}