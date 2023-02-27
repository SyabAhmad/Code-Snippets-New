package com.example.codesnippets;

public class post {
    int postImg;
    int likesImg;
    int dislikesImg;
    int downloadImg;
    int likesValue;
    int dislikesValue;

    public int getDownloadImg() {
        return downloadImg;
    }

    public void setDownloadImg(int downloadImg) {
        this.downloadImg = downloadImg;
    }

    public void setPostImg(int postImg) {
        this.postImg = postImg;
    }

    public void setLikesImg(int likesImg) {
        this.likesImg = likesImg;
    }

    public void setDislikesImg(int dislikesImg) {
        this.dislikesImg = dislikesImg;
    }

    public void setLikesValue(int likesValue) {
        this.likesValue = likesValue;
    }

    public void setDislikesValue(int dislikesValue) {
        this.dislikesValue = dislikesValue;
    }

    public int getPostImg() {
        return postImg;
    }

    public int getLikesImg() {
        return likesImg;
    }

    public int getDislikesImg() {
        return dislikesImg;
    }

    public int getLikesValue() {
        return likesValue;
    }

    public int getDislikesValue() {
        return dislikesValue;
    }

    public post(int postImg, int likesImg, int dislikesImg, int likesValue, int dislikesValue, int downloadImg) {
        this.postImg = postImg;
        this.likesImg = likesImg;
        this.dislikesImg = dislikesImg;
        this.likesValue = likesValue;
        this.dislikesValue = dislikesValue;
        this.downloadImg = downloadImg;
    }
}
