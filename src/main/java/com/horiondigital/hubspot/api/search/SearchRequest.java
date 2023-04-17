package com.horiondigital.hubspot.api.search;


import com.horiondigital.rest.client.model.request.Request;
import com.horiondigital.rest.client.model.response.ModeType;

public class SearchRequest extends Request<SearchRequest> {
    private String propertyName;
    private SearchOperator operator;
    private String value;

    public String getPropertyName() {
        return propertyName;
    }

    public SearchRequest setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    public SearchOperator getOperator() {
        return operator;
    }

    public SearchRequest setOperator(SearchOperator operator) {
        this.operator = operator;
        return this;
    }

    public String getValue() {
        return value;
    }

    public SearchRequest setValue(String value) {
        this.value = value;
        return this;
    }

    public SearchRequest() {
        this(ModeType.RESULT);
    }

    public SearchRequest(ModeType modeType) {
        super(modeType);
    }

}
