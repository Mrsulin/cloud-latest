package com.sulin.cloud.controller;

import com.sulin.cloud.common.utils.R;
import com.sulin.cloud.entity.Dictionary;
import com.sulin.cloud.service.DictionaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * (Dictionary)表控制层
 *
 * @author slc
 * @since 2020-09-26 22:41:41
 */
@Api(tags = "-控制器")
@RestController
@RequestMapping("dictionary")
public class DictionaryController {
    /**
     * 服务对象
     */
    @Resource
    private DictionaryService dictionaryService;


    @GetMapping("list")
    @ApiOperation(value = "用户列表")
    public R list() {
        List<Dictionary> list = dictionaryService.list();
        return R.ok().put("data",list);
    }
}
