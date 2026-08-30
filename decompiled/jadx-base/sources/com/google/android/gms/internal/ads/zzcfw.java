package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
final class zzcfw extends android.webkit.WebView implements android.webkit.DownloadListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, com.google.android.gms.internal.ads.zzcex {
    public static final /* synthetic */ int zza = 0;
    private final java.lang.String zzA;
    private com.google.android.gms.internal.ads.zzcfz zzB;
    private boolean zzC;
    private boolean zzD;
    private com.google.android.gms.internal.ads.zzbfk zzE;
    private com.google.android.gms.internal.ads.zzbfi zzF;
    private com.google.android.gms.internal.ads.zzazx zzG;
    private int zzH;
    private int zzI;
    private com.google.android.gms.internal.ads.zzbcx zzJ;
    private final com.google.android.gms.internal.ads.zzbcx zzK;
    private com.google.android.gms.internal.ads.zzbcx zzL;
    private final com.google.android.gms.internal.ads.zzbcy zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzck zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private java.util.Map zzV;
    private final android.view.WindowManager zzW;
    private final com.google.android.gms.internal.ads.zzbbj zzX;
    private boolean zzY;
    private final com.google.android.gms.internal.ads.zzcgq zzb;
    private final com.google.android.gms.internal.ads.zzava zzc;
    private final com.google.android.gms.internal.ads.zzfcn zzd;
    private final com.google.android.gms.internal.ads.zzbds zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final android.util.DisplayMetrics zzi;
    private final float zzj;
    private com.google.android.gms.internal.ads.zzfbo zzk;
    private com.google.android.gms.internal.ads.zzfbr zzl;
    private boolean zzm;
    private boolean zzn;
    private com.google.android.gms.internal.ads.zzcff zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private com.google.android.gms.internal.ads.zzecr zzq;
    private com.google.android.gms.internal.ads.zzecp zzr;
    private com.google.android.gms.internal.ads.zzcgr zzs;
    private final java.lang.String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private java.lang.Boolean zzy;
    private boolean zzz;

    protected zzcfw(com.google.android.gms.internal.ads.zzcgq zzcgqVar, com.google.android.gms.internal.ads.zzcgr zzcgrVar, java.lang.String str, boolean z, boolean z2, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.internal.ads.zzbds zzbdsVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbda zzbdaVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, com.google.android.gms.internal.ads.zzbbj zzbbjVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar, com.google.android.gms.internal.ads.zzfcn zzfcnVar) {
        com.google.android.gms.internal.ads.zzfbr zzfbrVar2;
        super(zzcgqVar);
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzcgqVar;
        this.zzs = zzcgrVar;
        this.zzt = str;
        this.zzw = z;
        this.zzc = zzavaVar;
        this.zzd = zzfcnVar;
        this.zze = zzbdsVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.zzv.zzq();
        android.util.DisplayMetrics displayMetricsZzu = com.google.android.gms.ads.internal.util.zzs.zzu(windowManager);
        this.zzi = displayMetricsZzu;
        this.zzj = displayMetricsZzu.density;
        this.zzX = zzbbjVar;
        this.zzk = zzfboVar;
        this.zzl = zzfbrVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzck(zzcgqVar.zza(), this, this, null);
        this.zzY = false;
        setBackgroundColor(0);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlv)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        final android.webkit.WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlu)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzv.zzq().zzc(zzcgqVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzv.zzq();
        final android.content.Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcd.zza(context, new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.google.android.gms.internal.ads.zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
                java.lang.String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                android.webkit.WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaV)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return true;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzba();
        addJavascriptInterface(new com.google.android.gms.internal.ads.zzcgd(this, new com.google.android.gms.internal.ads.zzcgc(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        com.google.android.gms.internal.ads.zzbcy zzbcyVar = new com.google.android.gms.internal.ads.zzbcy(new com.google.android.gms.internal.ads.zzbda(true, "make_wv", this.zzt));
        this.zzM = zzbcyVar;
        zzbcyVar.zza().zzc(null);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue() && (zzfbrVar2 = this.zzl) != null && zzfbrVar2.zzb != null) {
            zzbcyVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbcyVar.zza();
        com.google.android.gms.internal.ads.zzbcx zzbcxVarZzf = com.google.android.gms.internal.ads.zzbda.zzf();
        this.zzK = zzbcxVarZzf;
        zzbcyVar.zzb("native:view_create", zzbcxVarZzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzcg.zza().zzb(zzcgqVar);
        com.google.android.gms.ads.internal.zzv.zzp().zzt();
    }

    private final synchronized void zzba() {
        com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzk;
        if (zzfboVar != null && zzfboVar.zzam) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Disabling hardware acceleration on an overlay.");
            zzbc();
            return;
        }
        if (!this.zzw && !this.zzs.zzi()) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbb() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzv.zzp().zzr();
    }

    private final synchronized void zzbc() {
        if (!this.zzx) {
            setLayerType(1, null);
        }
        this.zzx = true;
    }

    private final void zzbd(boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.pg.k, true != z ? "0" : "1");
        zzd("onAdVisibilityChanged", map);
    }

    private final synchronized void zzbe() {
        if (this.zzx) {
            setLayerType(0, null);
        }
        this.zzx = false;
    }

    private final synchronized void zzbf(java.lang.String str) {
        final java.lang.String str2 = com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE;
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcfr
                public final /* synthetic */ java.lang.String zzb = com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE;

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzaW(this.zzb);
                }
            });
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzbg() {
        com.google.android.gms.internal.ads.zzbcs.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        java.util.Map map = this.zzV;
        if (map != null) {
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.ads.zzcde) it.next()).release();
            }
        }
        this.zzV = null;
    }

    private final void zzbi() {
        com.google.android.gms.internal.ads.zzbcy zzbcyVar = this.zzM;
        if (zzbcyVar == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzbda zzbdaVarZza = zzbcyVar.zza();
        com.google.android.gms.internal.ads.zzbcq zzbcqVarZzg = com.google.android.gms.ads.internal.zzv.zzp().zzg();
        if (zzbcqVarZzg != null) {
            zzbcqVarZzg.zzf(zzbdaVarZza);
        }
    }

    private final synchronized void zzbj() {
        java.lang.Boolean boolZzl = com.google.android.gms.ads.internal.zzv.zzp().zzl();
        this.zzy = boolZzl;
        if (boolZzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaY(true);
            } catch (java.lang.IllegalStateException unused) {
                zzaY(false);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final synchronized void destroy() {
        zzbi();
        this.zzQ.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzb();
            this.zzp.zzm();
            this.zzp = null;
        }
        this.zzq = null;
        this.zzr = null;
        this.zzo.zzi();
        this.zzG = null;
        this.zzg = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzv) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzz().zzd(this);
        zzbh();
        this.zzv = true;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkF)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzX();
            return;
        }
        android.app.Activity activityZza = this.zzb.zza();
        if (activityZza != null && activityZza.isDestroyed()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzX();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzbf(com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE);
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final java.lang.String str, final android.webkit.ValueCallback valueCallback) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkG)).booleanValue() || android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            com.google.android.gms.internal.ads.zzbzw.zzf.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzaU(str, valueCallback);
                }
            });
        }
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            synchronized (this) {
                if (!this.zzv) {
                    this.zzo.zzi();
                    com.google.android.gms.ads.internal.zzv.zzz().zzd(this);
                    zzbh();
                    zzbb();
                }
            }
            super.finalize();
        } catch (java.lang.Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final synchronized void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final synchronized void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final synchronized void loadUrl(final java.lang.String str) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcft
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzaV(str);
                }
            });
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdWebViewImpl.loadUrl");
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.internal.ads.zzcff zzcffVar = this.zzo;
        if (zzcffVar != null) {
            zzcffVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaE()) {
            this.zzQ.zzc();
        }
        if (this.zzY) {
            onResume();
            this.zzY = false;
        }
        boolean z = this.zzC;
        com.google.android.gms.internal.ads.zzcff zzcffVar = this.zzo;
        if (zzcffVar != null && zzcffVar.zzU()) {
            if (!this.zzD) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = true;
            }
            zzaZ();
            z = true;
        }
        zzbd(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        com.google.android.gms.internal.ads.zzcff zzcffVar;
        synchronized (this) {
            if (!zzaE()) {
                this.zzQ.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzD && (zzcffVar = this.zzo) != null && zzcffVar.zzU() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = false;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setDataAndType(android.net.Uri.parse(str), str4);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkU)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzT(getContext(), intent);
        } catch (android.content.ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewImpl.onDownloadStart: ".concat(java.lang.String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        if (zzaE()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zZzaZ = zzaZ();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL == null || !zZzaZ) {
            return;
        }
        zzmVarZzL.zzn();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0082 A[Catch: all -> 0x01dd, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x000f, B:11:0x0015, B:13:0x0019, B:16:0x0023, B:18:0x002b, B:21:0x0030, B:23:0x0038, B:25:0x004a, B:28:0x004f, B:30:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:48:0x008c, B:42:0x007d, B:45:0x0082, B:51:0x0099, B:53:0x00a1, B:55:0x00b3, B:58:0x00b8, B:60:0x00d4, B:62:0x00dc, B:61:0x00d8, B:65:0x00e1, B:67:0x00e9, B:70:0x00f4, B:79:0x0118, B:81:0x011f, B:86:0x0127, B:88:0x0139, B:90:0x0147, B:94:0x0154, B:97:0x0159, B:99:0x019f, B:100:0x01a3, B:102:0x01aa, B:107:0x01b7, B:109:0x01bd, B:110:0x01c0, B:112:0x01c4, B:113:0x01cd, B:116:0x01d8), top: B:122:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (zzaE()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzf()) {
            if (this.zzs.zzh()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzs.zzj()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdV)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                com.google.android.gms.internal.ads.zzcfz zzcfzVarZzq = zzq();
                float fZze = zzcfzVarZzq != null ? zzcfzVarZzq.zze() : 0.0f;
                if (fZze == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = android.view.View.MeasureSpec.getSize(i);
                int size2 = android.view.View.MeasureSpec.getSize(i2);
                float f = size2 * fZze;
                int i7 = (int) (size / fZze);
                if (size2 != 0) {
                    i3 = (int) f;
                    if (size == 0) {
                        i6 = size;
                    } else if (i3 != 0) {
                        i7 = (int) (i3 / fZze);
                        i4 = size2;
                        i5 = i3;
                        i6 = i5;
                    }
                    i4 = size2;
                    i5 = i3;
                } else if (i7 != 0) {
                    i5 = (int) (i7 * fZze);
                    i6 = size;
                    i4 = i7;
                } else {
                    size2 = 0;
                    i3 = (int) f;
                    if (size == 0) {
                        i6 = size;
                    } else if (i3 != 0) {
                        i7 = (int) (i3 / fZze);
                        i4 = size2;
                        i5 = i3;
                        i6 = i5;
                    }
                    i4 = size2;
                    i5 = i3;
                }
                setMeasuredDimension(java.lang.Math.min(i5, i6), java.lang.Math.min(i7, i4));
                return;
            }
            if (this.zzs.zzg()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzea)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzag("/contentHeight", new com.google.android.gms.internal.ads.zzcfu(this));
                zzaT("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.zzi.density;
                int size3 = android.view.View.MeasureSpec.getSize(i);
                int i8 = this.zzI;
                setMeasuredDimension(size3, i8 != -1 ? (int) (i8 * f2) : android.view.View.MeasureSpec.getSize(i2));
                return;
            }
            if (this.zzs.zzi()) {
                android.util.DisplayMetrics displayMetrics = this.zzi;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = android.view.View.MeasureSpec.getMode(i);
            int size4 = android.view.View.MeasureSpec.getSize(i);
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            int size5 = android.view.View.MeasureSpec.getSize(i2);
            int i9 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i10 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            com.google.android.gms.internal.ads.zzcgr zzcgrVar = this.zzs;
            boolean z = zzcgrVar.zzb > i9 || zzcgrVar.zza > i10;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfs)).booleanValue()) {
                com.google.android.gms.internal.ads.zzcgr zzcgrVar2 = this.zzs;
                float f3 = zzcgrVar2.zzb;
                float f4 = this.zzj;
                z &= f3 / f4 <= ((float) i9) / f4 && ((float) zzcgrVar2.zza) / f4 <= ((float) i10) / f4;
            }
            if (!z) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.zzn) {
                    this.zzX.zzc(com.google.android.gms.games.GamesActivityResultCodes.RESULT_SIGN_IN_FAILED);
                    this.zzn = true;
                }
                com.google.android.gms.internal.ads.zzcgr zzcgrVar3 = this.zzs;
                setMeasuredDimension(zzcgrVar3.zzb, zzcgrVar3.zza);
                return;
            }
            com.google.android.gms.internal.ads.zzcgr zzcgrVar4 = this.zzs;
            float f5 = zzcgrVar4.zzb;
            float f6 = this.zzj;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Not enough space to show ad. Needs " + ((int) (f5 / f6)) + "x" + ((int) (zzcgrVar4.zza / f6)) + " dp, but only has " + ((int) (size4 / f6)) + "x" + ((int) (size5 / f6)) + " dp.");
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.zzm) {
                return;
            }
            this.zzX.zzc(com.google.android.gms.games.GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED);
            this.zzm = true;
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void onPause() {
        if (zzaE()) {
            return;
        }
        try {
            super.onPause();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmu)).booleanValue() && androidx.webkit.WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Muting webview");
                androidx.webkit.WebViewCompat.setAudioMuted(this, true);
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not pause webview.", e);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmx)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void onResume() {
        if (zzaE()) {
            return;
        }
        try {
            super.onResume();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmu)).booleanValue() && androidx.webkit.WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Unmuting webview");
                androidx.webkit.WebViewCompat.setAudioMuted(this, false);
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not resume webview.", e);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmx)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdD)).booleanValue() && this.zzo.zzR();
        if ((!this.zzo.zzU() || this.zzo.zzS()) && !z) {
            com.google.android.gms.internal.ads.zzava zzavaVar = this.zzc;
            if (zzavaVar != null) {
                zzavaVar.zzd(motionEvent);
            }
            com.google.android.gms.internal.ads.zzbds zzbdsVar = this.zze;
            if (zzbdsVar != null) {
                zzbdsVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                com.google.android.gms.internal.ads.zzbfk zzbfkVar = this.zzE;
                if (zzbfkVar != null) {
                    zzbfkVar.zzd(motionEvent);
                }
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void setWebViewClient(android.webkit.WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof com.google.android.gms.internal.ads.zzcff) {
            this.zzo = (com.google.android.gms.internal.ads.zzcff) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzA(int i) {
        this.zzN = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzC(com.google.android.gms.internal.ads.zzcfz zzcfzVar) {
        if (this.zzB != null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzB = zzcfzVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzceo
    public final com.google.android.gms.internal.ads.zzfbo zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final android.content.Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgm
    public final android.view.View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final android.webkit.WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final android.webkit.WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgk
    public final com.google.android.gms.internal.ads.zzava zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized com.google.android.gms.internal.ads.zzazx zzJ() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized com.google.android.gms.internal.ads.zzbfk zzK() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final /* synthetic */ com.google.android.gms.internal.ads.zzcgp zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgj
    public final synchronized com.google.android.gms.internal.ads.zzcgr zzO() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized com.google.android.gms.internal.ads.zzecp zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized com.google.android.gms.internal.ads.zzecr zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcga
    public final com.google.android.gms.internal.ads.zzfbr zzR() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.android.gms.internal.ads.zzfcn zzS() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.common.util.concurrent.ListenableFuture zzT() {
        com.google.android.gms.internal.ads.zzbds zzbdsVar = this.zze;
        return zzbdsVar == null ? com.google.android.gms.internal.ads.zzgch.zzh(null) : zzbdsVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized java.lang.String zzU() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final java.util.List zzV() {
        return new java.util.ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzW(com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar) {
        this.zzk = zzfboVar;
        this.zzl = zzfbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzX() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcfv(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzY() {
        zzbg();
        java.util.HashMap map = new java.util.HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzZ(int i) {
        if (i == 0) {
            com.google.android.gms.internal.ads.zzbcy zzbcyVar = this.zzM;
            com.google.android.gms.internal.ads.zzbcs.zza(zzbcyVar.zza(), this.zzK, "aebb2");
        }
        zzbg();
        this.zzM.zza();
        this.zzM.zza().zzd("close_type", java.lang.String.valueOf(i));
        java.util.HashMap map = new java.util.HashMap(2);
        map.put("closetype", java.lang.String.valueOf(i));
        map.put("version", this.zzf.afmaVersion);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zza(java.lang.String str) {
        zzaT(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaA(java.lang.String str, com.google.android.gms.common.util.Predicate predicate) {
        com.google.android.gms.internal.ads.zzcff zzcffVar = this.zzo;
        if (zzcffVar != null) {
            zzcffVar.zzQ(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaD(final boolean z, final int i) {
        destroy();
        this.zzX.zzb(new com.google.android.gms.internal.ads.zzbbi() { // from class: com.google.android.gms.internal.ads.zzcfs
            @Override // com.google.android.gms.internal.ads.zzbbi
            public final void zza(com.google.android.gms.internal.ads.zzbbq.zzt.zza zzaVar) {
                int i2 = com.google.android.gms.internal.ads.zzcfw.zza;
                com.google.android.gms.internal.ads.zzbbq.zzbl.zza zzaVarZzb = com.google.android.gms.internal.ads.zzbbq.zzbl.zzb();
                boolean zZzf = zzaVarZzb.zzf();
                boolean z2 = z;
                if (zZzf != z2) {
                    zzaVarZzb.zzd(z2);
                }
                zzaVarZzb.zze(i);
                zzaVar.zzab(zzaVarZzb.zzbr());
            }
        });
        this.zzX.zzc(com.google.android.gms.games.GamesActivityResultCodes.RESULT_LICENSE_FAILED);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, java.lang.String str) {
        this.zzo.zzv(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaK(java.lang.String str, java.lang.String str2, int i) {
        this.zzo.zzw(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaL(boolean z, int i, boolean z2) {
        this.zzo.zzx(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaM(boolean z, int i, java.lang.String str, java.lang.String str2, boolean z2) {
        this.zzo.zzz(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaN(boolean z, int i, java.lang.String str, boolean z2, boolean z3) {
        this.zzo.zzA(z, i, str, z2, z3);
    }

    public final com.google.android.gms.internal.ads.zzcff zzaO() {
        return this.zzo;
    }

    final synchronized java.lang.Boolean zzaP() {
        return this.zzy;
    }

    protected final synchronized void zzaS(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    protected final void zzaT(java.lang.String str) {
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()) {
            zzaX("javascript:".concat(str));
            return;
        }
        if (zzaP() == null) {
            zzbj();
        }
        if (zzaP().booleanValue()) {
            zzaS(str, null);
        } else {
            zzaX("javascript:".concat(str));
        }
    }

    final /* synthetic */ void zzaU(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    final /* synthetic */ void zzaV(java.lang.String str) {
        super.loadUrl(str);
    }

    final /* synthetic */ void zzaW(java.lang.String str) {
        super.loadUrl(com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE);
    }

    protected final synchronized void zzaX(java.lang.String str) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    final void zzaY(java.lang.Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzy(bool);
    }

    public final boolean zzaZ() {
        int i;
        int iZzv;
        if (this.zzo.zzT() || this.zzo.zzU()) {
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            android.util.DisplayMetrics displayMetrics = this.zzi;
            int iZzv2 = com.google.android.gms.ads.internal.util.client.zzf.zzv(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            android.util.DisplayMetrics displayMetrics2 = this.zzi;
            int iZzv3 = com.google.android.gms.ads.internal.util.client.zzf.zzv(displayMetrics2, displayMetrics2.heightPixels);
            android.app.Activity activityZza = this.zzb.zza();
            if (activityZza == null || activityZza.getWindow() == null) {
                i = iZzv2;
                iZzv = iZzv3;
            } else {
                com.google.android.gms.ads.internal.zzv.zzq();
                int[] iArrZzQ = com.google.android.gms.ads.internal.util.zzs.zzQ(activityZza);
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                int iZzv4 = com.google.android.gms.ads.internal.util.client.zzf.zzv(this.zzi, iArrZzQ[0]);
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                iZzv = com.google.android.gms.ads.internal.util.client.zzf.zzv(this.zzi, iArrZzQ[1]);
                i = iZzv4;
            }
            int i2 = this.zzS;
            if (i2 != iZzv2 || this.zzR != iZzv3 || this.zzT != i || this.zzU != iZzv) {
                boolean z = (i2 == iZzv2 && this.zzR == iZzv3) ? false : true;
                this.zzS = iZzv2;
                this.zzR = iZzv3;
                this.zzT = i;
                this.zzU = iZzv;
                new com.google.android.gms.internal.ads.zzbsi(this, "").zzj(iZzv2, iZzv3, i, iZzv, this.zzi.density, this.zzW.getDefaultDisplay().getRotation());
                return z;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaa() {
        if (this.zzJ == null) {
            com.google.android.gms.internal.ads.zzbcy zzbcyVar = this.zzM;
            com.google.android.gms.internal.ads.zzbcs.zza(zzbcyVar.zza(), this.zzK, "aes2");
            this.zzM.zza();
            com.google.android.gms.internal.ads.zzbcx zzbcxVarZzf = com.google.android.gms.internal.ads.zzbda.zzf();
            this.zzJ = zzbcxVarZzf;
            this.zzM.zzb("native:view_show", zzbcxVarZzf);
        }
        java.util.HashMap map = new java.util.HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zzd("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzab() {
        java.util.HashMap map = new java.util.HashMap(3);
        map.put("app_muted", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzv.zzs().zze()));
        map.put("app_volume", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzv.zzs().zza()));
        map.put("device_volume", java.lang.String.valueOf(com.google.android.gms.ads.internal.util.zzab.zzb(getContext())));
        zzd("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzac(boolean z) {
        this.zzo.zzj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzad() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzae(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        java.lang.String[] strArr = new java.lang.String[1];
        java.lang.String str5 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzab);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put(com.unity3d.services.core.di.ServiceProvider.NAMED_SDK, "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, com.google.android.gms.internal.ads.zzcgi.zzb(str2, strArr), "text/html", com.adjust.sdk.Constants.ENCODING, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaf() {
        if (this.zzL == null) {
            this.zzM.zza();
            com.google.android.gms.internal.ads.zzbcx zzbcxVarZzf = com.google.android.gms.internal.ads.zzbda.zzf();
            this.zzL = zzbcxVarZzf;
            this.zzM.zzb("native:view_load", zzbcxVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzag(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        com.google.android.gms.internal.ads.zzcff zzcffVar = this.zzo;
        if (zzcffVar != null) {
            zzcffVar.zzB(str, zzbjpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzah() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzaj(com.google.android.gms.internal.ads.zzcgr zzcgrVar) {
        this.zzs = zzcgrVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzak(com.google.android.gms.internal.ads.zzazx zzazxVar) {
        this.zzG = zzazxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzal(boolean z) {
        this.zzz = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzan(android.content.Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzao(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzy(this.zzo.zzT(), z);
        } else {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzap(com.google.android.gms.internal.ads.zzbfi zzbfiVar) {
        this.zzF = zzbfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzaq(boolean z) {
        boolean z2 = this.zzw;
        this.zzw = z;
        zzba();
        if (z != z2) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzac)).booleanValue() || !this.zzs.zzi()) {
                new com.google.android.gms.internal.ads.zzbsi(this, "").zzl(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzar(com.google.android.gms.internal.ads.zzbfk zzbfkVar) {
        this.zzE = zzbfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzas(com.google.android.gms.internal.ads.zzecp zzecpVar) {
        this.zzr = zzecpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzat(com.google.android.gms.internal.ads.zzecr zzecrVar) {
        this.zzq = zzecrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzau(int i) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzav(boolean z) {
        this.zzY = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzax(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i = this.zzH + (true != z ? -1 : 1);
        this.zzH = i;
        if (i > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzE();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:8:0x000b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x0007, B:8:0x000b), top: B:16:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0010, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzay(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        if (!z) {
            zzmVar = this.zzp;
            if (zzmVar != null) {
                zzmVar.zzB(z);
                return;
            }
            return;
        }
        setBackgroundColor(0);
        zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzB(z);
            return;
        }
        return;
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaz(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        com.google.android.gms.internal.ads.zzcff zzcffVar = this.zzo;
        if (zzcffVar != null) {
            zzcffVar.zzP(str, zzbjpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zzb(java.lang.String str, java.lang.String str2) {
        zzaT(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzd(java.lang.String str, java.util.Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(map));
        } catch (org.json.JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        com.google.android.gms.internal.ads.zzcff zzcffVar = this.zzo;
        if (zzcffVar != null) {
            zzcffVar.zzdd();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzde() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzde();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdf() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzdg() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(com.google.android.gms.internal.ads.zzayj zzayjVar) {
        synchronized (this) {
            this.zzC = zzayjVar.zzj;
        }
        zzbd(zzayjVar.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zze(java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String string = jSONObject.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzaT(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbs
    public final android.app.Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.internal.ads.zzbcx zzk() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zzl(java.lang.String str, org.json.JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.internal.ads.zzbcy zzm() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.internal.ads.zzcbh zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized com.google.android.gms.internal.ads.zzcde zzp(java.lang.String str) {
        java.util.Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (com.google.android.gms.internal.ads.zzcde) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final synchronized com.google.android.gms.internal.ads.zzcfz zzq() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized java.lang.String zzr() {
        com.google.android.gms.internal.ads.zzfbr zzfbrVar = this.zzl;
        if (zzfbrVar == null) {
            return null;
        }
        return zzfbrVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized java.lang.String zzs() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzt(java.lang.String str, com.google.android.gms.internal.ads.zzcde zzcdeVar) {
        if (this.zzV == null) {
            this.zzV = new java.util.HashMap();
        }
        this.zzV.put(str, zzcdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        com.google.android.gms.internal.ads.zzcff zzcffVar = this.zzo;
        if (zzcffVar != null) {
            zzcffVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzv(boolean z, long j) {
        java.util.HashMap map = new java.util.HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put("duration", java.lang.Long.toString(j));
        zzd("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzw() {
        com.google.android.gms.internal.ads.zzbfi zzbfiVar = this.zzF;
        if (zzbfiVar != null) {
            final com.google.android.gms.internal.ads.zzdmm zzdmmVar = (com.google.android.gms.internal.ads.zzdmm) zzbfiVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdmk
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdmmVar.zzd();
                    } catch (android.os.RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzz(boolean z) {
        this.zzo.zzE(false);
    }
}
