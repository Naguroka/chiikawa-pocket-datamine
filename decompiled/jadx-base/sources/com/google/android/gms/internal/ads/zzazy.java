package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzazy extends com.google.android.gms.internal.ads.zzbaf {
    private final com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback zza;
    private final java.lang.String zzb;

    public zzazy(com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, java.lang.String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzd(com.google.android.gms.internal.ads.zzbad zzbadVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new com.google.android.gms.internal.ads.zzazz(zzbadVar, this.zzb));
        }
    }
}
