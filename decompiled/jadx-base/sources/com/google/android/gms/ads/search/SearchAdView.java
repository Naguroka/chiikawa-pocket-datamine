package com.google.android.gms.ads.search;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class SearchAdView extends android.view.ViewGroup {

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.ads.internal.client.zzel zza;

    public SearchAdView(android.content.Context context) {
        super(context);
        this.zza = new com.google.android.gms.ads.internal.client.zzel(this);
    }

    public void destroy() {
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

    public void loadAd(com.google.android.gms.ads.search.DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (!com.google.android.gms.ads.AdSize.SEARCH.equals(getAdSize())) {
            throw new java.lang.IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
        }
        this.zza.zzm(dynamicHeightSearchAdRequest.zza());
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
        this.zza.zzn();
    }

    public void resume() {
        this.zza.zzp();
    }

    public void setAdListener(com.google.android.gms.ads.AdListener adListener) {
        this.zza.zzr(adListener);
    }

    public void setAdSize(com.google.android.gms.ads.AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(java.lang.String str) {
        this.zza.zzu(str);
    }

    public SearchAdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = new com.google.android.gms.ads.internal.client.zzel(this, attributeSet, false);
    }

    public void loadAd(com.google.android.gms.ads.search.SearchAdRequest searchAdRequest) {
        this.zza.zzm(searchAdRequest.zza());
    }

    public SearchAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = new com.google.android.gms.ads.internal.client.zzel(this, attributeSet, false);
    }
}
