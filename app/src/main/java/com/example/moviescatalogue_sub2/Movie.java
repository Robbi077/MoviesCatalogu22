package com.example.moviescatalogue_sub2;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private int cImage;
    private String cName;
    private String cDescription;

    public int getcImage() {
        return cImage;
    }

    public void setcImage(int cImage) {
        this.cImage = cImage;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.cImage);
        dest.writeString(this.cName);
        dest.writeString(this.cDescription);
    }

    public Movie() {
    }

    protected Movie(Parcel in) {
        this.cImage = in.readInt();
        this.cName = in.readString();
        this.cDescription = in.readString();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
