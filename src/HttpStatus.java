public enum HttpStatus {
    OK(200, "OK"),
    NOT_FOUND(404, "Not Found"),
    BAD_REQUEST(400, "Bad Request"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),;

    private String nameRy;
    private int code;

    HttpStatus(int code,String nameRy) {
        this.code=code;
        this.nameRy = nameRy;
    }
    void setCode(int code) {
        this.code = code;
    }
    int getCode() {
        return this.code;
    }
    public String getNameRy() {
        return nameRy;
    }
    void setNameRy(String nameRy) {
        this.nameRy = nameRy;
    }
    static void getInfo(HttpStatus status) {
        System.out.println(status.getNameRy()
        + " " + status.getCode());
    }
    static HttpStatus fromCode(int code) {
        for (HttpStatus httpStatus : HttpStatus.values()) {
            if (httpStatus.getCode()==code) {
                return httpStatus;
            }
        }
        return null;
    }

}
