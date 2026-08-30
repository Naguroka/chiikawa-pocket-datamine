package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface PreviewingVideoGraph extends androidx.media3.common.VideoGraph {

    public interface Factory {
        androidx.media3.common.PreviewingVideoGraph create(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, java.util.List<androidx.media3.common.Effect> list, long j) throws androidx.media3.common.VideoFrameProcessingException;
    }

    void renderOutputFrame(long j);
}
