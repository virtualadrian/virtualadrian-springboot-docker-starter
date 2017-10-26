package com.virtualadrian.services.company;

import com.virtualadrian.base.BaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class CompanyService extends BaseCrudService<CompanyModel, CompanyEntity, Long>  {

    public CompanyService() {
        super(CompanyModel.class, CompanyEntity.class);
    }

}
