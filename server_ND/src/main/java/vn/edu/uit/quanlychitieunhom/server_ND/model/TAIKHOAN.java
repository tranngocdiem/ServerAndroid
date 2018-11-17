package vn.edu.uit.quanlychitieunhom.server_ND.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TAIKHOAN")

public class TAIKHOAN implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String tentaikhoan;
    @Column(name = "matkhau")
    private String matkhau;
    @Column(name = "tennguoidung")
    private String tennguoidung;
    @Column(name = "ngaysinh")
    private Date ngaysinh;
    @Column(name = "gioitinh")
    private String gioitinh;
    @Column(name = "sodienthoai")
    private String sodienthoai;
    @Column(name = "email")
    private String email;
    @Column(name = "ngaydangki")
    private Date ngaydangki;
    @Column(name = "avatar")
    private String avatar;

    public String getTennguoidung() {
        return tennguoidung;
    }

    public void setTennguoidung(String tennguoidung) {
        this.tennguoidung = tennguoidung;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public void setTentaikhoan(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaydangki() {
        return ngaydangki;
    }

    public void setNgaydangki(Date ngaydangki) {
        this.ngaydangki = ngaydangki;
    }
}
