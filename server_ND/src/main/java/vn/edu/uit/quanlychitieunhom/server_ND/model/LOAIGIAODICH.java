package vn.edu.uit.quanlychitieunhom.server_ND.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LOAIGIAODICH")
public class LOAIGIAODICH implements Serializable {
    @Id
    @GeneratedValue
    private Integer maloaigiaodich;
    @Column(name = "tenloaigiaodich")
    private String tenloaigiaodich;
    @Column(name = "nhom")
    private String nhom;

    public Integer getMaloaigiaodich() {
        return maloaigiaodich;
    }

    public void setMaloaigiaodich(Integer maloaigiaodich) {
        this.maloaigiaodich = maloaigiaodich;
    }

    public String getTenloaigiaodich() {
        return tenloaigiaodich;
    }

    public void setTenloaigiaodich(String tenloaigiaodich) {
        this.tenloaigiaodich = tenloaigiaodich;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }
}
