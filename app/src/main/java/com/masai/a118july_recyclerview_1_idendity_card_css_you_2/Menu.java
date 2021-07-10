package com.masai.a118july_recyclerview_1_idendity_card_css_you_2;

public class Menu {
    private int image;
    private String age;
    private String profession;
    private String company;


    public Menu(int image, String age, String profession, String company) {
        this.image = image;
        this.age = age;
        this.profession = profession;
        this.company = company;
    }

    public int getImage() {
        return image;
    }

    public String getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public String getCompany() {
        return company;
    }

}