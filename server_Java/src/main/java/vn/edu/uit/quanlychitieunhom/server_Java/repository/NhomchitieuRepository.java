package vn.edu.uit.quanlychitieunhom.server_Java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.uit.quanlychitieunhom.server_Java.model.NHOMCHITIEU;

public interface NhomchitieuRepository extends JpaRepository<NHOMCHITIEU,Integer> {
    NHOMCHITIEU findNHOMCHITIEUByManhomchitieu(Integer manhomchitieu);
}
