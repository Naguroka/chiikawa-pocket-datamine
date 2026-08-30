package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzrp extends android.os.Handler {
    final /* synthetic */ com.google.android.gms.internal.ads.zzrr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzrp(com.google.android.gms.internal.ads.zzrr zzrrVar, android.os.Looper looper) {
        super(looper);
        this.zza = zzrrVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        com.google.android.gms.internal.ads.zzrr.zza(this.zza, message);
    }
}
