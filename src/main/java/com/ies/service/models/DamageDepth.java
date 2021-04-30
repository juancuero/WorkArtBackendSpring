/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ies.service.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="damagedepth")
public class DamageDepth {
    @Id
    Integer damagedepth;
    String description;

    public DamageDepth() {
    }

    public DamageDepth(Integer damagedepth, String description) {
        this.damagedepth = damagedepth;
        this.description = description;
    }

    public Integer getDamagedepth() {
        return damagedepth;
    }

    public void setDamagedepth(Integer damagedepth) {
        this.damagedepth = damagedepth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
