package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzho extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzho zzb;
    private int zzd;
    private java.lang.String zze = "";
    private long zzf;

    static {
        com.google.android.gms.internal.measurement.zzho zzhoVar = new com.google.android.gms.internal.measurement.zzho();
        zzb = zzhoVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzho.class, zzhoVar);
    }

    private zzho() {
    }

    public static com.google.android.gms.internal.measurement.zzhn zza() {
        return (com.google.android.gms.internal.measurement.zzhn) zzb.zzcg();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.measurement.zzho zzhoVar, long j) {
        zzhoVar.zzd |= 2;
        zzhoVar.zzf = j;
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.measurement.zzho zzhoVar, java.lang.String str) {
        str.getClass();
        zzhoVar.zzd |= 1;
        zzhoVar.zze = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzho();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhn(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
