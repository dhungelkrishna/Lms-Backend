package com.lmskrishna.lms.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "publisher")
public class Publisher {
    @Column(name = "publisherId")
    private int publisherId;
    @Column(columnDefinition = "Date",name = "yop")
    private Date yop; //year of publication
    @Column(name = "publisherName")
    private String publisherName;
    public Publisher() {
    }
    public Publisher(int publisherId, Date yop, String publisherName) {
        this.publisherId = publisherId;
        this.yop = yop;
        this.publisherName = publisherName;
    }
    public int getPublisherId() {
        return publisherId;
    }
    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }
    public Date getYop() {
        return yop;
    }
    public void setYop(Date yop) {
        this.yop = yop;
    }
    public String getPublisherName() {
        return publisherName;
    }
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    
    
}
