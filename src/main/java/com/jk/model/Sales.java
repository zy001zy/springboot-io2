package com.jk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zy on 2017/11/16.
 */
@Entity
public class Sales implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;//货品id
    @Column(nullable = false, unique = true)
    private Long   salesDH;//货品单号
    @Column(nullable = false)
    private String salesName;//客户名
    @Column(nullable = false)
    private Date   saDate;//销售时间
    @Column(nullable = false)
    private Double saSum;//销售总额
    @Column(nullable = false)
    private Integer saDj;//登记情况
    @Column(nullable = false)
    private Integer saZt;//状态
    @Column(nullable = false)
    private Double saYsum;//预计收款金额
    @Column(nullable = false)
    private Date yjsDate ;//预计收款日
    @Column(nullable = false)
    private Date yjfDate; //预计发货日
    @Column(nullable = false)
    private Integer salesType;//发货方式
    @Column(nullable = false)
    private String ywName;//业务员
    @Column(nullable = false)
    private String beizhu;//备注

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getSalesDH() {
        return salesDH;
    }

    public void setSalesDH(Long salesDH) {
        this.salesDH = salesDH;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public Date getSaDate() {
        return saDate;
    }

    public void setSaDate(Date saDate) {
        this.saDate = saDate;
    }

    public Double getSaSum() {
        return saSum;
    }

    public void setSaSum(Double saSum) {
        this.saSum = saSum;
    }

    public Integer getSaDj() {
        return saDj;
    }

    public void setSaDj(Integer saDj) {
        this.saDj = saDj;
    }

    public Integer getSaZt() {
        return saZt;
    }

    public void setSaZt(Integer saZt) {
        this.saZt = saZt;
    }

    public Double getSaYsum() {
        return saYsum;
    }

    public void setSaYsum(Double saYsum) {
        this.saYsum = saYsum;
    }

    public Date getYjsDate() {
        return yjsDate;
    }

    public void setYjsDate(Date yjsDate) {
        this.yjsDate = yjsDate;
    }

    public Date getYjfDate() {
        return yjfDate;
    }

    public void setYjfDate(Date yjfDate) {
        this.yjfDate = yjfDate;
    }

    public Integer getSalesType() {
        return salesType;
    }

    public void setSalesType(Integer salesType) {
        this.salesType = salesType;
    }

    public String getYwName() {
        return ywName;
    }

    public void setYwName(String ywName) {
        this.ywName = ywName;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public Sales(Long salesDH, String salesName, Date saDate, Double saSum, Integer saDj, Integer saZt, Double saYsum, Date yjsDate, Date yjfDate, Integer salesType, String ywName, String beizhu) {
        this.salesDH = salesDH;
        this.salesName = salesName;
        this.saDate = saDate;
        this.saSum = saSum;
        this.saDj = saDj;
        this.saZt = saZt;
        this.saYsum = saYsum;
        this.yjsDate = yjsDate;
        this.yjfDate = yjfDate;
        this.salesType = salesType;
        this.ywName = ywName;
        this.beizhu = beizhu;
    }

    public Sales() {
    }
}
