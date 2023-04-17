package com.horiondigital.hubspot.api.create;

import com.horiondigital.rest.client.model.request.Request;
import com.horiondigital.rest.client.model.response.ModeType;

import java.util.Map;

public class CreateRequest extends Request<CreateRequest> {
    private String email;
    private String firstName;
    private String lastName;
    private String role;
    private String phoneNumber;

    private Map<String, Object> properties;

    public CreateRequest() {
        this(ModeType.RESULT);
    }

    public CreateRequest(ModeType modeType) {
        super(modeType);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public CreateRequest setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CreateRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public CreateRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CreateRequest setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getRole() {
        return role;
    }

    public CreateRequest setRole(String role) {
        this.role = role;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public CreateRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
