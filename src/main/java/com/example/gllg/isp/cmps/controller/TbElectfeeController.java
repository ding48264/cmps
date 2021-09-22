package com.example.gllg.isp.cmps.controller;

import com.example.gllg.isp.cmps.entity.TbElectfee;
import com.example.gllg.isp.cmps.entity.TbHold;
import com.example.gllg.isp.cmps.entity.TbUptown;
import com.example.gllg.isp.cmps.service.TbElectfeeService;
import com.example.gllg.isp.cmps.service.TbUptownService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

/**
 * (TbElectfee)表控制层
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@RestController
@RequestMapping("tbElectfee")
public class TbElectfeeController {
    /**
     * 服务对象
     */
    @Resource
    private TbElectfeeService tbElectfeeService;
    @Resource
    private
    TbUptownService tbUptownService;
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
    @GetMapping()
    public ModelAndView selectAll(ModelAndView mav){
        List<TbElectfee> tbElectfee = this.tbElectfeeService.queryAllElectFee(1,10);
        mav.addObject("tbElectfee",tbElectfee);
        mav.setViewName("elect/ElectFee");
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
        List<TbElectfee> tbElectfee = this.tbElectfeeService.queryAllElectFee(1, 10);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("elect/ElectFee");
        mav.addObject("tbElectfee", tbElectfee);
        return mav;
    }
    @GetMapping("/async/insert")
    public ModelAndView  InsertModel(Model model,
                                     ModelAndView modelAndView){
        TbElectfee tbElectfee = new TbElectfee();
        List<TbUptown> tbUptowns = this.tbUptownService.queryAllUptown();
        modelAndView.addObject("tbUptowns",tbUptowns);
        modelAndView.addObject("tbElectfee",tbElectfee);
        modelAndView.setViewName("elect/insert-content");
        return modelAndView;
//        return "uptown/update-content";
    }
    @PostMapping("/doInsertWater")
    @ResponseBody
    public String doInsertWater(TbElectfee tbElectfee){
        String itemcode = UUID.randomUUID().toString();
        tbElectfee.setItemcode(itemcode);
        TbElectfee insert = this.tbElectfeeService.insert(tbElectfee);
        if(insert==null){
            return "[{\"status\":\"failed\",\"message\":\"插入失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"插入成功!\"}]";
    }
    //异步更新
    @GetMapping("/async/update/{itemid}")
    public ModelAndView selectByAsync(Model model,
                                      ModelAndView modelAndView,
                                      @PathVariable Integer itemid){
        final TbElectfee tbElectfee=this.tbElectfeeService.queryById(itemid);
//        model.addAttribute("tbWaterfee",tbWaterfee);
        modelAndView.addObject("tbElectfee",tbElectfee);
        modelAndView.setViewName("elect/update-content");
        return modelAndView;
//        return "uptown/update-content";
    }
    @PostMapping("/doUpdateWater")
    @ResponseBody
    public String doUpdateHold(TbElectfee tbWaterfee){
        TbElectfee update = this.tbElectfeeService.update(tbWaterfee);
        if(update==null){
            return "[{\"status\":\"failed\",\"message\":\"更新失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"更新成功!\"}]";
    }
    @PostMapping("/delete")
    @ResponseBody
    public String doDeleteHOldn(@RequestParam("itemid")Integer itemid){
        boolean b = this.tbElectfeeService.deleteById(itemid);
//        TbHold TbHold = this.tbHoldService.queryById(itemid);
//        this.tbHouseService.deleteByhouseCode(TbHold.getUptowncode());
        if(b==false){
            return "[{\"status\":\"failed\",\"message\":\"删除失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"删除成功!\"}]";
    }
}