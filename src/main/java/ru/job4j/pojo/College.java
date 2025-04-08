package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vladimir Kozhemyaka");
        student.setGroup(1122);
        student.setDateOf(new Date());
        System.out.println(student.getName() + " " + student.getGroup() + " " + student.getDateOf());
    }
}
