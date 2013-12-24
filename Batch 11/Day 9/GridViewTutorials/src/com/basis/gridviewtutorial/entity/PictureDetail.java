package com.basis.gridviewtutorial.entity;

public class PictureDetail {
    private String pictureName;
    private int pictureResourceId;

    public PictureDetail(String name, int resourceId) {
        this.pictureName = name;
        this.pictureResourceId = resourceId;
    }

    public String getPictureName() {
        return pictureName;
    }
    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }
    public int getPictureResourceId() {
        return pictureResourceId;
    }
    public void setPictureResourceId(int pictureResourceId) {
        this.pictureResourceId = pictureResourceId;
    }

}
