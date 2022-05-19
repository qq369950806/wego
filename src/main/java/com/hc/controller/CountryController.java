package com.hc.controller;

import com.hc.domain.Country;
import com.hc.domain.vo.CountryVO;
import com.hc.service.CountryService;
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
@RequestMapping("/country")
public class CountryController {

    @Resource
    private CountryService countryService;

    @PostMapping
    public ModelAndView create(@RequestBody Country country, ModelAndView mav) {
        countryService.insert(country);
        mav.setViewName("country_list");
        return mav;
    }

    @PutMapping
    public ModelAndView updateById(@RequestBody Country country, ModelAndView mav) {
        countryService.updateByPrimaryKeySelective(country);
        mav.setViewName("country_list");
        return mav;
    }

    @DeleteMapping("/{id}")
    public ModelAndView removeById(@PathVariable Integer id, ModelAndView mav) {
        countryService.deleteByPrimaryKey(id);
        mav.setViewName("country_list");
        return mav;
    }

    @GetMapping("/get/{id}")
    public ModelAndView getById(@PathVariable Integer id, ModelAndView mav) {
        Country country = countryService.selectByPrimaryKey(id);
        mav.addObject("country", country);
        mav.setViewName("country_details");
        return mav;
    }

    @ResponseBody
    @GetMapping("/getCountryByCityId/{cityId}")
    public List<CountryVO> getCountryByCityId(@PathVariable("cityId") Integer cityId){
        List<CountryVO> countryVOList = countryService.selectByCityId(cityId);
        return countryVOList;
    }

    //@GetMapping("/list")
    //public ModelAndView list(QueryBean queryBean,
    //                        @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
    //                        @RequestParam(name = "pageSize", defaultValue = WeGoConst.PAGE_SIZE) Integer pageSize,
    //                        ModelAndView mav) {
    //   //TODO .....queryBean转 country,
    //  CountryQuery countryQuery = null;
    //  PageBean<CountryVO> pageBean = countryService.getPage( countryQuery,pageNum,pageSize);
    //  pageBean.setUrl("country/list?");
    //
    //  mav.addObject("pageBean", pageBean);
    //
    //   mav.setViewName("country_list");
    //     return mav;
    //   }
}