package com.google.android.gms.ads.admanager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdManagerAdView extends com.google.android.gms.ads.BaseAdView {
    public AdManagerAdView(android.content.Context context) {
        super(context, 0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public com.google.android.gms.ads.AdSize[] getAdSizes() {
        return this.zza.zzC();
    }

    public com.google.android.gms.ads.admanager.AppEventListener getAppEventListener() {
        return this.zza.zzh();
    }

    public com.google.android.gms.ads.VideoController getVideoController() {
        return this.zza.zzf();
    }

    public com.google.android.gms.ads.VideoOptions getVideoOptions() {
        return this.zza.zzg();
    }

    public void loadAd(final com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbcl.zza(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzf.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zza(adManagerAdRequest);
                    }
                });
                return;
            }
        }
        this.zza.zzm(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.zza.zzo();
    }

    public void setAdSizes(com.google.android.gms.ads.AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new java.lang.IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zza.zzt(adSizeArr);
    }

    public void setAppEventListener(com.google.android.gms.ads.admanager.AppEventListener appEventListener) {
        this.zza.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.zza.zzw(z);
    }

    public void setVideoOptions(com.google.android.gms.ads.VideoOptions videoOptions) {
        this.zza.zzy(videoOptions);
    }

    final /* synthetic */ void zza(com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest) {
        try {
            this.zza.zzm(adManagerAdRequest.zza());
        } catch (java.lang.IllegalStateException e) {
            com.google.android.gms.internal.ads.zzbuh.zza(getContext()).zzh(e, "AdManagerAdView.loadAd");
        }
    }

    public final boolean zzb(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        return this.zza.zzz(zzbyVar);
    }

    public AdManagerAdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, true);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null");
    }
}
