package vn.edu.uit.quanlychitieunhom.server_Java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.uit.quanlychitieunhom.server_Java.model.LOAIGIAODICH;

import java.util.List;

public interface LoaigiaodichRepository extends JpaRepository<LOAIGIAODICH, Integer> {

    LOAIGIAODICH findByMaloaigiaodich(Integer maloaigiaodich);

    List<LOAIGIAODICH> findAll();
}
