import java.util.ArrayList;
public class packb {
public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
list.add("C++");
System.out.println("Languages:");
for (String lang : list) {
System.out.println(lang);
}
}
}