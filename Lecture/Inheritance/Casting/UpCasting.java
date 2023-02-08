class UpCasting {
    public static void main(String[] args) {

        Parrent parrent = new Parrent();
        Child child = new Child();

        parrent.m1();
        child.m1();
        child.m2();

        /*
         * Up Casting
         * Object of Child Class but the reference of Parrent Class
         */

        Parrent parrentrefchild = new Child();
        parrentrefchild.m1();
        Parrent newParrent = (Parrent) parrentrefchild;
        newParrent.m1();

        /*
         * Down Casting:
         */
        Parrent parrentrefchild1 = new Child();
        Child child4 = (Child) parrentrefchild1;
        child4.m1();
        child4.m2();
    }
}

class Parrent {
    public void m1() {
        System.out.println("Parrent Class M1 Method Called..");
    }
}

class Child extends Parrent {
    public void m2() {
        System.out.println("Child Class M2 Method Called..");
    }
}