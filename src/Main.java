public class Main {
    public static void main(String[] args) {
        Foo foo1 = new Foo() {
            @Override
            public void m() {
                System.out.println("m");
            }

            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        };

        foo1.m();

        Foo foo2 = new Foo() {
            @Override
            public void m() {
                System.out.println(">>m");
            }

            @Override
            public void m1() {
                System.out.println(">>m1");
            }

            @Override
            public void m2() {
                System.out.println(">>m2");
            }
        };

        foo2.m();
    }
}