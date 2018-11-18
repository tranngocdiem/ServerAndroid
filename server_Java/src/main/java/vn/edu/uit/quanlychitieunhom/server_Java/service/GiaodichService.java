package vn.edu.uit.quanlychitieunhom.server_Java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.uit.quanlychitieunhom.server_Java.model.GIAODICH;
import vn.edu.uit.quanlychitieunhom.server_Java.repository.GiaodichRepository;

import java.util.List;

@Service
@Transactional
public class GiaodichService {

    @Autowired
    GiaodichRepository giaodichRepository;

    public GIAODICH findgiaodich(Integer magiaodich){
        return giaodichRepository.findByMagiaodich(magiaodich);
    }

    public List<GIAODICH> findallgiaodich(){
        return giaodichRepository.findAll();
    }

    public void save(GIAODICH giaodich){
        giaodichRepository.save(giaodich);
    }

    public void update(GIAODICH giaodich){
        giaodichRepository.save(giaodich);
    }

    public void deleteById(Integer magiaodich){
        giaodichRepository.deleteById(magiaodich);
    }

    public void delete(GIAODICH giaodich){
        giaodichRepository.deleteById(giaodich.getMagiaodich());
    }

}
