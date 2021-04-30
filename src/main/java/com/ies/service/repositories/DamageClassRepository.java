/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ies.service.repositories;

import com.ies.service.models.DamageClass;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DamageClassRepository extends CrudRepository<DamageClass, Integer> {
    @Override
    List<DamageClass> findAll();
    
    @Override
    DamageClass save(DamageClass damageClass);

    @Override
    public void deleteById(Integer id);
    
    @Query("SELECT d FROM DamageClass d WHERE d.id = ?1")
    public List<DamageClass> findById(int i);
    
}
