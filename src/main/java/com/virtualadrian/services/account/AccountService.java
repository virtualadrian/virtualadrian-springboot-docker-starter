package com.virtualadrian.services.account;

import com.virtualadrian.base.BaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class AccountService extends BaseCrudService<AccountModel, AccountEntity, Long>  {

    public AccountService() {
        super(AccountModel.class, AccountEntity.class);
    }

}
