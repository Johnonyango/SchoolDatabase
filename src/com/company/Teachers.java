package com.company;

import java.sql.SQLException;
import java.util.*;

public class Teachers {
    public int Id;
    public String Name;
    String subject;
    Scanner scanner=new Scanner(System.in);
    List<Teachers> teacher=new ArrayList<>();

    public int getId() {
        return Id;
    }

    public void setId(int tId) {
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
    public void add() throws SQLException, ClassNotFoundException {
        TeacherDB.getTeachersData();
    }

    public void assignSubject(){
        String subj;
        do {
            System.out.print("Enter subject to assign (Q to quit): ");
            subj = scanner.nextLine();
            if (!"Q".equals(subj)){
                subject+='\n' + subj;
            }else
                break;
        }while (1 != 0);

        System.out.println("Assign" + subj);
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