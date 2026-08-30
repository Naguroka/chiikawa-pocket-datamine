package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public interface WritableDownloadIndex extends androidx.media3.exoplayer.offline.DownloadIndex {
    void putDownload(androidx.media3.exoplayer.offline.Download download) throws java.io.IOException;

    void removeDownload(java.lang.String str) throws java.io.IOException;

    void setDownloadingStatesToQueued() throws java.io.IOException;

    void setStatesToRemoving() throws java.io.IOException;

    void setStopReason(int i) throws java.io.IOException;

    void setStopReason(java.lang.String str, int i) throws java.io.IOException;
}
