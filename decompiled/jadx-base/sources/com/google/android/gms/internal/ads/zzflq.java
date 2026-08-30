package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzflq implements java.lang.Runnable {
    final /* synthetic */ android.webkit.WebView zza;
    final /* synthetic */ java.lang.String zzb;

    zzflq(com.google.android.gms.internal.ads.zzflr zzflrVar, android.webkit.WebView webView, java.lang.String str) {
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzflr.zzk(this.zza, this.zzb);
    }
}
