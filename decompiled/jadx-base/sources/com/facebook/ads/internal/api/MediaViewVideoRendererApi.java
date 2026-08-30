package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface MediaViewVideoRendererApi extends com.facebook.ads.internal.api.AdComponentViewApiProvider {
    void destroy();

    void disengageSeek(com.facebook.ads.VideoStartReason videoStartReason);

    void engageSeek();

    int getCurrentTimeMs();

    int getDuration();

    android.view.View getVideoView();

    float getVolume();

    void initialize(com.facebook.ads.internal.api.AdViewConstructorParams adViewConstructorParams, com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer);

    void pause(boolean z);

    void play(com.facebook.ads.VideoStartReason videoStartReason);

    void seekTo(int i);

    void setVolume(float f);

    boolean shouldAutoplay();
}
