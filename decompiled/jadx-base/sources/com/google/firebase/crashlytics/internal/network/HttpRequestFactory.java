package com.google.firebase.crashlytics.internal.network;

/* JADX INFO: loaded from: classes5.dex */
public class HttpRequestFactory {
    public com.google.firebase.crashlytics.internal.network.HttpGetRequest buildHttpGetRequest(java.lang.String str) {
        return buildHttpGetRequest(str, java.util.Collections.emptyMap());
    }

    public com.google.firebase.crashlytics.internal.network.HttpGetRequest buildHttpGetRequest(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.google.firebase.crashlytics.internal.network.HttpGetRequest(str, map);
    }
}
