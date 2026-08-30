package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzek extends com.google.android.gms.ads.internal.client.zzbd {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzel zza;

    zzek(com.google.android.gms.ads.internal.client.zzel zzelVar) {
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbd, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
        com.google.android.gms.ads.internal.client.zzel zzelVar = this.zza;
        zzelVar.zze.zzb(zzelVar.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbd, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        com.google.android.gms.ads.internal.client.zzel zzelVar = this.zza;
        zzelVar.zze.zzb(zzelVar.zzi());
        super.onAdLoaded();
    }
}
