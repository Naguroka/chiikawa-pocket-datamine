package com.iab.omid.library.unity3d.adsession;

/* JADX INFO: loaded from: classes5.dex */
public enum CreativeType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");

    private final java.lang.String creativeType;

    CreativeType(java.lang.String str) {
        this.creativeType = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.creativeType;
    }
}
