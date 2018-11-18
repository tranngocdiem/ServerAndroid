package vn.edu.uit.quanlychitieunhom.server_Java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.uit.quanlychitieunhom.server_Java.model.GIAODICH;

import java.util.List;

public interface GiaodichRepository extends JpaRepository<GIAODICH, Integer> {

    GIAODICH findByMagiaodich(Integer magiaodich);

    List<GIAODICH> findAll();
}
