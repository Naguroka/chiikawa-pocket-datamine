package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfr extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzfr zzb;
    private int zzd;
    private int zze;
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.measurement.zzfl zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        com.google.android.gms.internal.measurement.zzfr zzfrVar = new com.google.android.gms.internal.measurement.zzfr();
        zzb = zzfrVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    public static com.google.android.gms.internal.measurement.zzfq zzc() {
        return (com.google.android.gms.internal.measurement.zzfq) zzb.zzcg();
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.measurement.zzfr zzfrVar, java.lang.String str) {
        zzfrVar.zzd |= 2;
        zzfrVar.zzf = str;
    }

    public final int zza() {
        return this.zze;
    }

    public final com.google.android.gms.internal.measurement.zzfl zzb() {
        com.google.android.gms.internal.measurement.zzfl zzflVar = this.zzg;
        return zzflVar == null ? com.google.android.gms.internal.measurement.zzfl.zzb() : zzflVar;
    }

    public final java.lang.String zze() {
        return this.zzf;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final boolean zzj() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzk() {
        return (this.zzd & 32) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfr();
        }
        com.google.android.gms.internal.measurement.zzfw zzfwVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfq(zzfwVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
