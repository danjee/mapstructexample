package ro.oss.niinoo.domain.model;

import ro.oss.niinoo.domain.model.base.Entity;

import java.util.Collection;

public class Account extends Entity<AccountAttribute> {

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

    @Override
    public void setAttributes(Collection<AccountAttribute> attributes) {
        this.attributes = attributes;
    }


}
