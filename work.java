package com.company;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class work implements interfaces {
    Random rand=new Random();
    Scanner scan=new Scanner(System.in);
    ArrayList arr=new ArrayList();
    ArrayList newArr=new ArrayList();
    ArrayList newArrAdd=new ArrayList();
    ArrayList newArrRand=new ArrayList();
    ArrayList oldArr=new ArrayList();
    ArrayList oldArrTwo=new ArrayList();
    ArrayList oddArr=new ArrayList();
    ArrayList thirty=new ArrayList();
    ArrayList firstArr=new ArrayList();
    ArrayList secondArr=new ArrayList();
    byte[] array = new byte[10];
    ArrayList strs=new ArrayList();

    @Override
    public void insertAndPrint() {
        for (int i=0; i<5; i++){
            arr.add(rand.nextInt());
        }
        System.out.println("1) - "+arr);
    }

    @Override
    public void reversedPrint() {
        System.out.println("2.1) - "+arr);
        Collections.reverse(arr);
        System.out.println("2.2) - "+arr);
    }

    @Override
    public void ascendPrint() {
        Collections.sort(arr);
        System.out.println("3) - "+arr);
    }

    @Override
    public void descendPrint() {
        Collections.reverse(arr);
        System.out.println("4) - "+arr);
    }

    @Override
    public void newArr() {
        for (int i=0; i<5; i++){
            newArr.add(rand.nextInt());
        }
        System.out.println("5.1) - " + newArr);
        for (int i=0; i<3; i++){
            newArr.add(rand.nextInt(25-10)+10);
        }
        System.out.println("5.2) - "+ newArr);
    }

    @Override
    public void newArrAdd() {
        for (int i=0; i<5; i++) {
            newArrAdd.add(rand.nextInt());
        }
        System.out.println("6-first) "+newArrAdd);
        for (int i=1; i<newArrAdd.size(); i+=2) {
                newArrAdd.add(i,rand.nextInt(10));
        }
        newArrAdd.add(rand.nextInt(10));
        System.out.println("6-last) "+newArrAdd);
    }

    @Override
    public void newArrRand() {
        int k=scan.nextInt();
        for (int i=0; i<5; i++){
            newArrRand.add(rand.nextInt());
        }
        System.out.println("7-first) "+newArrRand);
        newArrRand.add(k+1, rand.nextInt(10));
        System.out.println("7-last) "+newArrRand);
    }

    @Override
    public void oldArr() {
        for (int i=0; i<5; i++){
            oldArr.add(rand.nextInt());
        }
        System.out.println("8-first) "+oldArr);
        for (int i=0; i<3; i++){
            oldArr.remove(0);
        }
        System.out.println("8-last) "+oldArr);
    }

    @Override
    public void oldArrTwo() {
        for (int i=0; i<5; i++){
            oldArrTwo.add(rand.nextInt());
        }
        int k=scan.nextInt();
        System.out.println("9-first) "+oldArrTwo);
        oldArrTwo.remove(k);
        System.out.println("9-last) "+oldArrTwo);
    }

    @Override
    public void oddArr() {
        for (int i=0; i<5; i++){
            oddArr.add(rand.nextInt());
        }
        System.out.println("10-first) "+oddArr);
        for (int i=0; i<oddArr.size(); i+=1){
            oddArr.remove(i);
        }
        System.out.println("10-last) "+oddArr);
    }

    @Override
    public void thirty() {
        for (int i=0; i<5; i++){
            thirty.add(rand.nextInt(32-27)+27);
        }
        System.out.println("11-first) "+thirty);
        for (int i=0; i<thirty.size(); i++){
            thirty.remove(new Integer(30));
        }
        System.out.println("11-last) "+thirty);
    }

    @Override
    public void twoArr() {
        for (int i=0; i<20; i++){
            firstArr.add(rand.nextInt(50));
        }
        System.out.println("12-first) "+firstArr);
        for (int i=7; i<15; i++){
            secondArr.add(firstArr.get(i));
        }
        System.out.println("12-second) "+secondArr);
    }

}
