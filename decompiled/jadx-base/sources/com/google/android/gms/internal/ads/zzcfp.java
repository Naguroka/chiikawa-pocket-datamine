package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcfp extends android.widget.FrameLayout implements com.google.android.gms.internal.ads.zzcex {
    private final com.google.android.gms.internal.ads.zzcex zza;
    private final com.google.android.gms.internal.ads.zzcbh zzb;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcfp(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        super(zzcexVar.getContext());
        this.zzc = new java.util.concurrent.atomic.AtomicBoolean();
        this.zza = zzcexVar;
        this.zzb = new com.google.android.gms.internal.ads.zzcbh(zzcexVar.zzE(), this, this);
        addView((android.view.View) zzcexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void destroy() {
        final com.google.android.gms.internal.ads.zzecp zzecpVarZzP;
        final com.google.android.gms.internal.ads.zzecr zzecrVarZzQ = zzQ();
        if (zzecrVarZzQ != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfm
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzv.zzB().zzi(zzecrVarZzQ.zza());
                }
            });
            com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
            com.google.android.gms.internal.ads.zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
            java.util.Objects.requireNonNull(zzcexVar);
            zzfqwVar.postDelayed(new com.google.android.gms.internal.ads.zzcfl(zzcexVar), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfd)).intValue());
            return;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzff)).booleanValue() || (zzecpVarZzP = zzP()) == null) {
            this.zza.destroy();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcfn
                @Override // java.lang.Runnable
                public final void run() {
                    zzecpVarZzP.zzf(new com.google.android.gms.internal.ads.zzcfo(this.zza));
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", com.adjust.sdk.Constants.ENCODING, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void loadUrl(java.lang.String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcex
    public final void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcex
    public final void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void setWebChromeClient(android.webkit.WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void setWebViewClient(android.webkit.WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzA(int i) {
        this.zza.zzA(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzB(int i) {
        this.zzb.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final void zzC(com.google.android.gms.internal.ads.zzcfz zzcfzVar) {
        this.zza.zzC(zzcfzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzceo
    public final com.google.android.gms.internal.ads.zzfbo zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final android.content.Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgm
    public final android.view.View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final android.webkit.WebView zzG() {
        return (android.webkit.WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final android.webkit.WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgk
    public final com.google.android.gms.internal.ads.zzava zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.android.gms.internal.ads.zzazx zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.android.gms.internal.ads.zzbfk zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.android.gms.internal.ads.zzcgp zzN() {
        return ((com.google.android.gms.internal.ads.zzcfw) this.zza).zzaO();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgj
    public final com.google.android.gms.internal.ads.zzcgr zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.android.gms.internal.ads.zzecp zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.android.gms.internal.ads.zzecr zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcga
    public final com.google.android.gms.internal.ads.zzfbr zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.android.gms.internal.ads.zzfcn zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.common.util.concurrent.ListenableFuture zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final java.lang.String zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final java.util.List zzV() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzW(com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar) {
        this.zza.zzW(zzfboVar, zzfbrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzY() {
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzZ(int i) {
        this.zza.zzZ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zza(java.lang.String str) {
        ((com.google.android.gms.internal.ads.zzcfw) this.zza).zzaT(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaA(java.lang.String str, com.google.android.gms.common.util.Predicate predicate) {
        this.zza.zzaA(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaD(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaW)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) this.zza.getParent()).removeView((android.view.View) this.zza);
        }
        this.zza.zzaD(z, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaG() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    final /* synthetic */ void zzaI(boolean z) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
        com.google.android.gms.internal.ads.zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        java.util.Objects.requireNonNull(zzcexVar);
        zzfqwVar.post(new com.google.android.gms.internal.ads.zzcfl(zzcexVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, java.lang.String str) {
        this.zza.zzaJ(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaK(java.lang.String str, java.lang.String str2, int i) {
        this.zza.zzaK(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaL(boolean z, int i, boolean z2) {
        this.zza.zzaL(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaM(boolean z, int i, java.lang.String str, java.lang.String str2, boolean z2) {
        this.zza.zzaM(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaN(boolean z, int i, java.lang.String str, boolean z2, boolean z3) {
        this.zza.zzaN(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzab() {
        this.zza.zzab();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzac(boolean z) {
        this.zza.zzac(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzad() {
        this.zza.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzae(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza.zzae(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaf() {
        this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzag(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        this.zza.zzag(str, zzbjpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzah() {
        com.google.android.gms.internal.ads.zzecr zzecrVarZzQ;
        com.google.android.gms.internal.ads.zzecp zzecpVarZzP;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        com.google.android.gms.ads.internal.zzv.zzq();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzz());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new android.widget.FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzff)).booleanValue() && (zzecpVarZzP = zzP()) != null) {
            zzecpVarZzP.zza(textView);
        } else if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfe)).booleanValue() && (zzecrVarZzQ = zzQ()) != null && zzecrVarZzQ.zzb()) {
            com.google.android.gms.ads.internal.zzv.zzB().zzg(zzecrVarZzQ.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzai(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaj(com.google.android.gms.internal.ads.zzcgr zzcgrVar) {
        this.zza.zzaj(zzcgrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzak(com.google.android.gms.internal.ads.zzazx zzazxVar) {
        this.zza.zzak(zzazxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzal(boolean z) {
        this.zza.zzal(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzam() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzan(android.content.Context context) {
        this.zza.zzan(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzao(boolean z) {
        this.zza.zzao(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzap(com.google.android.gms.internal.ads.zzbfi zzbfiVar) {
        this.zza.zzap(zzbfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaq(boolean z) {
        this.zza.zzaq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzar(com.google.android.gms.internal.ads.zzbfk zzbfkVar) {
        this.zza.zzar(zzbfkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzas(com.google.android.gms.internal.ads.zzecp zzecpVar) {
        this.zza.zzas(zzecpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzat(com.google.android.gms.internal.ads.zzecr zzecrVar) {
        this.zza.zzat(zzecrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzau(int i) {
        this.zza.zzau(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzav(boolean z) {
        this.zza.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzaw(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzax(boolean z) {
        this.zza.zzax(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzay(boolean z) {
        this.zza.zzay(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaz(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        this.zza.zzaz(str, zzbjpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zzb(java.lang.String str, java.lang.String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzd(java.lang.String str, java.util.Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.zzdd();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzde() {
        this.zza.zzde();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdf() {
        this.zza.zzdf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzdg() {
        this.zza.zzdg();
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(com.google.android.gms.internal.ads.zzayj zzayjVar) {
        this.zza.zzdn(zzayjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zze(java.lang.String str, org.json.JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final int zzg() {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdW)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final int zzh() {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdW)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbs
    public final android.app.Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.internal.ads.zzbcx zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zzl(java.lang.String str, org.json.JSONObject jSONObject) {
        ((com.google.android.gms.internal.ads.zzcfw) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.internal.ads.zzbcy zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.internal.ads.zzcbh zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.internal.ads.zzcde zzp(java.lang.String str) {
        return this.zza.zzp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.internal.ads.zzcfz zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final java.lang.String zzr() {
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final java.lang.String zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final void zzt(java.lang.String str, com.google.android.gms.internal.ads.zzcde zzcdeVar) {
        this.zza.zzt(str, zzcdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzv(boolean z, long j) {
        this.zza.zzv(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzz(boolean z) {
        this.zza.zzz(false);
    }
}
