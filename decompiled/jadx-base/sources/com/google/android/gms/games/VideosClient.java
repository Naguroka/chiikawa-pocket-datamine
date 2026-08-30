package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public interface VideosClient {
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STARTED = 2;
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STOPPED = 3;
    public static final int CAPTURE_OVERLAY_STATE_DISMISSED = 4;
    public static final int CAPTURE_OVERLAY_STATE_SHOWN = 1;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CaptureOverlayState {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    @java.lang.Deprecated
    public interface OnCaptureOverlayStateListener {
        @java.lang.Deprecated
        void onCaptureOverlayStateChanged(int i);
    }

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.gms.games.video.VideoCapabilities> getCaptureCapabilities();

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<android.content.Intent> getCaptureOverlayIntent();

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.gms.games.video.CaptureState> getCaptureState();

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.Boolean> isCaptureAvailable(int i);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.Boolean> isCaptureSupported();

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.Void> registerOnCaptureOverlayStateChangedListener(com.google.android.gms.games.VideosClient.OnCaptureOverlayStateListener onCaptureOverlayStateListener);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterOnCaptureOverlayStateChangedListener(com.google.android.gms.games.VideosClient.OnCaptureOverlayStateListener onCaptureOverlayStateListener);
}
