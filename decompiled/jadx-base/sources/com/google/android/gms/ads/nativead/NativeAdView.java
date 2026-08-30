package com.google.android.gms.ads.nativead;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class NativeAdView extends android.widget.FrameLayout {

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final android.widget.FrameLayout zza;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.internal.ads.zzbga zzb;

    public NativeAdView(android.content.Context context) {
        super(context);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    private final android.widget.FrameLayout zzd(android.content.Context context) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"overlayFrame"})
    private final com.google.android.gms.internal.ads.zzbga zze() {
        if (isInEditMode()) {
            return null;
        }
        android.widget.FrameLayout frameLayout = this.zza;
        return com.google.android.gms.ads.internal.client.zzbc.zza().zzj(frameLayout.getContext(), this, frameLayout);
    }

    private final void zzf(java.lang.String str, android.view.View view) {
        com.google.android.gms.internal.ads.zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zzdt(str, com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(android.view.View view) {
        super.bringChildToFront(view);
        android.widget.FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        com.google.android.gms.internal.ads.zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zzc();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to destroy native ad view", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.zzb != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzls)).booleanValue()) {
                try {
                    this.zzb.zzd(com.google.android.gms.dynamic.ObjectWrapper.wrap(motionEvent));
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.google.android.gms.ads.nativead.AdChoicesView getAdChoicesView() {
        android.view.View viewZza = zza("3011");
        if (viewZza instanceof com.google.android.gms.ads.nativead.AdChoicesView) {
            return (com.google.android.gms.ads.nativead.AdChoicesView) viewZza;
        }
        return null;
    }

    public final android.view.View getAdvertiserView() {
        return zza("3005");
    }

    public final android.view.View getBodyView() {
        return zza("3004");
    }

    public final android.view.View getCallToActionView() {
        return zza("3002");
    }

    public final android.view.View getHeadlineView() {
        return zza("3001");
    }

    public final android.view.View getIconView() {
        return zza("3003");
    }

    public final android.view.View getImageView() {
        return zza("3008");
    }

    public final com.google.android.gms.ads.nativead.MediaView getMediaView() {
        android.view.View viewZza = zza("3010");
        if (viewZza instanceof com.google.android.gms.ads.nativead.MediaView) {
            return (com.google.android.gms.ads.nativead.MediaView) viewZza;
        }
        if (viewZza == null) {
            return null;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("View is not an instance of MediaView");
        return null;
    }

    public final android.view.View getPriceView() {
        return zza("3007");
    }

    public final android.view.View getStarRatingView() {
        return zza("3009");
    }

    public final android.view.View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        com.google.android.gms.internal.ads.zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(view), i);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(com.google.android.gms.ads.nativead.AdChoicesView adChoicesView) {
        zzf("3011", adChoicesView);
    }

    public final void setAdvertiserView(android.view.View view) {
        zzf("3005", view);
    }

    public final void setBodyView(android.view.View view) {
        zzf("3004", view);
    }

    public final void setCallToActionView(android.view.View view) {
        zzf("3002", view);
    }

    public final void setClickConfirmingView(android.view.View view) {
        com.google.android.gms.internal.ads.zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zzdu(com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(android.view.View view) {
        zzf("3001", view);
    }

    public final void setIconView(android.view.View view) {
        zzf("3003", view);
    }

    public final void setImageView(android.view.View view) {
        zzf("3008", view);
    }

    public final void setMediaView(com.google.android.gms.ads.nativead.MediaView mediaView) {
        zzf("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new com.google.android.gms.ads.nativead.zzb(this));
        mediaView.zzb(new com.google.android.gms.ads.nativead.zzc(this));
    }

    public void setNativeAd(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
        com.google.android.gms.internal.ads.zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null) {
            return;
        }
        try {
            zzbgaVar.zzdx((com.google.android.gms.dynamic.IObjectWrapper) nativeAd.zza());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(android.view.View view) {
        zzf("3007", view);
    }

    public final void setStarRatingView(android.view.View view) {
        zzf("3009", view);
    }

    public final void setStoreView(android.view.View view) {
        zzf("3006", view);
    }

    protected final android.view.View zza(java.lang.String str) {
        com.google.android.gms.internal.ads.zzbga zzbgaVar = this.zzb;
        if (zzbgaVar != null) {
            try {
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzb = zzbgaVar.zzb(str);
                if (iObjectWrapperZzb != null) {
                    return (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzb);
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    final /* synthetic */ void zzb(com.google.android.gms.ads.MediaContent mediaContent) {
        com.google.android.gms.internal.ads.zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof com.google.android.gms.ads.internal.client.zzfd) {
                zzbgaVar.zzdv(((com.google.android.gms.ads.internal.client.zzfd) mediaContent).zzc());
            } else if (mediaContent == null) {
                zzbgaVar.zzdv(null);
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call setMediaContent on delegate", e);
        }
    }

    final /* synthetic */ void zzc(android.widget.ImageView.ScaleType scaleType) {
        com.google.android.gms.internal.ads.zzbga zzbgaVar = this.zzb;
        if (zzbgaVar == null || scaleType == null) {
            return;
        }
        try {
            zzbgaVar.zzdw(com.google.android.gms.dynamic.ObjectWrapper.wrap(scaleType));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public NativeAdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zza = zzd(context);
        this.zzb = zze();
    }
}
