package com.myProject.beerTheStrong.Controller;

import com.myProject.beerTheStrong.Entity.Hop;
import com.myProject.beerTheStrong.Entity.Yeast;
import com.myProject.beerTheStrong.Repository.YeastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class YeastController {

    @Autowired
    YeastRepository yeastRepository;

    @GetMapping("yeasts")
    public List<Yeast> getAllYeasts(){
        return yeastRepository.findAll();
    }

    @GetMapping("yeasts/{yeastId}")
    public Yeast getYeastWithId(@PathVariable Long yeastId){
        return yeastRepository.findById(yeastId).get();
    }

    @PostMapping("yeasts")
    public Yeast addHop(@RequestBody Yeast yeast){
        return yeastRepository.save(yeast);
    }

    @PutMapping("yeasts/{yeastId}")
    public Yeast updateHop(@PathVariable Long yeastId, @RequestBody Yeast yeast){
        Yeast yeastToModified = yeastRepository.findById(yeastId).get();
        yeastToModified.setName(yeast.getName());
        yeastToModified.setType(yeast.getType());
        yeastToModified.setBrand(yeast.getBrand());
        yeastToModified.setAromas(yeast.getAromas());
        yeastToModified.setStyle(yeast.getStyle());
        yeastToModified.setSediment(yeast.getSediment());
        yeastToModified.setPitchingRateMaximum(yeast.getPitchingRateMaximum());
        yeastToModified.setPitchingRateMinimum(yeast.getPitchingRateMinimum());
        yeastToModified.setTemperatureMaximum(yeast.getTemperatureMaximum());
        yeastToModified.setTemperatureMinimum(yeast.getTemperatureMinimum());
        return yeastRepository.save(yeastToModified);
    }

    @DeleteMapping("yeasts/{yeastId}")
    public Boolean deleteYeast(@PathVariable Long yeastId){
        yeastRepository.deleteById(yeastId);
        return true;
    }


}
