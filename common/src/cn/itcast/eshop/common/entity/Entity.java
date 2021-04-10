package cn.itcast.eshop.common.entity;

/*
 * 实体类
 * 所有模块实体类的父类
 * 职责：封装数据
 */
public class Entity
{
    private String id; //数据唯一标识
    private String createTime; //创建时间
    private String deleteTime; //删除时间
    private String idDel = "1"; // 删除状态 0已删除，1正常

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(String createTime)
    {
        this.createTime = createTime;
    }

    public String getDeleteTime()
    {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime)
    {
        this.deleteTime = deleteTime;
    }

    public String getIdDel()
    {
        return idDel;
    }

    public void setIdDel(String idDel)
    {
        this.idDel = idDel;
    }
}
