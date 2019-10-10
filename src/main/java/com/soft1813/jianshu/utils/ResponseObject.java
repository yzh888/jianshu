package com.soft1813.jianshu.utils;

import lombok.Data;

/**
 * @author zh_yan
 * @ClassName ResponseObject
 * @Description 统一响应对象
 * @Date 2019/10/10
 * @Version 1.0
 **/
@Data
public class ResponseObject {
    private Integer code;
    private String msg;
    private Object data;
}
