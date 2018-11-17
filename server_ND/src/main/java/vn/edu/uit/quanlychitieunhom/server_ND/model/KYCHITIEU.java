package vn.edu.uit.quanlychitieunhom.server_ND.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "kychitieu")
public class KYCHITIEU implements Serializable {
    @Id
    @GeneratedValue
    private Integer makychitieu;
    @Column(name = "tenkychitieu")
    private String tenkichitieu;
    @Column(name = "tungay")
    private Date tungay;
    @Column(name = "denngay")
    private Date denngay;
    @Column(name = "hanmucchitieu")
    private Float hanmucchitieu;

    @ManyToOne
    @JoinColumn(name = "manhomchitieu", foreignKey = @ForeignKey(name = "fk_KYCHITIEU_NHOMCHITIEU_1"))
    private NHOMCHITIEU manhomchitieu;

    public Integer getMakychitieu() {
        return makychitieu;
    }

    public void setMakychitieu(Integer makychitieu) {
        this.makychitieu = makychitieu;
    }

    public String getTenkichitieu() {
        return tenkichitieu;
    }

    public void setTenkichitieu(String tenkichitieu) {
        this.tenkichitieu = tenkichitieu;
    }

    public Date getTungay() {
        return tungay;
    }

    public void setTungay(Date tungay) {
        this.tungay = tungay;
    }

    public Date getDenngay() {
        return denngay;
    }

    public void setDenngay(Date denngay) {
        this.denngay = denngay;
    }

    public Float getHanmucchitieu() {
        return hanmucchitieu;
    }

    public void setHanmucchitieu(Float hanmucchitieu) {
        this.hanmucchitieu = hanmucchitieu;
    }

    public NHOMCHITIEU getNhomchitieu() {
        return manhomchitieu;
    }

    public void setNhomchitieu(NHOMCHITIEU nhomchitieu) {
        this.manhomchitieu = nhomchitieu;
    }
}
