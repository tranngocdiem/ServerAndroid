package vn.edu.uit.quanlychitieunhom.server_Java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.edu.uit.quanlychitieunhom.server_Java.model.LOAIGIAODICH;
import vn.edu.uit.quanlychitieunhom.server_Java.service.LoaigiaodichService;

import java.util.List;

@RestController
@RequestMapping("/api/loaigiaodich")
public class LoaigiaodichController {

    @Autowired
    LoaigiaodichService loaigiaodichService;

    @GetMapping("/{maloaigiaodich}")
    public LOAIGIAODICH findloaigiaodich(@PathVariable Integer maloaigiaodich){
        return loaigiaodichService.findloaigiaodich(maloaigiaodich);
    }

    @GetMapping("/list")
    public List<LOAIGIAODICH> findallloaigiaodich(){
        return loaigiaodichService.findallloaigiaodich();
    }

    @PostMapping("/")
    public String saveloaigiaodich(@RequestBody LOAIGIAODICH loaigiaodich){
        loaigiaodichService.save(loaigiaodich);
        return "Loại giao dịch saved!";
    }

    @PutMapping("/")
    public String updateloaigiaodich(@RequestBody LOAIGIAODICH loaigiaodich){
        loaigiaodichService.update(loaigiaodich);
        return "Loại giao dịch updated!";
    }

    @DeleteMapping("/{maloaigiaodich}")
    public String deleteloaigiaodich(@PathVariable Integer maloaigiaodich){
        loaigiaodichService.deleteById(maloaigiaodich);
        return "Loại giao dịch deleted!";
    }

    @DeleteMapping("/")
    public String deleteloaigiaodich(@RequestBody LOAIGIAODICH loaigiaodich){
        loaigiaodichService.delete(loaigiaodich);
        return "Loại giao dịch deleted!";
    }


}
