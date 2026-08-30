package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgxo implements com.google.android.gms.internal.ads.zzgxf {
    final int zza;
    final com.google.android.gms.internal.ads.zzhau zzb;
    final boolean zzc;
    final boolean zzd;

    zzgxo(com.google.android.gms.internal.ads.zzgxw zzgxwVar, int i, com.google.android.gms.internal.ads.zzhau zzhauVar, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = zzhauVar;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.zza - ((com.google.android.gms.internal.ads.zzgxo) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final com.google.android.gms.internal.ads.zzhau zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final com.google.android.gms.internal.ads.zzhav zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final boolean zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final boolean zze() {
        return this.zzc;
    }
}
