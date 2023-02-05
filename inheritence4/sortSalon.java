package com.adhithiya.inheritence4;

import java.util.Arrays;

public class sortSalon {
    public static void main(String[] args) {
        int i;
        hairSalon[] obj=new hairSalon[4];
        for(i=0;i<4;i++)
        {
            obj[i]=new hairSalon();
        }
        obj[0].setDetails("cut",25,23);
        obj[1].setDetails("manicure",3,23);
        obj[2].setDetails("shampoo",40,23);
        obj[3].setDetails("cut",20,23);

        double[] arr=new double[4];
        for(i=0;i<4;i++)
        {
            arr[i]=obj[i].price;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
