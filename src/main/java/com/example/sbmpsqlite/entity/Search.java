package com.example.sbmpsqlite.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "search_list")
public class Search {

    @TableId
    @TableField("movement_name")
    private String movementName;

    @TableField("movement_img")
    private String movementImg;

    public String getMovementName() {
        return movementName;
    }

    public void setMovementName(String movementName) {
        this.movementName = movementName;
    }

    public String getMovementImg() {
        return movementImg;
    }

    public void setMovementImg(String movementImg) {
        this.movementImg = movementImg;
    }
}
