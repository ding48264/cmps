package com.example.gllg.isp.cmps.controller;

import com.example.gllg.isp.cmps.entity.TbGasfee;
import com.example.gllg.isp.cmps.entity.TbHold;
import com.example.gllg.isp.cmps.entity.TbUptown;
import com.example.gllg.isp.cmps.service.TbGasfeeService;
import com.example.gllg.isp.cmps.service.TbUptownService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

/**
 * (TbGasfee)表控制层
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@RestController
@RequestMapping("tbGasfee")
public class TbGasfeeController {
    /**
     * 服务对象
     */
    @Resource
    private TbGasfeeService tbGasfeeService;
    @Resource
    private
    TbUptownService tbUptownService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("sgasOne")
    public TbGasfee sgasOne(Integer id) {
        return this.tbGasfeeService.queryById(id);
    }
    @GetMapping()
    public ModelAndView sgasAll(ModelAndView mav){
        List<TbGasfee> tbGasfee = this.tbGasfeeService.queryAllGasFee(1,10);
        mav.addObject("tbGasfee",tbGasfee);
        mav.setViewName("gas/GasFee");
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
        List<TbGasfee> tbGasfee = this.tbGasfeeService.queryAllGasFee(1, 10);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("gas/GasFee");
        mav.addObject("tbGasfee", tbGasfee);
        return mav;
    }
    @GetMapping("/async/insert")
    public ModelAndView  InsertModel(Model model,
                                     ModelAndView modelAndView){
        TbGasfee tbGasfee = new TbGasfee();
        List<TbUptown> tbUptowns = this.tbUptownService.queryAllUptown();
        modelAndView.addObject("tbUptowns",tbUptowns);
        modelAndView.addObject("tbGasfee",tbGasfee);
        modelAndView.setViewName("gas/insert-content");
        return modelAndView;
//        return "uptown/update-content";
    }
    @PostMapping("/doInsertGas")
    @ResponseBody
    public String doInsertWater(TbGasfee tbGasfee){
        String itemcode = UUID.randomUUID().toString();
        tbGasfee.setItemcode(itemcode);
        TbGasfee insert = this.tbGasfeeService.insert(tbGasfee);
        if(insert==null){
            return "[{\"status\":\"failed\",\"message\":\"插入失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"插入成功!\"}]";
    }
    //异步更新
    @GetMapping("/async/update/{itemid}")
    public ModelAndView sgasByAsync(Model model,
                                      ModelAndView modelAndView,
                                      @PathVariable Integer itemid){
        final TbGasfee tbGasfee=this.tbGasfeeService.queryById(itemid);
//        model.addAttribute("tbWaterfee",tbWaterfee);
        modelAndView.addObject("tbGasfee",tbGasfee);
        modelAndView.setViewName("gas/update-content");
        return modelAndView;
//        return "uptown/update-content";
    }
    @PostMapping("/doUpdateGas")
    @ResponseBody
    public String doUpdateHold(TbGasfee tbGasfee){
        TbGasfee update = this.tbGasfeeService.update(tbGasfee);
        if(update==null){
            return "[{\"status\":\"failed\",\"message\":\"更新失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"更新成功!\"}]";
    }
    @PostMapping("/delete")
    @ResponseBody
    public String doDeleteHOldn(@RequestParam("itemid")Integer itemid){
        boolean b = this.tbGasfeeService.deleteById(itemid);
//        TbHold TbHold = this.tbHoldService.queryById(itemid);
//        this.tbHouseService.deleteByhouseCode(TbHold.getUptowncode());
        if(b==false){
            return "[{\"status\":\"failed\",\"message\":\"删除失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"删除成功!\"}]";
    }
}