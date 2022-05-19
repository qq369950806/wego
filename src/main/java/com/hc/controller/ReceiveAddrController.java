package com.hc.controller;

import com.hc.domain.Province;
import com.hc.domain.ReceiveAddr;
import com.hc.domain.vo.ProvinceVO;
import com.hc.domain.vo.ReceiveAddrVO;
import com.hc.service.ProvinceService;
import com.hc.service.ReceiveAddrService;
import com.hc.translate.ProvinceTrans;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
import java.util.List;

@Api(tags = "用户收件地址控制器", value = "用户收件地址")
@Slf4j
@Controller
@RequestMapping("/receiveAddr")
public class ReceiveAddrController {
    @Resource
    private ReceiveAddrService receiveAddrService;

    @Resource
    private ProvinceService provinceService;

    @ApiOperation(value = "获取部门信息列表", notes = "", httpMethod = "GET")
    @GetMapping("/list/{userId}")
    public ModelAndView list(@PathVariable("userId") Long userId, ModelAndView mav) {
        List<ReceiveAddrVO> list = receiveAddrService.selectByUserId(userId);
        mav.addObject("receiveAddrVOList", list);
        mav.setViewName("receiveAddr_list");
        return mav;
    }

    @ApiOperation(value = "获取指定的部门信息", notes = "", httpMethod = "GET")
    @GetMapping("/get/{id}")
    public ModelAndView getById(@PathVariable Long id, ModelAndView mav) {
        ReceiveAddr receiveAddr = receiveAddrService.selectByPrimaryKey(id);
        mav.addObject("receiveAddr", receiveAddr);
        mav.setViewName("receiveAddr_details");
        return mav;
    }

    @GetMapping("/openAddPage")
    public ModelAndView openAddPage(ModelAndView mav) {
        List<Province> provinceList = provinceService.selectList();
        List<ProvinceVO> provinceVOList = ProvinceTrans.mapper.provinceList2ProvinceVOList(provinceList);
        provinceVOList.add(0,new ProvinceVO(-1,"请选择省份"));
        mav.addObject("provinceVOList", provinceVOList);
        mav.setViewName("receiveAddr_add");
        return mav;
    }

    @ApiOperation(value = "添加部门信息", notes = "", httpMethod = "POST")
    @PostMapping
    public ModelAndView create(@RequestBody ReceiveAddr receiveAddr, ModelAndView mav) {
        receiveAddrService.insert(receiveAddr);
        mav.setViewName("receiveAddr_list");
        return mav;
    }

    @ApiOperation(value = "修改部门信息", notes = "", httpMethod = "PUT")
    @PutMapping
    public ModelAndView updateById(@RequestBody ReceiveAddr receiveAddr, ModelAndView mav) {
        receiveAddrService.updateByPrimaryKeySelective(receiveAddr);
        mav.setViewName("receiveAddr_list");
        return mav;
    }

    @ApiOperation(value = "删除指定的部门", notes = "", httpMethod = "delete")
    @DeleteMapping("/{id}")
    public ModelAndView removeById(@PathVariable Long id, ModelAndView mav) {
        receiveAddrService.deleteByPrimaryKey(id);
        mav.setViewName("receiveAddr_list");
        return mav;
    }
}