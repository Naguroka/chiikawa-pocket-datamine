package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdoi implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;

    public zzdoi(com.google.android.gms.internal.ads.zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza enumC0177zza = ((com.google.android.gms.internal.ads.zzcvk) this.zza).zza().zzo.zza == 3 ? com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza.REWARDED_INTERSTITIAL : com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza.REWARD_BASED_VIDEO_AD;
        com.google.android.gms.internal.ads.zzhez.zzb(enumC0177zza);
        return enumC0177zza;
    }
}
