package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzia extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzia zzb;
    private int zzd;
    private int zze = 1;
    private com.google.android.gms.internal.measurement.zzmj zzf = zzcn();

    static {
        com.google.android.gms.internal.measurement.zzia zziaVar = new com.google.android.gms.internal.measurement.zzia();
        zzb = zziaVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzia.class, zziaVar);
    }

    private zzia() {
    }

    public static com.google.android.gms.internal.measurement.zzhy zza() {
        return (com.google.android.gms.internal.measurement.zzhy) zzb.zzcg();
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.measurement.zzia zziaVar, com.google.android.gms.internal.measurement.zzho zzhoVar) {
        zzhoVar.getClass();
        com.google.android.gms.internal.measurement.zzmj zzmjVar = zziaVar.zzf;
        if (!zzmjVar.zzc()) {
            zziaVar.zzf = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
        }
        zziaVar.zzf.add(zzhoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.measurement.zzhz.zza, "zzf", com.google.android.gms.internal.measurement.zzho.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzia();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhy(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
