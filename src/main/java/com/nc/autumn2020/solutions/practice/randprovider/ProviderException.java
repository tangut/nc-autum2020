package com.nc.autumn2020.solutions.practice.randprovider;

public class ProviderException extends Exception {
    private RandomProviderErrorCode errorCode;

   public ProviderException(RandomProviderErrorCode errorCode){
       this.errorCode = errorCode;
   }

    public RandomProviderErrorCode getErrorCode() {
        return errorCode;
    }
}
