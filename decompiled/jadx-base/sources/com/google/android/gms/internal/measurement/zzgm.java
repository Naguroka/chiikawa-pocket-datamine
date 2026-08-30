package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgm extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgm zzb;
    private int zzd;
    private java.lang.String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        com.google.android.gms.internal.measurement.zzgm zzgmVar = new com.google.android.gms.internal.measurement.zzgm();
        zzb = zzgmVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzgm.class, zzgmVar);
    }

    private zzgm() {
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.measurement.zzgm zzgmVar, java.lang.String str) {
        str.getClass();
        zzgmVar.zzd |= 1;
        zzgmVar.zze = str;
    }

    public final int zza() {
        return this.zzh;
    }

    public final java.lang.String zzc() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgm();
        }
        com.google.android.gms.internal.measurement.zzgz zzgzVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzgl(zzgzVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
