package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class AdLoader {
    private final com.google.android.gms.ads.internal.client.zzr zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.ads.internal.client.zzbr zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static class Builder {
        private final android.content.Context zza;
        private final com.google.android.gms.ads.internal.client.zzbu zzb;

        public Builder(android.content.Context context, java.lang.String str) {
            android.content.Context context2 = (android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "context cannot be null");
            com.google.android.gms.ads.internal.client.zzbu zzbuVarZzd = com.google.android.gms.ads.internal.client.zzbc.zza().zzd(context, str, new com.google.android.gms.internal.ads.zzbpa());
            this.zza = context2;
            this.zzb = zzbuVarZzd;
        }

        public com.google.android.gms.ads.AdLoader build() {
            try {
                return new com.google.android.gms.ads.AdLoader(this.zza, this.zzb.zze(), com.google.android.gms.ads.internal.client.zzr.zza);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to build AdLoader.", e);
                return new com.google.android.gms.ads.AdLoader(this.zza, new com.google.android.gms.ads.internal.client.zzfi().zzc(), com.google.android.gms.ads.internal.client.zzr.zza);
            }
        }

        public com.google.android.gms.ads.AdLoader.Builder forCustomFormatAd(java.lang.String str, com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            com.google.android.gms.internal.ads.zzbsr zzbsrVar = new com.google.android.gms.internal.ads.zzbsr(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbsrVar.zzb(), zzbsrVar.zza());
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to add custom format ad listener", e);
            }
            return this;
        }

        public com.google.android.gms.ads.AdLoader.Builder forNativeAd(com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new com.google.android.gms.internal.ads.zzbst(onNativeAdLoadedListener));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        public com.google.android.gms.ads.AdLoader.Builder withAdListener(com.google.android.gms.ads.AdListener adListener) {
            try {
                this.zzb.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to set AdListener.", e);
            }
            return this;
        }

        public com.google.android.gms.ads.AdLoader.Builder withAdManagerAdViewOptions(com.google.android.gms.ads.formats.AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        public com.google.android.gms.ads.AdLoader.Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new com.google.android.gms.internal.ads.zzbfl(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb(), nativeAdOptions.zzd() - 1));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        @java.lang.Deprecated
        public final com.google.android.gms.ads.AdLoader.Builder zza(java.lang.String str, com.google.android.gms.ads.formats.zzg zzgVar, com.google.android.gms.ads.formats.zzf zzfVar) {
            com.google.android.gms.internal.ads.zzbia zzbiaVar = new com.google.android.gms.internal.ads.zzbia(zzgVar, zzfVar);
            try {
                this.zzb.zzh(str, zzbiaVar.zzd(), zzbiaVar.zzc());
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to add custom template ad listener", e);
            }
            return this;
        }

        @java.lang.Deprecated
        public final com.google.android.gms.ads.AdLoader.Builder zzb(com.google.android.gms.ads.formats.zzi zziVar) {
            try {
                this.zzb.zzk(new com.google.android.gms.internal.ads.zzbid(zziVar));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @java.lang.Deprecated
        public final com.google.android.gms.ads.AdLoader.Builder zzc(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new com.google.android.gms.internal.ads.zzbfl(nativeAdOptions));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        public com.google.android.gms.ads.AdLoader.Builder forAdManagerAdView(com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, com.google.android.gms.ads.AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new java.lang.IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzb.zzj(new com.google.android.gms.internal.ads.zzbic(onAdManagerAdViewLoadedListener), new com.google.android.gms.ads.internal.client.zzs(this.zza, adSizeArr));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to add Google Ad Manager banner ad listener", e);
            }
            return this;
        }
    }

    AdLoader(android.content.Context context, com.google.android.gms.ads.internal.client.zzbr zzbrVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = context;
        this.zzc = zzbrVar;
        this.zza = zzrVar;
    }

    private final void zzb(final com.google.android.gms.ads.internal.client.zzei zzeiVar) {
        com.google.android.gms.internal.ads.zzbcl.zza(this.zzb);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzc.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zza(zzeiVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzeiVar));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(com.google.android.gms.ads.AdRequest adRequest) {
        zzb(adRequest.zza);
    }

    public void loadAds(com.google.android.gms.ads.AdRequest adRequest, int i) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza), i);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to load ads.", e);
        }
    }

    final /* synthetic */ void zza(com.google.android.gms.ads.internal.client.zzei zzeiVar) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzeiVar));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to load ad.", e);
        }
    }

    public void loadAd(com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
