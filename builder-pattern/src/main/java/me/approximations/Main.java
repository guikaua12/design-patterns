package me.approximations;

public class Main {
    public static void main(String[] args) {
        final Product product = Product.builder()
                .id(3L)
                .name("Keyboard")
                .price(100D)
                .build();

        System.out.println(product);
    }
}
