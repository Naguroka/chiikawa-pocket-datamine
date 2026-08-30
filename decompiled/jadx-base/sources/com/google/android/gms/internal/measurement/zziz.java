package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zziz extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zziz zzb;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.measurement.zzmj zzf = zzcn();
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        com.google.android.gms.internal.measurement.zziz zzizVar = new com.google.android.gms.internal.measurement.zziz();
        zzb = zzizVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zziz.class, zzizVar);
    }

    private zziz() {
    }

    public final double zza() {
        return this.zzj;
    }

    public final java.lang.String zzc() {
        return this.zzg;
    }

    public final java.lang.String zzd() {
        return this.zzh;
    }

    public final java.util.List zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 4) != 0;
    }

    public final int zzj() {
        int iZza = com.google.android.gms.internal.measurement.zziy.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.measurement.zzix.zza, "zzf", com.google.android.gms.internal.measurement.zziz.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zziz();
        }
        com.google.android.gms.internal.measurement.zzja zzjaVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zziw(zzjaVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
