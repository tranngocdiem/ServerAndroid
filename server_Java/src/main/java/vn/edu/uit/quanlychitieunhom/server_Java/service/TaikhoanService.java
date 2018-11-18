package vn.edu.uit.quanlychitieunhom.server_Java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.uit.quanlychitieunhom.server_Java.model.TAIKHOAN;
import vn.edu.uit.quanlychitieunhom.server_Java.repository.TaikhoanRepository;

@Service
public class TaikhoanService {
    @Autowired
    TaikhoanRepository taikhoanRepository;

    public TAIKHOAN getTaikhoanByTentaikhoan(String tentaikhoan)
    {
        return taikhoanRepository.findTaikhoanByTentaikhoan(tentaikhoan);
    }

    /*public TAIKHOAN updateTaikhoanNoPass(String tentaikhoan, String tennguoidung, Number sodienthoai, String gioitinh, Date ngaysinh)
    {
        taikhoanRepository.updateTaikhoanNoPass(tentaikhoan,tennguoidung,sodienthoai,gioitinh,ngaysinh);
        return getTaikhoanByTentaikhoan(tentaikhoan);
    }*/


}
