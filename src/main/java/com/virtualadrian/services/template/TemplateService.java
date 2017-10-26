package com.virtualadrian.services.template;

import com.virtualadrian.base.BaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class TemplateService extends BaseCrudService<TemplateModel, TemplateEntity, Long>  {

    public TemplateService() {
        super(TemplateModel.class, TemplateEntity.class);
    }

}
