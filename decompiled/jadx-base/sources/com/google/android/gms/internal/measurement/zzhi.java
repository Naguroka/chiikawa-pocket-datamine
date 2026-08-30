package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhi extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhi zzb;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.measurement.zzic zzf;
    private com.google.android.gms.internal.measurement.zzic zzg;
    private boolean zzh;

    static {
        com.google.android.gms.internal.measurement.zzhi zzhiVar = new com.google.android.gms.internal.measurement.zzhi();
        zzb = zzhiVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzhi.class, zzhiVar);
    }

    private zzhi() {
    }

    public static com.google.android.gms.internal.measurement.zzhh zzb() {
        return (com.google.android.gms.internal.measurement.zzhh) zzb.zzcg();
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.measurement.zzhi zzhiVar, int i) {
        zzhiVar.zzd |= 1;
        zzhiVar.zze = i;
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.measurement.zzhi zzhiVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        zzicVar.getClass();
        zzhiVar.zzf = zzicVar;
        zzhiVar.zzd |= 2;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.measurement.zzhi zzhiVar, boolean z) {
        zzhiVar.zzd |= 8;
        zzhiVar.zzh = z;
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzhi zzhiVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        zzhiVar.zzg = zzicVar;
        zzhiVar.zzd |= 4;
    }

    public final int zza() {
        return this.zze;
    }

    public final com.google.android.gms.internal.measurement.zzic zzd() {
        com.google.android.gms.internal.measurement.zzic zzicVar = this.zzf;
        return zzicVar == null ? com.google.android.gms.internal.measurement.zzic.zzg() : zzicVar;
    }

    public final com.google.android.gms.internal.measurement.zzic zze() {
        com.google.android.gms.internal.measurement.zzic zzicVar = this.zzg;
        return zzicVar == null ? com.google.android.gms.internal.measurement.zzic.zzg() : zzicVar;
    }

    public final boolean zzj() {
        return this.zzh;
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhi();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhh(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean zzm() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zzd & 4) != 0;
    }
}
