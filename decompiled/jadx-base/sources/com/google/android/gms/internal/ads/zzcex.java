package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public interface zzcex extends com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzdds, com.google.android.gms.internal.ads.zzceo, com.google.android.gms.internal.ads.zzbmk, com.google.android.gms.internal.ads.zzcga, com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzbmw, com.google.android.gms.internal.ads.zzayk, com.google.android.gms.internal.ads.zzcgh, com.google.android.gms.ads.internal.zzn, com.google.android.gms.internal.ads.zzcgk, com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbs, com.google.android.gms.internal.ads.zzcgm {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbs
    android.content.Context getContext();

    int getHeight();

    android.view.ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    android.view.ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    void loadUrl(java.lang.String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcbs
    void setBackgroundColor(int i);

    void setOnClickListener(android.view.View.OnClickListener onClickListener);

    void setOnTouchListener(android.view.View.OnTouchListener onTouchListener);

    void setWebChromeClient(android.webkit.WebChromeClient webChromeClient);

    void setWebViewClient(android.webkit.WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcbs
    void zzC(com.google.android.gms.internal.ads.zzcfz zzcfzVar);

    @Override // com.google.android.gms.internal.ads.zzceo
    com.google.android.gms.internal.ads.zzfbo zzD();

    android.content.Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcgm
    android.view.View zzF();

    android.webkit.WebView zzG();

    android.webkit.WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcgk
    com.google.android.gms.internal.ads.zzava zzI();

    com.google.android.gms.internal.ads.zzazx zzJ();

    com.google.android.gms.internal.ads.zzbfk zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    com.google.android.gms.internal.ads.zzcgp zzN();

    @Override // com.google.android.gms.internal.ads.zzcgj
    com.google.android.gms.internal.ads.zzcgr zzO();

    com.google.android.gms.internal.ads.zzecp zzP();

    com.google.android.gms.internal.ads.zzecr zzQ();

    @Override // com.google.android.gms.internal.ads.zzcga
    com.google.android.gms.internal.ads.zzfbr zzR();

    com.google.android.gms.internal.ads.zzfcn zzS();

    com.google.common.util.concurrent.ListenableFuture zzT();

    java.lang.String zzU();

    java.util.List zzV();

    void zzW(com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar);

    void zzX();

    void zzY();

    void zzZ(int i);

    void zzaA(java.lang.String str, com.google.android.gms.common.util.Predicate predicate);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean z, int i);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean z);

    void zzad();

    void zzae(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void zzaf();

    void zzag(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar);

    void zzah();

    void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaj(com.google.android.gms.internal.ads.zzcgr zzcgrVar);

    void zzak(com.google.android.gms.internal.ads.zzazx zzazxVar);

    void zzal(boolean z);

    void zzam();

    void zzan(android.content.Context context);

    void zzao(boolean z);

    void zzap(com.google.android.gms.internal.ads.zzbfi zzbfiVar);

    void zzaq(boolean z);

    void zzar(com.google.android.gms.internal.ads.zzbfk zzbfkVar);

    void zzas(com.google.android.gms.internal.ads.zzecp zzecpVar);

    void zzat(com.google.android.gms.internal.ads.zzecr zzecrVar);

    void zzau(int i);

    void zzav(boolean z);

    void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzax(boolean z);

    void zzay(boolean z);

    void zzaz(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar);

    @Override // com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbs
    android.app.Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcbs
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzcbs
    com.google.android.gms.internal.ads.zzbcy zzm();

    @Override // com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbs
    com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzn();

    @Override // com.google.android.gms.internal.ads.zzcbs
    com.google.android.gms.internal.ads.zzcfz zzq();

    @Override // com.google.android.gms.internal.ads.zzcbs
    void zzt(java.lang.String str, com.google.android.gms.internal.ads.zzcde zzcdeVar);
}
