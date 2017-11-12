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
@Table(name = "DELIVERYMAN", catalog = "", schema = "NBUSER")
@NamedQueries({
    @NamedQuery(name = "Deliveryman.findAll", query = "SELECT d FROM Deliveryman d")
    , @NamedQuery(name = "Deliveryman.findByDId", query = "SELECT d FROM Deliveryman d WHERE d.dId = :dId")
    , @NamedQuery(name = "Deliveryman.findByDName", query = "SELECT d FROM Deliveryman d WHERE d.dName = :dName")
    , @NamedQuery(name = "Deliveryman.findByDIc", query = "SELECT d FROM Deliveryman d WHERE d.dIc = :dIc")
    , @NamedQuery(name = "Deliveryman.findByStatus", query = "SELECT d FROM Deliveryman d WHERE d.status = :status")
    , @NamedQuery(name = "Deliveryman.findByDContactno", query = "SELECT d FROM Deliveryman d WHERE d.dContactno = :dContactno")
    , @NamedQuery(name = "Deliveryman.findByCustName", query = "SELECT d FROM Deliveryman d WHERE d.custName = :custName")})
public class Deliveryman implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "D_ID")
    private String dId;
    @Column(name = "D_NAME")
    private String dName;
    @Column(name = "D_IC")
    private String dIc;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "D_CONTACTNO")
    private String dContactno;
    @Column(name = "CUST_NAME")
    private String custName;

    public Deliveryman() {
    }

    public Deliveryman(String dId) {
        this.dId = dId;
    }

    public String getDId() {
        return dId;
    }

    public void setDId(String dId) {
        String oldDId = this.dId;
        this.dId = dId;
        changeSupport.firePropertyChange("DId", oldDId, dId);
    }

    public String getDName() {
        return dName;
    }

    public void setDName(String dName) {
        String oldDName = this.dName;
        this.dName = dName;
        changeSupport.firePropertyChange("DName", oldDName, dName);
    }

    public String getDIc() {
        return dIc;
    }

    public void setDIc(String dIc) {
        String oldDIc = this.dIc;
        this.dIc = dIc;
        changeSupport.firePropertyChange("DIc", oldDIc, dIc);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getDContactno() {
        return dContactno;
    }

    public void setDContactno(String dContactno) {
        String oldDContactno = this.dContactno;
        this.dContactno = dContactno;
        changeSupport.firePropertyChange("DContactno", oldDContactno, dContactno);
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        String oldCustName = this.custName;
        this.custName = custName;
        changeSupport.firePropertyChange("custName", oldCustName, custName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dId != null ? dId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deliveryman)) {
            return false;
        }
        Deliveryman other = (Deliveryman) object;
        if ((this.dId == null && other.dId != null) || (this.dId != null && !this.dId.equals(other.dId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Deliveryman[ dId=" + dId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
