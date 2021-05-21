package Serialize;

import java.io.Serializable;

public class SerializeObject implements Serializable {

    private String field01;
    private String field02;

    public String getField01() {
        return field01;
    }

    public void setField01(String field01) {
        this.field01 = field01;
    }

    public String getField02() {
        return field02;
    }

    public void setField02(String field02) {
        this.field02 = field02;
    }

    public SerializeObject() {
        field01 = "field01";
        field02 = "field02";
    }

    public SerializeObject(String field01, String field02) {
        this.field01 = field01;
        this.field02 = field02;
    }

    @Override
    public String toString() {
        return field01 + "/" + field02;
    }
}
