package com.iab.omid.library.unity3d.adsession;

/* JADX INFO: loaded from: classes5.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE),
    JAVASCRIPT("javascript");

    private final java.lang.String typeString;

    AdSessionContextType(java.lang.String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.typeString;
    }
}
