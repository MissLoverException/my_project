package com.missloverexception.project.interview.chapter4;

import java.util.Date;
import java.util.Objects;

public class UserOverride {

    private int age;

    private String name;

    private Date time;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name, time);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        UserOverride user = (UserOverride) obj;
//        return age == user.getAge() && Objects.equals(name, user.getName()) && Objects.equals(time, user.getTime());
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserOverride that = (UserOverride) o;
        return age == that.age &&
                Objects.equals(name, that.name) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, time);
    }
}

