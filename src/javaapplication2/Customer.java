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
@Table(name = "CUSTOMER", catalog = "", schema = "NBUSER")
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCustName", query = "SELECT c FROM Customer c WHERE c.custName = :custName")
    , @NamedQuery(name = "Customer.findByCustAddress", query = "SELECT c FROM Customer c WHERE c.custAddress = :custAddress")
    , @NamedQuery(name = "Customer.findByContactno", query = "SELECT c FROM Customer c WHERE c.contactno = :contactno")})
public class Customer implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_NAME")
    private String custName;
    @Column(name = "CUST_ADDRESS")
    private String custAddress;
    @Column(name = "CONTACTNO")
    private String contactno;

    public Customer() {
    }

    public Customer(String custName) {
        this.custName = custName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        String oldCustName = this.custName;
        this.custName = custName;
        changeSupport.firePropertyChange("custName", oldCustName, custName);
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        String oldCustAddress = this.custAddress;
        this.custAddress = custAddress;
        changeSupport.firePropertyChange("custAddress", oldCustAddress, custAddress);
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        String oldContactno = this.contactno;
        this.contactno = contactno;
        changeSupport.firePropertyChange("contactno", oldContactno, contactno);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custName != null ? custName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.custName == null && other.custName != null) || (this.custName != null && !this.custName.equals(other.custName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.Customer[ custName=" + custName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
