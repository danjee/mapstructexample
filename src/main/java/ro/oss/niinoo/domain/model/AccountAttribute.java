package ro.oss.niinoo.domain.model;

import ro.oss.niinoo.domain.model.base.Attribute;

public class AccountAttribute implements Attribute{

    private String name;

    private String value;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }
}
