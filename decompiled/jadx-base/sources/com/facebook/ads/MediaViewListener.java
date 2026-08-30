package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public interface MediaViewListener {
    void onComplete(com.facebook.ads.MediaView mediaView);

    void onEnterFullscreen(com.facebook.ads.MediaView mediaView);

    void onExitFullscreen(com.facebook.ads.MediaView mediaView);

    void onFullscreenBackground(com.facebook.ads.MediaView mediaView);

    void onFullscreenForeground(com.facebook.ads.MediaView mediaView);

    void onPause(com.facebook.ads.MediaView mediaView);

    void onPlay(com.facebook.ads.MediaView mediaView);

    void onVolumeChange(com.facebook.ads.MediaView mediaView, float f);
}
