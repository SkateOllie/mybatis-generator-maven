package com.behosoft.lis.model.bo;

import java.util.Date;

import javax.persistence.*;
/**
 *
 */
public class RouteRelation {
    /**
     * 主键
     */
     @Column(name = "id")
    private String id;

    /**
     * 关联路线ID
     */
     @Column(name = "route_id")
    private String routeId;

    /**
     * 关联路线编码
     */
     @Column(name = "route_no")
    private String routeNo;

    /**
     * 客户ID
     */
     @Column(name = "transceiver_id")
    private String transceiverId;

    /**
     * 客户编码
     */
     @Column(name = "transceiver_code")
    private String transceiverCode;

    /**
     * 客户类型:[客户-1,门店-2]
     */
     @Column(name = "type")
    private Long type;

    /**
     * 创建人,存名称
     */
     @Column(name = "create_person")
    private String createPerson;

    /**
     * 更新人,存名称
     */
     @Column(name = "update_person")
    private String updatePerson;

    /**
     * 创建时间
     */
     @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
     @Column(name = "update_time")
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    public String getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(String routeNo) {
        this.routeNo = routeNo == null ? null : routeNo.trim();
    }

    public String getTransceiverId() {
        return transceiverId;
    }

    public void setTransceiverId(String transceiverId) {
        this.transceiverId = transceiverId == null ? null : transceiverId.trim();
    }

    public String getTransceiverCode() {
        return transceiverCode;
    }

    public void setTransceiverCode(String transceiverCode) {
        this.transceiverCode = transceiverCode == null ? null : transceiverCode.trim();
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson == null ? null : updatePerson.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}