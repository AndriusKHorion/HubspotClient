package com.horiondigital.hubspot.model;

import com.horiondigital.rest.client.model.request.Request;
import com.horiondigital.rest.client.model.response.Response;

public interface Query<R, P extends Request<P>> {
    Response<R> execute(P parameter);
}
