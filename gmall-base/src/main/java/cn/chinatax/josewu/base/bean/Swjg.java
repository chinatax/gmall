package cn.chinatax.josewu.base.bean;

import java.io.Serializable;

public class Swjg implements Serializable {
    private Short id;

    private String swjgDm;

    private String swjgMc;

    public Swjg(Short id, String swjgDm, String swjgMc) {
        this.id = id;
        this.swjgDm = swjgDm;
        this.swjgMc = swjgMc;
    }

    public Swjg() {
        super();
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getSwjgDm() {
        return swjgDm;
    }

    public void setSwjgDm(String swjgDm) {
        this.swjgDm = swjgDm == null ? null : swjgDm.trim();
    }

    public String getSwjgMc() {
        return swjgMc;
    }

    public void setSwjgMc(String swjgMc) {
        this.swjgMc = swjgMc == null ? null : swjgMc.trim();
    }
}