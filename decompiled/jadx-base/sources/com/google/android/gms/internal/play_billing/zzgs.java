package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgs {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.play_billing.zzgs zzb = new com.google.android.gms.internal.play_billing.zzgs();
    private final java.util.concurrent.ConcurrentMap zzd = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.play_billing.zzgw zzc = new com.google.android.gms.internal.play_billing.zzgd();

    private zzgs() {
    }

    public static com.google.android.gms.internal.play_billing.zzgs zza() {
        return zzb;
    }

    public final com.google.android.gms.internal.play_billing.zzgv zzb(java.lang.Class cls) {
        com.google.android.gms.internal.play_billing.zzfo.zzc(cls, "messageType");
        java.util.concurrent.ConcurrentMap concurrentMap = this.zzd;
        com.google.android.gms.internal.play_billing.zzgv zzgvVarZza = (com.google.android.gms.internal.play_billing.zzgv) concurrentMap.get(cls);
        if (zzgvVarZza == null) {
            zzgvVarZza = this.zzc.zza(cls);
            com.google.android.gms.internal.play_billing.zzfo.zzc(cls, "messageType");
            com.google.android.gms.internal.play_billing.zzgv zzgvVar = (com.google.android.gms.internal.play_billing.zzgv) concurrentMap.putIfAbsent(cls, zzgvVarZza);
            if (zzgvVar != null) {
                return zzgvVar;
            }
        }
        return zzgvVarZza;
    }
}
