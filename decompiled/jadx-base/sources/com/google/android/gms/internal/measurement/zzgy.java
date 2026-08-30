package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgy extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgy zzb;
    private int zzd;
    private int zzh;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzi = "";

    static {
        com.google.android.gms.internal.measurement.zzgy zzgyVar = new com.google.android.gms.internal.measurement.zzgy();
        zzb = zzgyVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzgy.class, zzgyVar);
    }

    private zzgy() {
    }

    public static com.google.android.gms.internal.measurement.zzgy zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zzh;
    }

    public final java.lang.String zzd() {
        return this.zzf;
    }

    public final java.lang.String zze() {
        return this.zzi;
    }

    public final java.lang.String zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgy();
        }
        com.google.android.gms.internal.measurement.zzgz zzgzVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzgx(zzgzVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
