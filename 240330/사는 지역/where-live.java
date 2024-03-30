import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    String address;
    String city;

    public Person(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        // 첫 번째 줄에 n 입력받기
        int n = scanner.nextInt();
        scanner.nextLine(); // 숫자 입력 후 남은 줄바꿈 문자 제거

        // n명의 정보 입력받기
        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split(" ");
            String name = inputData[0];
            String address = inputData[1];
            String city = inputData[2];
            people.add(new Person(name, address, city));
        }

        // 이름을 기준으로 사전순으로 정렬
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        // 이름이 사전순으로 가장 느린 사람의 정보 출력
        Person lastPerson = people.get(people.size() - 1);
        System.out.println("name " + lastPerson.getName());
        System.out.println("addr " + lastPerson.getAddress());
        System.out.println("city " + lastPerson.getCity());
    }
}