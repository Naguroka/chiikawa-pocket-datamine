package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcpc implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzcot zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;

    public zzcpc(com.google.android.gms.internal.ads.zzcot zzcotVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar) {
        this.zza = zzcotVar;
        this.zzb = zzhfjVar;
    }

    public static java.util.Set zza(com.google.android.gms.internal.ads.zzcot zzcotVar, com.google.android.gms.internal.ads.zzcqo zzcqoVar) {
        java.util.Set setSingleton = java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzddk(zzcqoVar, com.google.android.gms.internal.ads.zzbzw.zzg));
        com.google.android.gms.internal.ads.zzhez.zzb(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return zza(this.zza, (com.google.android.gms.internal.ads.zzcqo) this.zzb.zzb());
    }
}
