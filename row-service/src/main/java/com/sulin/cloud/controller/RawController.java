package com.sulin.cloud.controller;

import com.sulin.cloud.common.utils.R;
import com.sulin.cloud.entity.Raw;
import com.sulin.cloud.service.RawService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * (Raw)表控制层
 *
 * @author slc
 * @since 2020-09-26 21:11:27
 */
@Api(tags = "原料-控制器")
@RestController
@RequestMapping("raw")
public class RawController {
    /**
     * 服务对象
     */
    @Resource
    private RawService rawService;


    @GetMapping("list")
    @ApiOperation(value = "原料列表")
    public R list() {
        List<Raw> list = rawService.list();
        return R.ok().put("data",list);
    }
}
