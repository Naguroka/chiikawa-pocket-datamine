package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface TimeToFirstByteEstimator {
    long getTimeToFirstByteEstimateUs();

    void onTransferInitializing(androidx.media3.datasource.DataSpec dataSpec);

    void onTransferStart(androidx.media3.datasource.DataSpec dataSpec);

    void reset();
}
