package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgi extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgi zzb;
    private int zzd;
    private boolean zzh;
    private com.google.android.gms.internal.measurement.zzmj zze = zzcn();
    private com.google.android.gms.internal.measurement.zzmj zzf = zzcn();
    private com.google.android.gms.internal.measurement.zzmj zzg = zzcn();
    private com.google.android.gms.internal.measurement.zzmj zzi = zzcn();

    static {
        com.google.android.gms.internal.measurement.zzgi zzgiVar = new com.google.android.gms.internal.measurement.zzgi();
        zzb = zzgiVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzgi.class, zzgiVar);
    }

    private zzgi() {
    }

    public static com.google.android.gms.internal.measurement.zzgi zzb() {
        return zzb;
    }

    public final java.util.List zzc() {
        return this.zzg;
    }

    public final java.util.List zzd() {
        return this.zze;
    }

    public final java.util.List zze() {
        return this.zzf;
    }

    public final java.util.List zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        return this.zzh;
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
            return zzcq(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.measurement.zzfz.class, "zzf", com.google.android.gms.internal.measurement.zzgb.class, "zzg", com.google.android.gms.internal.measurement.zzgh.class, "zzh", "zzi", com.google.android.gms.internal.measurement.zzfz.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgi();
        }
        com.google.android.gms.internal.measurement.zzgz zzgzVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfx(zzgzVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
