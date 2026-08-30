package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class NetworkQualityThroughputListener {
    private final java.util.concurrent.Executor mExecutor;

    public abstract void onThroughputObservation(int i, long j, int i2);

    public NetworkQualityThroughputListener(java.util.concurrent.Executor executor) {
        if (executor == null) {
            throw new java.lang.IllegalStateException("Executor must not be null");
        }
        this.mExecutor = executor;
    }

    public java.util.concurrent.Executor getExecutor() {
        return this.mExecutor;
    }
}
