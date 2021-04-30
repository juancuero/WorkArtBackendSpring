/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ies.service.repositories;

import com.ies.service.models.DamageDepth;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DamageDepthRepository extends CrudRepository<DamageDepth, Integer> {
    @Override
    List<DamageDepth> findAll();
    
    @Override
    DamageDepth save(DamageDepth damageDepth);

    @Override
    public void deleteById(Integer id);
    
    @Query("SELECT d FROM DamageDepth d WHERE d.id = ?1")
    public List<DamageDepth> findById(int i);
}
