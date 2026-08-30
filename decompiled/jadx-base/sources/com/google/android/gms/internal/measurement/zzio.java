package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzio extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzio zzb;
    private int zzd;
    private long zze;
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        com.google.android.gms.internal.measurement.zzio zzioVar = new com.google.android.gms.internal.measurement.zzio();
        zzb = zzioVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzio.class, zzioVar);
    }

    private zzio() {
    }

    public static com.google.android.gms.internal.measurement.zzin zze() {
        return (com.google.android.gms.internal.measurement.zzin) zzb.zzcg();
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzio zzioVar) {
        zzioVar.zzd &= -33;
        zzioVar.zzj = 0.0d;
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzio zzioVar) {
        zzioVar.zzd &= -9;
        zzioVar.zzh = 0L;
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.measurement.zzio zzioVar) {
        zzioVar.zzd &= -5;
        zzioVar.zzg = zzb.zzg;
    }

    static /* synthetic */ void zzm(com.google.android.gms.internal.measurement.zzio zzioVar, double d) {
        zzioVar.zzd |= 32;
        zzioVar.zzj = d;
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.measurement.zzio zzioVar, long j) {
        zzioVar.zzd |= 8;
        zzioVar.zzh = j;
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.measurement.zzio zzioVar, java.lang.String str) {
        str.getClass();
        zzioVar.zzd |= 2;
        zzioVar.zzf = str;
    }

    static /* synthetic */ void zzp(com.google.android.gms.internal.measurement.zzio zzioVar, long j) {
        zzioVar.zzd |= 1;
        zzioVar.zze = j;
    }

    static /* synthetic */ void zzq(com.google.android.gms.internal.measurement.zzio zzioVar, java.lang.String str) {
        str.getClass();
        zzioVar.zzd |= 4;
        zzioVar.zzg = str;
    }

    public final double zza() {
        return this.zzj;
    }

    public final float zzb() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zze;
    }

    public final java.lang.String zzg() {
        return this.zzf;
    }

    public final java.lang.String zzh() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzio();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzin(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean zzr() {
        return (this.zzd & 32) != 0;
    }

    public final boolean zzs() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzt() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzv() {
        return (this.zzd & 4) != 0;
    }
}
