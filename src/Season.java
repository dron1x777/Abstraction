public enum Season {
    SPRING("ВЕСНА"),
    SUMMER("ЛЕТО"),
    AUTUMN("ОСЕНЬ"),
    WINTER("ЗИМА");

    private String nameRy;

    Season(String nameRy) {
        this.nameRy = nameRy;
    }
    public String getNameRy() {
        return nameRy;
    }
    void setNameRy(String nameRy) {
        this.nameRy = nameRy;
    }
}
