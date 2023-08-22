public class StringDemo2 {
    int price;
    public static void main(String[] args) {
        StringDemo2 sl = new StringDemo2();
        System.out.println(sl.hashCode());
        sl.price = 100;

        StringDemo2 sl2 = new StringDemo2();
        System.out.println(sl2.hashCode());
        sl2.price = 200;

        // sl2 --> StringDemo da obj

        if(sl.equals(sl2)){
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
    // Current object --> sl
    // current object of this class --> sk


    @Override
    public boolean equals(Object obj) {
        StringDemo2 s = (StringDemo2)obj;   //Casting
        if (this.price == s.price)  // Here s argument ullala pass aakura object sl2
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return 123;
    }
}

