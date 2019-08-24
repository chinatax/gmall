package cn.chinatax.josewu.base.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Rkphb implements Serializable {
    private Long id;

    private String xh;

    private String dq;

    private String djxh;

    private String nsrsbh;

    private String nsrmc;

    private BigDecimal hj;

    private Date tdate;

    public Rkphb(Long id, String xh, String dq, String djxh, String nsrsbh, String nsrmc, BigDecimal hj, Date tdate) {
        this.id = id;
        this.xh = xh;
        this.dq = dq;
        this.djxh = djxh;
        this.nsrsbh = nsrsbh;
        this.nsrmc = nsrmc;
        this.hj = hj;
        this.tdate = tdate;
    }

    public Rkphb() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getDq() {
        return dq;
    }

    public void setDq(String dq) {
        this.dq = dq == null ? null : dq.trim();
    }

    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh == null ? null : djxh.trim();
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh == null ? null : nsrsbh.trim();
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc == null ? null : nsrmc.trim();
    }

    public BigDecimal getHj() {
        return hj;
    }

    public void setHj(BigDecimal hj) {
        this.hj = hj;
    }

    public Date getTdate() {
        return tdate;
    }

    public void setTdate(Date tdate) {
        this.tdate = tdate;
    }
}