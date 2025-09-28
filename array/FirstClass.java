class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!1");
        MyFirstClass.main(args);
        MySecondClass.main(args);
        MyFirstClass.main(null);
        MySecondClass.main(null);
    }
}


class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!2");
    }
}

class MySecondClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!3");
    }
}