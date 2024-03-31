package com.lmskrishna.lms.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "phoneNumber")
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int phoneId;
    private Long phoneNumber;
    @ManyToOne
    @JoinColumn(name = "userId")
    private Reader reader;
    public PhoneNumber() {
    }
    public PhoneNumber(int phoneId, Long phoneNumber, Reader reader) {
        this.phoneId = phoneId;
        this.phoneNumber = phoneNumber;
        this.reader = reader;
    }
    public int getPhoneId() {
        return phoneId;
    }
    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Reader getReader() {
        return reader;
    }
    public void setReader(Reader reader) {
        this.reader = reader;
    }
    
    
}
