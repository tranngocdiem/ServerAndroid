package vn.edu.uit.quanlychitieunhom.server_ND.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.uit.quanlychitieunhom.server_ND.model.TAIKHOAN;
import vn.edu.uit.quanlychitieunhom.server_ND.service.TaikhoanService;

@RestController
@RequestMapping("/api/taikhoan")
public class TaikhoanController {

    @Autowired
    TaikhoanService taikhoanService;

    @GetMapping("{tentaikhoan}")
    public TAIKHOAN getTaikhoanByid(@PathVariable(value = "tentaikhoan") String tentaikhoan)
    {
        return taikhoanService.getTaikhoanByTentaikhoan(tentaikhoan);
    }


}
