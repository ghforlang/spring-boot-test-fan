package cn.edu.nbu.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/21 17:34
 */
public class Cache {

    private Map<String,Object> map = new HashMap<>();

    public void set(String key,String value){
        this.map.put(key,value);
    }

    public Object get(String key){
        return this.map.get(key);
    }

}
