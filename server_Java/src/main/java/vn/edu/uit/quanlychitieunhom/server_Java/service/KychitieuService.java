package vn.edu.uit.quanlychitieunhom.server_Java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.uit.quanlychitieunhom.server_Java.model.KYCHITIEU;
import vn.edu.uit.quanlychitieunhom.server_Java.repository.KychitieuRepository;

import java.util.List;

@Service
@Transactional
public class KychitieuService {

    @Autowired
    KychitieuRepository kychitieuRepository;

    public KYCHITIEU findkychitieu(Integer makychitieu){
        return kychitieuRepository.findByMakychitieu(makychitieu);
    }

    public List<KYCHITIEU> findallkychitieu(){
        return kychitieuRepository.findAll();
    }

    public void save(KYCHITIEU kychitieu){
        kychitieuRepository.save(kychitieu);
    }

    public void update(KYCHITIEU kychitieu){
        kychitieuRepository.save(kychitieu);
    }

    public void daleteById(Integer makychitieu){
        kychitieuRepository.deleteById(makychitieu);
    }

    public void dalete(KYCHITIEU kychitieu){
        kychitieuRepository.deleteById(kychitieu.getMakychitieu());
    }
}
