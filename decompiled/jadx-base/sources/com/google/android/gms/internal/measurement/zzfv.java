package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfv extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzfv zzb;
    private int zzd;
    private int zze;
    private boolean zzg;
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.measurement.zzmj zzh = com.google.android.gms.internal.measurement.zzmd.zzcn();

    static {
        com.google.android.gms.internal.measurement.zzfv zzfvVar = new com.google.android.gms.internal.measurement.zzfv();
        zzb = zzfvVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzfv.class, zzfvVar);
    }

    private zzfv() {
    }

    public static com.google.android.gms.internal.measurement.zzfv zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zzh.size();
    }

    public final java.lang.String zzd() {
        return this.zzf;
    }

    public final java.util.List zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    public final int zzj() {
        int iZza = com.google.android.gms.internal.measurement.zzfu.zza(this.zze);
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
            return zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.measurement.zzft.zza, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfv();
        }
        com.google.android.gms.internal.measurement.zzfw zzfwVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfs(zzfwVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
