import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task18 {
    public static ArrayList<String> EmailList = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            if (text.toLowerCase().startsWith("list")) {
                System.out.println(list());
            }
            if (text.toLowerCase().startsWith("add")) {
                add(text);
            }
            if (text.toLowerCase().startsWith("exit")) {
                break;
            }
        }
    }
        public static void add(String email){
        String [] split = email.split("\\s",2);
        if(split[1].matches("[A-z]+[0-9]+@[A-z]+.[A-z]+||[A-z]+@[A-z]+.[A-z]")){
            EmailList.add(split[1]);
            System.out.println("Электронный адрес добавлен");
        }else{
            System.out.println("Неверный формат");
        }
        }
    public static String list() {
        return IntStream.range(0, EmailList.size())
                .mapToObj(i -> i + " - " + EmailList.get(i))
                .collect(Collectors.joining("\n"));
    }
    }



