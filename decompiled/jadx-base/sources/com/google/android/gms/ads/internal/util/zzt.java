package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzt extends com.google.android.gms.ads.internal.util.zzaa {
    public zzt() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final android.webkit.CookieManager zza(android.content.Context context) {
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzG()) {
            return null;
        }
        try {
            return android.webkit.CookieManager.getInstance();
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final android.webkit.WebResourceResponse zzb(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.util.Map map, java.io.InputStream inputStream) {
        return new android.webkit.WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final com.google.android.gms.internal.ads.zzcff zzc(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzbbj zzbbjVar, boolean z, com.google.android.gms.internal.ads.zzebv zzebvVar) {
        return new com.google.android.gms.internal.ads.zzcgg(zzcexVar, zzbbjVar, z, zzebvVar);
    }
}
