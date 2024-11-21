package com.ayan.Martin;

public interface ResponseCallback {

    void onResponse(String response);
    void onError(Throwable throwable);

}
