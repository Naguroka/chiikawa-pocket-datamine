package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzdiz extends com.google.android.gms.internal.ads.zzbgf implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, com.google.android.gms.internal.ads.zzdkd {
    private final java.lang.ref.WeakReference zza;
    private final java.util.Map zzb = new java.util.HashMap();
    private final java.util.Map zzc = new java.util.HashMap();
    private final java.util.Map zzd = new java.util.HashMap();
    private com.google.android.gms.internal.ads.zzdia zze;
    private com.google.android.gms.internal.ads.zzayl zzf;

    public zzdiz(android.view.View view, java.util.HashMap map, java.util.HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzv.zzy();
        com.google.android.gms.internal.ads.zzcaj.zza(view, this);
        com.google.android.gms.ads.internal.zzv.zzy();
        com.google.android.gms.internal.ads.zzcaj.zzb(view, this);
        this.zza = new java.lang.ref.WeakReference(view);
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.view.View view2 = (android.view.View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new java.lang.ref.WeakReference(view2));
                if (!com.google.android.gms.ads.formats.NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (java.util.Map.Entry entry2 : map2.entrySet()) {
            android.view.View view3 = (android.view.View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((java.lang.String) entry2.getKey(), new java.lang.ref.WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new com.google.android.gms.internal.ads.zzayl(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(android.view.View view) {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zze;
        if (zzdiaVar != null) {
            zzdiaVar.zzD(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zze;
        if (zzdiaVar != null) {
            zzdiaVar.zzB(zzf(), zzl(), zzm(), com.google.android.gms.internal.ads.zzdia.zzY(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zze;
        if (zzdiaVar != null) {
            zzdiaVar.zzB(zzf(), zzl(), zzm(), com.google.android.gms.internal.ads.zzdia.zzY(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zze;
        if (zzdiaVar != null) {
            zzdiaVar.zzL(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (this.zze != null) {
            java.lang.Object objUnwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
            if (!(objUnwrap instanceof android.view.View)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zze.zzN((android.view.View) objUnwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzc(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        java.lang.Object objUnwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof com.google.android.gms.internal.ads.zzdia)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zze;
        if (zzdiaVar != null) {
            zzdiaVar.zzT(this);
        }
        com.google.android.gms.internal.ads.zzdia zzdiaVar2 = (com.google.android.gms.internal.ads.zzdia) objUnwrap;
        if (!zzdiaVar2.zzU()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.zze = zzdiaVar2;
        zzdiaVar2.zzS(this);
        this.zze.zzK(zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzd() {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zze;
        if (zzdiaVar != null) {
            zzdiaVar.zzT(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final android.view.View zzf() {
        return (android.view.View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized android.view.View zzg(java.lang.String str) {
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (android.view.View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final android.widget.FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final com.google.android.gms.internal.ads.zzayl zzi() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized com.google.android.gms.dynamic.IObjectWrapper zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized java.lang.String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized java.util.Map zzl() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized java.util.Map zzm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized java.util.Map zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized org.json.JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized org.json.JSONObject zzp() {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zze;
        if (zzdiaVar == null) {
            return null;
        }
        return zzdiaVar.zzj(zzf(), zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized void zzq(java.lang.String str, android.view.View view, boolean z) {
        this.zzd.put(str, new java.lang.ref.WeakReference(view));
        if (!com.google.android.gms.ads.formats.NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new java.lang.ref.WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}
