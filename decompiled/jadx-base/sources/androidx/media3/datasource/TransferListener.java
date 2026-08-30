package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public interface TransferListener {
    void onBytesTransferred(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z, int i);

    void onTransferEnd(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z);

    void onTransferInitializing(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z);

    void onTransferStart(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z);
}
