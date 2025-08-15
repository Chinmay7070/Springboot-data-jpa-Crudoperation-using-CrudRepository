package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="JPA_CUSTOMER_TAB")
@Data
public class Coustomer {
    @Column(name="CID")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer cno;
    @Column(name="CNAME",length=20)
    private String cname;
    
    @Column(name="CADD")
    private String caddrs;
    
    @Column(name="BILL_AMT")
    private Float billAmt;
    
    
    
}
