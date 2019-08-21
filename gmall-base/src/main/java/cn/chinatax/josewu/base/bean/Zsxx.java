package cn.chinatax.josewu.base.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Zsxx implements Serializable {
    private Long id;

    private Short xh;

    private String dq;

    private BigDecimal jfrsSntq;

    private BigDecimal jfjsSntq;

    private BigDecimal jfjeSntq;

    private BigDecimal jfrsBq;

    private BigDecimal jfjsBq;

    private BigDecimal jfjeBq;

    private BigDecimal xj;

    private BigDecimal jvjf;

    private BigDecimal spgzkjjfe;

    private BigDecimal xsjfzchs;

    public Zsxx(Long id, Short xh, String dq, BigDecimal jfrsSntq, BigDecimal jfjsSntq, BigDecimal jfjeSntq, BigDecimal jfrsBq, BigDecimal jfjsBq, BigDecimal jfjeBq, BigDecimal xj, BigDecimal jvjf, BigDecimal spgzkjjfe, BigDecimal xsjfzchs) {
        this.id = id;
        this.xh = xh;
        this.dq = dq;
        this.jfrsSntq = jfrsSntq;
        this.jfjsSntq = jfjsSntq;
        this.jfjeSntq = jfjeSntq;
        this.jfrsBq = jfrsBq;
        this.jfjsBq = jfjsBq;
        this.jfjeBq = jfjeBq;
        this.xj = xj;
        this.jvjf = jvjf;
        this.spgzkjjfe = spgzkjjfe;
        this.xsjfzchs = xsjfzchs;
    }

    public Zsxx() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getXh() {
        return xh;
    }

    public void setXh(Short xh) {
        this.xh = xh;
    }

    public String getDq() {
        return dq;
    }

    public void setDq(String dq) {
        this.dq = dq == null ? null : dq.trim();
    }

    public BigDecimal getJfrsSntq() {
        return jfrsSntq;
    }

    public void setJfrsSntq(BigDecimal jfrsSntq) {
        this.jfrsSntq = jfrsSntq;
    }

    public BigDecimal getJfjsSntq() {
        return jfjsSntq;
    }

    public void setJfjsSntq(BigDecimal jfjsSntq) {
        this.jfjsSntq = jfjsSntq;
    }

    public BigDecimal getJfjeSntq() {
        return jfjeSntq;
    }

    public void setJfjeSntq(BigDecimal jfjeSntq) {
        this.jfjeSntq = jfjeSntq;
    }

    public BigDecimal getJfrsBq() {
        return jfrsBq;
    }

    public void setJfrsBq(BigDecimal jfrsBq) {
        this.jfrsBq = jfrsBq;
    }

    public BigDecimal getJfjsBq() {
        return jfjsBq;
    }

    public void setJfjsBq(BigDecimal jfjsBq) {
        this.jfjsBq = jfjsBq;
    }

    public BigDecimal getJfjeBq() {
        return jfjeBq;
    }

    public void setJfjeBq(BigDecimal jfjeBq) {
        this.jfjeBq = jfjeBq;
    }

    public BigDecimal getXj() {
        return xj;
    }

    public void setXj(BigDecimal xj) {
        this.xj = xj;
    }

    public BigDecimal getJvjf() {
        return jvjf;
    }

    public void setJvjf(BigDecimal jvjf) {
        this.jvjf = jvjf;
    }

    public BigDecimal getSpgzkjjfe() {
        return spgzkjjfe;
    }

    public void setSpgzkjjfe(BigDecimal spgzkjjfe) {
        this.spgzkjjfe = spgzkjjfe;
    }

    public BigDecimal getXsjfzchs() {
        return xsjfzchs;
    }

    public void setXsjfzchs(BigDecimal xsjfzchs) {
        this.xsjfzchs = xsjfzchs;
    }
}