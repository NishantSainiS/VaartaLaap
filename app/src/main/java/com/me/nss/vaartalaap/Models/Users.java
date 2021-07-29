package com.me.nss.vaartalaap.Models;

public class Users {
    String userProfilePicture;
    String userName;
    String userEmail;
    String userPassword;
    String userId;
    String userLastMassage;
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Users(String userProfilePicture, String userName, String userEmail, String userPassword, String userId, String userLastMassage, String status) {
        this.userProfilePicture = userProfilePicture;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userId = userId;
        this.userLastMassage = userLastMassage;
        this.status = status;
    }

    public Users(){}
    //for signup
    public Users(String userName, String userEmail, String userPassword) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }


    public String getUserProfilePicture() {
        return userProfilePicture;
    }

    public void setUserProfilePicture(String userProfilePicture) {
        this.userProfilePicture = userProfilePicture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserLastMassage() {
        return userLastMassage;
    }

    public void setUserLastMassage(String userLastMassage) {
        this.userLastMassage = userLastMassage;
    }


}

