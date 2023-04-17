package com.horiondigital.hubspot.api.search;

import java.util.List;

public class SearchResponse {
    private Integer total;
    private List<SearchProperties> properties;

    public Integer getTotal() {
        return total;
    }

    public SearchResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public List<SearchProperties> getProperties() {
        return properties;
    }

    public SearchResponse setProperties(List<SearchProperties> properties) {
        this.properties = properties;
        return this;
    }

    public static class SearchProperties {
        private String id;
        private String email;

        public String getId() {
            return id;
        }

        public SearchProperties setId(String id) {
            this.id = id;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public SearchProperties setEmail(String email) {
            this.email = email;
            return this;
        }
    }
}
