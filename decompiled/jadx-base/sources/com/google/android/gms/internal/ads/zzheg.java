package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzheg extends com.google.android.gms.internal.ads.zzhej {
    final java.util.logging.Logger zza;

    public zzheg(java.lang.String str) {
        this.zza = java.util.logging.Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhej
    public final void zza(java.lang.String str) {
        this.zza.logp(java.util.logging.Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
