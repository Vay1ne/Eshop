package cn.itcast.eshop.common.entity;

/*
 * 消息封装类
 * */
public class Msg
{
    public static final String SUCCESS = "SUCCESS"; //消息类型：成功
    public static final String FAIL = "FAIL";//消息类型：失败
    private String msg; //消息内容
    private String type; //消息类型：成功-SUCCESS,失败-FAIL

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
