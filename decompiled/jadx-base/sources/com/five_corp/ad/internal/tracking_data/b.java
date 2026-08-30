package com.five_corp.ad.internal.tracking_data;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f2078a;

    public b(android.content.Context context) {
        this.f2078a = context;
    }

    public final com.five_corp.ad.internal.tracking_data.a a() {
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            throw new java.lang.RuntimeException("UI Thread cannot run this method");
        }
        for (int i = 1; i <= 3; i++) {
            try {
                com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(this.f2078a);
                if (advertisingIdInfo != null) {
                    return new com.five_corp.ad.internal.tracking_data.a(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return new com.five_corp.ad.internal.tracking_data.a(null, true);
    }
}
