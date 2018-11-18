package vn.edu.uit.quanlychitieunhom.server_Java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.uit.quanlychitieunhom.server_Java.model.NHOMCHITIEU;
import vn.edu.uit.quanlychitieunhom.server_Java.model.TAIKHOAN;
import vn.edu.uit.quanlychitieunhom.server_Java.model.THANHVIENNHOM;
import vn.edu.uit.quanlychitieunhom.server_Java.model.ThanhviennhomId;

public interface ThanhviennhomRepository extends JpaRepository<THANHVIENNHOM,ThanhviennhomId> {
    THANHVIENNHOM findTHANHVIENNHOMById_NhomchitieuAndId_Taikhoan(NHOMCHITIEU nhomchitieu, TAIKHOAN taikhoan);
    //void deleteById_NhomchitieuAndId_Taikhoan(NHOMCHITIEU nhomchitieu, TAIKHOAN taikhoan);
}
