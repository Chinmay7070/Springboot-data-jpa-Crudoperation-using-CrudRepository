package com.nt.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_CUSTOMER_TAB")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Coustomer {
    @Column(name="CID")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    //@SequenceGenerator(name="gen1",sequenceName="CNO_SEQ",initialValue=1,allocationSize=1)
    //@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="gen1")
    private Integer cno;
    @Column(name="CNAME",length=20)
    @Nonnull
    private String cname;
    
    @Column(name="CADD")
    @Nonnull
    private String caddrs;
    
    @Column(name="BILL_AMT")
    @Nonnull
    private Float billAmt;
    
    
    
}
