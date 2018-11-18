package vn.edu.uit.quanlychitieunhom.server_Java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.uit.quanlychitieunhom.server_Java.model.NHOMCHITIEU;
import vn.edu.uit.quanlychitieunhom.server_Java.repository.NhomchitieuRepository;

import java.util.List;

@Service
public class NhomchitieuService {
    @Autowired
    NhomchitieuRepository nhomchitieuRepository;

    public List<NHOMCHITIEU> getAllNhomchitieu(){return nhomchitieuRepository.findAll();}

    public NHOMCHITIEU getNhomchitieuByManhom(Integer manhomchitieu){ return nhomchitieuRepository.findNHOMCHITIEUByManhomchitieu(manhomchitieu);}

    public NHOMCHITIEU createNhomchitieu(NHOMCHITIEU nhomchitieu) {return  nhomchitieuRepository.save(nhomchitieu);}

    public void deleteNhomchitieu(Integer manhomchitieu) { nhomchitieuRepository.deleteById(manhomchitieu);}

}
