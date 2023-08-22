public class StringDemo3 {
    public static void main(String[] args) {

        StringDemo3 sd = new StringDemo3();
        String[] names = {"Aashik", "Mohamed", "Ahamed"};
        sd.joinWords(names);
    }

    private void joinWords(String[] names) {
        String sentence = "";
        StringBuffer sb = new StringBuffer("");
        StringBuffer sb2 = new StringBuffer("raja");
        sb2.insert(1,"a");
        System.out.println(sb2);

        sb2.replace(0,2, "ki");
        System.out.println("After replacing");
        System.out.println(sb2);
        System.out.println(sb2.reverse());


        for (String name:names){
            sentence+=name;
//            System.out.println("String hashCode " +sentence.hashCode());
            sb.append(name);
//            System.out.println("StringBuffer hashCode " +sb.hashCode());

        }
        System.out.println(sentence);
        System.out.println(sb);
    }
}
