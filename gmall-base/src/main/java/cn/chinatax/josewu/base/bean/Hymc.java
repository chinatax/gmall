package cn.chinatax.josewu.base.bean;

import java.io.Serializable;

public class Hymc implements Serializable {

       public static final long  serialVersionUID  = -5189652849506557843L;

       private  int uuid;

       private  String   hydm;

       private  String   hymc;

        public int getUuid() {
            return uuid;
        }

        public void setUuid(int uuid) {
            this.uuid = uuid;
        }

        public String getHydm() {
            return hydm;
        }

        public void setHydm(String hydm) {
            this.hydm = hydm;
        }

        public String getHymc() {
            return hymc;
        }

        public void setHymc(String hymc) {
            this.hymc = hymc;
        }
}
