package vn.edu.uit.quanlychitieunhom.server_Java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.uit.quanlychitieunhom.server_Java.model.TAIKHOAN;
import vn.edu.uit.quanlychitieunhom.server_Java.repository.TaikhoanRepository;

import java.util.Optional;

@Service
public class TaikhoanService {

    @Autowired
    TaikhoanRepository taikhoanRepository;

    public TAIKHOAN getTaikhoanByTentaikhoan(String tentaikhoan)
    {
        return taikhoanRepository.findTaikhoanByTentaikhoan(tentaikhoan);
    }

    public TAIKHOAN updateTaikhoan (TAIKHOAN taikhoan, String tentaikhoan)
    {
        Optional<TAIKHOAN> studentOptional = taikhoanRepository.findById(tentaikhoan);

        if (!studentOptional.isPresent())
            return null;

        taikhoan.setTentaikhoan(tentaikhoan);
        return taikhoanRepository.save(taikhoan);
    }

    public TAIKHOAN createTaikhoan (TAIKHOAN taikhoan){return taikhoanRepository.save(taikhoan);}

    public void deleteTaikhoan(String tentaikhoan)
    {
        taikhoanRepository.deleteById(tentaikhoan);
    }


}
