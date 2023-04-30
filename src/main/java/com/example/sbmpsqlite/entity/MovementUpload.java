package com.example.sbmpsqlite.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("movement_upload")
public class MovementUpload {


    @TableField("user_id")
    private String userId;

    @TableId
    @TableField("movement_name")
    private String movementName;

    @TableField("movement_img")
    private String movementImg;

    @TableField("movement_detail")
    private String movementDetail;

    @TableField("movement_steps")
    private String movementSteps;

    @TableField("movement_position_cn")
    private String movementPositionCn;

    @TableField("movement_position_en")
    private String movementPositionEn;

    @TableField("movement_type")
    private String movementType;

    @TableField("is_selected")
    private Integer isSelected;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public Integer getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Integer isSelected) {
        this.isSelected = isSelected;
    }
}
