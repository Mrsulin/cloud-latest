package com.sulin.cloud.feign;

import com.sulin.cloud.common.modules.raw.entity.Raw;
import com.sulin.cloud.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author slc
 */
@Component
public class RowFeignFallbackService implements RowFeignService{


    @Override
    public List<Raw> getRowList() {
        return null;
    }

    @Override
    public R rList() {
        return R.error("手动熔断");
    }
}
