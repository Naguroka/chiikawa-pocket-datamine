package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhk extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhk zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        com.google.android.gms.internal.measurement.zzhk zzhkVar = new com.google.android.gms.internal.measurement.zzhk();
        zzb = zzhkVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzhk.class, zzhkVar);
    }

    private zzhk() {
    }

    public static com.google.android.gms.internal.measurement.zzhj zzc() {
        return (com.google.android.gms.internal.measurement.zzhj) zzb.zzcg();
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.measurement.zzhk zzhkVar, long j) {
        zzhkVar.zzd |= 2;
        zzhkVar.zzf = j;
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.measurement.zzhk zzhkVar, int i) {
        zzhkVar.zzd |= 1;
        zzhkVar.zze = i;
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhk();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhj(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
