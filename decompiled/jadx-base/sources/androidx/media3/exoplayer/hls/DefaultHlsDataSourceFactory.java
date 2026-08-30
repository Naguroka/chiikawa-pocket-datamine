package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultHlsDataSourceFactory implements androidx.media3.exoplayer.hls.HlsDataSourceFactory {
    private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;

    public DefaultHlsDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
        this.dataSourceFactory = factory;
    }

    @Override // androidx.media3.exoplayer.hls.HlsDataSourceFactory
    public androidx.media3.datasource.DataSource createDataSource(int i) {
        return this.dataSourceFactory.createDataSource();
    }
}
