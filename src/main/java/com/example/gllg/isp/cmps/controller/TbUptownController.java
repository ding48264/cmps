package com.example.gllg.isp.cmps.controller;

import com.example.gllg.isp.cmps.entity.TbHouse;
import com.example.gllg.isp.cmps.entity.TbUptown;
import com.example.gllg.isp.cmps.service.TbHouseService;
import com.example.gllg.isp.cmps.service.TbUptownService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

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
    @Resource
    private TbHouseService tbHouseService;

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
//    异步插入
    @GetMapping("/async/insert")
    public ModelAndView  InsertModel(Model model,
                                     ModelAndView modelAndView){
        TbUptown tbUptown = new TbUptown();
        modelAndView.addObject("tbUptown",tbUptown);
        modelAndView.setViewName("uptown/insert-content");
        return modelAndView;
//        return "uptown/update-content";
    }
    @PostMapping("/doInsertUptown")
    @ResponseBody
    public String doInsertUptown(TbUptown tbUptown){
        String itemcode = UUID.randomUUID().toString();
        String uptowncode = UUID.randomUUID().toString();
        tbUptown.setItemcode(itemcode);
        tbUptown.setUptowncode(uptowncode);
        TbUptown update = this.tbUptownService.insert(tbUptown);
        TbHouse tbHouse = new TbHouse();
        for (int i = 1; i <= 2; i++) { //房屋所在栋
            for (int j = 1; j <=2 ; j++) {   //房屋所在单元
                for (int k = 101; k <=600 ; k++) {//房屋所在室
                    if(k%10==6){
                        k=((k/100)+1)*100+1;
                    }
                    tbHouse.setItemcode(uptowncode);
                    tbHouse.setHousecode(UUID.randomUUID().toString());
                    tbHouse.setBuilding(i+"");
                    tbHouse.setUnit(j+"");
                    tbHouse.setRoom(k+"");
                    tbHouse.setType("0");
                    tbHouse.setState("0");
                    tbHouse.setArea(120);
                    this.tbHouseService.insert(tbHouse);
                }
            }
        }
        
        if(update==null){
            return "[{\"status\":\"failed\",\"message\":\"插入失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"插入成功!\"}]";
    }

    //异步更新
    @GetMapping("/async/update/{itemid}")
    public ModelAndView  selectByAsync(Model model,
                                 ModelAndView modelAndView,
                                @PathVariable Integer itemid){
        final TbUptown tbUptown=this.tbUptownService.queryById(itemid);
        model.addAttribute("tbUptown",tbUptown);
        modelAndView.addObject("tbUptown",tbUptown);
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
//        TbUptown tbUptown = this.tbUptownService.queryById(itemid);
//        this.tbHouseService.deleteByhouseCode(tbUptown.getUptowncode());
        if(b==false){
            return "[{\"status\":\"failed\",\"message\":\"删除失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"删除成功!\"}]";
    }
}