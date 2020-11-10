package com.nc.autumn2020.solutions.practice.randprovider;

public enum RandomProviderErrorCode {
    ARRAY_IS_EMPTY;
    String errorString;

    public String getErrorString() {
        return errorString;
    }

    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }
}
