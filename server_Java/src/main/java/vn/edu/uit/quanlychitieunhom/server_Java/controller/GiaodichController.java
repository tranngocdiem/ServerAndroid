package vn.edu.uit.quanlychitieunhom.server_Java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.edu.uit.quanlychitieunhom.server_Java.model.GIAODICH;
import vn.edu.uit.quanlychitieunhom.server_Java.service.GiaodichService;

import java.util.List;

@RestController
@RequestMapping("/api/giaodich")
public class GiaodichController {

    @Autowired
    GiaodichService giaodichService;

    @GetMapping("/{magiaodich}")
    public GIAODICH findgiaodich(@PathVariable Integer magiaodich){
        return giaodichService.findgiaodich(magiaodich);
    }

    @GetMapping("/list")
    public List<GIAODICH> findallgiaodich(){
        return giaodichService.findallgiaodich();
    }

    @PostMapping("/")
    public String savegiaodich(@RequestBody GIAODICH giaodich){
        giaodichService.save(giaodich);
        return "Giao dich seved!";
    }

    @PutMapping("/")
    public String updategiaodich(@RequestBody GIAODICH giaodich){
        giaodichService.update(giaodich);
        return "Giao dich updated!";
    }

    @DeleteMapping("/{magiaodich}")
    public String deletegiaodich(@PathVariable Integer magiaodich){
        giaodichService.deleteById(magiaodich);
        return "Giao dich deleted!";
    }

    @DeleteMapping("/")
    public String deletegiaodich(@RequestBody GIAODICH giaodich){
        giaodichService.delete(giaodich);
        return "Giao dich deleted!";
    }
}
