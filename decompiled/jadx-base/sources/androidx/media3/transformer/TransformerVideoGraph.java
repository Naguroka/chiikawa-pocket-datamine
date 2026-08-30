package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
interface TransformerVideoGraph extends androidx.media3.common.VideoGraph {

    public interface Factory {
        androidx.media3.transformer.TransformerVideoGraph create(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, java.util.List<androidx.media3.common.Effect> list, long j) throws androidx.media3.common.VideoFrameProcessingException;
    }

    androidx.media3.transformer.GraphInput createInput(int i) throws androidx.media3.common.VideoFrameProcessingException;
}
