package com.sulin.cloud.controller;

import com.sulin.cloud.common.utils.R;
import com.sulin.cloud.entity.Product;
import com.sulin.cloud.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Product)表控制层
 *
 * @author slc
 * @since 2020-09-26 01:00:28
 */
@RestController
@RequestMapping("product")
@Api(tags = "产品-主控制器")
public class ProductController {
    /**
     * 服务对象
     */
    @Resource
    private ProductService productService;


    @GetMapping("list")
    @ApiOperation(value = "用户列表")
    public R list() {
        List<Product> list = productService.list();
        return R.ok().put("data",list);
    }
}
