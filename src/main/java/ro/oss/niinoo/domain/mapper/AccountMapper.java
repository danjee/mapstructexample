package ro.oss.niinoo.domain.mapper;/*
 * Copyright (c) 2017, UXP Systems, Inc.
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of UXP Systems Incorporated and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to UXP Systems Incorporated
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from UXP Systems Incorporated.
 * UXDR, ULM, Powering The Digital User Lifecycle and User Lifecycle Management
 * are all trademarks of UXP Systems Inc.
 */

import org.mapstruct.Mapper;
import ro.oss.niinoo.domain.dto.AccountAttributeDTO;
import ro.oss.niinoo.domain.dto.AccountDTO;
import ro.oss.niinoo.domain.model.Account;
import ro.oss.niinoo.domain.model.AccountAttribute;

@Mapper
public interface AccountMapper {

    AccountDTO entity2dto(Account entity);

    Account dto2entity(AccountDTO dto);

    AccountAttribute map(AccountAttributeDTO dto);

}
