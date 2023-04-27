package com.example.sbmpsqlite.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("train_movement")
public class TrainMovement {


    private String movementTime;

    @TableField("user_id")
    private String userId;

    @TableField("movement_name")
    private String movementName;

    @TableField("movement_sets")
    private Integer movementSets;

    @TableField("movement_weight")
    private Integer movementWeight;

    @TableField("movement_feeling")
    private String movementFeeling;

    @TableField("movement_type")
    private String movementType;


    public String getMovementTime() {
        return movementTime;
    }

    public void setMovementTime(String movementTime) {
        this.movementTime = movementTime;
    }

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

    public Integer getMovementSets() {
        return movementSets;
    }

    public void setMovementSets(Integer movementSets) {
        this.movementSets = movementSets;
    }

    public Integer getMovementWeight() {
        return movementWeight;
    }

    public void setMovementWeight(Integer movementWeight) {
        this.movementWeight = movementWeight;
    }

    public String getMovementFeeling() {
        return movementFeeling;
    }

    public void setMovementFeeling(String movementFeeling) {
        this.movementFeeling = movementFeeling;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }
}
