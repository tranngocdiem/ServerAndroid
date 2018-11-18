package vn.edu.uit.quanlychitieunhom.server_Java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.uit.quanlychitieunhom.server_Java.model.NHOMCHITIEU;
import vn.edu.uit.quanlychitieunhom.server_Java.model.TAIKHOAN;
import vn.edu.uit.quanlychitieunhom.server_Java.model.THANHVIENNHOM;
import vn.edu.uit.quanlychitieunhom.server_Java.model.ThanhviennhomId;
import vn.edu.uit.quanlychitieunhom.server_Java.repository.ThanhviennhomRepository;

import java.util.List;

@Service
public class ThanhviennhomService {

    @Autowired
    ThanhviennhomRepository thanhviennhomRepository;


    public THANHVIENNHOM getThanhviennhomById(NHOMCHITIEU nhomchitieu, TAIKHOAN taikhoan)
    {
        return thanhviennhomRepository.findTHANHVIENNHOMById_NhomchitieuAndId_Taikhoan(nhomchitieu,taikhoan);
    }

    public THANHVIENNHOM createThanhviennhom(THANHVIENNHOM thanhviennhom)
    {
        return thanhviennhomRepository.save(thanhviennhom);
    }

    public void deleteThanhviennhom(ThanhviennhomId Id){
        thanhviennhomRepository.deleteById(Id);
    }

    public List<THANHVIENNHOM> getAll(){
        return thanhviennhomRepository.findAll();
    }
}
