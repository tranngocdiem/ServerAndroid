package vn.edu.uit.quanlychitieunhom.server_Java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.uit.quanlychitieunhom.server_Java.model.TAIKHOAN;

@Repository
@Transactional
public interface TaikhoanRepository extends JpaRepository<TAIKHOAN,String> {

    TAIKHOAN findTaikhoanByTentaikhoan(String tentaikhoan);





}
