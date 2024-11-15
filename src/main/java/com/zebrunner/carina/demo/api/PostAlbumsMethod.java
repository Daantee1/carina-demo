package com.zebrunner.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/albums", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/users/_post/rq2.json")
@ResponseTemplatePath(path = "api/users/_post/rs2.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class PostAlbumsMethod extends AbstractApiMethodV2 {
    public PostAlbumsMethod() {
        super("api/users/_post/rq2.json", "api/users/_post/rs2.json", "api/users/user.properties");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
