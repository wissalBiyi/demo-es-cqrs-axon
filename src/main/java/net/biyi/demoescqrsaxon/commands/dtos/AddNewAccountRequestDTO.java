package net.biyi.demoescqrsaxon.commands.dtos;

public record AddNewAccountRequestDTO(
        double initialBalance,
        String currency
) {
}