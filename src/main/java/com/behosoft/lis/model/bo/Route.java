package com.behosoft.lis.model.bo;

import java.util.Date;

import javax.persistence.*;
/**
 *
 */
public class Route {
    /**
     * 主键
     */
     @Column(name = "id")
    private String id;

    /**
     * 路线编码
     */
     @Column(name = "no")
    private String no;

    /**
     * 路线名称
     */
     @Column(name = "name")
    private String name;

    /**
     * 账户ID
     */
     @Column(name = "account_id")
    private String accountId;

    /**
     * 路线类型:[客户-1,门店-2],路线类型唯一
     */
     @Column(name = "type")
    private Long type;

    /**
     * 仓库ID
     */
     @Column(name = "warehouse_id")
    private String warehouseId;

    /**
     * 仓库编码
     */
     @Column(name = "warehouse_code")
    private String warehouseCode;

    /**
     * 货主ID
     */
     @Column(name = "customer_id")
    private String customerId;

    /**
     * 货主编码
     */
     @Column(name = "customer_code")
    private String customerCode;

    /**
     * 来源:[TMS-1,菜菜-2,手动创建-3]
     */
     @Column(name = "source")
    private Long source;

    /**
     * 删除标志:[未删除-0,已删除-1]
     */
     @Column(name = "delete_flag")
    private Long deleteFlag;

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

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public Long getSource() {
        return source;
    }

    public void setSource(Long source) {
        this.source = source;
    }

    public Long getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Long deleteFlag) {
        this.deleteFlag = deleteFlag;
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