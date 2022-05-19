package com.hc.controller;

import com.hc.domain.Province;
import com.hc.service.ProvinceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Slf4j
@Controller
@RequestMapping("/province")
public class ProvinceController {

    @Resource
    private ProvinceService provinceService;

    @PostMapping
    public ModelAndView create(@RequestBody Province province, ModelAndView mav) {
        provinceService.insert(province);
        mav.setViewName("province_list");
        return mav;
    }

    @PutMapping
    public ModelAndView updateById(@RequestBody Province province, ModelAndView mav) {
        provinceService.updateByPrimaryKeySelective(province);
        mav.setViewName("province_list");
        return mav;
    }

    @DeleteMapping("/{id}")
    public ModelAndView removeById(@PathVariable Integer id, ModelAndView mav) {
        provinceService.deleteByPrimaryKey(id);
        mav.setViewName("province_list");
        return mav;
    }

    @GetMapping("/get/{id}")
    public ModelAndView getById(@PathVariable Integer id, ModelAndView mav) {
        Province province = provinceService.selectByPrimaryKey(id);
        mav.addObject("province", province);
        mav.setViewName("province_details");
        return mav;
    }

    //@GetMapping("/list")
    //public ModelAndView list(QueryBean queryBean,
    //                        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
    //                        @RequestParam(name = "pageSize", defaultValue = WeGoConst.PAGE_SIZE) Integer pageSize,
    //                        ModelAndView mav) {
    //   //TODO .....queryBean转 province,
    //  ProvinceQuery provinceQuery = null;
    //  PageBean<ProvinceVO> pageBean = provinceService.getPage( provinceQuery,pageNum,pageSize);
    //  pageBean.setUrl("province/list?");
    //
    //  mav.addObject("pageBean", pageBean);
    //
    //   mav.setViewName("province_list");
    //     return mav;
    //   }
}