/* This is multi line comment - Displying a table like i i+1 i+2*/
public class Ex01_06 {
    public static void main(String[] args) {
        System.out.println("i\ti+1\ti+2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "\t" + (i + 1) + "\t" + (i + 2));
        }
    }
}