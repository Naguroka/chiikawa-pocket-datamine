package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbtx extends com.google.android.gms.internal.ads.zzbts {
    final /* synthetic */ com.google.android.gms.ads.query.UpdateClickUrlCallback zza;

    zzbtx(com.google.android.gms.internal.ads.zzbub zzbubVar, com.google.android.gms.ads.query.UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zze(java.lang.String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzf(java.util.List list) {
        this.zza.onSuccess((android.net.Uri) list.get(0));
    }
}
