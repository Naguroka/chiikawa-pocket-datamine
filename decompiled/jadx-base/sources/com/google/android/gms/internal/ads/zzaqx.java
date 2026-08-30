package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaqx extends com.google.android.gms.internal.ads.zzhec implements java.io.Closeable {
    static {
        com.google.android.gms.internal.ads.zzhej.zzb(com.google.android.gms.internal.ads.zzaqx.class);
    }

    public zzaqx(com.google.android.gms.internal.ads.zzhed zzhedVar, com.google.android.gms.internal.ads.zzaqw zzaqwVar) throws java.io.IOException {
        zze(zzhedVar, zzhedVar.zzc(), zzaqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhec, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final java.lang.String toString() {
        java.lang.String string = this.zzc.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
