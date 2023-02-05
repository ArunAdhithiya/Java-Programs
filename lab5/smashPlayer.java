package com.adhithiya.lab5;

import java.util.Scanner;

public class smashPlayer {
    int id,a;

    String name;
    int[] arr=new int[10];
    int lvl;
    Scanner in=new Scanner(System.in);
    void setId(int id)
    {
        this.id=id;
    }
    void setName(String name)
    {
        this.name=name;
    }
    int getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }

    void setArr(int[] arr,int lvl)
    {
        if(lvl>9) {
            System.out.println("invalid");
        }
        //Additionally, no level except the first one should be set unless the user has earned at least
        // 100 points at each previous level.
        // If a user tries to set a score for a level that is not yet available, issue an error message.
        for (int i = 0; i < lvl; i++) {
                System.out.println("score[" + i + "]");
                arr[i] = in.nextInt();
            if(arr[0]<100){
                System.out.println("invalid");
                break;
            }
            else{
                if(arr[i]<100)
                {
                    System.out.println("invalid");
                    break;
                }
                else{
                    continue;
                }
            }
        }
    }



}
