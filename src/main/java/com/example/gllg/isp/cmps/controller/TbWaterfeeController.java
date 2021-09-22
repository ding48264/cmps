package com.example.gllg.isp.cmps.controller;

import com.example.gllg.isp.cmps.entity.TbHold;
import com.example.gllg.isp.cmps.entity.TbHouse;
import com.example.gllg.isp.cmps.entity.TbUptown;
import com.example.gllg.isp.cmps.entity.TbWaterfee;
import com.example.gllg.isp.cmps.service.TbHouseService;
import com.example.gllg.isp.cmps.service.TbUptownService;
import com.example.gllg.isp.cmps.service.TbWaterfeeService;
import com.github.pagehelper.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

/**
 * (TbWaterfee)表控制层
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@RestController
@Slf4j
@RequestMapping("tbWaterfee")

public class TbWaterfeeController {
    /**
     * 服务对象
     */
    @Resource
    private TbWaterfeeService tbWaterfeeService;
    @Resource
    private TbUptownService tbUptownService;
    @Resource
    TbHouseService tbHouseService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbWaterfee selectOne(Integer id) {
        return this.tbWaterfeeService.queryById(id);
    }
    @GetMapping()
    public ModelAndView selectAll(ModelAndView mav){
        List<TbWaterfee> tbWaterfees = this.tbWaterfeeService.queryAllWaterFee(1,10);
        mav.addObject("tbWaterfees",tbWaterfees);
        mav.setViewName("water/WaterFee");
        return mav;
//        return null;
    }
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search(TbHold tbHold,
                               @RequestParam(value = "pageNum", required = false) Integer pageNum,
                               HttpSession session) {
        if (pageNum == null) {
            pageNum = 1;
        }
        List<TbWaterfee> tbWaterfees = this.tbWaterfeeService.queryAllWaterFee(1, 10);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("water/WaterFee");
        mav.addObject("tbWaterfees", tbWaterfees);
        return mav;
    }
    @GetMapping("/async/insert")
    public ModelAndView  InsertModel(Model model,
                                     ModelAndView modelAndView){
        TbWaterfee tbWaterfee = new TbWaterfee();
        List<TbUptown> tbUptowns = this.tbUptownService.queryAllUptown();
        modelAndView.addObject("tbUptowns",tbUptowns);
        modelAndView.addObject("tbWaterfee",tbWaterfee);
        modelAndView.setViewName("water/insert-content");
        return modelAndView;
//        return "uptown/update-content";
    }
    @PostMapping("/doInsertWater")
    @ResponseBody
    public String doInsertWater(TbWaterfee tbWaterfee){
        String itemcode = UUID.randomUUID().toString();
        tbWaterfee.setItemcode(itemcode);
        TbWaterfee insert = this.tbWaterfeeService.insert(tbWaterfee);
        if(insert==null){
            return "[{\"status\":\"failed\",\"message\":\"插入失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"插入成功!\"}]";
    }
    //异步更新
    @GetMapping("/async/update/{itemid}")
    public ModelAndView  selectByAsync(Model model,
                                       ModelAndView modelAndView,
                                       @PathVariable Integer itemid){
        final TbWaterfee tbWaterfee=this.tbWaterfeeService.queryById(itemid);
//        model.addAttribute("tbWaterfee",tbWaterfee);
        modelAndView.addObject("tbWaterfee",tbWaterfee);
        modelAndView.setViewName("water/update-content");
        return modelAndView;
//        return "uptown/update-content";
    }
    @PostMapping("/doUpdateWater")
    @ResponseBody
    public String doUpdateHold(TbWaterfee tbWaterfee){
        TbWaterfee update = this.tbWaterfeeService.update(tbWaterfee);
        if(update==null){
            return "[{\"status\":\"failed\",\"message\":\"更新失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"更新成功!\"}]";
    }
    @PostMapping("/delete")
    @ResponseBody
    public String doDeleteHOldn(@RequestParam("itemid")Integer itemid){
        boolean b = this.tbWaterfeeService.deleteById(itemid);
//        TbHold TbHold = this.tbHoldService.queryById(itemid);
//        this.tbHouseService.deleteByhouseCode(TbHold.getUptowncode());
        if(b==false){
            return "[{\"status\":\"failed\",\"message\":\"删除失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"删除成功!\"}]";
    }
}