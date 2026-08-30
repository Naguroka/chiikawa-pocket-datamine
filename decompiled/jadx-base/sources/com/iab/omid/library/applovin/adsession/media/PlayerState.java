package com.iab.omid.library.applovin.adsession.media;

/* JADX INFO: loaded from: classes5.dex */
public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL(com.adjust.sdk.Constants.NORMAL),
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");

    private final java.lang.String playerState;

    PlayerState(java.lang.String str) {
        this.playerState = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.playerState;
    }
}
