package vn.edu.uit.quanlychitieunhom.server_Java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import vn.edu.uit.quanlychitieunhom.server_Java.model.TAIKHOAN;
import vn.edu.uit.quanlychitieunhom.server_Java.service.TaikhoanService;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/api/taikhoan")
public class TaikhoanController {

    @Autowired
    TaikhoanService taikhoanService;

    @GetMapping("/getInfo/{tentaikhoan}")
    public TAIKHOAN getTaikhoanByid(@PathVariable(value = "tentaikhoan") String tentaikhoan)
    {
        return taikhoanService.getTaikhoanByTentaikhoan(tentaikhoan);
    }

    @PutMapping("/update/{tentaikhoan}")
    public ResponseEntity<Object> updateTaikhoan(@Valid @RequestBody TAIKHOAN taikhoan, @PathVariable String tentaikhoan) {
         if(taikhoanService.updateTaikhoan(taikhoan,tentaikhoan)==null)
         {
             return ResponseEntity.notFound().build();
         }
         else
             return ResponseEntity.ok(taikhoanService.updateTaikhoan(taikhoan,tentaikhoan));
             //return ResponseEntity.noContent().build();
    }

    @PostMapping("/insert")
    public ResponseEntity<Object> createTaikhoan(@RequestBody TAIKHOAN taikhoan) {
        TAIKHOAN savedTaikhoan = taikhoanService.createTaikhoan(taikhoan);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{taikhoan}")
                .buildAndExpand(savedTaikhoan.getTentaikhoan()).toUri();

        return ResponseEntity.created(location).build();

    }

    @DeleteMapping("/delete/{mataikhoan}")
    public void deleteStudent(@PathVariable String mataikhoan) {
        taikhoanService.deleteTaikhoan(mataikhoan);
    }




}
