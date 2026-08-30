package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewingSingleInputVideoGraph extends androidx.media3.effect.SingleInputVideoGraph implements androidx.media3.common.PreviewingVideoGraph {

    public static final class Factory implements androidx.media3.common.PreviewingVideoGraph.Factory {
        private final androidx.media3.common.VideoFrameProcessor.Factory videoFrameProcessorFactory;

        public Factory() {
            this(new androidx.media3.effect.DefaultVideoFrameProcessor.Factory.Builder().build());
        }

        public Factory(androidx.media3.common.VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
        }

        @Override // androidx.media3.common.PreviewingVideoGraph.Factory
        public androidx.media3.common.PreviewingVideoGraph create(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, java.util.List<androidx.media3.common.Effect> list, long j) {
            androidx.media3.effect.Presentation presentation = null;
            for (int i = 0; i < list.size(); i++) {
                androidx.media3.common.Effect effect = list.get(i);
                if (effect instanceof androidx.media3.effect.Presentation) {
                    presentation = (androidx.media3.effect.Presentation) effect;
                }
            }
            return new androidx.media3.effect.PreviewingSingleInputVideoGraph(context, this.videoFrameProcessorFactory, colorInfo, debugViewProvider, listener, executor, presentation, j);
        }
    }

    private PreviewingSingleInputVideoGraph(android.content.Context context, androidx.media3.common.VideoFrameProcessor.Factory factory, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, androidx.media3.effect.Presentation presentation, long j) {
        super(context, factory, colorInfo, listener, debugViewProvider, executor, androidx.media3.effect.VideoCompositorSettings.DEFAULT, false, presentation, j);
    }

    @Override // androidx.media3.common.PreviewingVideoGraph
    public void renderOutputFrame(long j) {
        getProcessor(getInputIndex()).renderOutputFrame(j);
    }
}
