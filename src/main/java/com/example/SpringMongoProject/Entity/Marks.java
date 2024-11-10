package com.example.SpringMongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="marks")
public class Marks {

    @Id
    private String _id;
    private String studentname;
    private String studentrollno;
    private String english;
    private String maths;
    private String hindi;
    private String social_science;
    private String science;


    public Marks(String _id, String studentname, String studentrollno, String english, String maths, String hindi, String social_science, String science) {
        this._id = _id;
        this.studentname = studentname;
        this.studentrollno = studentrollno;
        this.english = english;
        this.maths = maths;
        this.hindi = hindi;
        this.social_science = social_science;
        this.science = science;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentrollno() {
        return studentrollno;
    }

    public void setStudentrollno(String studentrollno) {
        this.studentrollno = studentrollno;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMaths() {
        return maths;
    }

    public void setMaths(String maths) {
        this.maths = maths;
    }

    public String getHindi() {
        return hindi;
    }

    public void setHindi(String hindi) {
        this.hindi = hindi;
    }

    public String getSocial_science() {
        return social_science;
    }

    public void setSocial_science(String social_science) {
        this.social_science = social_science;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "_id='" + _id + '\'' +
                ", studentname='" + studentname + '\'' +
                ", studentrollno='" + studentrollno + '\'' +
                ", english='" + english + '\'' +
                ", maths='" + maths + '\'' +
                ", hindi='" + hindi + '\'' +
                ", social_science='" + social_science + '\'' +
                ", science='" + science + '\'' +
                '}';
    }
}