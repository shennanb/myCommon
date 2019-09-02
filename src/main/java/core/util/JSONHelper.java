package core.util;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import org.hibernate.validator.internal.util.StringHelper;

import java.util.List;

/**
 * @Description Json 工具类
 */
public class JSONHelper {

    public static <T> T jsonToObject(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

    public static String objectToJson(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static <T> T objectToBean(Object object, Class<T> clazz) {
        return jsonToObject(objectToJson(object), clazz);
    }

    public static <T> T xmlToObject(String xml, Class<T> clazz) {
        JSONObject jsonObject = JSONUtil.xmlToJson(xml);
        return JSONUtil.toBean(jsonObject, clazz);
    }

    public static <T> List<T> jsonToList(String json, Class<T> clazz) {
        if (StrUtil.isEmpty(json)) {
            return null;
        }
        return JSON.parseArray(json, clazz);
    }

    public static String objectToXml(Object obj) {
        return JSONUtil.toXmlStr(JSONUtil.parse(obj));
    }

}
