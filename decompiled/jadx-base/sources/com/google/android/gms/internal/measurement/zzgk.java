package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgk extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgk zzb;
    private int zzd;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.measurement.zzmj zzf = zzcn();
    private boolean zzg;

    static {
        com.google.android.gms.internal.measurement.zzgk zzgkVar = new com.google.android.gms.internal.measurement.zzgk();
        zzb = zzgkVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzgk.class, zzgkVar);
    }

    private zzgk() {
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
            return zzcq(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf", com.google.android.gms.internal.measurement.zzgu.class, "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgk();
        }
        com.google.android.gms.internal.measurement.zzgz zzgzVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzgj(zzgzVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
