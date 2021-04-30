/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ies.service.controllers;

import com.ies.service.models.Costs;
import com.ies.service.models.DamageClass;
import com.ies.service.models.DamageDepth;
import com.ies.service.models.PaintingType;
import com.ies.service.repositories.CostsRepository;
import com.ies.service.repositories.DamageClassRepository;
import com.ies.service.repositories.DamageDepthRepository;
import com.ies.service.repositories.PaintingTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {
    @Autowired
    private PaintingTypeRepository repositoryPaintingType;
    
    @GetMapping("/paintings")
    public ResponseEntity<List<PaintingType>> getAllPaintings(Model model) {
        List<PaintingType> types = repositoryPaintingType.findAll();
        return ResponseEntity.ok(types);
    }
    
    @PostMapping("/painting")
    public ResponseEntity<PaintingType> savePainting(@RequestBody PaintingType paintingType) {
        System.out.println("si entro");
        return ResponseEntity.status(HttpStatus.CREATED).body(repositoryPaintingType.save(paintingType));
    }
    
    @GetMapping("/painting/{id}")
    public ResponseEntity<PaintingType> getPainting(@PathVariable int id) {
        PaintingType type = repositoryPaintingType.findById(id).get(0);
        return ResponseEntity.ok(type);
    }
    
    @PutMapping("/painting/{id}")
    public ResponseEntity<PaintingType> updatePainting(@RequestBody PaintingType paintingType) {
        return ResponseEntity.status(HttpStatus.OK).body(repositoryPaintingType.save(paintingType));
    }

    @DeleteMapping("/painting/{id}")
    public ResponseEntity<?> deletePainting(@PathVariable int id) {
        PaintingType type = repositoryPaintingType.findById(id).get(0);
        repositoryPaintingType.delete(type);
        return ResponseEntity.ok(type);
    }
    

    @Autowired
    private DamageClassRepository repositoryDamageClass;
    
    @GetMapping("/damageclasses")
    public ResponseEntity<List<DamageClass>> getAllDamageclass(Model model) {
        List<DamageClass> damages = repositoryDamageClass.findAll();
        return ResponseEntity.ok(damages);
    }
    
    @PostMapping("/damageclass")
    public ResponseEntity<DamageClass> saveDamageclass(@RequestBody DamageClass damageClass) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repositoryDamageClass.save(damageClass));
    }
    
    @GetMapping("/damageclass/{id}")
    public ResponseEntity<DamageClass> getDamageclass(@PathVariable int id, Model model) {
        DamageClass damage = repositoryDamageClass.findById(id).get(0);
        return ResponseEntity.ok(damage);
    }
    

    @PutMapping("/damageclass/{id}")
    public ResponseEntity<DamageClass> updateDamageclass(@RequestBody DamageClass damageClass) {
        return ResponseEntity.status(HttpStatus.OK).body(repositoryDamageClass.save(damageClass));
    }

    @DeleteMapping("/damageclass/{id}")
    public ResponseEntity<?> deleteDamageclass(@PathVariable int id) {
        DamageClass damage = repositoryDamageClass.findById(id).get(0);
        repositoryDamageClass.delete(damage);
        return ResponseEntity.ok(damage);
    }

    @Autowired
    private DamageDepthRepository repositoryDamageDepth;
    
    @GetMapping("/damagedepths")
    public ResponseEntity<List<DamageDepth>> getAllDamageDepth(Model model) {
        List<DamageDepth> damages = repositoryDamageDepth.findAll();
        return ResponseEntity.ok(damages);
    }
    
    @PostMapping("/damagedepth")
    public ResponseEntity<DamageDepth> saveDamageDepth(@RequestBody DamageDepth damageDepth) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repositoryDamageDepth.save(damageDepth));
    }
    
    @GetMapping("/damagedepth/{id}")
    public ResponseEntity<DamageDepth> getDamageDepth(@PathVariable int id, Model model) {
        DamageDepth damage = repositoryDamageDepth.findById(id).get(0);
        return ResponseEntity.ok(damage);
    }
    
    @PutMapping("/damagedepth/{id}")
    public ResponseEntity<DamageDepth> updateDamageDepth(@RequestBody DamageDepth damageDepth) {
        return ResponseEntity.status(HttpStatus.OK).body(repositoryDamageDepth.save(damageDepth));
    }

    @DeleteMapping("/damagedepth/{id}")
    public ResponseEntity<?> deleteDamageDepth(@PathVariable int id) {
        DamageDepth damage = repositoryDamageDepth.findById(id).get(0);
        repositoryDamageDepth.delete(damage);
        return ResponseEntity.ok(damage);
    }
    

    @Autowired
    private CostsRepository repositoryCosts;
    
    @GetMapping("/costs")
    public ResponseEntity<List<Costs>> getAllCosts(Model model) {
        List<Costs> costs = repositoryCosts.findAll();
        return ResponseEntity.ok(costs);
    }
    
    @PostMapping("/cost")
    public ResponseEntity<Costs> saveCosts(@RequestBody Costs cost) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repositoryCosts.save(cost));
    }
    
    @GetMapping("/cost/{id}")
    public ResponseEntity<Costs> getCosts(@PathVariable int id, Model model) {
        Costs cost = repositoryCosts.findById(id).get(0);
        return ResponseEntity.ok(cost);
    }
    

    @PutMapping("/cost/{id}")
    public ResponseEntity<Costs> updateCosts(@RequestBody Costs cost) {
        return ResponseEntity.status(HttpStatus.OK).body(repositoryCosts.save(cost));
    }

    @DeleteMapping("/cost/{id}")
    public ResponseEntity<?> deleteCosts(@PathVariable int id) {
        Costs cost = repositoryCosts.findById(id).get(0);
        repositoryCosts.delete(cost);
        return ResponseEntity.ok(cost);
    }
}
