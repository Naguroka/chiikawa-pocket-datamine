package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public interface DataSource extends androidx.media3.common.DataReader {

    public interface Factory {
        androidx.media3.datasource.DataSource createDataSource();
    }

    void addTransferListener(androidx.media3.datasource.TransferListener transferListener);

    void close() throws java.io.IOException;

    android.net.Uri getUri();

    long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException;

    default java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return java.util.Collections.emptyMap();
    }
}
