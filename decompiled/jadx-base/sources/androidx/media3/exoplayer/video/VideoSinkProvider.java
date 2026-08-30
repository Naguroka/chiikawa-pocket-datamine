package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public interface VideoSinkProvider {
    void clearOutputSurfaceInfo();

    androidx.media3.exoplayer.video.VideoSink getSink();

    androidx.media3.exoplayer.video.VideoFrameReleaseControl getVideoFrameReleaseControl();

    void release();

    void setOutputSurfaceInfo(android.view.Surface surface, androidx.media3.common.util.Size size);
}
