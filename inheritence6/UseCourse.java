package com.adhithiya.inheritence6;

import javax.swing.*;
import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {
        LabCourse o = new LabCourse(13,2,"nxf");
        collegeCourse o1 = new collegeCourse();
        if (o.department == "PHY" || o.department== "CIS" || o.department == "BIO" || o.department == "CHM")
            System.out.println("labcourse");
        else
            System.out.println("");;
    }
}

