package com.sulin.cloud.controller;

import com.sulin.cloud.common.modules.product.entity.ProductPlace;
import com.sulin.cloud.common.utils.R;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import com.sulin.cloud.service.ProductPlaceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProductPlace)表控制层
 *
 * @author slc
 * @since 2020-09-26 00:57:21
 */
@RestController
@Api(tags = "产品-生产地 控制器")
@RequestMapping("productPlace")
public class ProductPlaceController {
    /**
     * 服务对象
     */
    @Resource
    private ProductPlaceService productPlaceService;


    @GetMapping("list")
    @ApiOperation(value = "用户列表")
    public R list() {
        List<ProductPlace> list = productPlaceService.list();
        return R.ok().put("data",list);
    }
}
