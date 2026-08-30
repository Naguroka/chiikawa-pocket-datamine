package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzir extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzir zzb;
    private com.google.android.gms.internal.measurement.zzmj zzd = zzcn();

    static {
        com.google.android.gms.internal.measurement.zzir zzirVar = new com.google.android.gms.internal.measurement.zzir();
        zzb = zzirVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzir.class, zzirVar);
    }

    private zzir() {
    }

    public static com.google.android.gms.internal.measurement.zzir zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final java.util.List zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzd", com.google.android.gms.internal.measurement.zzit.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzir();
        }
        com.google.android.gms.internal.measurement.zzja zzjaVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zziq(zzjaVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
