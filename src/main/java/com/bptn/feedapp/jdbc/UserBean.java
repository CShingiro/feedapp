package com.bptn.feedapp.jdbc;

import java.sql.Timestamp;

public class UserBean {

    private Integer userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phone;
    private String emailId;
    private Boolean emailVerified;
    private Timestamp createdOn;

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
            "}";
    }
}
