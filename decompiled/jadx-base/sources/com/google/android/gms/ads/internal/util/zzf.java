package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzf extends com.google.android.gms.internal.ads.zzfqw {
    public zzf(android.os.Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        try {
            super.handleMessage(message);
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    protected final void zza(android.os.Message message) {
        try {
            super.zza(message);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzN(com.google.android.gms.ads.internal.zzv.zzp().zzd(), th);
            throw th;
        }
    }
}
