package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzcgf extends com.google.android.gms.internal.ads.zzcff {
    public zzcgf(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzbbj zzbbjVar, boolean z, com.google.android.gms.internal.ads.zzebv zzebvVar) {
        super(zzcexVar, zzbbjVar, z, new com.google.android.gms.internal.ads.zzbsh(zzcexVar, zzcexVar.zzE(), new com.google.android.gms.internal.ads.zzbbt(zzcexVar.getContext())), null, zzebvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final android.webkit.WebResourceResponse zzW(android.webkit.WebView webView, java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        if (!(webView instanceof com.google.android.gms.internal.ads.zzcex)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) webView;
        com.google.android.gms.internal.ads.zzbxu zzbxuVar = this.zza;
        if (zzbxuVar != null) {
            zzbxuVar.zzd(str, map, 1);
        }
        com.google.android.gms.internal.ads.zzfpu.zza();
        com.google.android.gms.internal.ads.zzfqa zzfqaVar = com.google.android.gms.internal.ads.zzfqa.zza;
        if (!"mraid.js".equalsIgnoreCase(new java.io.File(str).getName())) {
            if (map == null) {
                map = java.util.Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcexVar.zzN() != null) {
            zzcexVar.zzN().zzH();
        }
        if (zzcexVar.zzO().zzi()) {
            str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaa);
        } else if (zzcexVar.zzaF()) {
            str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzZ);
        } else {
            str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzY);
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        return com.google.android.gms.ads.internal.util.zzs.zzy(zzcexVar.getContext(), zzcexVar.zzn().afmaVersion, str2);
    }
}
