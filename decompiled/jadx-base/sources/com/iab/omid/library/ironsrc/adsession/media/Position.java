package com.iab.omid.library.ironsrc.adsession.media;

/* JADX INFO: loaded from: classes5.dex */
public enum Position {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE(com.applovin.mediation.unity.BuildConfig.FLAVOR);

    private final java.lang.String position;

    Position(java.lang.String str) {
        this.position = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.position;
    }
}
