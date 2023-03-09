package com.bptn.feedapp.jpa;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "\"User\"")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"userId\"")
    private Integer userId;
    @Column(name = "\"firstName\"")
    private String firstName;

    @Column(name = "\"lastName\"")
    private String lastName;

    private String username;

    @JsonProperty(access = Access.WRITE_ONLY)
    private String password;

    private String phone;

    @Column(name = "\"emailId\"")
    private String emailId;

    @Column(name = "\"emailVerified\"")
    private Boolean emailVerified;

    @Column(name = "\"createdOn\"")
    private Timestamp createdOn;

    @JsonInclude(Include.NON_NULL)
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Profile profile;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Feed> feeds;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<FeedMetaData> feedMetaData;

    public Profile getProfile() {
        return this.profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Feed> getFeeds() {
        return this.feeds;
    }

    public void setFeeds(List<Feed> feeds) {
        this.feeds = feeds;
    }

    public List<FeedMetaData> getFeedMetaData() {
        return this.feedMetaData;
    }

    public void setFeedMetaData(List<FeedMetaData> feedMetaData) {
        this.feedMetaData = feedMetaData;
    }

    public User() {
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Boolean isEmailVerified() {
        return this.emailVerified;
    }

    public Boolean getEmailVerified() {
        return this.emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "{" +
                " userId='" + userId + "'" +
                ", firstName='" + firstName + "'" +
                ", lastName='" + lastName + "'" +
                ", username='" + username + "'" +
                ", password='" + password + "'" +
                ", phone='" + phone + "'" +
                ", emailId='" + emailId + "'" +
                ", emailVerified='" + emailVerified + "'" +
                ", createdOn='" + createdOn + "'" +
                ", profile='" + profile + "'" +
                ", feeds='" + feeds + "'" +
                ", feedMetaData='" + feedMetaData + "'" +
                "}";
    }

}
