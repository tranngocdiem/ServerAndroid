package vn.edu.uit.quanlychitieunhom.server_ND.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.uit.quanlychitieunhom.server_ND.model.TAIKHOAN;

import java.util.Date;

@Repository
@Transactional
public interface TaikhoanRepository extends JpaRepository<TAIKHOAN,String> {

    TAIKHOAN findTaikhoanByTentaikhoan(String tentaikhoan);

  /*  //Update without change password
    @Query(
            "update table Taikhoan set tennguoidung = ?2 , sodienthoai = ?3, gioitinh = 4, ngaysinh = ?5 where tentaikhoan = ?1"
    )
    TAIKHOAN updateTaikhoanNoPass(String tentaikhoan, String tennguoidung, Number sodienthoai, String gioitinh, Date ngaysinh);

    //Check password of an account
    int countTAIKHOANByTentaikhoanAndMatkhau(String tentaikhoan, String matkhau);

    //Update taikhoan with password
    TAIKHOAN updateTaikhoanWithPass(String tentaikhoan, String tennguoidung, Number sodienthoai, String gioitinh, Date ngaysinh,String matkhaucu, String matkhaumoi);
*/

}
