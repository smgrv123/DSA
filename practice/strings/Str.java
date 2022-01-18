public class Str {
    public static void main(String[] args) {
        //!Strings are used in double quotes in java
        String b="HelloW";
        System.out.println(b);
        // ! two reference variables will be pointing at the same object in the string pool 
        String a="HelloW";
        System.out.println(a);
        // ?if we compare the two reference variables it would return true 
        System.out.println(a==b);
        // ! this wont work if we create to string outside the string pool and in the heap memory
        String name1=new String("Sam");
        String name2=new String("Sam");
        System.out.println(name1==name2);
        //* will return true if we use equals function in the string class
        System.out.println(name1.equals(name2));
    }
}