package com.example.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 在线监测 导线温度监测设备模型
 * @author fyy
 * @Date 2021-12-08
 */
public class SxdlDxwd implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     */
    private String id;

    /**
     * 设备ID
     */
    private String sbid;

    /**
     * 厂商
     */
    private String cs;

    /**
     * 采集单元总数
     */
    private Integer unit_sum;

    private String dataNo;

    /**
     * 采集单元序号
     */
    private Integer unit_no;

    /**
     * 线温1 小数点后1位
     */
    private Float xw1;

    /**
     * 线温2 小数点后1位
     */
    private Float xw2;
    private Float xw3;
    private Float xw4;

    /**
     * 数据日期 格式: yyyy-MM-dd
     */
    private String sjrq;
    /**
     * 采集时间 格式: yyyy-MM-dd hh:mm:ss
     */
    private String cjsj;

    private Integer gjbs;//告警标识
    private String gjnr;//告警内容
    private Date createTime;//入库时间
    private String createBy;//入库账户
    private Date updateTime;//更新时间
    private String updateBy;//更新账户
    private String cdid; //测点id
    private String batx; //采集单元电压

    public String getBatx() {
        return batx;
    }

    public void setBatx(String batx) {
        this.batx = batx;
    }

    public String getCdid() {
        return cdid;
    }

    public void setCdid(String cdid) {
        this.cdid = cdid;
    }

    public Float getXw3() {
        return xw3;
    }

    public void setXw3(Float xw3) {
        this.xw3 = xw3;
    }

    public Float getXw4() {
        return xw4;
    }

    public void setXw4(Float xw4) {
        this.xw4 = xw4;
    }
    public Integer getGjbs() {
        return gjbs;
    }

    public void setGjbs(Integer gjbs) {
        this.gjbs = gjbs;
    }

    public String getDataNo() {
        return dataNo;
    }

    public void setDataNo(String dataNo) {
        this.dataNo = dataNo;
    }

    public String getGjnr() {
        return gjnr;
    }

    public void setGjnr(String gjnr) {
        this.gjnr = gjnr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSbid() {
        return sbid;
    }

    public void setSbid(String sbid) {
        this.sbid = sbid;
    }

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    public Integer getUnit_sum() {
        return unit_sum;
    }

    public void setUnit_sum(Integer unit_sum) {
        this.unit_sum = unit_sum;
    }

    public Integer getUnit_no() {
        return unit_no;
    }

    public void setUnit_no(Integer unit_no) {
        this.unit_no = unit_no;
    }

    public Float getXw1() {
        return xw1;
    }

    public void setXw1(Float xw1) {
        this.xw1 = xw1;
    }

    public Float getXw2() {
        return xw2;
    }

    public void setXw2(Float xw2) {
        this.xw2 = xw2;
    }



    public String getSjrq() {
        return sjrq;
    }

    public void setSjrq(String sjrq) {
        this.sjrq = sjrq;
    }

    public String getCjsj() {
        return cjsj;
    }

    public void setCjsj(String cjsj) {
        this.cjsj = cjsj;
    }
}
