package kiosk.kioskApi.domain;

public class UserRecordResponse {
    private int code;
    private String message;
    private String exception;
    private UserRecordData data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public UserRecordData getData() {
        return data;
    }

    public void setData(UserRecordData data) {
        this.data = data;
    }
}

