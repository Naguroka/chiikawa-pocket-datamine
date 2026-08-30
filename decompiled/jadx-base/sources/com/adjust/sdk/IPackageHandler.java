package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface IPackageHandler {
    void addPackage(com.adjust.sdk.ActivityPackage activityPackage);

    void flush();

    void init(com.adjust.sdk.IActivityHandler iActivityHandler, android.content.Context context, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender);

    void pauseSending();

    void resumeSending();

    void sendFirstPackage();

    void teardown();
}
