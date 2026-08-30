package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbkj implements com.google.android.gms.internal.ads.zzbjp {
    private final com.google.android.gms.internal.ads.zzduv zza;

    public zzbkj(com.google.android.gms.internal.ads.zzduv zzduvVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzduvVar, "The Inspector Manager must not be null");
        this.zza = zzduvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = java.lang.Long.parseLong((java.lang.String) map.get("expires"));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.zza.zzi((java.lang.String) map.get("extras"), j);
    }
}
