package by.string.asStringBuilder;

// В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut\n" +
                "in culpa qui officia deserunt mollit anim id est laborum.aaaa.baba";
        String find = "a";
        String add = "b";
        System.out.println(s);
        s = s.replace("a", "ab");
        System.out.println(s);
    }
}
