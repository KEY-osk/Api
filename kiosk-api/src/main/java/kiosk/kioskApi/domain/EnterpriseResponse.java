package kiosk.kioskApi.domain;

// 응답 클래스
public class EnterpriseResponse {
    private int code;
    private String message;
    private Object exception;
    private EnterpriseData data;

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

    public Object getException() {
        return exception;
    }

    public void setException(Object exception) {
        this.exception = exception;
    }

    public EnterpriseData getData() {
        return data;
    }

    public void setData(EnterpriseData data) {
        this.data = data;
    }

}
