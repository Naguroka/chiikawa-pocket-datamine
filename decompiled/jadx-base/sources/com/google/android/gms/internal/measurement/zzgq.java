package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgq extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgq zzb;
    private com.google.android.gms.internal.measurement.zzmj zzd = com.google.android.gms.internal.measurement.zzmd.zzcn();

    static {
        com.google.android.gms.internal.measurement.zzgq zzgqVar = new com.google.android.gms.internal.measurement.zzgq();
        zzb = zzgqVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzgq.class, zzgqVar);
    }

    private zzgq() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgq();
        }
        com.google.android.gms.internal.measurement.zzgz zzgzVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzgp(zzgzVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
