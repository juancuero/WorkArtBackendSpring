/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ies.service.repositories;

import com.ies.service.models.PaintingType;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaintingTypeRepository extends CrudRepository<PaintingType, Integer>{
    @Override
    public List<PaintingType> findAll();
    
    @Override
    public PaintingType save(PaintingType paintingtype);

    @Override
    public void deleteById(Integer id);
    
    @Query("SELECT p FROM PaintingType p WHERE p.id = ?1")
    public List<PaintingType> findById(int i);
}
