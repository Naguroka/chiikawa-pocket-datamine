package com.google.android.gms.ads.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzo extends android.webkit.WebViewClient {
    final /* synthetic */ com.google.android.gms.ads.internal.zzu zza;

    zzo(com.google.android.gms.ads.internal.zzu zzuVar) {
        this.zza = zzuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        com.google.android.gms.ads.internal.zzu zzuVar = this.zza;
        if (zzuVar.zzg != null) {
            try {
                zzuVar.zzg.zzf(com.google.android.gms.internal.ads.zzfdk.zzd(1, null, null));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        com.google.android.gms.ads.internal.zzu zzuVar2 = this.zza;
        if (zzuVar2.zzg != null) {
            try {
                zzuVar2.zzg.zze(0);
            } catch (android.os.RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (str.startsWith(this.zza.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            com.google.android.gms.ads.internal.zzu zzuVar = this.zza;
            if (zzuVar.zzg != null) {
                try {
                    zzuVar.zzg.zzf(com.google.android.gms.internal.ads.zzfdk.zzd(3, null, null));
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
            com.google.android.gms.ads.internal.zzu zzuVar2 = this.zza;
            if (zzuVar2.zzg != null) {
                try {
                    zzuVar2.zzg.zze(3);
                } catch (android.os.RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            com.google.android.gms.ads.internal.zzu zzuVar3 = this.zza;
            if (zzuVar3.zzg != null) {
                try {
                    zzuVar3.zzg.zzf(com.google.android.gms.internal.ads.zzfdk.zzd(1, null, null));
                } catch (android.os.RemoteException e3) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e3);
                }
            }
            com.google.android.gms.ads.internal.zzu zzuVar4 = this.zza;
            if (zzuVar4.zzg != null) {
                try {
                    zzuVar4.zzg.zze(0);
                } catch (android.os.RemoteException e4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            com.google.android.gms.ads.internal.zzu zzuVar5 = this.zza;
            if (zzuVar5.zzg != null) {
                try {
                    zzuVar5.zzg.zzi();
                } catch (android.os.RemoteException e5) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e5);
                }
            }
            this.zza.zzV(this.zza.zzb(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        com.google.android.gms.ads.internal.zzu zzuVar6 = this.zza;
        if (zzuVar6.zzg != null) {
            try {
                zzuVar6.zzg.zzc();
                this.zza.zzg.zzh();
            } catch (android.os.RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        com.google.android.gms.ads.internal.zzu.zzw(this.zza, com.google.android.gms.ads.internal.zzu.zzo(this.zza, str));
        return true;
    }
}
