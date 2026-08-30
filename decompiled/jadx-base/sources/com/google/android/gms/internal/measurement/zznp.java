package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zznp {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.measurement.zznp zzb = new com.google.android.gms.internal.measurement.zznp();
    private final java.util.concurrent.ConcurrentMap zzd = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.measurement.zznt zzc = new com.google.android.gms.internal.measurement.zzmz();

    private zznp() {
    }

    public static com.google.android.gms.internal.measurement.zznp zza() {
        return zzb;
    }

    public final com.google.android.gms.internal.measurement.zzns zzb(java.lang.Class cls) {
        com.google.android.gms.internal.measurement.zzmk.zzc(cls, "messageType");
        java.util.concurrent.ConcurrentMap concurrentMap = this.zzd;
        com.google.android.gms.internal.measurement.zzns zznsVarZza = (com.google.android.gms.internal.measurement.zzns) concurrentMap.get(cls);
        if (zznsVarZza == null) {
            zznsVarZza = this.zzc.zza(cls);
            com.google.android.gms.internal.measurement.zzmk.zzc(cls, "messageType");
            com.google.android.gms.internal.measurement.zzns zznsVar = (com.google.android.gms.internal.measurement.zzns) concurrentMap.putIfAbsent(cls, zznsVarZza);
            if (zznsVar != null) {
                return zznsVar;
            }
        }
        return zznsVarZza;
    }
}
