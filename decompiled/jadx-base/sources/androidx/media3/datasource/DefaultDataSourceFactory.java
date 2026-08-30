package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class DefaultDataSourceFactory implements androidx.media3.datasource.DataSource.Factory {
    private final androidx.media3.datasource.DataSource.Factory baseDataSourceFactory;
    private final android.content.Context context;
    private final androidx.media3.datasource.TransferListener listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultDataSourceFactory(android.content.Context context) {
        this(context, (java.lang.String) null, (androidx.media3.datasource.TransferListener) null);
    }

    public DefaultDataSourceFactory(android.content.Context context, java.lang.String str) {
        this(context, str, (androidx.media3.datasource.TransferListener) null);
    }

    public DefaultDataSourceFactory(android.content.Context context, java.lang.String str, androidx.media3.datasource.TransferListener transferListener) {
        this(context, transferListener, new androidx.media3.datasource.DefaultHttpDataSource.Factory().setUserAgent(str));
    }

    public DefaultDataSourceFactory(android.content.Context context, androidx.media3.datasource.DataSource.Factory factory) {
        this(context, (androidx.media3.datasource.TransferListener) null, factory);
    }

    public DefaultDataSourceFactory(android.content.Context context, androidx.media3.datasource.TransferListener transferListener, androidx.media3.datasource.DataSource.Factory factory) {
        this.context = context.getApplicationContext();
        this.listener = transferListener;
        this.baseDataSourceFactory = factory;
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public androidx.media3.datasource.DefaultDataSource createDataSource() {
        androidx.media3.datasource.DefaultDataSource defaultDataSource = new androidx.media3.datasource.DefaultDataSource(this.context, this.baseDataSourceFactory.createDataSource());
        androidx.media3.datasource.TransferListener transferListener = this.listener;
        if (transferListener != null) {
            defaultDataSource.addTransferListener(transferListener);
        }
        return defaultDataSource;
    }
}
