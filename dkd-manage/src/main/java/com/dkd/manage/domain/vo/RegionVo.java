package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Region;
import lombok.Data;

/**
 * @version 1.0.0
 * @program: dkd-parent
 * @className: RegionVo
 * @description:
 * @author: Lin
 * @create: 2025/8/1 22:44
 **/
@Data
public class RegionVo extends Region {

    // 点位数量
    private Integer nodeCount;
}