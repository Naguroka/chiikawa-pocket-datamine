package com.iab.omid.library.applovin.adsession;

/* JADX INFO: loaded from: classes5.dex */
public enum DeviceCategory {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER("other");

    private final java.lang.String deviceCategory;

    DeviceCategory(java.lang.String str) {
        this.deviceCategory = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.deviceCategory;
    }
}
