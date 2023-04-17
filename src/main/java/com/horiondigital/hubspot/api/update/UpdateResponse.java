package com.horiondigital.hubspot.api.update;

import java.util.Map;

public class UpdateResponse {
    private String id;
    private Map<String, Object> properties;
    private String createdAt;
    private String updatedAt;
    private boolean archived;

    public String getId() {
        return id;
    }

    public UpdateResponse setId(String id) {
        this.id = id;
        return this;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public UpdateResponse setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public UpdateResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public UpdateResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public boolean isArchived() {
        return archived;
    }

    public UpdateResponse setArchived(boolean archived) {
        this.archived = archived;
        return this;
    }
}
