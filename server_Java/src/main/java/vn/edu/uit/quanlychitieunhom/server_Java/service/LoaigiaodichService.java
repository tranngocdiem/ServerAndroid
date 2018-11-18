package vn.edu.uit.quanlychitieunhom.server_Java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.uit.quanlychitieunhom.server_Java.model.LOAIGIAODICH;
import vn.edu.uit.quanlychitieunhom.server_Java.repository.LoaigiaodichRepository;

import java.util.List;

@Service
@Transactional
public class LoaigiaodichService {

    @Autowired
    LoaigiaodichRepository loaigiaodichRepository;

    public LOAIGIAODICH findloaigiaodich(Integer maloaigiaodich){
        return  loaigiaodichRepository.findByMaloaigiaodich(maloaigiaodich);
    }

    public List<LOAIGIAODICH> findallloaigiaodich(){
        return loaigiaodichRepository.findAll();
    }

    public void save(LOAIGIAODICH loaigiaodich){
        loaigiaodichRepository.save(loaigiaodich);
    }

    public void update(LOAIGIAODICH loaigiaodich){
        loaigiaodichRepository.save(loaigiaodich);
    }

    public void deleteById(Integer maloaigiaodich){
        loaigiaodichRepository.deleteById(maloaigiaodich);
    }

    public void delete(LOAIGIAODICH loaigiaodich){
        loaigiaodichRepository.deleteById(loaigiaodich.getMaloaigiaodich());
    }

}
