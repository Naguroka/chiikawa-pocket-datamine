package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbxx {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    zzbxx(com.google.android.gms.common.util.Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, com.google.android.gms.internal.ads.zzbyi zzbyiVar) {
        this.zza = zzgVar;
    }

    public final void zza(int i, long j) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaD)).booleanValue()) {
            return;
        }
        if (j - this.zza.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaE)).booleanValue()) {
            this.zza.zzH(i);
            this.zza.zzI(j);
        } else {
            this.zza.zzH(-1);
            this.zza.zzI(j);
        }
    }
}
