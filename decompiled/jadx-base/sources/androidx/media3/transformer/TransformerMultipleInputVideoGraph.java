package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class TransformerMultipleInputVideoGraph extends androidx.media3.effect.MultipleInputVideoGraph implements androidx.media3.transformer.TransformerVideoGraph {

    public static final class Factory implements androidx.media3.transformer.TransformerVideoGraph.Factory {
        @Override // androidx.media3.transformer.TransformerVideoGraph.Factory
        public /* bridge */ /* synthetic */ androidx.media3.transformer.TransformerVideoGraph create(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, java.util.List list, long j) throws androidx.media3.common.VideoFrameProcessingException {
            return create(context, colorInfo, debugViewProvider, listener, executor, videoCompositorSettings, (java.util.List<androidx.media3.common.Effect>) list, j);
        }

        @Override // androidx.media3.transformer.TransformerVideoGraph.Factory
        public androidx.media3.transformer.TransformerMultipleInputVideoGraph create(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, java.util.List<androidx.media3.common.Effect> list, long j) {
            return new androidx.media3.transformer.TransformerMultipleInputVideoGraph(context, colorInfo, debugViewProvider, listener, executor, videoCompositorSettings, list, j);
        }
    }

    private TransformerMultipleInputVideoGraph(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, java.util.List<androidx.media3.common.Effect> list, long j) {
        super(context, colorInfo, debugViewProvider, listener, executor, videoCompositorSettings, list, j);
    }

    @Override // androidx.media3.transformer.TransformerVideoGraph
    public androidx.media3.transformer.GraphInput createInput(int i) throws androidx.media3.common.VideoFrameProcessingException {
        registerInput(i);
        return new androidx.media3.transformer.VideoFrameProcessingWrapper(getProcessor(i), null, getInitialTimestampOffsetUs());
    }
}
