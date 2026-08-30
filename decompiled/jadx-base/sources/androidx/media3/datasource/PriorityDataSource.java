package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class PriorityDataSource implements androidx.media3.datasource.DataSource {
    private final int priority;
    private final androidx.media3.common.PriorityTaskManager priorityTaskManager;
    private final androidx.media3.datasource.DataSource upstream;

    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        private final int priority;
        private final androidx.media3.common.PriorityTaskManager priorityTaskManager;
        private final androidx.media3.datasource.DataSource.Factory upstreamFactory;

        public Factory(androidx.media3.datasource.DataSource.Factory factory, androidx.media3.common.PriorityTaskManager priorityTaskManager, int i) {
            this.upstreamFactory = factory;
            this.priorityTaskManager = priorityTaskManager;
            this.priority = i;
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public androidx.media3.datasource.PriorityDataSource createDataSource() {
            return new androidx.media3.datasource.PriorityDataSource(this.upstreamFactory.createDataSource(), this.priorityTaskManager, this.priority);
        }
    }

    public PriorityDataSource(androidx.media3.datasource.DataSource dataSource, androidx.media3.common.PriorityTaskManager priorityTaskManager, int i) {
        this.upstream = (androidx.media3.datasource.DataSource) androidx.media3.common.util.Assertions.checkNotNull(dataSource);
        this.priorityTaskManager = (androidx.media3.common.PriorityTaskManager) androidx.media3.common.util.Assertions.checkNotNull(priorityTaskManager);
        this.priority = i;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        androidx.media3.common.util.Assertions.checkNotNull(transferListener);
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        this.priorityTaskManager.proceedOrThrow(this.priority);
        return this.upstream.open(dataSpec);
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.priorityTaskManager.proceedOrThrow(this.priority);
        return this.upstream.read(bArr, i, i2);
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws java.io.IOException {
        this.upstream.close();
    }
}
