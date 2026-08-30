package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzit extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzit zzb;
    private int zzd;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.measurement.zzmj zzf = zzcn();

    static {
        com.google.android.gms.internal.measurement.zzit zzitVar = new com.google.android.gms.internal.measurement.zzit();
        zzb = zzitVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzit.class, zzitVar);
    }

    private zzit() {
    }

    public final java.lang.String zzb() {
        return this.zze;
    }

    public final java.util.List zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new java.lang.Object[]{"zzd", "zze", "zzf", com.google.android.gms.internal.measurement.zziz.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzit();
        }
        com.google.android.gms.internal.measurement.zzja zzjaVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzis(zzjaVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
