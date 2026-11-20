package pt.ipp.estg.pp.pp_fp08.stand.enums;

/**
 *
 * @author Utilizador
 */
public enum Condition {
    NEW,
    USED;

    public String conditionToString() {
        return switch (this) {
            case NEW -> "New";
            case USED -> "Used";
        };
    }
}
