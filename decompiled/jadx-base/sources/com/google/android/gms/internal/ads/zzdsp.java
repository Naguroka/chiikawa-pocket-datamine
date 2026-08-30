package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdsp implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzdsl zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;

    public zzdsp(com.google.android.gms.internal.ads.zzdsl zzdslVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2) {
        this.zza = zzdslVar;
        this.zzb = zzhfjVar;
    }

    public static java.util.Set zza(com.google.android.gms.internal.ads.zzdsl zzdslVar, com.google.android.gms.internal.ads.zzdsv zzdsvVar, java.util.concurrent.Executor executor) {
        java.util.Set setZzd = com.google.android.gms.internal.ads.zzdsl.zzd(zzdsvVar, executor);
        com.google.android.gms.internal.ads.zzhez.zzb(setZzd);
        return setZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return zza(this.zza, (com.google.android.gms.internal.ads.zzdsv) this.zzb.zzb(), com.google.android.gms.internal.ads.zzffh.zzc());
    }
}
