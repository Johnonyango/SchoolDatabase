package com.company;

import java.util.*;

public class Teachers {
    public String tId;
    public String tName;
    Scanner scanner=new Scanner(System.in);
    List<Teachers> teacher=new ArrayList<>();

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        return this.gettId()+" "+this.gettName();
    }

//    @Override
    public void add() {
        Teachers teachers=new Teachers();
        System.out.println("enter the Teacher ID");
        teachers.settId(scanner.nextLine());
        System.out.println("enter the name of the teacher");
        teachers.settName(scanner.nextLine());
        teacher.add(teachers);

    }

//    @Override
    public void delete() {
        System.out.println("enter the number of the teacher you want to delete");
        Iterator iterator=teacher.iterator();
        int i=0;
        while (iterator.hasNext()){
            System.out.println(i+". "+iterator.next());
            i++;
        }
        int j=scanner.nextInt();
        teacher.remove(j);
    }

//    @Override
    public void view() {
        Iterator iterator=teacher.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}