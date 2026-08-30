package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgh extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgh zzb;
    private int zzd;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";

    static {
        com.google.android.gms.internal.measurement.zzgh zzghVar = new com.google.android.gms.internal.measurement.zzgh();
        zzb = zzghVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzgh.class, zzghVar);
    }

    private zzgh() {
    }

    public final java.lang.String zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgh();
        }
        com.google.android.gms.internal.measurement.zzgz zzgzVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzgg(zzgzVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
