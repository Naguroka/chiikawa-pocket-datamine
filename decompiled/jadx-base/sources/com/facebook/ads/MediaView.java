package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class MediaView extends com.facebook.ads.internal.api.AdNativeComponentView {
    private com.facebook.ads.internal.api.AdViewConstructorParams mConstructorParams;
    private com.facebook.ads.internal.api.MediaViewApi mMediaViewApi;

    public MediaView(android.content.Context context) {
        super(context);
        initializeSelf(new com.facebook.ads.internal.api.AdViewConstructorParams(context));
    }

    public MediaView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(new com.facebook.ads.internal.api.AdViewConstructorParams(context, attributeSet));
    }

    public MediaView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initializeSelf(new com.facebook.ads.internal.api.AdViewConstructorParams(context, attributeSet, i));
    }

    public MediaView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initializeSelf(new com.facebook.ads.internal.api.AdViewConstructorParams(context, attributeSet, i, i2));
    }

    private void initializeSelf(com.facebook.ads.internal.api.AdViewConstructorParams adViewConstructorParams) {
        this.mConstructorParams = adViewConstructorParams;
        com.facebook.ads.internal.api.MediaViewApi mediaViewApiCreateMediaViewApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(adViewConstructorParams.getContext()).createMediaViewApi();
        this.mMediaViewApi = mediaViewApiCreateMediaViewApi;
        attachAdComponentViewApi(mediaViewApiCreateMediaViewApi);
        this.mMediaViewApi.initialize(adViewConstructorParams, this);
    }

    public com.facebook.ads.internal.api.MediaViewApi getMediaViewApi() {
        return this.mMediaViewApi;
    }

    public void setVideoRenderer(com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer) {
        this.mMediaViewApi.setVideoRenderer(mediaViewVideoRenderer);
    }

    public int getMediaWidth() {
        return this.mMediaViewApi.getMediaWidth();
    }

    public int getMediaHeight() {
        return this.mMediaViewApi.getMediaHeight();
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public android.view.View getAdContentsView() {
        return this.mMediaViewApi.getAdContentsView();
    }

    public void setListener(com.facebook.ads.MediaViewListener mediaViewListener) {
        this.mMediaViewApi.setListener(mediaViewListener);
    }

    public void destroy() {
        this.mMediaViewApi.destroy();
    }

    public void repair(java.lang.Throwable th) {
        post(new java.lang.Runnable() { // from class: com.facebook.ads.MediaView.1
            @Override // java.lang.Runnable
            public void run() {
                com.facebook.ads.MediaView.this.removeAllViews();
                com.facebook.ads.MediaView.this.mAdComponentViewApi = null;
                com.facebook.ads.MediaView mediaView = com.facebook.ads.MediaView.this;
                mediaView.mMediaViewApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(mediaView.mConstructorParams.getContext()).createMediaViewApi();
                com.facebook.ads.MediaView mediaView2 = com.facebook.ads.MediaView.this;
                mediaView2.attachAdComponentViewApi(mediaView2.mMediaViewApi);
                com.facebook.ads.MediaView.this.mMediaViewApi.initialize(com.facebook.ads.MediaView.this.mConstructorParams, com.facebook.ads.MediaView.this);
            }
        });
    }
}
