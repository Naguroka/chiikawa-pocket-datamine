package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdjb extends com.google.android.gms.internal.ads.zzbfz implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, com.google.android.gms.internal.ads.zzdkd {
    public static final com.google.android.gms.internal.ads.zzfxn zza = com.google.android.gms.internal.ads.zzfxn.zzq("2011", "1009", "3010");
    private final java.lang.String zzb;
    private android.widget.FrameLayout zzd;
    private android.widget.FrameLayout zze;
    private final com.google.android.gms.internal.ads.zzgcs zzf;
    private android.view.View zzg;
    private com.google.android.gms.internal.ads.zzdia zzi;
    private com.google.android.gms.internal.ads.zzayl zzj;
    private com.google.android.gms.internal.ads.zzbft zzl;
    private boolean zzm;
    private android.view.GestureDetector zzo;
    private java.util.Map zzc = new java.util.HashMap();
    private com.google.android.gms.dynamic.IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = 244410000;

    public zzdjb(android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2, int i) {
        java.lang.String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        java.lang.String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzv.zzy();
        com.google.android.gms.internal.ads.zzcaj.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzv.zzy();
        com.google.android.gms.internal.ads.zzcaj.zzb(frameLayout, this);
        this.zzf = com.google.android.gms.internal.ads.zzbzw.zzf;
        this.zzj = new com.google.android.gms.internal.ads.zzayl(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt(java.lang.String str) {
        android.util.DisplayMetrics displayMetrics;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.content.Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!android.text.TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            android.content.res.Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] bArrDecode = android.util.Base64.decode(str, 0);
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    bitmapDrawable.setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (java.lang.IllegalArgumentException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    private final synchronized void zzu() {
        this.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdja
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzs();
            }
        });
    }

    private final synchronized void zzv() {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzls)).booleanValue() || this.zzi.zza() == 0) {
            return;
        }
        this.zzo = new android.view.GestureDetector(this.zzd.getContext(), new com.google.android.gms.internal.ads.zzdjj(this.zzi, this));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(android.view.View view) {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzi;
        if (zzdiaVar == null || !zzdiaVar.zzV()) {
            return;
        }
        this.zzi.zzv();
        this.zzi.zzD(view, this.zzd, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null) {
            android.widget.FrameLayout frameLayout = this.zzd;
            zzdiaVar.zzB(frameLayout, zzl(), zzm(), com.google.android.gms.internal.ads.zzdia.zzY(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null) {
            android.widget.FrameLayout frameLayout = this.zzd;
            zzdiaVar.zzB(frameLayout, zzl(), zzm(), com.google.android.gms.internal.ads.zzdia.zzY(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null) {
            zzdiaVar.zzL(view, motionEvent, this.zzd);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzls)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized com.google.android.gms.dynamic.IObjectWrapper zzb(java.lang.String str) {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzc() {
        if (this.zzn) {
            return;
        }
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null) {
            zzdiaVar.zzT(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (android.view.MotionEvent) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzdt(java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        zzq(str, (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzdu(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzi.zzN((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzdv(com.google.android.gms.internal.ads.zzbft zzbftVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbftVar;
            com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzi;
            if (zzdiaVar != null) {
                zzdiaVar.zzc().zzb(zzbftVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzdw(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzdx(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        java.lang.Object objUnwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof com.google.android.gms.internal.ads.zzdia)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null) {
            zzdiaVar.zzT(this);
        }
        zzu();
        com.google.android.gms.internal.ads.zzdia zzdiaVar2 = (com.google.android.gms.internal.ads.zzdia) objUnwrap;
        this.zzi = zzdiaVar2;
        zzdiaVar2.zzS(this);
        this.zzi.zzK(this.zzd);
        this.zzi.zzu(this.zze);
        if (this.zzm) {
            this.zzi.zzc().zzb(this.zzl);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdY)).booleanValue() && !android.text.TextUtils.isEmpty(this.zzi.zzg())) {
            zzt(this.zzi.zzg());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final /* synthetic */ android.view.View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized android.view.View zzg(java.lang.String str) {
        java.lang.ref.WeakReference weakReference;
        if (!this.zzn && (weakReference = (java.lang.ref.WeakReference) this.zzc.get(str)) != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final android.widget.FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final com.google.android.gms.internal.ads.zzayl zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final com.google.android.gms.dynamic.IObjectWrapper zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized java.lang.String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized java.util.Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized java.util.Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized java.util.Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized org.json.JSONObject zzo() {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzi;
        if (zzdiaVar == null) {
            return null;
        }
        return zzdiaVar.zzi(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized org.json.JSONObject zzp() {
        com.google.android.gms.internal.ads.zzdia zzdiaVar = this.zzi;
        if (zzdiaVar == null) {
            return null;
        }
        return zzdiaVar.zzj(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized void zzq(java.lang.String str, android.view.View view, boolean z) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new java.lang.ref.WeakReference(view));
            if (!com.google.android.gms.ads.formats.NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbv.zzi(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final android.widget.FrameLayout zzr() {
        return this.zzd;
    }

    final /* synthetic */ void zzs() {
        if (this.zzg == null) {
            android.view.View view = new android.view.View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
