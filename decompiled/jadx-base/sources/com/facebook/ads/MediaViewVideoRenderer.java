package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaViewVideoRenderer extends com.facebook.ads.internal.api.AdComponentFrameLayout {
    private com.facebook.ads.internal.api.MediaViewVideoRendererApi mMediaViewVideoRendererApi;

    @java.lang.Deprecated
    protected com.facebook.ads.NativeAd nativeAd;

    @java.lang.Deprecated
    protected com.facebook.ads.VideoAutoplayBehavior videoAutoplayBehavior;

    @Override // com.facebook.ads.internal.api.AdComponentFrameLayout, android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(android.view.View view) {
    }

    @Override // com.facebook.ads.internal.api.AdComponentFrameLayout, android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(android.view.View view, int i) {
    }

    @Override // com.facebook.ads.internal.api.AdComponentFrameLayout, android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(android.view.View view, int i, int i2) {
    }

    @Override // com.facebook.ads.internal.api.AdComponentFrameLayout, android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
    }

    @Override // com.facebook.ads.internal.api.AdComponentFrameLayout, android.view.ViewGroup, android.view.ViewManager, com.facebook.ads.internal.api.AdComponentView
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
    }

    @java.lang.Deprecated
    public void destroy() {
    }

    public void onCompleted() {
    }

    public void onError() {
    }

    public void onPaused() {
    }

    public void onPlayed() {
    }

    public void onPrepared() {
    }

    public void onSeek() {
    }

    public void onSeekDisengaged() {
    }

    public void onSeekEngaged() {
    }

    public void onVolumeChanged() {
    }

    @java.lang.Deprecated
    final void setListener(java.lang.Object obj) {
    }

    public boolean shouldAllowBackgroundPlayback() {
        return false;
    }

    public MediaViewVideoRenderer(android.content.Context context) {
        super(context);
        initialize(new com.facebook.ads.internal.api.AdViewConstructorParams(context));
    }

    public MediaViewVideoRenderer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(new com.facebook.ads.internal.api.AdViewConstructorParams(context, attributeSet));
    }

    public MediaViewVideoRenderer(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(new com.facebook.ads.internal.api.AdViewConstructorParams(context, attributeSet, i));
    }

    public MediaViewVideoRenderer(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initialize(new com.facebook.ads.internal.api.AdViewConstructorParams(context, attributeSet, i, i2));
    }

    private void initialize(com.facebook.ads.internal.api.AdViewConstructorParams adViewConstructorParams) {
        com.facebook.ads.internal.api.MediaViewVideoRendererApi mediaViewVideoRendererApiCreateMediaViewVideoRendererApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(adViewConstructorParams.getContext()).createMediaViewVideoRendererApi();
        this.mMediaViewVideoRendererApi = mediaViewVideoRendererApiCreateMediaViewVideoRendererApi;
        attachAdComponentViewApi(mediaViewVideoRendererApiCreateMediaViewVideoRendererApi);
        this.mMediaViewVideoRendererApi.initialize(adViewConstructorParams, this);
    }

    public com.facebook.ads.internal.api.MediaViewVideoRendererApi getMediaViewVideoRendererApi() {
        return this.mMediaViewVideoRendererApi;
    }

    @java.lang.Deprecated
    public void setNativeAd(com.facebook.ads.NativeAd nativeAd) {
        this.nativeAd = nativeAd;
        this.videoAutoplayBehavior = nativeAd.getVideoAutoplayBehavior();
    }

    @java.lang.Deprecated
    public void unsetNativeAd() {
        this.nativeAd = null;
        this.videoAutoplayBehavior = com.facebook.ads.VideoAutoplayBehavior.DEFAULT;
    }

    public final void play(com.facebook.ads.VideoStartReason videoStartReason) {
        this.mMediaViewVideoRendererApi.play(videoStartReason);
    }

    public final void pause(boolean z) {
        this.mMediaViewVideoRendererApi.pause(z);
    }

    public final int getCurrentTimeMs() {
        return this.mMediaViewVideoRendererApi.getCurrentTimeMs();
    }

    public final void engageSeek() {
        this.mMediaViewVideoRendererApi.engageSeek();
    }

    public final void disengageSeek(com.facebook.ads.VideoStartReason videoStartReason) {
        this.mMediaViewVideoRendererApi.disengageSeek(videoStartReason);
    }

    public final void seekTo(int i) {
        this.mMediaViewVideoRendererApi.seekTo(i);
    }

    public final int getDuration() {
        return this.mMediaViewVideoRendererApi.getDuration();
    }

    public final void setVolume(float f) {
        this.mMediaViewVideoRendererApi.setVolume(f);
    }

    public final float getVolume() {
        return this.mMediaViewVideoRendererApi.getVolume();
    }

    public final boolean shouldAutoplay() {
        return this.mMediaViewVideoRendererApi.shouldAutoplay();
    }

    @java.lang.Deprecated
    final android.view.View getVideoView() {
        return this.mMediaViewVideoRendererApi.getVideoView();
    }
}
