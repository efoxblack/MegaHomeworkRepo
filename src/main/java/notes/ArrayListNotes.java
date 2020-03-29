package notes;

import java.util.ArrayList;

public class ArrayListNotes {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        String s = "news";
        myList.add(s);
        String b = "not";
        myList.add(b);
        int theSize = myList.size();
        boolean isIn = myList.contains(s);
        int idx = myList.indexOf(b);
        boolean empty = myList.isEmpty();
        myList.remove(s);

        // java.util.ArrayList<Dog> list = new java.util.ArrayList<Dog>();
        // public void go(java.util.ArrayList<Dog> list) { }
        // public java.util.ArrayList<Dog> foo() {...}


    }
}
