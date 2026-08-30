package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzie extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzie zzb;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.measurement.zzmi zzf = zzcl();

    static {
        com.google.android.gms.internal.measurement.zzie zzieVar = new com.google.android.gms.internal.measurement.zzie();
        zzb = zzieVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzie.class, zzieVar);
    }

    private zzie() {
    }

    public static com.google.android.gms.internal.measurement.zzid zzd() {
        return (com.google.android.gms.internal.measurement.zzid) zzb.zzcg();
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.measurement.zzie zzieVar, java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmi zzmiVar = zzieVar.zzf;
        if (!zzmiVar.zzc()) {
            zzieVar.zzf = com.google.android.gms.internal.measurement.zzmd.zzcm(zzmiVar);
        }
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzieVar.zzf);
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.measurement.zzie zzieVar, int i) {
        zzieVar.zzd |= 1;
        zzieVar.zze = i;
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc(int i) {
        return this.zzf.zza(i);
    }

    public final java.util.List zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzie();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzid(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
