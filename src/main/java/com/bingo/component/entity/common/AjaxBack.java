package com.bingo.component.entity.common;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author:yaobin
 * @date:2020/5/12,18:23
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AjaxBack implements Serializable {
    //状态
    private Integer status;
    //信息
    private String message;
    //数据
    private Object data;
}
