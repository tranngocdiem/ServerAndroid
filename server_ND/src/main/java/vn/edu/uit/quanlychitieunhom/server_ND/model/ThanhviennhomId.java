package vn.edu.uit.quanlychitieunhom.server_ND.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ThanhviennhomId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "tentaikhoan", foreignKey = @ForeignKey(name = "fk_THANHVIENNHOM_TAIKHOAN1"))
    private TAIKHOAN taikhoan;
    @ManyToOne
    @JoinColumn(name = "manhomchitieu", foreignKey = @ForeignKey(name = "fk_THANHVIENNHOM_NHOMCHITIEU1"))
    private NHOMCHITIEU nhomchitieu;

    public TAIKHOAN getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(TAIKHOAN taikhoan) {
        this.taikhoan = taikhoan;
    }

    public NHOMCHITIEU getNhomchitieu() {
        return nhomchitieu;
    }

    public void setNhomchitieu(NHOMCHITIEU nhomchitieu) {
        this.nhomchitieu = nhomchitieu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThanhviennhomId that = (ThanhviennhomId) o;
        return Objects.equals(taikhoan, that.taikhoan) &&
                Objects.equals(nhomchitieu, that.nhomchitieu);
    }

    @Override
    public int hashCode() {

        return Objects.hash(taikhoan, nhomchitieu);
    }
}
