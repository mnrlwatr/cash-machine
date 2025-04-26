package command;

import command.enums.Operation;
import exception.InterruptOperationException;

import java.util.EnumMap;
import java.util.Map;

public final class CommandExecutor {
    private static final Map<Operation, Command> allKnownCommandsMap = new EnumMap<>(Operation.class);;

    static {
        allKnownCommandsMap.put(Operation.LOGIN, new LoginCommand());
        allKnownCommandsMap.put(Operation.DEPOSIT, new DepositCommand());
        allKnownCommandsMap.put(Operation.WITHDRAW, new WithdrawCommand());
        allKnownCommandsMap.put(Operation.INFO, new InfoCommand());
        allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
    }

    private CommandExecutor() {
    }

    public static void execute(Operation operation) throws InterruptOperationException {
        allKnownCommandsMap.get(operation).execute();
    }
}
