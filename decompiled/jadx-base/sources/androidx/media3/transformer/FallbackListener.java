package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class FallbackListener {
    private final androidx.media3.transformer.Composition composition;
    private androidx.media3.transformer.TransformationRequest fallbackTransformationRequest;
    private final androidx.media3.transformer.TransformationRequest originalTransformationRequest;
    private final java.util.concurrent.atomic.AtomicInteger trackCount = new java.util.concurrent.atomic.AtomicInteger();
    private final androidx.media3.common.util.HandlerWrapper transformerListenerHandler;
    private final androidx.media3.common.util.ListenerSet<androidx.media3.transformer.Transformer.Listener> transformerListeners;

    public FallbackListener(androidx.media3.transformer.Composition composition, androidx.media3.common.util.ListenerSet<androidx.media3.transformer.Transformer.Listener> listenerSet, androidx.media3.common.util.HandlerWrapper handlerWrapper, androidx.media3.transformer.TransformationRequest transformationRequest) {
        this.composition = composition;
        this.transformerListeners = listenerSet;
        this.transformerListenerHandler = handlerWrapper;
        this.originalTransformationRequest = transformationRequest;
        this.fallbackTransformationRequest = transformationRequest;
    }

    public void setTrackCount(int i) {
        this.trackCount.set(i);
    }

    public synchronized void onTransformationRequestFinalized(androidx.media3.transformer.TransformationRequest transformationRequest) {
        androidx.media3.common.util.Assertions.checkState(this.trackCount.getAndDecrement() > 0);
        androidx.media3.transformer.TransformationRequest.Builder builderBuildUpon = this.fallbackTransformationRequest.buildUpon();
        if (!androidx.media3.common.util.Util.areEqual(transformationRequest.audioMimeType, this.originalTransformationRequest.audioMimeType)) {
            builderBuildUpon.setAudioMimeType(transformationRequest.audioMimeType);
        }
        if (!androidx.media3.common.util.Util.areEqual(transformationRequest.videoMimeType, this.originalTransformationRequest.videoMimeType)) {
            builderBuildUpon.setVideoMimeType(transformationRequest.videoMimeType);
        }
        if (transformationRequest.outputHeight != this.originalTransformationRequest.outputHeight) {
            builderBuildUpon.setResolution(transformationRequest.outputHeight);
        }
        if (transformationRequest.hdrMode != this.originalTransformationRequest.hdrMode) {
            builderBuildUpon.setHdrMode(transformationRequest.hdrMode);
        }
        final androidx.media3.transformer.TransformationRequest transformationRequestBuild = builderBuildUpon.build();
        this.fallbackTransformationRequest = transformationRequestBuild;
        if (this.trackCount.get() == 0 && !this.originalTransformationRequest.equals(this.fallbackTransformationRequest)) {
            this.transformerListenerHandler.post(new java.lang.Runnable() { // from class: androidx.media3.transformer.FallbackListener$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m432x1c71813f(transformationRequestBuild);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onTransformationRequestFinalized$1$androidx-media3-transformer-FallbackListener, reason: not valid java name */
    /* synthetic */ void m432x1c71813f(final androidx.media3.transformer.TransformationRequest transformationRequest) {
        this.transformerListeners.sendEvent(-1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.transformer.FallbackListener$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                this.f$0.m431x62f9f3a0(transformationRequest, (androidx.media3.transformer.Transformer.Listener) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onTransformationRequestFinalized$0$androidx-media3-transformer-FallbackListener, reason: not valid java name */
    /* synthetic */ void m431x62f9f3a0(androidx.media3.transformer.TransformationRequest transformationRequest, androidx.media3.transformer.Transformer.Listener listener) {
        listener.onFallbackApplied(this.composition, this.originalTransformationRequest, transformationRequest);
    }
}
