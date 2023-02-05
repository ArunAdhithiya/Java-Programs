package com.adhithiya.lab6.p6;

import com.adhithiya.lab6.p2.Staff;
import com.adhithiya.lab6.p3.Patient;
import com.adhithiya.lab6.p4.Doctor;
import com.adhithiya.lab6.p5.Nurse;

public class HospitalDatabase {
    public static void main(String[] args) {
        Staff o1=new Staff("arun",20,12,1);
        o1.staffDetails();
        Patient o2=new Patient("adhithiya",11,6,1001);
        o2.patientDetails();
        Doctor o3=new Doctor("karan",50,30,4,"surgeon");
        o3.doctorDetails();
        Nurse o4=new Nurse("kanni",25,10,2002,"assistant");
        o4.nurseDetails();
    }
}
