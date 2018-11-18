package vn.edu.uit.quanlychitieunhom.server_Java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import vn.edu.uit.quanlychitieunhom.server_Java.model.NHOMCHITIEU;
import vn.edu.uit.quanlychitieunhom.server_Java.service.NhomchitieuService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/nhomchitieu")
public class NhomchitieuController {
    @Autowired
    NhomchitieuService nhomchitieuService;


    @GetMapping("/getall")
    public List<NHOMCHITIEU> getAll ()
    {
        return nhomchitieuService.getAllNhomchitieu();
    }

    @GetMapping("/getInfo/{manhomchitieu}")
    public NHOMCHITIEU getNhomchitieu(@PathVariable Integer manhomchitieu)
    {
        return nhomchitieuService.getNhomchitieuByManhom(manhomchitieu);
    }

    @PostMapping("/insert")
    public ResponseEntity<Object> createNhomchitieu(@RequestBody NHOMCHITIEU nhomchitieu) {
        NHOMCHITIEU savedNhomchitieu = nhomchitieuService.createNhomchitieu(nhomchitieu);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{manhomchitieu}")
                .buildAndExpand(savedNhomchitieu.getManhomchitieu()).toUri();

        return ResponseEntity.created(location).build();

    }

    @DeleteMapping("/delete/{manhomchitieu}")
    public void deleteNhomchitieu(@PathVariable Integer manhomchitieu) {
        nhomchitieuService.deleteNhomchitieu(manhomchitieu);
    }



}
