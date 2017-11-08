package ro.oss.niinoo.domain.model;

import ro.oss.niinoo.domain.model.base.Attribute;
import ro.oss.niinoo.domain.model.base.Entity;

import java.util.Collection;

public class Account extends Entity {

    private Long accountId;

    private Collection<AccountAttribute> attributes;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Collection<AccountAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(Collection<? extends Attribute> attributes) {
        this.attributes = (Collection<AccountAttribute>) attributes;
    }
}
