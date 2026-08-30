package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzbd extends com.google.android.gms.ads.AdListener {
    private final java.lang.Object zza = new java.lang.Object();
    private com.google.android.gms.ads.AdListener zzb;

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized (this.zza) {
            com.google.android.gms.ads.AdListener adListener = this.zzb;
            if (adListener != null) {
                adListener.onAdClicked();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized (this.zza) {
            com.google.android.gms.ads.AdListener adListener = this.zzb;
            if (adListener != null) {
                adListener.onAdClosed();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
        synchronized (this.zza) {
            com.google.android.gms.ads.AdListener adListener = this.zzb;
            if (adListener != null) {
                adListener.onAdFailedToLoad(loadAdError);
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized (this.zza) {
            com.google.android.gms.ads.AdListener adListener = this.zzb;
            if (adListener != null) {
                adListener.onAdImpression();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.zza) {
            com.google.android.gms.ads.AdListener adListener = this.zzb;
            if (adListener != null) {
                adListener.onAdLoaded();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized (this.zza) {
            com.google.android.gms.ads.AdListener adListener = this.zzb;
            if (adListener != null) {
                adListener.onAdOpened();
            }
        }
    }

    public final void zza(com.google.android.gms.ads.AdListener adListener) {
        synchronized (this.zza) {
            this.zzb = adListener;
        }
    }
}
