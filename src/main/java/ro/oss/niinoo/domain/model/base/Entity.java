package ro.oss.niinoo.domain.model.base;

import java.util.Collection;

public abstract class Entity {

    public abstract Collection<? extends Attribute> getAttributes();

    public abstract void setAttributes(Collection<? extends Attribute> attributes);
}
