package ru.nsu.ci.iter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        List<UserData> users = new ArrayList<>();
        users.add(new UserData("Ivan", "Ivanov", 18));
        users.add(new UserData("Ivan", "Petrov", 20));
        users.add(new UserData("Anna", "Fedorova", 22));
        users.add(new UserData("Maria", "Sergeeva", 20));

        System.out.println("----Start All Users----");
        printNames(users);
        System.out.println("----End All Users----");

        System.out.println("----Start All Users Age Greater Than 20----");
        printNameIfAgeGreater(users, 20);
        System.out.println("----End All Users Age Greater Than 20----");
        // сделать новый спсиок, который содержал бы только пользователей с определеым именем
        // в искомом листе изменений не произойдёт
        List<UserData> users1 = listOfUsersWithNameByFori(users, "Ivan");
        List<UserData> users2 = listOfUsersWithNameByFor(users, "Ivan");
        List<UserData> users3 = listOfUsersWithNameByForeach(users, "Ivan");
        List<UserData> users4 = listOfUsersWithNameByStream(users, "Ivan");
        System.out.println("----Start All Users Again After Filter----");
        printNames(users);
        System.out.println("----End All Users Again After Filter----");
        System.out.println("----Start New Filtered Users----");
        printNames(users2);
        printNames(users3);
        printNames(users4);
        printNames(users1);
        System.out.println("----End New Filtered Users----");

    }

    private static void printNames(List<UserData> users) {
        System.out.println("-----fori-----");
        for (int i = 0; i < users.size(); i++) {
            UserData userData = users.get(i);
            System.out.println(userData.firstName() + " " + userData.lastName());
        }

        System.out.println("-----for-----");
        for (UserData userData : users) {
            System.out.println(userData.firstName() + " " + userData.lastName());
        }

        System.out.println("-----foreach-----");
        users.forEach(userData -> System.out.println(userData.firstName() + " " + userData.lastName()));
    }

    private static void printNameIfAgeGreater(List<UserData> users, int minAge) {
        System.out.println("-----fori-----");
        for (int i = 0; i < users.size(); i++) {
            UserData userData = users.get(i);
            if (userData.age() > minAge) {
                System.out.println(userData.firstName() + " " + userData.lastName());
            }
        }

        System.out.println("-----for-----");
        for (UserData userData : users) {
            if (userData.age() > minAge) {
                System.out.println(userData.firstName() + " " + userData.lastName());
            }
        }

        System.out.println("-----foreach-----");
        users.forEach(userData -> {
            if (userData.age() > minAge) {
                System.out.println(userData.firstName() + " " + userData.lastName());
            }
        });

        System.out.println("-----stream-----");
        users.stream()
            .filter(userData -> userData.age() > minAge)
            .forEach(userData -> System.out.println(userData.firstName() + " " + userData.lastName()));
    }

    private static List<UserData> listOfUsersWithNameByFori(List<UserData> users, String name) {
        System.out.println("-----new list via fori-----");
        List<UserData> result = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            UserData userData = users.get(i);
            if (userData.firstName().equals(name)) {
                result.add(userData);
            }
        }
        return result;
    }

    private static List<UserData> listOfUsersWithNameByFor(List<UserData> users, String name) {
        System.out.println("-----new list via for-----");
        List<UserData> result = new ArrayList<>();
        for (UserData userData : users) {
            if (userData.firstName().equals(name)) {
                result.add(userData);
            }
        }
        return result;
    }

    private static List<UserData> listOfUsersWithNameByForeach(List<UserData> users, String name) {
        System.out.println("-----new list via foreach-----");
        List<UserData> result = new ArrayList<>();
        users.forEach(userData -> {
            if (userData.firstName().equals(name)) {
                result.add(userData);
            }
        });
        return result;
    }

    private static List<UserData> listOfUsersWithNameByStream(List<UserData> users, String name) {
        System.out.println("-----new list via stream-----");
        return users.stream()
            .filter(userData -> userData.firstName().equals(name))
            .collect(Collectors.toList());
    }

}
