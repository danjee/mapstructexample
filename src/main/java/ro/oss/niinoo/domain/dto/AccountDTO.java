package ro.oss.niinoo.domain.dto;

import java.util.Collection;

public class AccountDTO {

    private Long accountId;

    private Collection<AccountAttributeDTO> attributes;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Collection<AccountAttributeDTO> getAttributes() {
        return attributes;
    }

    public void setAttributes(Collection<AccountAttributeDTO> attributes) {
        this.attributes = attributes;
    }
}
