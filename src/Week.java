public enum Week {
   MONDAY("Дуйшөмбү куну жава окуйм"),
    TUESDAY("Шейшемби күнү англис тили сабагын окуйм"),
    WEDNESDAY("Шаршемби күнү жаны тема отобуз"),
    THURSDAY("Бейшемби күнү англис тили сабагын окуйм"),
    FRIDAY("Жума күнү жава окуйм"),
    SATURDAY("Ишемби күнү өз алдынча практика кылам"),
    SUNDAY("Жекшемби күнү эс алам");

    private String description;

    Week(String description) {
        this.description = description;
    }
    String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
