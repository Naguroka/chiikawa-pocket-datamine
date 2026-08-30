package com.iab.omid.library.bytedance2.adsession;

/* JADX INFO: loaded from: classes5.dex */
public enum Owner {
    NATIVE(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final java.lang.String owner;

    Owner(java.lang.String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.owner;
    }
}
