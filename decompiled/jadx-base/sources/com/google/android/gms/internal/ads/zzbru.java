package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbru implements com.google.android.gms.ads.internal.overlay.zzr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbrw zza;

    zzbru(com.google.android.gms.internal.ads.zzbrw zzbrwVar) {
        this.zza = zzbrwVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Opening AdMobCustomTabsAdapter overlay.");
        com.google.android.gms.internal.ads.zzbrw zzbrwVar = this.zza;
        zzbrwVar.zzb.onAdOpened(zzbrwVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("AdMobCustomTabsAdapter overlay is closed.");
        com.google.android.gms.internal.ads.zzbrw zzbrwVar = this.zza;
        zzbrwVar.zzb.onAdClosed(zzbrwVar);
    }
}
