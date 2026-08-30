package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class an implements java.io.Closeable {
    public abstract long a();

    protected abstract java.io.InputStream b(long j, long j2) throws java.io.IOException;

    public final synchronized java.io.InputStream c() throws java.io.IOException {
        return b(0L, a());
    }
}
