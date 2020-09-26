package com.sulin.cloud.feign;

import com.sulin.cloud.common.modules.raw.entity.Raw;
import com.sulin.cloud.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author slc
 */
@Component
@Slf4j
public class RowFeignFallbackService implements RowFeignService{


    @Override
    public List<Raw> getRowList() {
        log.info("row feign getRowList方法 出现熔断情况");
        return null;
    }

    @Override
    public R rList() {
        log.info("row feign rList方法 出现熔断情况");
        return R.error("手动熔断");
    }
}
