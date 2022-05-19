package com.hc.controller;

import com.hc.domain.City;
import com.hc.domain.vo.CityVO;
import com.hc.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/city")
public class CityController {

    @Resource
    private CityService cityService;

    @PostMapping
    public ModelAndView create(@RequestBody City city, ModelAndView mav) {
        cityService.insert(city);
        mav.setViewName("city_list");
        return mav;
    }

    @PutMapping
    public ModelAndView updateById(@RequestBody City city, ModelAndView mav) {
        cityService.updateByPrimaryKeySelective(city);
        mav.setViewName("city_list");
        return mav;
    }

    @DeleteMapping("/{id}")
    public ModelAndView removeById(@PathVariable Integer id, ModelAndView mav) {
        cityService.deleteByPrimaryKey(id);
        mav.setViewName("city_list");
        return mav;
    }

    @GetMapping("/get/{id}")
    public ModelAndView getById(@PathVariable Integer id, ModelAndView mav) {
        City city = cityService.selectByPrimaryKey(id);
        mav.addObject("city", city);
        mav.setViewName("city_details");
        return mav;
    }

    @ResponseBody
    @GetMapping("/getCityByProvinceId/{provinceId}")
    public List<CityVO> getCityByProvinceId(@PathVariable("provinceId") Integer provinceId){
        List<CityVO> cityVOList = cityService.selectByProvinceId(provinceId);
        return cityVOList;
    }

    //@GetMapping("/list")
    //public ModelAndView list(QueryBean queryBean,
    //                        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
    //                        @RequestParam(name = "pageSize", defaultValue = WeGoConst.PAGE_SIZE) Integer pageSize,
    //                        ModelAndView mav) {
    //   //TODO .....queryBean转 city,
    //  CityQuery cityQuery = null;
    //  PageBean<CityVO> pageBean = cityService.getPage( cityQuery,pageNum,pageSize);
    //  pageBean.setUrl("city/list?");
    //
    //  mav.addObject("pageBean", pageBean);
    //
    //   mav.setViewName("city_list");
    //     return mav;
    //   }
}