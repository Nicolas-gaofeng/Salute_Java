package src.basic.oo.oo.myInnerClass.inner_02;

public class Outer {

    private int num = 10;

    /*
     * public class Inner { public void show() { System.out.println(num); } }
     */

    private class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }

}
