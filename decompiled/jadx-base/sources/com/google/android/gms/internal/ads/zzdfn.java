package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdfn implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzdeu zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;

    public zzdfn(com.google.android.gms.internal.ads.zzdeu zzdeuVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar) {
        this.zza = zzdeuVar;
        this.zzb = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return this.zza.zzd((java.util.concurrent.Executor) this.zzb.zzb());
    }
}
