package com.example.gllg.isp.cmps.controller;

import com.example.gllg.isp.cmps.entity.TbHold;
import com.example.gllg.isp.cmps.entity.TbHouse;
import com.example.gllg.isp.cmps.entity.TbHold;
import com.example.gllg.isp.cmps.service.TbHoldService;
import com.example.gllg.isp.cmps.service.TbHouseService;
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
 * (TbHold)表控制层
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@RestController
@Slf4j
@RequestMapping("tbHold")
@SessionAttributes({"holdcode"})
public class TbHoldController {
    /**
     * 服务对象
     */
    @Resource
    private TbHoldService tbHoldService;
    @Resource
    TbHouseService tbHouseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbHold selectOne(Integer id) {
        return this.tbHoldService.queryById(id);
    }

    @RequestMapping()
    public ModelAndView selectAllHold(){
        TbHold tbHold=new TbHold();
        List<TbHold> tbHolds = this.tbHoldService.queryAllHold(tbHold,1,5);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("tbHolds",tbHolds);
        modelAndView.setViewName("hold/Hold");
        return modelAndView;
    }
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search(TbHold tbHold,
                               @RequestParam(value = "pageNum", required = false) Integer pageNum,
                               HttpSession session) {
        if (pageNum == null) {
            pageNum = 1;
        }
        Page<TbHold> tbHolds = this.tbHoldService.queryAllHolds(tbHold, pageNum, 5);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hold/Hold");
        mav.addObject("tbHolds", tbHolds);
        return mav;
    }
    //    异步插入
    @GetMapping("/async/insert")
    public ModelAndView  InsertModel(Model model,
                                     ModelAndView modelAndView){
        TbHold tbHold = new TbHold();
        modelAndView.addObject("tbHold",tbHold);
        modelAndView.setViewName("hold/insert-content");
        return modelAndView;
//        return "uptown/update-content";
    }
    @PostMapping("/doInsertHold")
    @ResponseBody
    public String doInsertUptown(TbHold tbHold){
        TbHouse tbHouse=this.tbHouseService.selectUse();//找出未分配的房间
        String itemcode = UUID.randomUUID().toString();
        tbHold.setItemcode(itemcode);
        tbHold.setHoldcode(tbHouse.getHousecode());
        tbHold.setHoldrela("本人");
        TbHold insert = this.tbHoldService.insert(tbHold);
        tbHouse.setState("1");
        this.tbHouseService.update(tbHouse);
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
        final TbHold tbHold=this.tbHoldService.queryById(itemid);
        model.addAttribute("TbHold",tbHold);
        modelAndView.addObject("tbHold",tbHold);
        modelAndView.setViewName("hold/update-content");
        return modelAndView;
//        return "uptown/update-content";
    }
    @PostMapping("/doUpdateHold")
    @ResponseBody
    public String doUpdateHold(TbHold tbHold){
        TbHold update = this.tbHoldService.update(tbHold);
        if(update==null){
            return "[{\"status\":\"failed\",\"message\":\"更新失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"更新成功!\"}]";
    }
    @PostMapping("/delete")
    @ResponseBody
    public String doDeleteHOldn(@RequestParam("itemid")Integer itemid){
        boolean b = this.tbHoldService.deleteById(itemid);
//        TbHold TbHold = this.tbHoldService.queryById(itemid);
//        this.tbHouseService.deleteByhouseCode(TbHold.getUptowncode());
        if(b==false){
            return "[{\"status\":\"failed\",\"message\":\"删除失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"删除成功!\"}]";
    }
    @GetMapping("/remember")
    public ModelAndView rememberPage(ModelAndView mav){
        mav.setViewName("hold/HoldMeber");
        return mav;
    }

    @GetMapping("/async/selectHold")
    public ModelAndView selectHold(ModelAndView mav,TbHold tbHold){
        List<TbHold> tbHolds = this.tbHoldService.queryAllHoldOwn(tbHold, 1, 10);
        mav.addObject("tbHolds",tbHolds);
        mav.setViewName("hold/selectHold");
        return mav;
    }
    @RequestMapping("/selectHold")
    public ModelAndView selectHold(ModelAndView mav,
                                   Integer itemid,
                                   HttpSession session){
//        log.error("itemid"+itemid);
        TbHold tbHold = this.tbHoldService.queryById(itemid);
        List<TbHold> tbHolds=this.tbHoldService.queryMeb(tbHold.getHoldcode());
        mav.addObject("tbHolds",tbHolds);
        mav.addObject("tbHold",tbHold);
        session.setAttribute("holdcode",tbHold.getHoldcode());
        mav.setViewName("hold/HoldMebInfo");
        return mav;
//        return null;
    }
    @GetMapping("/async/insertMeb")
    public ModelAndView  InsertMeb(Model model,
                                     ModelAndView modelAndView,
                                   HttpSession session){
        TbHold tbHold = new TbHold();
        modelAndView.addObject("tbHold",tbHold);
        modelAndView.setViewName("hold/insertMeb-content");
        return modelAndView;
//        return "uptown/update-content";
    }
    @PostMapping("/doInsertHoldMeb")
    @ResponseBody
    public String doInsertMeb(TbHold tbHold,HttpSession session){
        String itemcode = UUID.randomUUID().toString();
        tbHold.setItemcode(itemcode);
        String holdcode=session.getAttribute("holdcode").toString();
        log.error("holdcode"+holdcode);
        tbHold.setHoldcode(holdcode);
        TbHold insert = this.tbHoldService.insert(tbHold);
        if(insert==null){
            return "[{\"status\":\"failed\",\"message\":\"插入失败!\"}]";
        }
        return "[{\"status\":\"success\",\"message\":\"插入成功!\"}]";
    }
}