package com.usecase.usecase;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Usecase {
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("Reg No")
    private String RegNo;
    @JsonProperty("Course")
    private String Course;
    @JsonProperty("Hobbies")
    private String Hobbies;
    @JsonProperty("Fav Food")
    private String Favfood;
    @JsonProperty("Funny Moments")
    private String Funnymoments;
    @JsonProperty("Aim")
    private String Aim;
    @JsonProperty("Short term Goal")
    private String ShGoal;
    @JsonProperty("Long term Goal")
    private String LoGoal;
    @JsonProperty("Suggestion")
    private String Suggestion;

    

    public Usecase(String name, String regNo, String course, String hobbies, String favfood, String funnymoments,
            String aim, String shGoal, String loGoal, String suggestion) {
        Name = name;
        RegNo = regNo;
        Course = course;
        Hobbies = hobbies;
        Favfood = favfood;
        Funnymoments = funnymoments;
        Aim = aim;
        ShGoal = shGoal;
        LoGoal = loGoal;
        Suggestion = suggestion;
    }



    public void setName(String name) {
        Name = name;
    }



    public void setRegNo(String regNo) {
        RegNo = regNo;
    }



    public void setCourse(String course) {
        Course = course;
    }



    public void setHobbies(String hobbies) {
        Hobbies = hobbies;
    }



    public void setFavfood(String favfood) {
        Favfood = favfood;
    }



    public void setFunnymoments(String funnymoments) {
        Funnymoments = funnymoments;
    }



    public void setAim(String aim) {
        Aim = aim;
    }



    public void setShGoal(String shGoal) {
        ShGoal = shGoal;
    }



    public void setLoGoal(String loGoal) {
        LoGoal = loGoal;
    }



    public void setSuggestion(String suggestion) {
        Suggestion = suggestion;
    }
    

    
    
}
