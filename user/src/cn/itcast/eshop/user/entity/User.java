package cn.itcast.eshop.user.entity;

public class User extends Person
{
    private String username;
    private String password;
    private String role = "NORMAL"; //代表普通用户

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
