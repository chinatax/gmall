package cn.chinatax.josewu.base.bean;

import java.io.Serializable;

public class Hydm implements Serializable {
    private Short id;

    private String hyDm;

    private String hyMc;

    private String mlbz;

    private String dlbz;

    private String zlbz;

    private String xlbz;

    private String xybz;

    private String yxbz;

    public Hydm(Short id, String hyDm, String hyMc, String mlbz, String dlbz, String zlbz, String xlbz, String xybz, String yxbz) {
        this.id = id;
        this.hyDm = hyDm;
        this.hyMc = hyMc;
        this.mlbz = mlbz;
        this.dlbz = dlbz;
        this.zlbz = zlbz;
        this.xlbz = xlbz;
        this.xybz = xybz;
        this.yxbz = yxbz;
    }

    public Hydm() {
        super();
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getHyDm() {
        return hyDm;
    }

    public void setHyDm(String hyDm) {
        this.hyDm = hyDm == null ? null : hyDm.trim();
    }

    public String getHyMc() {
        return hyMc;
    }

    public void setHyMc(String hyMc) {
        this.hyMc = hyMc == null ? null : hyMc.trim();
    }

    public String getMlbz() {
        return mlbz;
    }

    public void setMlbz(String mlbz) {
        this.mlbz = mlbz == null ? null : mlbz.trim();
    }

    public String getDlbz() {
        return dlbz;
    }

    public void setDlbz(String dlbz) {
        this.dlbz = dlbz == null ? null : dlbz.trim();
    }

    public String getZlbz() {
        return zlbz;
    }

    public void setZlbz(String zlbz) {
        this.zlbz = zlbz == null ? null : zlbz.trim();
    }

    public String getXlbz() {
        return xlbz;
    }

    public void setXlbz(String xlbz) {
        this.xlbz = xlbz == null ? null : xlbz.trim();
    }

    public String getXybz() {
        return xybz;
    }

    public void setXybz(String xybz) {
        this.xybz = xybz == null ? null : xybz.trim();
    }

    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz == null ? null : yxbz.trim();
    }
}