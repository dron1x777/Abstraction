public enum Direction {
    NORTH("Север"),
    SOUTH("Юг"),
    WEST("Запад"),
    EAST("Восток");

    private String nameRy;

    Direction(String nameRy) {
        this.nameRy = nameRy;
    }
    public String getNameRy() {
        return nameRy;
    }
    void setNameRy(String nameRy) {
        this.nameRy = nameRy;
    }
    String getOpposite(Direction season) {
        switch (season) {
            case NORTH:
                return SOUTH.nameRy;
                case SOUTH:
                    return NORTH.nameRy;
                    case WEST:
                        return EAST.nameRy;
                        case EAST:
                            return WEST.nameRy;
            default:
                return "Ошибка";
        }
    }
}
