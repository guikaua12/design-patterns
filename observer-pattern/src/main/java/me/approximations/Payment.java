package me.approximations;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@Getter
public class Payment {
    private final UUID id;
    private final double amount;
}
