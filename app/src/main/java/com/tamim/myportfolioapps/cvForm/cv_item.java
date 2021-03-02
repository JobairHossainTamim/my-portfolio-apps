package com.tamim.myportfolioapps.cvForm;

public class cv_item {
    private String title;
    private String description;

    public cv_item(String title, String description) {
        this.title = title;
        this.description = description;

    }
    public cv_item(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
