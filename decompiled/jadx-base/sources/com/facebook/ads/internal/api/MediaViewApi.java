package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface MediaViewApi extends com.facebook.ads.internal.api.AdComponentViewApiProvider {
    void destroy();

    android.view.View getAdContentsView();

    int getMediaHeight();

    int getMediaWidth();

    void initialize(com.facebook.ads.internal.api.AdViewConstructorParams adViewConstructorParams, com.facebook.ads.MediaView mediaView);

    void setListener(com.facebook.ads.MediaViewListener mediaViewListener);

    void setVideoRenderer(com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer);
}
