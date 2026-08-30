package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdvl extends com.google.android.gms.ads.AdListener {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.ads.AdView zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdvs zzd;

    zzdvl(com.google.android.gms.internal.ads.zzdvs zzdvsVar, java.lang.String str, com.google.android.gms.ads.AdView adView, java.lang.String str2) {
        this.zza = str;
        this.zzb = adView;
        this.zzc = str2;
        this.zzd = zzdvsVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
        this.zzd.zzm(com.google.android.gms.internal.ads.zzdvs.zzl(loadAdError), this.zzc);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
