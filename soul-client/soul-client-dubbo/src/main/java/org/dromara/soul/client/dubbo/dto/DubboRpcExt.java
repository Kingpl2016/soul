package org.dromara.soul.client.dubbo.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author xiaoyu
 */
@Data
@Builder
public class DubboRpcExt {

    private String group;

    private String version;

    private String loadbalance;

    private Integer retries;

    private Integer timeout;
}
