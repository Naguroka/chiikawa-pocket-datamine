package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdsb extends com.google.android.gms.internal.ads.zzdsf {
    private final com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults zzf;

    public zzdsb(java.util.concurrent.Executor executor, com.google.android.gms.ads.internal.util.client.zzu zzuVar, com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults csiParamDefaults, com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder csiUrlBuilder, android.content.Context context) {
        super(executor, zzuVar, csiUrlBuilder, context);
        this.zzf = csiParamDefaults;
        csiParamDefaults.set(this.zza);
    }

    public final java.util.Map zza() {
        return new java.util.HashMap(this.zza);
    }
}
