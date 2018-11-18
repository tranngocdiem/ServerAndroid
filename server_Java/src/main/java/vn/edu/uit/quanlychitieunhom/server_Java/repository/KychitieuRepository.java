package vn.edu.uit.quanlychitieunhom.server_Java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.uit.quanlychitieunhom.server_Java.model.KYCHITIEU;

import java.util.List;

public interface KychitieuRepository extends JpaRepository<KYCHITIEU, Integer> {

    KYCHITIEU findByMakychitieu(Integer makychitieu);

    List<KYCHITIEU> findAll();
}
