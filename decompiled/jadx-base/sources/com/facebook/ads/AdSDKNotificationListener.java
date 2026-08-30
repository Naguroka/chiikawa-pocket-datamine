package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public interface AdSDKNotificationListener {
    public static final java.lang.String ENCRYPTED_CPM_KEY = "encrypted_cpm";
    public static final java.lang.String IMPRESSION_EVENT = "impression";

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SDKEventKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SDKEventType {
    }

    void onAdEvent(java.lang.String str, android.os.Bundle bundle);
}
