package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdvp extends com.google.android.gms.ads.AdListener {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdvs zzb;

    zzdvp(com.google.android.gms.internal.ads.zzdvs zzdvsVar, java.lang.String str) {
        this.zza = str;
        this.zzb = zzdvsVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
        this.zzb.zzm(com.google.android.gms.internal.ads.zzdvs.zzl(loadAdError), this.zza);
    }
}
