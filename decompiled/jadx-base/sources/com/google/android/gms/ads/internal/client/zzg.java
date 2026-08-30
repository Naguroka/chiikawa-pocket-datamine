package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzg extends com.google.android.gms.ads.internal.client.zzbk {
    private final com.google.android.gms.ads.AdListener zza;

    public zzg(com.google.android.gms.ads.AdListener adListener) {
        this.zza = adListener;
    }

    public final com.google.android.gms.ads.AdListener zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
        com.google.android.gms.ads.AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }
}
