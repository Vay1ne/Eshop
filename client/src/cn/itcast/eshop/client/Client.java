package cn.itcast.eshop.client;

/*
 * 客户端顶层父类
 * 处理公共的用户操作
 **/
public class Client
{
    public static final String LOGIN = "L"; //全局 用户操作 登录
    public static final String HISTORY = "I"; //全局 上一次操作 记录
    public static final String INDEX = "I";//全局 上一次操作 首页

    public static void main(String[] args)
    {
        Client c = new Client();
        c.start();
    }

    public void start()
    {
        UserClient userClient = new UserClient();
        String result = userClient.showLogin();

        if (result.equals(INDEX)) //首页
        {
            System.out.println("这里是首页");
        } else if (result.equals(LOGIN))
        {
            System.out.println("这里是登录界面");
        } else if (result.equals(HISTORY))
        {
            System.out.println("这里是历史界面");
        } else
        {
            System.out.println("出错了");
        }
    }
}
