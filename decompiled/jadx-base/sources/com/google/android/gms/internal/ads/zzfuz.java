package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfuz implements java.lang.Iterable {
    final /* synthetic */ java.lang.CharSequence zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfvc zzb;

    zzfuz(com.google.android.gms.internal.ads.zzfvc zzfvcVar, java.lang.CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfvcVar;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('[');
        com.google.android.gms.internal.ads.zzfuf.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
