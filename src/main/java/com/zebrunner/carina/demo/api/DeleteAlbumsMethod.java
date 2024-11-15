package com.zebrunner.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/albums/1", methodType = HttpMethodType.DELETE)
@RequestTemplatePath(path = "api/users/_delete/rq2.json")
@ResponseTemplatePath(path = "api/users/_delete/rs2.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class DeleteAlbumsMethod extends AbstractApiMethodV2 {
    public DeleteAlbumsMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
