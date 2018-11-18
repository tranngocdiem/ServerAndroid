package vn.edu.uit.quanlychitieunhom.server_Java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import vn.edu.uit.quanlychitieunhom.server_Java.model.NHOMCHITIEU;
import vn.edu.uit.quanlychitieunhom.server_Java.model.TAIKHOAN;
import vn.edu.uit.quanlychitieunhom.server_Java.model.THANHVIENNHOM;
import vn.edu.uit.quanlychitieunhom.server_Java.model.ThanhviennhomId;
import vn.edu.uit.quanlychitieunhom.server_Java.service.NhomchitieuService;
import vn.edu.uit.quanlychitieunhom.server_Java.service.TaikhoanService;
import vn.edu.uit.quanlychitieunhom.server_Java.service.ThanhviennhomService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/thanhviennhom")
public class ThanhviennhomController {

    @Autowired
    ThanhviennhomService thanhviennhomService;
    @Autowired
    NhomchitieuService nhomchitieuService;
    @Autowired
    TaikhoanService taikhoanService;


    @GetMapping("/getbyId/{manhomchitieu}/{tentaikhoan}")
    public THANHVIENNHOM getThanhviennhomById(@PathVariable("manhomchitieu") Integer manhomchitieu, @PathVariable("tentaikhoan") String tentaikhoan)
    {
        NHOMCHITIEU nhomchitieu = nhomchitieuService.getNhomchitieuByManhom(manhomchitieu);
        TAIKHOAN taikhoan = taikhoanService.getTaikhoanByTentaikhoan(tentaikhoan);
        return thanhviennhomService.getThanhviennhomById(nhomchitieu,taikhoan);
    }

    @PostMapping("/insert")
    public ResponseEntity<Object> createTaikhoan(@RequestBody THANHVIENNHOM thanhviennhom) {
        THANHVIENNHOM savedThanhviennhom = thanhviennhomService.createThanhviennhom(thanhviennhom);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{taikhoan}")
                .buildAndExpand(savedThanhviennhom.getId().getNhomchitieu().getManhomchitieu(),savedThanhviennhom.getId().getTaikhoan().getTentaikhoan()).toUri();

        return ResponseEntity.created(location).build();

    }

    @DeleteMapping("/delete/{manhomchitieu}/{tentaikhoan}")
    public void deleteThanhviennhom(@PathVariable Integer manhomchitieu, @PathVariable String tentaikhoan) {
        NHOMCHITIEU nhomchitieu = nhomchitieuService.getNhomchitieuByManhom(manhomchitieu);
        TAIKHOAN taikhoan = taikhoanService.getTaikhoanByTentaikhoan(tentaikhoan);
        ThanhviennhomId id = new ThanhviennhomId(taikhoan,nhomchitieu);
        thanhviennhomService.deleteThanhviennhom(id);
    }

    @GetMapping("/getAll")
    public List<THANHVIENNHOM> getAll()
    {
        return thanhviennhomService.getAll();
    }

}
