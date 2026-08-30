package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzag extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zza;

    zzag(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) {
        this.zza = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "Holder must not be null");
    }

    final void zzs(java.lang.Object obj) {
        this.zza.setResult(obj);
    }
}
