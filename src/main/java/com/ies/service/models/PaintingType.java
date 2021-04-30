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
@Table(name="paintingtype")
public class PaintingType {
    @Id
    Integer paintingtype;
    String description;

    public PaintingType() {
    }

    public PaintingType(Integer paintingtype, String description) {
        this.paintingtype = paintingtype;
        this.description = description;
    }

    public Integer getPaintingtype() {
        return paintingtype;
    }

    public void setPaintingtype(Integer paintingtype) {
        this.paintingtype = paintingtype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
