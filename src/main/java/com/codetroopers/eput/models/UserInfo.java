package com.codetroopers.eput.models;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;


@Named
@SessionScoped
public class UserInfo implements Serializable {

    private String name;
    private String password;
    private Boolean loggedIn;
    //This date will be set at the connection.
    private Date lastConnection;

    public UserInfo() {
        this.loggedIn = Boolean.FALSE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(final Boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public Date getLastConnection() {
        return lastConnection;
    }

    public void setLastConnection(Date lastConnection) {
        this.lastConnection = lastConnection;
    }
}
