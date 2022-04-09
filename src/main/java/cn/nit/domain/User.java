package cn.nit.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("users")
public class User {
    @TableId
    private String uid;
    private String uname;
    private String uage;

    @TableLogic
    @TableField("isdeleted")
    private Integer isDeleted;
}
