package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class SampleQueueMappingException extends java.io.IOException {
    public SampleQueueMappingException(java.lang.String str) {
        super("Unable to bind a sample queue to TrackGroup with MIME type " + str + ".");
    }
}
