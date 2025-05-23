package command.enums;

public enum Operation {
    LOGIN,
    INFO,
    DEPOSIT,
    WITHDRAW,
    EXIT;

    public static Operation getAllowableOperationByOrdinal(Integer i) {
        if (i == LOGIN.ordinal()) {
            throw new IllegalArgumentException();
        }
        for (Operation o : values()) {
            if (o.ordinal() == i) {
                return o;
            }
        }
        throw new IllegalArgumentException();
    }
}
