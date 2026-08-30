package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC0982Rf {
    void A8o();

    boolean A90();

    boolean A91();

    boolean A9a();

    void AEN(boolean z, int i);

    void AGo(int i);

    void AGt(com.facebook.ads.redexgen.core.EnumC0969Qs enumC0969Qs, int i);

    void AH1(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    com.facebook.ads.redexgen.core.EnumC0969Qs getStartReason();

    com.facebook.ads.redexgen.core.EnumC0984Rh getState();

    int getVideoHeight();

    int getVideoWidth();

    android.view.View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(android.view.View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(java.lang.String str);

    void setVideoStateChangeListener(com.facebook.ads.redexgen.core.InterfaceC0985Ri interfaceC0985Ri);

    void setup(android.net.Uri uri);
}
