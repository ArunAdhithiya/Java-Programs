package com.adhithiya.lab5;

public class author {
    private String name,email;
    private char gender;

    author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    String getName()
    {
        return name;
    }
    String getEmail()
    {
        return email;
    }
    char getGender()
    {
        return gender;
    }
    void setEmail(String email)
    {
        this.email=email;
    }
    public String toString()
    {
        return (name+"/"+email+"/"+gender);
    }

}
