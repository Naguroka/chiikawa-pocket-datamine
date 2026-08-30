package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface IPurchaseVerificationHandler {
    void init(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender);

    void pauseSending();

    void resumeSending();

    void sendPurchaseVerificationPackage(com.adjust.sdk.ActivityPackage activityPackage);

    void teardown();
}
