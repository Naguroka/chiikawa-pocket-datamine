package androidx.media3.exoplayer.upstream.experimental;

/* JADX INFO: loaded from: classes.dex */
public interface BandwidthEstimator {
    public static final long ESTIMATE_NOT_AVAILABLE = Long.MIN_VALUE;

    void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener);

    long getBandwidthEstimate();

    void onBytesTransferred(androidx.media3.datasource.DataSource dataSource, int i);

    void onNetworkTypeChange(long j);

    void onTransferEnd(androidx.media3.datasource.DataSource dataSource);

    void onTransferInitializing(androidx.media3.datasource.DataSource dataSource);

    void onTransferStart(androidx.media3.datasource.DataSource dataSource);

    void removeEventListener(androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener);
}
