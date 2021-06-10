package com.example.rv_rt1;

public class MyListData {
    private String title;
    private String decription;
    private int photo;
    private int position;


    public MyListData(String title, String decription, int photo) {
        this.title=title;
        this.decription=decription;
        this.photo=photo;
    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
