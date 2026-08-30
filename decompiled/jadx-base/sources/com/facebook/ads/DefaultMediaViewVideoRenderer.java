package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultMediaViewVideoRenderer extends com.facebook.ads.MediaViewVideoRenderer {
    private com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi mDefaultMediaViewVideoRendererApi;

    public DefaultMediaViewVideoRenderer(android.content.Context context) {
        super(context);
        initializeSelf(context);
    }

    public DefaultMediaViewVideoRenderer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(context);
    }

    public DefaultMediaViewVideoRenderer(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initializeSelf(context);
    }

    public DefaultMediaViewVideoRenderer(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initializeSelf(context);
    }

    private void initializeSelf(android.content.Context context) {
        com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi defaultMediaViewVideoRendererApiCreateDefaultMediaViewVideoRendererApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createDefaultMediaViewVideoRendererApi();
        this.mDefaultMediaViewVideoRendererApi = defaultMediaViewVideoRendererApiCreateDefaultMediaViewVideoRendererApi;
        defaultMediaViewVideoRendererApiCreateDefaultMediaViewVideoRendererApi.initialize(context, this, getMediaViewVideoRendererApi(), 0);
    }

    @Override // com.facebook.ads.MediaViewVideoRenderer
    public void onPrepared() {
        super.onPrepared();
        this.mDefaultMediaViewVideoRendererApi.onPrepared();
    }
}
