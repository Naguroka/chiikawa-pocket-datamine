package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzm extends com.google.android.gms.internal.ads.zzbtd implements com.google.android.gms.ads.internal.overlay.zzag {
    static final int zza = android.graphics.Color.argb(0, 0, 0, 0);
    protected final android.app.Activity zzb;
    com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zzc;
    com.google.android.gms.internal.ads.zzcex zzd;
    com.google.android.gms.ads.internal.overlay.zzi zze;
    com.google.android.gms.ads.internal.overlay.zzu zzf;
    android.widget.FrameLayout zzh;
    android.webkit.WebChromeClient.CustomViewCallback zzi;
    com.google.android.gms.ads.internal.overlay.zzh zzl;
    private java.lang.Runnable zzq;
    private boolean zzr;
    private boolean zzs;
    private android.widget.Toolbar zzw;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final java.lang.Object zzo = new java.lang.Object();
    private final android.view.View.OnClickListener zzp = new com.google.android.gms.ads.internal.overlay.zzf(this);
    private boolean zzt = false;
    private boolean zzu = false;
    private boolean zzv = true;

    public zzm(android.app.Activity activity) {
        this.zzb = activity;
    }

    private final void zzJ(android.view.View view) {
        com.google.android.gms.internal.ads.zzecr zzecrVarZzQ;
        com.google.android.gms.internal.ads.zzecp zzecpVarZzP;
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzd;
        if (zzcexVar == null) {
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzff)).booleanValue() && (zzecpVarZzP = zzcexVar.zzP()) != null) {
            zzecpVarZzP.zza(view);
        } else if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfe)).booleanValue() && (zzecrVarZzQ = zzcexVar.zzQ()) != null && zzecrVarZzQ.zzb()) {
            com.google.android.gms.ads.internal.zzv.zzB().zzg(zzecrVarZzQ.zza(), view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    private final void zzK(android.content.res.Configuration configuration) {
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        int i;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || (zzlVar2 = adOverlayInfoParcel2.zzo) == null || !zzlVar2.zzb) ? false : true;
        boolean zZzd = com.google.android.gms.ads.internal.zzv.zzr().zzd(this.zzb, configuration);
        if (!this.zzk || z3) {
            if (zZzd) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaP)).booleanValue()) {
                    z = false;
                }
            }
            adOverlayInfoParcel = this.zzc;
            if (adOverlayInfoParcel != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzg) {
                z2 = true;
            }
        } else if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaQ)).booleanValue()) {
            if (zZzd) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaP)).booleanValue()) {
                    z = false;
                }
            }
            adOverlayInfoParcel = this.zzc;
            if (adOverlayInfoParcel != null) {
                z2 = true;
            }
        } else {
            z = false;
        }
        android.view.Window window = this.zzb.getWindow();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbn)).booleanValue()) {
            android.view.View decorView = window.getDecorView();
            if (z) {
                i = z2 ? 5894 : 5380;
            } else {
                i = 256;
            }
            decorView.setSystemUiVisibility(i);
            return;
        }
        if (!z) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z2) {
            window.getDecorView().setSystemUiVisibility(androidx.core.view.InputDeviceCompat.SOURCE_TOUCHSCREEN);
        }
    }

    private static final void zzL(com.google.android.gms.internal.ads.zzecr zzecrVar, android.view.View view) {
        if (zzecrVar == null || view == null) {
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfe)).booleanValue() && zzecrVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzB().zzj(zzecrVar.zza(), view);
    }

    public final void zzA(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfQ)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfR)).intValue()) {
                if (android.os.Build.VERSION.SDK_INT >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfS)).intValue()) {
                    if (android.os.Build.VERSION.SDK_INT <= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfT)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzC(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzs = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    protected final void zzD(boolean z) throws com.google.android.gms.ads.internal.overlay.zzg {
        boolean z2;
        if (!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        android.view.Window window = this.zzb.getWindow();
        if (window == null) {
            throw new com.google.android.gms.ads.internal.overlay.zzg("Invalid activity, no window available.");
        }
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzc.zzd;
        com.google.android.gms.internal.ads.zzcgp zzcgpVarZzN = zzcexVar != null ? zzcexVar.zzN() : null;
        boolean z3 = zzcgpVarZzN != null && zzcgpVarZzN.zzT();
        this.zzm = false;
        if (z3) {
            int i = this.zzc.zzj;
            if (i == 6) {
                z2 = this.zzb.getResources().getConfiguration().orientation == 1;
                this.zzm = z2;
            } else if (i == 7) {
                z2 = this.zzb.getResources().getConfiguration().orientation == 2;
                this.zzm = z2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Delay onShow to next orientation change: " + z2);
        zzA(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.client.zzo.zze("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
            this.zzl.setBackgroundColor(zza);
        } else {
            this.zzl.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        }
        this.zzb.setContentView(this.zzl);
        this.zzs = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzv.zzA();
                android.app.Activity activity = this.zzb;
                com.google.android.gms.internal.ads.zzcex zzcexVar2 = this.zzc.zzd;
                com.google.android.gms.internal.ads.zzcgr zzcgrVarZzO = zzcexVar2 != null ? zzcexVar2.zzO() : null;
                com.google.android.gms.internal.ads.zzcex zzcexVar3 = this.zzc.zzd;
                java.lang.String strZzU = zzcexVar3 != null ? zzcexVar3.zzU() : null;
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                com.google.android.gms.internal.ads.zzcex zzcexVar4 = adOverlayInfoParcel.zzd;
                com.google.android.gms.internal.ads.zzcex zzcexVarZza = com.google.android.gms.internal.ads.zzcfk.zza(activity, zzcgrVarZzO, strZzU, true, z3, null, null, versionInfoParcel, null, null, zzcexVar4 != null ? zzcexVar4.zzj() : null, com.google.android.gms.internal.ads.zzbbj.zza(), null, null, null, null);
                this.zzd = zzcexVarZza;
                com.google.android.gms.internal.ads.zzcgp zzcgpVarZzN2 = zzcexVarZza.zzN();
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                com.google.android.gms.internal.ads.zzbif zzbifVar = adOverlayInfoParcel2.zzp;
                com.google.android.gms.internal.ads.zzbih zzbihVar = adOverlayInfoParcel2.zze;
                com.google.android.gms.ads.internal.overlay.zzac zzacVar = adOverlayInfoParcel2.zzi;
                com.google.android.gms.internal.ads.zzcex zzcexVar5 = adOverlayInfoParcel2.zzd;
                zzcgpVarZzN2.zzV(null, zzbifVar, null, zzbihVar, zzacVar, true, null, zzcexVar5 != null ? zzcexVar5.zzN().zzd() : null, null, null, null, null, null, null, null, null, null, null, null);
                this.zzd.zzN().zzC(new com.google.android.gms.internal.ads.zzcgn() { // from class: com.google.android.gms.ads.internal.overlay.zze
                    @Override // com.google.android.gms.internal.ads.zzcgn
                    public final void zza(boolean z4, int i2, java.lang.String str, java.lang.String str2) {
                        com.google.android.gms.internal.ads.zzcex zzcexVar6 = this.zza.zzd;
                        if (zzcexVar6 != null) {
                            zzcexVar6.zzaa();
                        }
                    }
                });
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                java.lang.String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.zzd.loadUrl(str);
                } else {
                    java.lang.String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new com.google.android.gms.ads.internal.overlay.zzg("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", com.adjust.sdk.Constants.ENCODING, null);
                }
                com.google.android.gms.internal.ads.zzcex zzcexVar6 = this.zzc.zzd;
                if (zzcexVar6 != null) {
                    zzcexVar6.zzaw(this);
                }
            } catch (java.lang.Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error obtaining webview.", e);
                throw new com.google.android.gms.ads.internal.overlay.zzg("Could not obtain webview for the overlay.", e);
            }
        } else {
            com.google.android.gms.internal.ads.zzcex zzcexVar7 = this.zzc.zzd;
            this.zzd = zzcexVar7;
            zzcexVar7.zzan(this.zzb);
        }
        if (this.zzc.zzw) {
            android.webkit.CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.zzG(), false);
        }
        this.zzd.zzai(this);
        com.google.android.gms.internal.ads.zzcex zzcexVar8 = this.zzc.zzd;
        if (zzcexVar8 != null) {
            zzL(zzcexVar8.zzQ(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            android.view.ViewParent parent = this.zzd.getParent();
            if (parent != null && (parent instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) parent).removeView(this.zzd.zzF());
            }
            if (this.zzk) {
                this.zzd.zzam();
            }
            if (this.zzc.zzw) {
                android.widget.Toolbar toolbar = new android.widget.Toolbar(this.zzb);
                this.zzw = toolbar;
                toolbar.setId(android.view.View.generateViewId());
                this.zzd.zzF().setId(android.view.View.generateViewId());
                this.zzw.setBackgroundColor(-12303292);
                this.zzw.setVisibility(0);
                try {
                    this.zzw.setNavigationIcon(com.google.android.gms.ads.internal.zzv.zzp().zze().getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_cross, null));
                } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", e2);
                }
                this.zzw.setNavigationOnClickListener(this.zzp);
                this.zzw.setTitleMarginStart(0);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.zzl.addView(this.zzw, layoutParams);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.zzw.getId());
                layoutParams2.addRule(12);
                this.zzl.addView(this.zzd.zzF(), layoutParams2);
                zzJ(this.zzw);
            } else {
                this.zzl.addView(this.zzd.zzF(), -1, -1);
            }
        }
        if (!z && !this.zzm) {
            zze();
        }
        if (this.zzc.zzk != 5) {
            zzw(z3);
            if (this.zzd.zzaB()) {
                zzy(z3, true);
                return;
            }
            return;
        }
        android.app.Activity activity2 = this.zzb;
        com.google.android.gms.internal.ads.zzebw zzebwVarZze = com.google.android.gms.internal.ads.zzebx.zze();
        zzebwVarZze.zza(activity2);
        zzebwVarZze.zzb(this);
        zzebwVarZze.zzc(this.zzc.zzq);
        zzebwVarZze.zzd(this.zzc.zzr);
        try {
            zzf(zzebwVarZze.zze());
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.overlay.zzg e3) {
            throw new com.google.android.gms.ads.internal.overlay.zzg(e3.getMessage(), e3);
        }
    }

    public final void zzE() {
        synchronized (this.zzo) {
            this.zzr = true;
            if (this.zzq != null) {
                com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzq);
                com.google.android.gms.ads.internal.util.zzs.zza.post(this.zzq);
            }
        }
    }

    protected final void zzF() {
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        if (!this.zzb.isFinishing() || this.zzt) {
            return;
        }
        this.zzt = true;
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzd;
        if (zzcexVar != null) {
            zzcexVar.zzZ(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzr && this.zzd.zzaC()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeQ)).booleanValue() && !this.zzu && (adOverlayInfoParcel = this.zzc) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                        zzrVar.zzdo();
                    }
                    this.zzq = new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzc();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this.zzq, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbg)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    public final void zzG(java.lang.String str) {
        android.widget.Toolbar toolbar = this.zzw;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzH() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zZzaH = this.zzd.zzaH();
        if (!zZzaH) {
            this.zzd.zzd("onbackblocked", java.util.Collections.emptyMap());
        }
        return zZzaH;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzd;
        if (zzcexVar != null) {
            zzcexVar.zzai(null);
        }
    }

    final void zzc() {
        com.google.android.gms.internal.ads.zzcex zzcexVar;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        if (this.zzu) {
            return;
        }
        this.zzu = true;
        com.google.android.gms.internal.ads.zzcex zzcexVar2 = this.zzd;
        if (zzcexVar2 != null) {
            this.zzl.removeView(zzcexVar2.zzF());
            com.google.android.gms.ads.internal.overlay.zzi zziVar = this.zze;
            if (zziVar != null) {
                this.zzd.zzan(zziVar.zzd);
                this.zzd.zzaq(false);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmz)).booleanValue() && this.zzd.getParent() != null) {
                    ((android.view.ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzF());
                }
                android.view.ViewGroup viewGroup = this.zze.zzc;
                android.view.View viewZzF = this.zzd.zzF();
                com.google.android.gms.ads.internal.overlay.zzi zziVar2 = this.zze;
                viewGroup.addView(viewZzF, zziVar2.zza, zziVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzan(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzds(this.zzn);
        }
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcexVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzcexVar.zzQ(), this.zzc.zzd.zzF());
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    protected final void zze() {
        this.zzd.zzaa();
    }

    public final void zzf(com.google.android.gms.internal.ads.zzebx zzebxVar) throws android.os.RemoteException, com.google.android.gms.ads.internal.overlay.zzg {
        com.google.android.gms.internal.ads.zzbsx zzbsxVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbsxVar = adOverlayInfoParcel.zzv) == null) {
            throw new com.google.android.gms.ads.internal.overlay.zzg("noioou");
        }
        zzbsxVar.zzg(com.google.android.gms.dynamic.ObjectWrapper.wrap(zzebxVar));
    }

    public final void zzg() {
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzs = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzh(int i, int i2, android.content.Intent intent) {
        com.google.android.gms.internal.ads.zzdrw zzdrwVarZze;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmV)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Callback from intent launch with requestCode: 236 and resultCode: " + i2);
                com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzd;
                if (zzcexVar == null || zzcexVar.zzN() == null || (zzdrwVarZze = zzcexVar.zzN().zze()) == null || (adOverlayInfoParcel = this.zzc) == null) {
                    return;
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmV)).booleanValue()) {
                    com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = zzdrwVarZze.zza();
                    zzdrvVarZza.zzb("action", "hilca");
                    zzdrvVarZza.zzb("gqi", com.google.android.gms.internal.ads.zzfve.zzc(adOverlayInfoParcel.zzq));
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(i2);
                    zzdrvVarZza.zzb("hilr", sb.toString());
                    if (i2 == -1 && intent != null) {
                        java.lang.String stringExtra = intent.getStringExtra("callerPackage");
                        java.lang.String stringExtra2 = intent.getStringExtra("loadingStage");
                        if (stringExtra != null) {
                            zzdrvVarZza.zzb("hilcp", stringExtra);
                        }
                        if (stringExtra2 != null) {
                            zzdrvVarZza.zzb("hills", stringExtra2);
                        }
                    }
                    zzdrvVarZza.zzf();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzi() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzag
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        zzK((android.content.res.Configuration) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public void zzl(android.os.Bundle bundle) {
        if (!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcelZza = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new com.google.android.gms.ads.internal.overlay.zzg("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    this.zzb.setShowWhenLocked(true);
                } else {
                    this.zzb.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzn = 4;
            }
            if (this.zzb.getIntent() != null) {
                this.zzv = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.zzo;
            if (zzlVar != null) {
                boolean z = zzlVar.zza;
                this.zzk = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzlVar.zzf != -1) {
                        new com.google.android.gms.ads.internal.overlay.zzk(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new com.google.android.gms.ads.internal.overlay.zzk(this, null).zzb();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzv) {
                    com.google.android.gms.internal.ads.zzcwg zzcwgVar = this.zzc.zzt;
                    if (zzcwgVar != null) {
                        zzcwgVar.zze();
                    }
                    com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc.zzc;
                    if (zzrVar != null) {
                        zzrVar.zzdp();
                    }
                }
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    com.google.android.gms.internal.ads.zzdds zzddsVar = this.zzc.zzu;
                    if (zzddsVar != null) {
                        zzddsVar.zzdd();
                    }
                }
            }
            android.app.Activity activity = this.zzb;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            com.google.android.gms.ads.internal.overlay.zzh zzhVar = new com.google.android.gms.ads.internal.overlay.zzh(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.afmaVersion, adOverlayInfoParcel3.zzs);
            this.zzl = zzhVar;
            zzhVar.setId(1000);
            com.google.android.gms.ads.internal.zzv.zzr().zzk(this.zzb);
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            int i = adOverlayInfoParcel4.zzk;
            if (i == 1) {
                zzD(false);
                return;
            }
            if (i == 2) {
                this.zze = new com.google.android.gms.ads.internal.overlay.zzi(adOverlayInfoParcel4.zzd);
                zzD(false);
            } else if (i == 3) {
                zzD(true);
            } else {
                if (i != 5) {
                    throw new com.google.android.gms.ads.internal.overlay.zzg("Could not determine ad overlay type.");
                }
                zzD(false);
            }
        } catch (com.google.android.gms.ads.internal.overlay.zzg e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(e.getMessage());
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzm() {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzd;
        if (zzcexVar != null) {
            try {
                this.zzl.removeView(zzcexVar.zzF());
            } catch (java.lang.NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzo() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        zzg();
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdi();
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeS)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzp(int i, java.lang.String[] strArr, int[] iArr) {
        if (i == 12345) {
            android.app.Activity activity = this.zzb;
            com.google.android.gms.internal.ads.zzebw zzebwVarZze = com.google.android.gms.internal.ads.zzebx.zze();
            zzebwVarZze.zza(activity);
            zzebwVarZze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzf(strArr, iArr, com.google.android.gms.dynamic.ObjectWrapper.wrap(zzebwVarZze.zze()));
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzr() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdE();
        }
        zzK(this.zzb.getResources().getConfiguration());
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeS)).booleanValue()) {
            return;
        }
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzd;
        if (zzcexVar == null || zzcexVar.zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzs(android.os.Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzt() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeS)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzd;
            if (zzcexVar == null || zzcexVar.zzaE()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzu() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeS)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzv() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdr();
    }

    public final void zzw(boolean z) {
        if (this.zzc.zzw) {
            return;
        }
        int iIntValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeV)).intValue();
        boolean z2 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbj)).booleanValue() || z;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = new com.google.android.gms.ads.internal.overlay.zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z2 ? 0 : iIntValue;
        zztVar.zzb = true != z2 ? iIntValue : 0;
        zztVar.zzc = iIntValue;
        this.zzf = new com.google.android.gms.ads.internal.overlay.zzu(this.zzb, zztVar, this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzy(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzJ(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzx() {
        this.zzs = true;
    }

    public final void zzy(boolean z, boolean z2) {
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z3 = true;
        boolean z4 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbh)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z5 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbi)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z && z2 && z4 && !z5) {
            new com.google.android.gms.internal.ads.zzbsi(this.zzd, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.zzf;
        if (zzuVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzuVar.zzb(z3);
        }
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }
}
