package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
@java.lang.Deprecated
public final class zzbcy {
    private final java.util.Map zza = new java.util.HashMap();
    private final com.google.android.gms.internal.ads.zzbda zzb;

    public zzbcy(com.google.android.gms.internal.ads.zzbda zzbdaVar) {
        this.zzb = zzbdaVar;
    }

    public final com.google.android.gms.internal.ads.zzbda zza() {
        return this.zzb;
    }

    public final void zzb(java.lang.String str, com.google.android.gms.internal.ads.zzbcx zzbcxVar) {
        this.zza.put(str, zzbcxVar);
    }

    public final void zzc(java.lang.String str, java.lang.String str2, long j) {
        com.google.android.gms.internal.ads.zzbcx zzbcxVar = (com.google.android.gms.internal.ads.zzbcx) this.zza.get(str2);
        java.lang.String[] strArr = {str};
        if (zzbcxVar != null) {
            this.zzb.zze(zzbcxVar, j, strArr);
        }
        this.zza.put(str, new com.google.android.gms.internal.ads.zzbcx(j, null, null));
    }
}
