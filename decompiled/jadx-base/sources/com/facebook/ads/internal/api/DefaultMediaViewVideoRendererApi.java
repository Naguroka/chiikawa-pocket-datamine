package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface DefaultMediaViewVideoRendererApi {
    public static final int MEDIA_VIEW_RENDERER_CHILD_TYPE_BACKGROUND_PLAYBACK = 1;
    public static final int MEDIA_VIEW_RENDERER_CHILD_TYPE_DEFAULT = 0;

    void initialize(android.content.Context context, com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer, com.facebook.ads.internal.api.MediaViewVideoRendererApi mediaViewVideoRendererApi, int i);

    void onPrepared();
}
