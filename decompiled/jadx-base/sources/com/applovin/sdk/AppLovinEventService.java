package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface AppLovinEventService {
    void trackCheckout(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

    void trackEvent(java.lang.String str);

    void trackEvent(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

    void trackInAppPurchase(android.content.Intent intent, java.util.Map<java.lang.String, java.lang.String> map);
}
