package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfek {
    private final java.util.HashMap zza = new java.util.HashMap();

    public final com.google.android.gms.internal.ads.zzfej zza(com.google.android.gms.internal.ads.zzfea zzfeaVar, android.content.Context context, com.google.android.gms.internal.ads.zzfds zzfdsVar, com.google.android.gms.internal.ads.zzfeq zzfeqVar) {
        com.google.android.gms.internal.ads.zzfej zzfejVar = (com.google.android.gms.internal.ads.zzfej) this.zza.get(zzfeaVar);
        if (zzfejVar != null) {
            return zzfejVar;
        }
        com.google.android.gms.internal.ads.zzfdx zzfdxVar = new com.google.android.gms.internal.ads.zzfdx(com.google.android.gms.internal.ads.zzfed.zza(zzfeaVar, context));
        com.google.android.gms.internal.ads.zzfej zzfejVar2 = new com.google.android.gms.internal.ads.zzfej(zzfdxVar, new com.google.android.gms.internal.ads.zzfes(zzfdxVar, zzfdsVar, zzfeqVar));
        this.zza.put(zzfeaVar, zzfejVar2);
        return zzfejVar2;
    }
}
