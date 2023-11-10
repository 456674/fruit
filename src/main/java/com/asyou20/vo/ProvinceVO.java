package com.asyou20.vo;

import lombok.Data;

import java.util.Map;
@Data
public class ProvinceVO {
    private Map<String,String> name;
    private Map<String,Integer> value;
}
