package com.leyou.service.controller;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;

import com.leyou.item.vo.BrandVo;
import com.leyou.service.service.impl.BrandServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("brand")
@Slf4j
public class BrandController {
    @Autowired
    private BrandServiceImpl brandService;


    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandPage(
            @RequestParam(value = "page" ,defaultValue = "1") Integer page,
            @RequestParam(value = "rows" ,defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy" ,required = false) String sortBy,
            @RequestParam(value = "desc" ,defaultValue = "false") Boolean desc,
            @RequestParam(value = "key" ,required = false) String key
    ){
        return ResponseEntity.ok(brandService.queryBrandByPageAndSort(page, rows, sortBy, desc, key));
    }

    @PostMapping
    public ResponseEntity<Void> addBrand(Brand brand , @RequestParam(value = "cids") List<Long> cids){
        brandService.saveBrand(brand, cids);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("bid/{bid}")
    public ResponseEntity<Void> deleteBrand(@PathVariable(value = "bid") Long bid){
        log.info("bid======================================"+bid);
        brandService.deleteBrand(bid);
        return ResponseEntity.ok().build();
    }
    @PutMapping
    public ResponseEntity<Void> updateBrand(BrandVo brandVo){
        brandService.updateBrand(brandVo);
        return ResponseEntity.ok().build();
    }

}
