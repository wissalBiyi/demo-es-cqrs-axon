package net.biyi.demoescqrsaxon.commands.commands;

import org.axonframework.messaging.commandhandling.annotation.Command;
import org.axonframework.modelling.annotation.TargetEntityId;

@Command(routingKey = "id")
public record AddAccountCommand(
        @TargetEntityId String id,
        double initialBalance,
        String currency
) {
}