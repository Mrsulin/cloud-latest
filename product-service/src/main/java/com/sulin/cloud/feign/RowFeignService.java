package com.sulin.cloud.feign;

import com.sulin.cloud.common.modules.raw.entity.Raw;
import com.sulin.cloud.common.utils.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author slc
 */
@FeignClient(name = "rowService", url = "${remote.url}/raw",fallback = RowFeignFallbackService.class)
public interface RowFeignService {

    @GetMapping("/list")
    List<Raw> getRowList();

    @GetMapping("/R/list")
    R rList();
}
