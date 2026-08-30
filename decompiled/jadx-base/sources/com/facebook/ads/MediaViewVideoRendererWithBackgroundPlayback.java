package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaViewVideoRendererWithBackgroundPlayback extends com.facebook.ads.MediaViewVideoRenderer {
    private com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi mDefaultMediaViewVideoRendererApi;

    @Override // com.facebook.ads.MediaViewVideoRenderer
    public boolean shouldAllowBackgroundPlayback() {
        return true;
    }

    public MediaViewVideoRendererWithBackgroundPlayback(android.content.Context context) {
        super(context);
        initialize(context);
    }

    public MediaViewVideoRendererWithBackgroundPlayback(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public MediaViewVideoRendererWithBackgroundPlayback(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
    }

    public MediaViewVideoRendererWithBackgroundPlayback(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initialize(context);
    }

    private void initialize(android.content.Context context) {
        com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi defaultMediaViewVideoRendererApiCreateDefaultMediaViewVideoRendererApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createDefaultMediaViewVideoRendererApi();
        this.mDefaultMediaViewVideoRendererApi = defaultMediaViewVideoRendererApiCreateDefaultMediaViewVideoRendererApi;
        defaultMediaViewVideoRendererApiCreateDefaultMediaViewVideoRendererApi.initialize(context, this, getMediaViewVideoRendererApi(), 1);
    }

    @Override // com.facebook.ads.MediaViewVideoRenderer
    public void onPrepared() {
        super.onPrepared();
        this.mDefaultMediaViewVideoRendererApi.onPrepared();
    }
}
