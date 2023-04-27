package com.example.sbmpsqlite.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "movement_list")
public class Movement {

    @TableField("movement_type")
    private String movementType;

    @TableField("movement_img")
    private String movementImg;

    @TableId // 主键
    @TableField("movement_name")
    private String movementName;

    @TableField("movement_detail")
    private String movementDetail;


    @TableField("movement_steps")
    private String movementSteps;


    @TableField("is_selected")
    private Integer isSelected;

    @TableField("movement_position_cn")
    private String movementPositionCn;

    @TableField("movement_position_en")
    private String movementPositionEn;
    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public String getMovementImg() {
        return movementImg;
    }

    public void setMovementImg(String movementImg) {
        this.movementImg = movementImg;
    }

    public String getMovementName() {
        return movementName;
    }

    public void setMovementName(String movementName) {
        this.movementName = movementName;
    }

    public String getMovementDetail() {
        return movementDetail;
    }

    public void setMovementDetail(String movementDetail) {
        this.movementDetail = movementDetail;
    }

    public String getMovementSteps() {
        return movementSteps;
    }

    public void setMovementSteps(String movementSteps) {
        this.movementSteps = movementSteps;
    }

    public Integer getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Integer isSelected) {
        this.isSelected = isSelected;
    }

    public String getMovementPositionCn() {
        return movementPositionCn;
    }

    public void setMovementPositionCn(String movementPositionCn) {
        this.movementPositionCn = movementPositionCn;
    }

    public String getMovementPositionEn() {
        return movementPositionEn;
    }

    public void setMovementPositionEn(String movementPositionEn) {
        this.movementPositionEn = movementPositionEn;
    }
}

