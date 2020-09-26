package com.sulin.cloud.controller;

import com.sulin.cloud.common.modules.product.entity.Product;
import com.sulin.cloud.common.modules.product.vo.ProductQueryVo;
import com.sulin.cloud.common.modules.raw.entity.Raw;
import com.sulin.cloud.common.utils.R;
import com.sulin.cloud.dao.ProductDao;
import com.sulin.cloud.feign.RowFeignService;
import com.sulin.cloud.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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

    @Resource
    private RowFeignService rowFeignService;


    @PostMapping("list")
    @ApiOperation(value = "1")
    public R list(@RequestBody ProductQueryVo productQueryVo) {
        List<Product> list = productService.list();
        return R.ok().put("data",list);
    }

    @GetMapping("feign/raw")
    @ApiOperation(value = "2")
    public R list() {
        List<Raw> rowList = rowFeignService.getRowList();
        return R.ok().put("data",rowList);
    }

    @GetMapping("R/feign/raw")
    @ApiOperation(value = "3")
    public R rFeign() {
        R r = rowFeignService.rList();
        return r;
    }
}
