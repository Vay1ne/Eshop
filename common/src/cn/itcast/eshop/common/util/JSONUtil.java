package cn.itcast.eshop.common.util;

import cn.itcast.eshop.common.entity.Entity;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/*
 * JSON工具类
 * 处理和JSON相关的所有内容
 * */
public class JSONUtil
{
    public static void main(String[] args)
    {
        Entity entity = new Entity();
        entity.setId("100");
        entity.setCreateTime("12:43");
        String json = entity2JSON(entity);
        System.out.println(json); // {"createTime":"12:43","id":"100","idDel":"1"}
        System.out.println("-----------------");
        List<Entity> entityList = new ArrayList<>();
        entityList.add(entity);
        String jsonList = entityList2JSON(entityList);
        System.out.println(jsonList); //[{"createTime":"12:43","id":"100","idDel":"1"}]
        System.out.println("-----------------");
        String jsonStr = "{\"createTime\":\"12:43\",\"id\":\"100\",\"idDel\":\"1\"}"; // 斜杠是转义字符
        Entity e = JSON2Entity(jsonStr, Entity.class);
        System.out.println(e.getCreateTime());
        System.out.println("-----------------");
        String jsonArr = "[{\"createTime\":\"12:43\",\"id\":\"100\",\"idDel\":\"1\"}]";
        List<Entity> el = JSONArray2List(jsonArr, Entity.class);
        System.out.println(el.get(0).getCreateTime());

    }

    /*
     * 把对象转换为JSON格式的字符串
     * @param entity 指定对象
     * @return 返回json格式的字符串
     * */
    public static String entity2JSON(Object entity)
    {
        return JSON.toJSONString(entity);
    }

    /*
     * 把实体对象列表转换为JSON字符串
     * */
    public static String entityList2JSON(List<?> entityList)
    {
        return entity2JSON(entityList);
    }

    /*
     * 将JSON字符串转换成指定类型对象
     * ? 泛型的通配符，代表的是未知的任意类型，或者说是Object
     * @param json 要转换的数据
     * @param clazz 指定的类型
     * @return 返回object对象*/
    public static <T> T JSON2Entity(String json, Class<T> clazz)
    {
        return JSON.parseObject(json, clazz);
    }

    /*
     * 将JSON数组转换成指定类型
     * */
    public static <T> List<T> JSONArray2List(String json, Class<T> clazz)
    {
        return JSON.parseArray(json, clazz);
    }

}
