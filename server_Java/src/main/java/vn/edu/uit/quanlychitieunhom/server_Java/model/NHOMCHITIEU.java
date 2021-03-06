package vn.edu.uit.quanlychitieunhom.server_Java.model;

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
    private Double quy;

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

    public Double getQuy() {
        return quy;
    }

    public void setQuy(Double quy) {
        this.quy = quy;
    }
}
