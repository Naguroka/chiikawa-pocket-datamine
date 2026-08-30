package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfl extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzfl zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzfv zze;
    private com.google.android.gms.internal.measurement.zzfp zzf;
    private boolean zzg;
    private java.lang.String zzh = "";

    static {
        com.google.android.gms.internal.measurement.zzfl zzflVar = new com.google.android.gms.internal.measurement.zzfl();
        zzb = zzflVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzfl.class, zzflVar);
    }

    private zzfl() {
    }

    public static com.google.android.gms.internal.measurement.zzfl zzb() {
        return zzb;
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.measurement.zzfl zzflVar, java.lang.String str) {
        zzflVar.zzd |= 8;
        zzflVar.zzh = str;
    }

    public final com.google.android.gms.internal.measurement.zzfp zzc() {
        com.google.android.gms.internal.measurement.zzfp zzfpVar = this.zzf;
        return zzfpVar == null ? com.google.android.gms.internal.measurement.zzfp.zzb() : zzfpVar;
    }

    public final com.google.android.gms.internal.measurement.zzfv zzd() {
        com.google.android.gms.internal.measurement.zzfv zzfvVar = this.zze;
        return zzfvVar == null ? com.google.android.gms.internal.measurement.zzfv.zzc() : zzfvVar;
    }

    public final java.lang.String zze() {
        return this.zzh;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zzd & 8) != 0;
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
            return zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfl();
        }
        com.google.android.gms.internal.measurement.zzfw zzfwVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfk(zzfwVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
