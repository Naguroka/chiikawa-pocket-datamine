package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzduk implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;

    public zzduk(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
    }

    public static com.google.android.gms.internal.ads.zzddk zza(com.google.android.gms.internal.ads.zzduj zzdujVar, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.zzddk(zzdujVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return zza((com.google.android.gms.internal.ads.zzduj) this.zza.zzb(), com.google.android.gms.internal.ads.zzffh.zzc());
    }
}
