package collectionframework;
import java.util.ArrayList;

    public class ArrayListExample {
        public static void main(String[] args) {
            // 1. Creation (Using Generics to enforce Type Safety)
            ArrayList frameworkList = new ArrayList();

            // 2. Adding Elements
            frameworkList.add("Happy");
            frameworkList.add("Angry");
            frameworkList.add("Sad");
            frameworkList.add(2000);
            frameworkList.add(87.23f);
            frameworkList.add(false);
            frameworkList.add(800);

            System.out.println(frameworkList);
//        System.out.println(frameworkList.get(0));
            frameworkList.add(4, 800);

            frameworkList.addFirst(900);
            System.out.println(frameworkList);
            System.out.println(frameworkList.contains(900));
            System.out.println(frameworkList.indexOf(87));
            System.out.println(frameworkList.remove(2));
            frameworkList.clear();
            System.out.println(frameworkList);
        }
    }
/*
[Happy, Angry, Sad, 2000, 87.23, false, 800]
[900, Happy, Angry, Sad, 2000, 800, 87.23, false, 800]
true
-1
Angry
[]
*/
