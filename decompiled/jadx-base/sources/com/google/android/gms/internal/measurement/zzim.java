package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzim extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzim zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.measurement.zzim zzimVar = new com.google.android.gms.internal.measurement.zzim();
        zzb = zzimVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzim.class, zzimVar);
    }

    private zzim() {
    }

    public static com.google.android.gms.internal.measurement.zzif zza() {
        return (com.google.android.gms.internal.measurement.zzif) zzb.zzcg();
    }

    public static com.google.android.gms.internal.measurement.zzim zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.measurement.zzim zzimVar, com.google.android.gms.internal.measurement.zzih zzihVar) {
        zzimVar.zzf = zzihVar.zza();
        zzimVar.zzd |= 2;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.measurement.zzim zzimVar, int i) {
        zzimVar.zzg = i - 1;
        zzimVar.zzd |= 4;
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzim zzimVar, int i) {
        zzimVar.zze = i - 1;
        zzimVar.zzd |= 1;
    }

    public final com.google.android.gms.internal.measurement.zzih zzb() {
        com.google.android.gms.internal.measurement.zzih zzihVarZzb = com.google.android.gms.internal.measurement.zzih.zzb(this.zzf);
        return zzihVarZzb == null ? com.google.android.gms.internal.measurement.zzih.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzihVarZzb;
    }

    public final int zzf() {
        int iZza = com.google.android.gms.internal.measurement.zzij.zza(this.zzg);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzg() {
        int iZza = com.google.android.gms.internal.measurement.zzil.zza(this.zze);
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
            return zzcq(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.measurement.zzik.zza, "zzf", com.google.android.gms.internal.measurement.zzig.zza, "zzg", com.google.android.gms.internal.measurement.zzii.zza});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzim();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzif(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
