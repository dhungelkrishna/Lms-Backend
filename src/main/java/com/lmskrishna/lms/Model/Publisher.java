package com.lmskrishna.lms.Model;

import java.time.Year;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "publisherId")
    private int publisherId;
    @Column(name = "yop")
    private Integer yop; //year of publication
    @Column(name = "publisherName")
    private String publisherName;
    public Publisher() {
    }
    public Publisher(int publisherId, Integer yop, String publisherName) {
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
    public Integer getYop() {
        return yop;
    }
    public void setYop(Integer yop) {
        this.yop = yop;
    }
    public String getPublisherName() {
        return publisherName;
    }
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    
    
}
