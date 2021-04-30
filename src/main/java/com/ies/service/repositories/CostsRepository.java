/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ies.service.repositories;

import com.ies.service.models.Costs;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CostsRepository extends CrudRepository<Costs, Integer> {
    @Override
    List<Costs> findAll();
    
    @Override
    Costs save(Costs costs);

    @Override
    public void deleteById(Integer id);
    
    @Query("SELECT c FROM Costs c WHERE c.id = ?1")
    public List<Costs> findById(int i);
}
