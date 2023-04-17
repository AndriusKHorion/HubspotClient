package com.horiondigital.hubspot.api.update;

import com.horiondigital.rest.client.model.request.Request;
import com.horiondigital.rest.client.model.response.ModeType;

import java.util.Map;
import java.util.Objects;

public class UpdateRequest extends Request<UpdateRequest> {
    private String contactId;
    private Map<String, Object> properties;

    public UpdateRequest() {
        this(ModeType.RESULT);
    }

    public UpdateRequest(ModeType modeType) {
        super(modeType);
    }

    public String getContactId() {
        return contactId;
    }

    public UpdateRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public UpdateRequest setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }
}
