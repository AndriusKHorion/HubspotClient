package com.horiondigital.hubspot.api.create;

import java.util.Map;
import java.util.Objects;

public class CreateResponse {
    private String id;
    private Map<String, Object> properties;
    private String createdAt;
    private String updatedAt;
    private boolean archived;

    public String getId() {
        return id;
    }

    public CreateResponse setId(String id) {
        this.id = id;
        return this;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public CreateResponse setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public CreateResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public CreateResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public boolean isArchived() {
        return archived;
    }

    public CreateResponse setArchived(boolean archived) {
        this.archived = archived;
        return this;
    }
}
