package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ao extends com.google.android.play.core.assetpacks.internal.an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.assetpacks.internal.an f2242a;
    private final long b;
    private final long c;

    public ao(com.google.android.play.core.assetpacks.internal.an anVar, long j, long j2) {
        this.f2242a = anVar;
        long jD = d(j);
        this.b = jD;
        this.c = d(jD + j2);
    }

    private final long d(long j) {
        if (j < 0) {
            return 0L;
        }
        return j > this.f2242a.a() ? this.f2242a.a() : j;
    }

    @Override // com.google.android.play.core.assetpacks.internal.an
    public final long a() {
        return this.c - this.b;
    }

    @Override // com.google.android.play.core.assetpacks.internal.an
    protected final java.io.InputStream b(long j, long j2) throws java.io.IOException {
        long jD = d(this.b);
        return this.f2242a.b(jD, d(j2 + jD) - jD);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
    }
}
