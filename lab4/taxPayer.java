package com.adhithiya.lab4;

public class taxPayer {
    int ssn=10000;
    int ygi;
    taxPayer(int ygi)
    {
        ssn+=(ssn+1);
        this.ygi=ygi;
    }
    int getSsn()
    {
        return ssn;
    }
    int getYgi()
    {
        return ygi;
    }

}
