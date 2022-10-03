package test;

public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person("qiu", "12313463");
        Person p2 = new Person("huang", "12315456");
        Person p3 = new Person("chen", "12313122");
        Person p4 = new Person("jiang", "1231454");
        Person p5 = new Person("liu", "123112311");

        test ts=new test();
        ts.Person_add(p1);
        ts.Person_add(p2);
        ts.Person_add(p3);
        ts.Person_add(p4);
        ts.Person_add(p5);

        ts.Person_select_name("qiu");
        ts.Person_select_phonenumber("12313122");

        ts.Person_print();

    }
}
