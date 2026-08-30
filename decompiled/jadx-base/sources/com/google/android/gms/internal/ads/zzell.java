package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzell implements com.google.android.gms.internal.ads.zzetr {
    private final android.content.Context zza;

    zzell(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzelm(androidx.core.content.ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
