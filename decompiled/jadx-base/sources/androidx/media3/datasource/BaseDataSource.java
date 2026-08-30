package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseDataSource implements androidx.media3.datasource.DataSource {
    private androidx.media3.datasource.DataSpec dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final java.util.ArrayList<androidx.media3.datasource.TransferListener> listeners = new java.util.ArrayList<>(1);

    protected BaseDataSource(boolean z) {
        this.isNetwork = z;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        androidx.media3.common.util.Assertions.checkNotNull(transferListener);
        if (this.listeners.contains(transferListener)) {
            return;
        }
        this.listeners.add(transferListener);
        this.listenerCount++;
    }

    protected final void transferInitializing(androidx.media3.datasource.DataSpec dataSpec) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).onTransferInitializing(this, dataSpec, this.isNetwork);
        }
    }

    protected final void transferStarted(androidx.media3.datasource.DataSpec dataSpec) {
        this.dataSpec = dataSpec;
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).onTransferStart(this, dataSpec, this.isNetwork);
        }
    }

    protected final void bytesTransferred(int i) {
        androidx.media3.datasource.DataSpec dataSpec = (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Util.castNonNull(this.dataSpec);
        for (int i2 = 0; i2 < this.listenerCount; i2++) {
            this.listeners.get(i2).onBytesTransferred(this, dataSpec, this.isNetwork, i);
        }
    }

    protected final void transferEnded() {
        androidx.media3.datasource.DataSpec dataSpec = (androidx.media3.datasource.DataSpec) androidx.media3.common.util.Util.castNonNull(this.dataSpec);
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).onTransferEnd(this, dataSpec, this.isNetwork);
        }
        this.dataSpec = null;
    }
}
