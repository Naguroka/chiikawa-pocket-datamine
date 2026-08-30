package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfp extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzfp zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";

    static {
        com.google.android.gms.internal.measurement.zzfp zzfpVar = new com.google.android.gms.internal.measurement.zzfp();
        zzb = zzfpVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzfp.class, zzfpVar);
    }

    private zzfp() {
    }

    public static com.google.android.gms.internal.measurement.zzfp zzb() {
        return zzb;
    }

    public final java.lang.String zzc() {
        return this.zzg;
    }

    public final java.lang.String zzd() {
        return this.zzi;
    }

    public final java.lang.String zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzk() {
        return (this.zzd & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.measurement.zzfn.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfp();
        }
        com.google.android.gms.internal.measurement.zzfw zzfwVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfm(zzfwVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int zzm() {
        int iZza = com.google.android.gms.internal.measurement.zzfo.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
