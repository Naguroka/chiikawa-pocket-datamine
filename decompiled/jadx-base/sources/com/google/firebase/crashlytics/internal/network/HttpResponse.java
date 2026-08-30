package com.google.firebase.crashlytics.internal.network;

/* JADX INFO: loaded from: classes5.dex */
public class HttpResponse {
    private final java.lang.String body;
    private final int code;

    public HttpResponse(int i, java.lang.String str) {
        this.code = i;
        this.body = str;
    }

    public int code() {
        return this.code;
    }

    public java.lang.String body() {
        return this.body;
    }
}
