package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Partner;
import lombok.Data;

/**
 * @version 1.0.0
 * @program: dkd-parent
 * @className: PartnerVo
 * @description:
 * @author: Lin
 * @create: 2025/8/4 21:15
 **/
@Data
public class PartnerVo extends Partner {

    // 点位数量
    private Integer nodeCount;
}