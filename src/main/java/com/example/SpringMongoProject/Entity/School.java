package com.example.SpringMongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="school")
public class School{

    @Id
    private String _id;
    private String schoolname;
    private String schoolregisno;
    private String address;
    private String foundedin;
    private String principal;
    private String board;

    public School(String _id, String schoolname, String schoolregisno, String address, String foundedin, String principal, String board) {
        this._id = _id;
        this.schoolname = schoolname;
        this.schoolregisno = schoolregisno;
        this.address = address;
        this.foundedin = foundedin;
        this.principal = principal;
        this.board = board;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getSchoolregisno() {
        return schoolregisno;
    }

    public void setSchoolregisno(String schoolregisno) {
        this.schoolregisno = schoolregisno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFoundedin() {
        return foundedin;
    }

    public void setFoundedin(String foundedin) {
        this.foundedin = foundedin;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "School{" +
                "_id='" + _id + '\'' +
                ", schoolname='" + schoolname + '\'' +
                ", schoolregisno='" + schoolregisno + '\'' +
                ", address='" + address + '\'' +
                ", foundedin='" + foundedin + '\'' +
                ", principal='" + principal + '\'' +
                ", board='" + board + '\'' +
                '}';
    }
}
