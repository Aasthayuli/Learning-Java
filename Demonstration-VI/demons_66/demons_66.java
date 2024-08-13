/*code sharing through super concept */
/*Runtime polymorphism(At runtime it will dissolve which method will be called there!) or dynamic binding */

class cat {
    void speak() {
        System.out.println("Meaon!");
    }
}

class petcat extends cat { // petcat is a kind of cat
    void speak() {
        System.out.println("Meow");
    }
}

class magicCat extends cat { // magicCat is another kind of cat
    static boolean noOne;

    void speak() {
        if (noOne) {
            super.speak(); // use the super class definition
        } else {
            System.out.println("Hello world!");
        }
    }
}

class demons_66 {
    public static void main(String[] args) {
        petcat c1 = new petcat();
        magicCat c2 = new magicCat();
        c2.noOne = true;
        c2.speak();
        c1.speak();
        c2.noOne = false;
        c2.speak();
    }
}