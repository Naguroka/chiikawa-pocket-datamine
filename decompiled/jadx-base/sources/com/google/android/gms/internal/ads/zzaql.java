package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaql extends java.io.FilterInputStream {
    private final java.net.HttpURLConnection zza;

    /* JADX WARN: Illegal instructions before constructor call */
    zzaql(java.net.HttpURLConnection httpURLConnection) {
        java.io.InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (java.io.IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        super(errorStream);
        this.zza = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        super.close();
        this.zza.disconnect();
    }
}
