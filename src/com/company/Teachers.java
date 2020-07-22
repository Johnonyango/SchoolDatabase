package com.company;

import java.util.*;

public class Teachers {
    public String Id;
    public String Name;
    Scanner scanner=new Scanner(System.in);
    List<Teachers> teacher=new ArrayList<>();

    public String getId() {
        return Id;
    }

    public void setId(String tId) {
        this.Id = tId;
    }

    public String getName() {
        return Name;
    }

    public void settName(String tName) {
        this.Name = tName;
    }

    @Override
    public String toString() {
        return this.getId()+" "+this.getName();
    }

//    @Override
    public void add() {
        Teachers teachers=new Teachers();
        System.out.println("Teacher's ID: ");
        teachers.setId(scanner.nextLine());
        System.out.println("Teacher's name: ");
        teachers.settName(scanner.nextLine());
        teacher.add(teachers);

    }

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

    public void view() {
        Iterator iterator=teacher.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}