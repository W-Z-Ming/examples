package Serialize;

import java.io.Serializable;

public class ObjectExtendsNonSerializableObjectWithConstructor extends NonSerializableObject implements Serializable {

    private String field02;

    public ObjectExtendsNonSerializableObjectWithConstructor() {
        this.setField01("");
        this.setField02("");
    }

    public String getField02() {
        return field02;
    }

    public void setField02(String field02) {
        this.field02 = field02;
    }
}
