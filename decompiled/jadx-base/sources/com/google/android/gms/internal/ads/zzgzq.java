package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgzq extends com.google.android.gms.internal.ads.zzgwc {
    final com.google.android.gms.internal.ads.zzgzs zza;
    com.google.android.gms.internal.ads.zzgwe zzb = zzb();
    final /* synthetic */ com.google.android.gms.internal.ads.zzgzu zzc;

    zzgzq(com.google.android.gms.internal.ads.zzgzu zzgzuVar) {
        this.zzc = zzgzuVar;
        this.zza = new com.google.android.gms.internal.ads.zzgzs(zzgzuVar, null);
    }

    private final com.google.android.gms.internal.ads.zzgwe zzb() {
        com.google.android.gms.internal.ads.zzgzs zzgzsVar = this.zza;
        if (zzgzsVar.hasNext()) {
            return zzgzsVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final byte zza() {
        com.google.android.gms.internal.ads.zzgwe zzgweVar = this.zzb;
        if (zzgweVar == null) {
            throw new java.util.NoSuchElementException();
        }
        byte bZza = zzgweVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
