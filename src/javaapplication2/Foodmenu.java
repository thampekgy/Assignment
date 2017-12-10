/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ckk
 */
@Entity
@Table(name = "FOODMENU", catalog = "", schema = "NBUSER")
@NamedQueries({
    @NamedQuery(name = "Foodmenu.findAll", query = "SELECT f FROM Foodmenu f")
    , @NamedQuery(name = "Foodmenu.findByFoodtype", query = "SELECT f FROM Foodmenu f WHERE f.foodtype = :foodtype")
    , @NamedQuery(name = "Foodmenu.findByFoodId", query = "SELECT f FROM Foodmenu f WHERE f.foodId = :foodId")
    , @NamedQuery(name = "Foodmenu.findByPrice", query = "SELECT f FROM Foodmenu f WHERE f.price = :price")
    , @NamedQuery(name = "Foodmenu.findByFoodDesc", query = "SELECT f FROM Foodmenu f WHERE f.foodDesc = :foodDesc")})
public class Foodmenu implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "FOODTYPE")
    private String foodtype;
    @Id
    @Basic(optional = false)
    @Column(name = "FOOD_ID")
    private String foodId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "FOOD_DESC")
    private String foodDesc;

    public Foodmenu() {
    }

    public Foodmenu(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodtype() {
        return foodtype;
    }

    public void setFoodtype(String foodtype) {
        String oldFoodtype = this.foodtype;
        this.foodtype = foodtype;
        changeSupport.firePropertyChange("foodtype", oldFoodtype, foodtype);
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        String oldFoodId = this.foodId;
        this.foodId = foodId;
        changeSupport.firePropertyChange("foodId", oldFoodId, foodId);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        Double oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        String oldFoodDesc = this.foodDesc;
        this.foodDesc = foodDesc;
        changeSupport.firePropertyChange("foodDesc", oldFoodDesc, foodDesc);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (foodId != null ? foodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Foodmenu)) {
            return false;
        }
        Foodmenu other = (Foodmenu) object;
        if ((this.foodId == null && other.foodId != null) || (this.foodId != null && !this.foodId.equals(other.foodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Foodmenu[ foodId=" + foodId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
