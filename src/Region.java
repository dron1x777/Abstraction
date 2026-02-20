public enum Region {
    OSH("ОШ"),
    BATKEN("БАТКЕН"),
    CHYI("ЧУЙ"),
    TALAS("ТАЛАС"),
    ISSYKKOL("ЫССЫК КОЛ"),
    JALALABAD("ДЖАЛАЛ АБАД"),
    NARYN("НАРЫН");

    private String nameRy;
    Region(String nameRy) {
        this.nameRy = nameRy;
    }
    public String getNameRy() {
        return nameRy;
    }
    void setNameRy(String nameRy) {
        this.nameRy = nameRy;
    }
}
