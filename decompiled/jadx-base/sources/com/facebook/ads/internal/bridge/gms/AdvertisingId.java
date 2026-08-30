package com.facebook.ads.internal.bridge.gms;

/* JADX INFO: loaded from: classes4.dex */
public class AdvertisingId {
    private final java.lang.String mId;
    private final boolean mLimitAdTracking;

    public AdvertisingId(java.lang.String str, boolean z) {
        this.mId = str;
        this.mLimitAdTracking = z;
    }

    public java.lang.String getId() {
        return this.mId;
    }

    public boolean isLimitAdTracking() {
        return this.mLimitAdTracking;
    }

    public static com.facebook.ads.internal.bridge.gms.AdvertisingId getAdvertisingIdInfoDirectly(android.content.Context context) {
        try {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                return new com.facebook.ads.internal.bridge.gms.AdvertisingId(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
