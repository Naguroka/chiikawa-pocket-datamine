package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfmd implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfme zza;
    private final android.webkit.WebView zzb;

    zzfmd(com.google.android.gms.internal.ads.zzfme zzfmeVar) {
        this.zza = zzfmeVar;
        this.zzb = zzfmeVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
