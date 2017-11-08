package ro.oss.niinoo.domain.model.base;

import java.util.Collection;

public abstract class Entity<T extends Attribute> {

    public abstract Collection<T> getAttributes();

    public abstract void setAttributes(Collection<T> attributes);
}
