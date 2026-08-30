package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class PriorityDataSourceFactory implements androidx.media3.datasource.DataSource.Factory {
    private final int priority;
    private final androidx.media3.common.PriorityTaskManager priorityTaskManager;
    private final androidx.media3.datasource.DataSource.Factory upstreamFactory;

    public PriorityDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory, androidx.media3.common.PriorityTaskManager priorityTaskManager, int i) {
        this.upstreamFactory = factory;
        this.priorityTaskManager = priorityTaskManager;
        this.priority = i;
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public androidx.media3.datasource.PriorityDataSource createDataSource() {
        return new androidx.media3.datasource.PriorityDataSource(this.upstreamFactory.createDataSource(), this.priorityTaskManager, this.priority);
    }
}
