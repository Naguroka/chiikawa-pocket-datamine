package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgb extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgb zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        com.google.android.gms.internal.measurement.zzgb zzgbVar = new com.google.android.gms.internal.measurement.zzgb();
        zzb = zzgbVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzgb.class, zzgbVar);
    }

    private zzgb() {
    }

    public final int zzb() {
        int iZza = com.google.android.gms.internal.measurement.zzgf.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzc() {
        int iZza = com.google.android.gms.internal.measurement.zzgf.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            com.google.android.gms.internal.measurement.zzmg zzmgVar = com.google.android.gms.internal.measurement.zzge.zza;
            return zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new java.lang.Object[]{"zzd", "zze", zzmgVar, "zzf", zzmgVar});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgb();
        }
        com.google.android.gms.internal.measurement.zzgz zzgzVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzga(zzgzVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
