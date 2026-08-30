package com.iab.omid.library.ironsrc.adsession;

/* JADX INFO: loaded from: classes5.dex */
public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED(com.google.firebase.ktx.BuildConfig.VERSION_NAME),
    LOADED(com.ironsource.y8.h.r),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final java.lang.String impressionType;

    ImpressionType(java.lang.String str) {
        this.impressionType = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.impressionType;
    }
}
