package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdwp implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;

    public zzdwp(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzfgn zzfgnVar = (com.google.android.gms.internal.ads.zzfgn) this.zza.zzb();
        final android.webkit.CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzv.zzr().zza((android.content.Context) this.zzb.zzb());
        com.google.android.gms.internal.ads.zzfgd zzfgdVarZzi = com.google.android.gms.internal.ads.zzffx.zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdwk
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                android.webkit.CookieManager cookieManager = cookieManagerZza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaY));
            }
        }, com.google.android.gms.internal.ads.zzfgh.WEBVIEW_COOKIE, zzfgnVar).zzi(1L, java.util.concurrent.TimeUnit.SECONDS);
        final com.google.android.gms.internal.ads.zzffr zzffrVar = new com.google.android.gms.internal.ads.zzffr() { // from class: com.google.android.gms.internal.ads.zzdwl
            @Override // com.google.android.gms.internal.ads.zzffr
            public final java.lang.Object zza(java.lang.Object obj) {
                return "";
            }
        };
        return zzfgdVarZzi.zzc(java.lang.Exception.class, new com.google.android.gms.internal.ads.zzgbo(zzffrVar) { // from class: com.google.android.gms.internal.ads.zzffy
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgch.zzh("");
            }
        }).zza();
    }
}
