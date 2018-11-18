package vn.edu.uit.quanlychitieunhom.server_Java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.edu.uit.quanlychitieunhom.server_Java.model.KYCHITIEU;
import vn.edu.uit.quanlychitieunhom.server_Java.service.KychitieuService;

import java.util.List;

@RestController
@RequestMapping("/api/kychitieu")
public class KychitieuController {

    @Autowired
    KychitieuService kychitieuService;

    @GetMapping("/{makychitieu}")
    public KYCHITIEU findkychitieu(@PathVariable Integer makychitieu){
        return kychitieuService.findkychitieu(makychitieu);
    }

    @GetMapping("/list")
    public List<KYCHITIEU> findallkychitieu(){
        return kychitieuService.findallkychitieu();
    }

    @PostMapping("/")
    public String savekychitieu(@RequestBody KYCHITIEU kychitieu){
        kychitieuService.save(kychitieu);
        return "Kỳ chi tiêu saved!";
    }

    @PutMapping("/")
    public String updatekychitieu(@RequestBody KYCHITIEU kychitieu){
        kychitieuService.update(kychitieu);
        return "Kỳ chi tiêu updated!";
    }

    @DeleteMapping("/{makychitieu}")
    public String deletekychitieu(@PathVariable Integer makychitieu ){
        kychitieuService.daleteById(makychitieu);
        return "Kỳ chi tiêu deleted!";
    }

    @DeleteMapping("/")
    public String deletekychitieu(@RequestBody KYCHITIEU kychitieu ){
        kychitieuService.dalete(kychitieu);
        return "Kỳ chi tiêu deleted!";
    }
}
