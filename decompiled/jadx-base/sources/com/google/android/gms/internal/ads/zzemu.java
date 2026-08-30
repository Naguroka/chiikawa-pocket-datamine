package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzemu implements com.google.android.gms.internal.ads.zzetr {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;

    zzemu(com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.content.Context context) {
        this.zzb = zzgcsVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmJ)).booleanValue()) {
            return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzemv(null, false));
        }
        final android.content.ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzemv(null, false)) : this.zzb.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzemt
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                android.content.ContentResolver contentResolver2 = contentResolver;
                return new com.google.android.gms.internal.ads.zzemv(android.provider.Settings.Secure.getString(contentResolver2, "advertising_id"), android.provider.Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }
}
