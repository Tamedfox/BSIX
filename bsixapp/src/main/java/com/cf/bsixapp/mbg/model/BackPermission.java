package com.cf.bsixapp.mbg.model;

import java.util.Date;

public class BackPermission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bsix_back_permission.id
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bsix_back_permission.parent_id
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bsix_back_permission.name
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bsix_back_permission.description
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bsix_back_permission.icon
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bsix_back_permission.url
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bsix_back_permission.type
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bsix_back_permission.status
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bsix_back_permission.create_time
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bsix_back_permission.order_seq
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    private Integer orderSeq;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bsix_back_permission.id
     *
     * @return the value of bsix_back_permission.id
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bsix_back_permission.id
     *
     * @param id the value for bsix_back_permission.id
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bsix_back_permission.parent_id
     *
     * @return the value of bsix_back_permission.parent_id
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bsix_back_permission.parent_id
     *
     * @param parentId the value for bsix_back_permission.parent_id
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bsix_back_permission.name
     *
     * @return the value of bsix_back_permission.name
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bsix_back_permission.name
     *
     * @param name the value for bsix_back_permission.name
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bsix_back_permission.description
     *
     * @return the value of bsix_back_permission.description
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bsix_back_permission.description
     *
     * @param description the value for bsix_back_permission.description
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bsix_back_permission.icon
     *
     * @return the value of bsix_back_permission.icon
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bsix_back_permission.icon
     *
     * @param icon the value for bsix_back_permission.icon
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bsix_back_permission.url
     *
     * @return the value of bsix_back_permission.url
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bsix_back_permission.url
     *
     * @param url the value for bsix_back_permission.url
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bsix_back_permission.type
     *
     * @return the value of bsix_back_permission.type
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bsix_back_permission.type
     *
     * @param type the value for bsix_back_permission.type
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bsix_back_permission.status
     *
     * @return the value of bsix_back_permission.status
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bsix_back_permission.status
     *
     * @param status the value for bsix_back_permission.status
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bsix_back_permission.create_time
     *
     * @return the value of bsix_back_permission.create_time
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bsix_back_permission.create_time
     *
     * @param createTime the value for bsix_back_permission.create_time
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bsix_back_permission.order_seq
     *
     * @return the value of bsix_back_permission.order_seq
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public Integer getOrderSeq() {
        return orderSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bsix_back_permission.order_seq
     *
     * @param orderSeq the value for bsix_back_permission.order_seq
     *
     * @mbg.generated Sat Apr 18 12:11:39 CST 2020
     */
    public void setOrderSeq(Integer orderSeq) {
        this.orderSeq = orderSeq;
    }
}