package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzerz implements com.google.android.gms.internal.ads.zzetr {
    private static java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;
    private final android.content.Context zzc;
    private final java.util.Set zzd;

    public zzerz(com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.content.Context context, java.util.Set set) {
        this.zzb = zzgcsVar;
        this.zzc = context;
        this.zzd = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zzb.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzery
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ com.google.android.gms.internal.ads.zzesa zzc() throws java.lang.Exception {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfc)).booleanValue()) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfn)).booleanValue()) {
                java.util.Set set = this.zzd;
                if (!set.contains("rewarded")) {
                    if (!set.contains("interstitial")) {
                        if (!set.contains(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE)) {
                        }
                    }
                }
            }
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfo)).booleanValue()) {
                return new com.google.android.gms.internal.ads.zzesa(com.google.android.gms.ads.internal.zzv.zzB().zzf(this.zzc));
            }
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.zzv.zzB().zzf(this.zzc);
            }
            return new com.google.android.gms.internal.ads.zzesa(zza);
        }
        return new com.google.android.gms.internal.ads.zzesa(null);
    }
}
