package test;

import java.util.ArrayList;

public class Person {
    private String name;
    private String phoneNumber;

    public Person() {
    }

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNuber() {
        return phoneNumber;
    }

    public void setPhoneNuber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


class test {
    ArrayList<Person> al = new ArrayList<Person>();
    boolean flag=false;
    public void Person_add(Person ps) {
        al.add(ps);
    }
    public void Person_print() {
        for (Person ps : al) {
            System.out.println("姓名      手机号码");
            System.out.println(ps.getName() +"      " +ps.getPhoneNuber());
        }
    }
    public void Person_select_name(String name) {
        for (Person ps : al) {
            if (ps.getName().equals(name)) {
                System.out.println("姓名      手机号码");
                System.out.println(ps.getName() +"      " +ps.getPhoneNuber());
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("没有找到这个人");
        }
    }

    public void Person_select_phonenumber(String phonenumber) {
        for (Person ps : al) {
            if (ps.getPhoneNuber().equals(phonenumber)) {
                System.out.println("姓名      手机号码");
                System.out.println(ps.getName() +"      " +ps.getPhoneNuber());
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("没有找到这个人");
        }
    }
}