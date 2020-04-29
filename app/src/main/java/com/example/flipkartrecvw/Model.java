package com.example.flipkartrecvw;

public class Model {
    private  String title,price,weight,strikePrice;
    private int img;

    public String getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(String strikePrice) {
        this.strikePrice = strikePrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
