package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhs extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhs zzb;
    private int zzd;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.measurement.zzhe zzg;

    static {
        com.google.android.gms.internal.measurement.zzhs zzhsVar = new com.google.android.gms.internal.measurement.zzhs();
        zzb = zzhsVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzhs.class, zzhsVar);
    }

    private zzhs() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhs();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhr(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
