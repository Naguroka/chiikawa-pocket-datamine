package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzetk implements com.google.android.gms.internal.ads.zzetr {
    private final boolean zza;

    zzetk(com.google.android.gms.internal.ads.zzezj zzezjVar) {
        this.zza = zzezjVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzeti(this.zza, null));
    }
}
