package com.lmskrishna.lms.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="reader")
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "reader",cascade = CascadeType.ALL)
    @Column(name = "phonenumber")
    private List<PhoneNumber> phoneNumbers;
    @Column(name = "fname")
    private String fName;
    @Column(name="lname")
    private String lName;
    public Reader() {
    }
    public Reader(long userId, String email, String address, List<PhoneNumber> phoneNumbers, String fName,
            String lName) {
        this.userId = userId;
        this.email = email;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
        this.fName = fName;
        this.lName = lName;
    }
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }
    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }

    

    
}
