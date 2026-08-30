package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbql extends com.google.android.gms.internal.ads.zzbps {
    private final com.google.android.gms.ads.mediation.UnifiedNativeAdMapper zza;

    public zzbql(com.google.android.gms.ads.mediation.UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zza = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzA() {
        return this.zza.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzB() {
        return this.zza.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final double zze() {
        if (this.zza.getStarRating() != null) {
            return this.zza.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final float zzf() {
        return this.zza.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final float zzg() {
        return this.zza.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final float zzh() {
        return this.zza.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final android.os.Bundle zzi() {
        return this.zza.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.ads.internal.client.zzeb zzj() {
        if (this.zza.zzb() != null) {
            return this.zza.zzb().zza();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.internal.ads.zzbfp zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.internal.ads.zzbfw zzl() {
        com.google.android.gms.ads.formats.NativeAd.Image icon = this.zza.getIcon();
        if (icon != null) {
            return new com.google.android.gms.internal.ads.zzbfj(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.dynamic.IObjectWrapper zzm() {
        android.view.View adChoicesContent = this.zza.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() {
        android.view.View viewZza = this.zza.zza();
        if (viewZza == null) {
            return null;
        }
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(viewZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.dynamic.IObjectWrapper zzo() {
        java.lang.Object objZzc = this.zza.zzc();
        if (objZzc == null) {
            return null;
        }
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(objZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.lang.String zzp() {
        return this.zza.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.lang.String zzq() {
        return this.zza.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.lang.String zzr() {
        return this.zza.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.lang.String zzs() {
        return this.zza.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.lang.String zzt() {
        return this.zza.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.lang.String zzu() {
        return this.zza.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final java.util.List zzv() {
        java.util.List<com.google.android.gms.ads.formats.NativeAd.Image> images = this.zza.getImages();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (images != null) {
            for (com.google.android.gms.ads.formats.NativeAd.Image image : images) {
                arrayList.add(new com.google.android.gms.internal.ads.zzbfj(image.getDrawable(), image.getUri(), image.getScale(), image.zzb(), image.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzw(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zza.handleClick((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzx() {
        this.zza.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzy(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) {
        java.util.HashMap map = (java.util.HashMap) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper2);
        java.util.HashMap map2 = (java.util.HashMap) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper3);
        this.zza.trackViews((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzz(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zza.untrackView((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }
}
