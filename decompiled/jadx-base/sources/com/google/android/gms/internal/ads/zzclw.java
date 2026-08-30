package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzclw implements com.google.android.gms.internal.ads.zzcla {
    private final android.webkit.CookieManager zza;

    public zzclw(android.content.Context context) {
        this.zza = com.google.android.gms.ads.internal.zzv.zzr().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(java.util.Map map) {
        java.lang.String cookie;
        if (this.zza == null) {
            return;
        }
        if (((java.lang.String) map.get("clear")) == null) {
            java.lang.String str = (java.lang.String) map.get("cookie");
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.setCookie((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaY), str);
            return;
        }
        java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaY);
        android.webkit.CookieManager cookieManager = this.zza;
        if (cookieManager == null || (cookie = cookieManager.getCookie(str2)) == null) {
            return;
        }
        java.util.List listZzf = com.google.android.gms.internal.ads.zzfvc.zzb(com.google.android.gms.internal.ads.zzfty.zzc(';')).zzf(cookie);
        for (int i = 0; i < listZzf.size(); i++) {
            android.webkit.CookieManager cookieManager2 = this.zza;
            java.util.Iterator it = com.google.android.gms.internal.ads.zzfvc.zzb(com.google.android.gms.internal.ads.zzfty.zzc('=')).zzd((java.lang.String) listZzf.get(i)).iterator();
            it.getClass();
            if (!it.hasNext()) {
                throw new java.lang.IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
            }
            cookieManager2.setCookie(str2, java.lang.String.valueOf((java.lang.String) it.next()).concat(java.lang.String.valueOf((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaK))));
        }
    }
}
