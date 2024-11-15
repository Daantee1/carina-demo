package com.zebrunner.carina.demo.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/albums", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/users/_get/rs2.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetAlbumsMethods extends AbstractApiMethodV2 {

    // Constructor name should match the class name
    public GetAlbumsMethods() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
