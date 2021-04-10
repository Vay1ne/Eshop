package cn.itcast.eshop.user.action;

import cn.itcast.eshop.common.action.BaseAction;
import cn.itcast.eshop.common.entity.Msg;
import cn.itcast.eshop.common.util.JSONUtil;
import cn.itcast.eshop.user.entity.User;
import cn.itcast.eshop.user.service.UserService;
import cn.itcast.eshop.user.service.impl.UserServiceImpl;

/*
 * 用户控制器类
 * 处理所有用户的后台操作，并返回JSON格式的字符串消息
 * */
public class UserAction extends BaseAction
{
    private String username; //用户名
    private String password; //密码

    /*
     * 用户登录功能
     * 1.封装数据到User对象
     * 2.调用UserService处理逻辑
     * 3.异常处理
     * 4.根据服务层返回结果生成消息
     * 5.记录日志
     * 6.响应消息到客户端
     * */
    public String login()
    {
        Msg msg = new Msg();
        try
        {
            // 1.封装User对象
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);

            // 2.调用UserService处理逻辑
            UserService userService = new UserServiceImpl();
            user = userService.login(user);
            // 4.根据服务层返回结果生成消息
            //    消息实体类Msg
            if (user != null)
            {
                msg.setType(Msg.SUCCESS); // 登录成功
                msg.setMsg("登录成功！");
            }
            else
            {
                msg.setType(Msg.FAIL); // 登录成功
                msg.setMsg("用户名或密码错误");
            }
            return JSONUtil.entity2JSON(msg);
        } catch (Exception e) // 3.异常处理
        {
            e.printStackTrace();
            msg.setType(Msg.FAIL); // 登录失败
            msg.setMsg("服务器异常");
            return JSONUtil.entity2JSON(msg);
        }
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}