package com.google.android.gms.ads.mediation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class UnifiedNativeAdMapper {
    private java.lang.String zza;
    private java.util.List zzb;
    private java.lang.String zzc;
    private com.google.android.gms.ads.formats.NativeAd.Image zzd;
    private java.lang.String zze;
    private java.lang.String zzf;
    private java.lang.Double zzg;
    private java.lang.String zzh;
    private java.lang.String zzi;
    private com.google.android.gms.ads.VideoController zzj;
    private boolean zzk;
    private android.view.View zzl;
    private android.view.View zzm;
    private java.lang.Object zzn;
    private android.os.Bundle zzo = new android.os.Bundle();
    private boolean zzp;
    private boolean zzq;
    private float zzr;

    public android.view.View getAdChoicesContent() {
        return this.zzl;
    }

    public final java.lang.String getAdvertiser() {
        return this.zzf;
    }

    public final java.lang.String getBody() {
        return this.zzc;
    }

    public final java.lang.String getCallToAction() {
        return this.zze;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public final android.os.Bundle getExtras() {
        return this.zzo;
    }

    public final java.lang.String getHeadline() {
        return this.zza;
    }

    public final com.google.android.gms.ads.formats.NativeAd.Image getIcon() {
        return this.zzd;
    }

    public final java.util.List<com.google.android.gms.ads.formats.NativeAd.Image> getImages() {
        return this.zzb;
    }

    public float getMediaContentAspectRatio() {
        return this.zzr;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzq;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzp;
    }

    public final java.lang.String getPrice() {
        return this.zzi;
    }

    public final java.lang.Double getStarRating() {
        return this.zzg;
    }

    public final java.lang.String getStore() {
        return this.zzh;
    }

    public void handleClick(android.view.View view) {
    }

    public boolean hasVideoContent() {
        return this.zzk;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(android.view.View view) {
        this.zzl = view;
    }

    public final void setAdvertiser(java.lang.String str) {
        this.zzf = str;
    }

    public final void setBody(java.lang.String str) {
        this.zzc = str;
    }

    public final void setCallToAction(java.lang.String str) {
        this.zze = str;
    }

    public final void setExtras(android.os.Bundle bundle) {
        this.zzo = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.zzk = z;
    }

    public final void setHeadline(java.lang.String str) {
        this.zza = str;
    }

    public final void setIcon(com.google.android.gms.ads.formats.NativeAd.Image image) {
        this.zzd = image;
    }

    public final void setImages(java.util.List<com.google.android.gms.ads.formats.NativeAd.Image> list) {
        this.zzb = list;
    }

    public void setMediaContentAspectRatio(float f) {
        this.zzr = f;
    }

    public void setMediaView(android.view.View view) {
        this.zzm = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.zzq = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.zzp = z;
    }

    public final void setPrice(java.lang.String str) {
        this.zzi = str;
    }

    public final void setStarRating(java.lang.Double d) {
        this.zzg = d;
    }

    public final void setStore(java.lang.String str) {
        this.zzh = str;
    }

    public void trackViews(android.view.View view, java.util.Map<java.lang.String, android.view.View> map, java.util.Map<java.lang.String, android.view.View> map2) {
    }

    public void untrackView(android.view.View view) {
    }

    public final android.view.View zza() {
        return this.zzm;
    }

    public final com.google.android.gms.ads.VideoController zzb() {
        return this.zzj;
    }

    public final java.lang.Object zzc() {
        return this.zzn;
    }

    public final void zzd(java.lang.Object obj) {
        this.zzn = obj;
    }

    public final void zze(com.google.android.gms.ads.VideoController videoController) {
        this.zzj = videoController;
    }
}
