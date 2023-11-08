package com.myProject.beerTheStrong.Controller;

import com.myProject.beerTheStrong.Entity.Hop;
import com.myProject.beerTheStrong.Entity.Various;
import com.myProject.beerTheStrong.Repository.HopRepository;
import com.myProject.beerTheStrong.Repository.VariousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class VariousController {

    @Autowired
    VariousRepository variousRepository;

    @GetMapping("various")
    public List<Various> getAllVarious(){
        return variousRepository.findAll();
    }

    @GetMapping("various/{variousId}")
    public Various getVariousWithId(@PathVariable Long variousId){
        return variousRepository.findById(variousId).get();
    }
    @PostMapping("various")
    public Various addVarious(@RequestBody Various various){
        return variousRepository.save(various);
    }
    @DeleteMapping("various/{variousId}")
    public Boolean deleteHop(@PathVariable Long variousId){
        variousRepository.deleteById(variousId);
        return true;
    }
}
