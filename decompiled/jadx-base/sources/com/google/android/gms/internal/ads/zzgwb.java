package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgwb extends com.google.android.gms.internal.ads.zzgwc {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgwj zza;
    private int zzb = 0;
    private final int zzc;

    zzgwb(com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        this.zza = zzgwjVar;
        this.zzc = zzgwjVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
