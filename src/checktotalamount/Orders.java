/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checktotalamount;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author ckk
 */
@Entity
@Table(name = "ORDERS", catalog = "", schema = "NBUSER")
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o")
    , @NamedQuery(name = "Orders.findByOrderId", query = "SELECT o FROM Orders o WHERE o.orderId = :orderId")
    , @NamedQuery(name = "Orders.findByOrderTime", query = "SELECT o FROM Orders o WHERE o.orderTime = :orderTime")
    , @NamedQuery(name = "Orders.findByDeliverystatus", query = "SELECT o FROM Orders o WHERE o.deliverystatus = :deliverystatus")
    , @NamedQuery(name = "Orders.findByOrderDate", query = "SELECT o FROM Orders o WHERE o.orderDate = :orderDate")
    , @NamedQuery(name = "Orders.findByQuantity", query = "SELECT o FROM Orders o WHERE o.quantity = :quantity")
    , @NamedQuery(name = "Orders.findByDId", query = "SELECT o FROM Orders o WHERE o.dId = :dId")
    , @NamedQuery(name = "Orders.findByPrice", query = "SELECT o FROM Orders o WHERE o.price = :price")})
public class Orders implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Column(name = "ORDER_TIME")
    private String orderTime;
    @Column(name = "DELIVERYSTATUS")
    private String deliverystatus;
    @Column(name = "ORDER_DATE")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "D_ID")
    private String dId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private Double price;

    public Orders() {
    }

    public Orders(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        String oldOrderId = this.orderId;
        this.orderId = orderId;
        changeSupport.firePropertyChange("orderId", oldOrderId, orderId);
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        String oldOrderTime = this.orderTime;
        this.orderTime = orderTime;
        changeSupport.firePropertyChange("orderTime", oldOrderTime, orderTime);
    }

    public String getDeliverystatus() {
        return deliverystatus;
    }

    public void setDeliverystatus(String deliverystatus) {
        String oldDeliverystatus = this.deliverystatus;
        this.deliverystatus = deliverystatus;
        changeSupport.firePropertyChange("deliverystatus", oldDeliverystatus, deliverystatus);
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        Date oldOrderDate = this.orderDate;
        this.orderDate = orderDate;
        changeSupport.firePropertyChange("orderDate", oldOrderDate, orderDate);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        Integer oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    public String getDId() {
        return dId;
    }

    public void setDId(String dId) {
        String oldDId = this.dId;
        this.dId = dId;
        changeSupport.firePropertyChange("DId", oldDId, dId);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        Double oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "checktotalamount.Orders[ orderId=" + orderId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
