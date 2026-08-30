package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface ISdkClickHandler {
    void init(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender);

    void pauseSending();

    void resumeSending();

    void sendPreinstallPayload(java.lang.String str, java.lang.String str2);

    void sendReftagReferrers();

    void sendSdkClick(com.adjust.sdk.ActivityPackage activityPackage);

    void teardown();
}
