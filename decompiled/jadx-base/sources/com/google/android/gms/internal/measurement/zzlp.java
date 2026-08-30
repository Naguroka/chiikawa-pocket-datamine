package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlp {
    static final com.google.android.gms.internal.measurement.zzlp zza = new com.google.android.gms.internal.measurement.zzlp(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile com.google.android.gms.internal.measurement.zzlp zzd;
    private final java.util.Map zze;

    zzlp() {
        this.zze = new java.util.HashMap();
    }

    public static com.google.android.gms.internal.measurement.zzlp zza() {
        com.google.android.gms.internal.measurement.zzlp zzlpVar = zzd;
        if (zzlpVar != null) {
            return zzlpVar;
        }
        synchronized (com.google.android.gms.internal.measurement.zzlp.class) {
            com.google.android.gms.internal.measurement.zzlp zzlpVar2 = zzd;
            if (zzlpVar2 != null) {
                return zzlpVar2;
            }
            int i = com.google.android.gms.internal.measurement.zznp.zza;
            com.google.android.gms.internal.measurement.zzlp zzlpVarZzb = com.google.android.gms.internal.measurement.zzlx.zzb(com.google.android.gms.internal.measurement.zzlp.class);
            zzd = zzlpVarZzb;
            return zzlpVarZzb;
        }
    }

    public final com.google.android.gms.internal.measurement.zzmc zzb(com.google.android.gms.internal.measurement.zznh zznhVar, int i) {
        return (com.google.android.gms.internal.measurement.zzmc) this.zze.get(new com.google.android.gms.internal.measurement.zzlo(zznhVar, i));
    }

    zzlp(boolean z) {
        this.zze = java.util.Collections.emptyMap();
    }
}
