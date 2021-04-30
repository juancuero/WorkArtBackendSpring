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
@Table(name="damageclass")
public class DamageClass {
    @Id
    Integer damageclass;
    String description;

    public DamageClass() {
    }

    public DamageClass(Integer damageclass, String description) {
        this.damageclass = damageclass;
        this.description = description;
    }

    public Integer getDamageclass() {
        return damageclass;
    }

    public void setDamageclass(Integer damageclass) {
        this.damageclass = damageclass;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
