package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbbc extends java.io.PushbackInputStream {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbbc(com.google.android.gms.internal.ads.zzbbd zzbbdVar, java.io.InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzbbdVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws java.io.IOException {
        com.google.android.gms.internal.ads.zzbbf.zze(this.zza.zzc);
        super.close();
    }
}
