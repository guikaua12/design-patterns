package me.approximations;

public class Main {
    public static void main(String[] args) {
        final EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);

        final LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
    }
}