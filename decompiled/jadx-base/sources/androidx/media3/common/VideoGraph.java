package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface VideoGraph {

    public interface Listener {
        void onEnded(long j);

        void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException);

        void onOutputFrameAvailableForRendering(long j);

        void onOutputSizeChanged(int i, int i2);
    }

    androidx.media3.common.VideoFrameProcessor getProcessor(int i);

    boolean hasProducedFrameWithTimestampZero();

    void initialize() throws androidx.media3.common.VideoFrameProcessingException;

    void registerInput(int i) throws androidx.media3.common.VideoFrameProcessingException;

    void release();

    void setOutputSurfaceInfo(androidx.media3.common.SurfaceInfo surfaceInfo);
}
