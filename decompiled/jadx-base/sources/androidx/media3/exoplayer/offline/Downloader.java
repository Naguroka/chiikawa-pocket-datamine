package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public interface Downloader {

    public interface ProgressListener {
        void onProgress(long j, long j2, float f);
    }

    void cancel();

    void download(androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener) throws java.lang.InterruptedException, java.io.IOException;

    void remove();
}
