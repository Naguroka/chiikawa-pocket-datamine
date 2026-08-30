package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class TransformerSingleInputVideoGraph extends androidx.media3.effect.SingleInputVideoGraph implements androidx.media3.transformer.TransformerVideoGraph {
    private androidx.media3.transformer.VideoFrameProcessingWrapper videoFrameProcessingWrapper;

    public static final class Factory implements androidx.media3.transformer.TransformerVideoGraph.Factory {
        private final androidx.media3.common.VideoFrameProcessor.Factory videoFrameProcessorFactory;

        @Override // androidx.media3.transformer.TransformerVideoGraph.Factory
        public /* bridge */ /* synthetic */ androidx.media3.transformer.TransformerVideoGraph create(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, java.util.List list, long j) throws androidx.media3.common.VideoFrameProcessingException {
            return create(context, colorInfo, debugViewProvider, listener, executor, videoCompositorSettings, (java.util.List<androidx.media3.common.Effect>) list, j);
        }

        public Factory(androidx.media3.common.VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
        }

        @Override // androidx.media3.transformer.TransformerVideoGraph.Factory
        public androidx.media3.transformer.TransformerSingleInputVideoGraph create(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, java.util.List<androidx.media3.common.Effect> list, long j) {
            androidx.media3.effect.Presentation presentation = null;
            for (int i = 0; i < list.size(); i++) {
                androidx.media3.common.Effect effect = list.get(i);
                if (effect instanceof androidx.media3.effect.Presentation) {
                    presentation = (androidx.media3.effect.Presentation) effect;
                }
            }
            return new androidx.media3.transformer.TransformerSingleInputVideoGraph(context, this.videoFrameProcessorFactory, colorInfo, listener, debugViewProvider, executor, videoCompositorSettings, true, presentation, j);
        }
    }

    private TransformerSingleInputVideoGraph(android.content.Context context, androidx.media3.common.VideoFrameProcessor.Factory factory, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.VideoGraph.Listener listener, androidx.media3.common.DebugViewProvider debugViewProvider, java.util.concurrent.Executor executor, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, boolean z, androidx.media3.effect.Presentation presentation, long j) {
        super(context, factory, colorInfo, listener, debugViewProvider, executor, videoCompositorSettings, z, presentation, j);
    }

    @Override // androidx.media3.transformer.TransformerVideoGraph
    public androidx.media3.transformer.GraphInput createInput(int i) throws androidx.media3.common.VideoFrameProcessingException {
        androidx.media3.common.util.Assertions.checkState(this.videoFrameProcessingWrapper == null);
        registerInput(i);
        androidx.media3.transformer.VideoFrameProcessingWrapper videoFrameProcessingWrapper = new androidx.media3.transformer.VideoFrameProcessingWrapper(getProcessor(i), getPresentation(), getInitialTimestampOffsetUs());
        this.videoFrameProcessingWrapper = videoFrameProcessingWrapper;
        return videoFrameProcessingWrapper;
    }
}
