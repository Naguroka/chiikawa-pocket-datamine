package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface IAttributionHandler {
    void checkSdkClickResponse(com.adjust.sdk.SdkClickResponseData sdkClickResponseData);

    void checkSessionResponse(com.adjust.sdk.SessionResponseData sessionResponseData);

    void getAttribution();

    void init(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender);

    void pauseSending();

    void resumeSending();

    void teardown();
}
