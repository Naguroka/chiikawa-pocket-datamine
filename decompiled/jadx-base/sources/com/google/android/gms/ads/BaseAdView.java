package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseAdView extends android.view.ViewGroup {

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    protected final com.google.android.gms.ads.internal.client.zzel zza;

    protected BaseAdView(android.content.Context context, int i) {
        super(context);
        this.zza = new com.google.android.gms.ads.internal.client.zzel(this, i);
    }

    public void destroy() {
        com.google.android.gms.internal.ads.zzbcl.zza(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zze.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkX)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzk();
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbuh.zza(baseAdView.getContext()).zzh(e, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzk();
    }

    public com.google.android.gms.ads.AdListener getAdListener() {
        return this.zza.zza();
    }

    public com.google.android.gms.ads.AdSize getAdSize() {
        return this.zza.zzb();
    }

    public java.lang.String getAdUnitId() {
        return this.zza.zzj();
    }

    public com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzc();
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        return this.zza.zzd();
    }

    public boolean isCollapsible() {
        return this.zza.zzA();
    }

    public boolean isLoading() {
        return this.zza.zzB();
    }

    public void loadAd(final com.google.android.gms.ads.AdRequest adRequest) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbcl.zza(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzf.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.zzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzm(adRequest.zza);
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbuh.zza(baseAdView.getContext()).zzh(e, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzm(adRequest.zza);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        com.google.android.gms.ads.AdSize adSize;
        int heightInPixels;
        int measuredWidth = 0;
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (java.lang.NullPointerException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                android.content.Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(android.view.View.resolveSize(java.lang.Math.max(measuredWidth, getSuggestedMinimumWidth()), i), android.view.View.resolveSize(java.lang.Math.max(heightInPixels, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        com.google.android.gms.internal.ads.zzbcl.zza(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzg.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkY)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzn();
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbuh.zza(baseAdView.getContext()).zzh(e, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzn();
    }

    public void resume() {
        com.google.android.gms.internal.ads.zzbcl.zza(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzh.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkW)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzp();
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbuh.zza(baseAdView.getContext()).zzh(e, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(com.google.android.gms.ads.AdListener adListener) {
        this.zza.zzr(adListener);
        if (adListener == 0) {
            this.zza.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            this.zza.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof com.google.android.gms.ads.admanager.AppEventListener) {
            this.zza.zzv((com.google.android.gms.ads.admanager.AppEventListener) adListener);
        }
    }

    public void setAdSize(com.google.android.gms.ads.AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(java.lang.String str) {
        this.zza.zzu(str);
    }

    public void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        this.zza.zzx(onPaidEventListener);
    }

    protected BaseAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zza = new com.google.android.gms.ads.internal.client.zzel(this, attributeSet, false, i);
    }

    protected BaseAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.zza = new com.google.android.gms.ads.internal.client.zzel(this, attributeSet, false, i2);
    }

    protected BaseAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.zza = new com.google.android.gms.ads.internal.client.zzel(this, attributeSet, z, i2);
    }

    protected BaseAdView(android.content.Context context, android.util.AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.zza = new com.google.android.gms.ads.internal.client.zzel(this, attributeSet, z);
    }
}
