package com.horiondigital.hubspot.api;

import com.horiondigital.hubspot.api.create.CreateRequest;
import com.horiondigital.hubspot.api.create.CreateResponse;
import com.horiondigital.hubspot.api.search.SearchRequest;
import com.horiondigital.hubspot.api.search.SearchResponse;
import com.horiondigital.hubspot.api.update.UpdateRequest;
import com.horiondigital.hubspot.api.update.UpdateResponse;
import com.horiondigital.rest.client.model.response.Response;

public interface Hubspot {
    Response<CreateResponse> create(CreateRequest request);

    Response<SearchResponse> search(SearchRequest request);

    Response<UpdateResponse> update(UpdateRequest request);
}
