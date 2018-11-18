package vn.edu.uit.quanlychitieunhom.server_Java.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "giaodich")
public class GIAODICH implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "magiaodich")
    private Integer magiaodich;
    @Column(name = "ngaygiaodich")
    private Date ngaygiaodich;
    @Column(name = "sotien")
    private Float sotien;
    @Column(name = "ghichu")
    private String ghichu;
    @Column(name = "anhhoadon")
    private String anhhoadon;


    @ManyToOne
    @JoinColumn(name = "maloaigiaodich", foreignKey = @ForeignKey(name = "fk_GIAODICH_LOAIGIAODICH_1"))
    private LOAIGIAODICH maloaigiaodich;


    @ManyToOne
    @JoinColumn(name = "tentaikhoan", foreignKey = @ForeignKey(name = "fk_GIAODICH_TAIKHOAN_1"))
    private TAIKHOAN mataikhoan;


    @ManyToOne
    @JoinColumn(name = "manhomchitieu", foreignKey = @ForeignKey(name = "fk_GIAODICH_NHOMCHITIEU_1"))
    private NHOMCHITIEU manhomchitieu;

    public Integer getMagiaodich() {
        return magiaodich;
    }

    public void setMagiaodich(Integer magiaodich) {
        this.magiaodich = magiaodich;
    }

    public Date getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(Date ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public Float getSotien() {
        return sotien;
    }

    public void setSotien(Float sotien) {
        this.sotien = sotien;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getAnhhoadon() {
        return anhhoadon;
    }

    public void setAnhhoadon(String anhhoadon) {
        this.anhhoadon = anhhoadon;
    }

    public LOAIGIAODICH getLoaigiaodich() {
        return maloaigiaodich;
    }

    public void setLoaigiaodich(LOAIGIAODICH loaigiaodich) {
        this.maloaigiaodich = loaigiaodich;
    }

    public TAIKHOAN getTaikhoan() {
        return mataikhoan;
    }

    public void setTaikhoan(TAIKHOAN taikhoan) {
        this.mataikhoan = taikhoan;
    }

    public NHOMCHITIEU getNhomchitieu() {
        return manhomchitieu;
    }

    public void setNhomchitieu(NHOMCHITIEU nhomchitieu) {
        this.manhomchitieu = nhomchitieu;
    }
}
