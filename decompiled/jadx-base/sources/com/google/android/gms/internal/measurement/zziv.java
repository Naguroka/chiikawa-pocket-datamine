package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zziv extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zziv zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzmj zze = zzcn();
    private com.google.android.gms.internal.measurement.zzir zzf;

    static {
        com.google.android.gms.internal.measurement.zziv zzivVar = new com.google.android.gms.internal.measurement.zziv();
        zzb = zzivVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zziv.class, zzivVar);
    }

    private zziv() {
    }

    public final com.google.android.gms.internal.measurement.zzir zza() {
        com.google.android.gms.internal.measurement.zzir zzirVar = this.zzf;
        return zzirVar == null ? com.google.android.gms.internal.measurement.zzir.zzc() : zzirVar;
    }

    public final java.util.List zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.measurement.zziz.class, "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zziv();
        }
        com.google.android.gms.internal.measurement.zzja zzjaVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zziu(zzjaVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
