/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ies.service.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="costs")
public class Costs {
    @Id
    Integer costid;
    Double cost;
    
    @ManyToOne
    @JoinColumn(name="paintingtype")
    PaintingType paintingtype;
    
    @ManyToOne
    @JoinColumn(name="damageclass")
    DamageClass damageclass;
    
    @ManyToOne
    @JoinColumn(name="damagedepth")
    DamageDepth damagedepth;

    public Costs() {
    }

    public Costs(Integer costid, PaintingType paintingtype, DamageClass damageclass, DamageDepth damagedepth, Double cost) {
        this.costid = costid;
        this.paintingtype = paintingtype;
        this.damageclass = damageclass;
        this.damagedepth = damagedepth;
        this.cost = cost;
    }

    public Integer getCostid() {
        return costid;
    }

    public void setCostid(Integer costid) {
        this.costid = costid;
    }

    public PaintingType getPaintingtype() {
        return paintingtype;
    }

    public void setPaintingtype(PaintingType paintingtype) {
        this.paintingtype = paintingtype;
    }

    public DamageClass getDamageclass() {
        return damageclass;
    }

    public void setDamageclass(DamageClass damageclass) {
        this.damageclass = damageclass;
    }

    public DamageDepth getDamagedepth() {
        return damagedepth;
    }

    public void setDamagedepth(DamageDepth damagedepth) {
        this.damagedepth = damagedepth;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
