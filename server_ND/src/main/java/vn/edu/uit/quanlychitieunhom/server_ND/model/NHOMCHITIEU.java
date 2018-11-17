package vn.edu.uit.quanlychitieunhom.server_ND.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "nhomchitieu")
public class NHOMCHITIEU implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "manhomchitieu")
    private Integer manhomchitieu;

    @Column(name = "tennhomchitieu")
    private String tennhomchitieu;

    @Column(name = "quy")
    private Float quy;

    public Integer getManhomchitieu() {
        return manhomchitieu;
    }

    public void setManhomchitieu(Integer manhomchitieu) {
        this.manhomchitieu = manhomchitieu;
    }

    public String getTennhomchitieu() {
        return tennhomchitieu;
    }

    public void setTennhomchitieu(String tennhomchitieu) {
        this.tennhomchitieu = tennhomchitieu;
    }

    public Float getQuy() {
        return quy;
    }

    public void setQuy(Float quy) {
        this.quy = quy;
    }
}
