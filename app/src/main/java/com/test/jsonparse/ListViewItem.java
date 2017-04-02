package com.test.jsonparse;
import android.graphics.Bitmap;

public class ListViewItem {
    private Bitmap image ;
    private String titleStr,link ;
    private String descStr ;
    public static MainActivity main = new MainActivity();

    public void setLink(String url) {

        link = url ;
    }

    public void setImage(Bitmap bitmap) {

        image = bitmap ;
    }
    public void setTitle(String title) {

        titleStr = title ;
    }

    public String getLink() {

        return this.link ;
    }

    public Bitmap getImage() {

        return this.image ;
    }
    public String getTitle() {

        return this.titleStr ;
    }

}



