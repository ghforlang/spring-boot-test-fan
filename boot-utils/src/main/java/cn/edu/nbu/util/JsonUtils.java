/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved. 
 * This software is the confidential and proprietary information of GuaHao Company. 
 * ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall use it only 
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package cn.edu.nbu.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * @author fanwenhao
 * @version V1.0
 * @since 2018-11-10 15:17
 */
@Slf4j
public class JsonUtils {

    private JsonUtils(){};

    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, Boolean.FALSE);
        MAPPER.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, Boolean.FALSE);
        MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    /**
     * 对象转换成json格式
     *
     * @param obj
     * @return
     */
    public static String toJSON(Object obj) {
        if (obj == null) {
            return "";
        }

        try {
            return MAPPER.writeValueAsString(obj);
        } catch (Exception e) {
            log.error("对象转换json出错", e);
        }
        return "";
    }

    /**
     * json格式转换成对象
     *
     * @param json
     * @param clazz
     * @return
     */
    public static <T> T fromJSON(String json, Class<T> clazz) {
        if (StringUtils.isBlank(json)) {
            return null;
        }

        try {
            return MAPPER.readValue(json, clazz);
        } catch (Exception e) {
            log.error("json转换对象出错,json={}", json, e);
        }
        return null;
    }

    /**
     * json格式转换成Map
     *
     * @param jsonString
     * @return Map
     */
    public static Map<String, Object> getMap4Json(String jsonString) {
        if (StringUtils.isBlank(jsonString)) {
            return null;
        }

        try {
            Map<String, Object> maps = MAPPER.readValue(jsonString, Map.class);
            Iterator<String> iter = maps.keySet().iterator();
            Map<String, Object> valueMap = new HashMap<>();
            while (iter.hasNext()) {
                String key = iter.next();
                Object value = maps.get(key);
                valueMap.put(key, value);
            }
            return valueMap;
        } catch (Exception e) {
            log.error("json转换Map对象出错,json={}", jsonString, e);
        }
        return null;
    }

}
