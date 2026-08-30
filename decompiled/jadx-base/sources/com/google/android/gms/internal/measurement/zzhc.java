package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhc extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhc zzb;
    private int zzd;
    private long zzh;
    private long zzl;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzi = "";
    private java.lang.String zzj = "";
    private java.lang.String zzk = "";

    static {
        com.google.android.gms.internal.measurement.zzhc zzhcVar = new com.google.android.gms.internal.measurement.zzhc();
        zzb = zzhcVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzhc.class, zzhcVar);
    }

    private zzhc() {
    }

    public static com.google.android.gms.internal.measurement.zzhb zzc() {
        return (com.google.android.gms.internal.measurement.zzhb) zzb.zzcg();
    }

    public static com.google.android.gms.internal.measurement.zzhc zze() {
        return zzb;
    }

    static /* synthetic */ void zzm(com.google.android.gms.internal.measurement.zzhc zzhcVar) {
        zzhcVar.zzd &= -5;
        zzhcVar.zzg = zzb.zzg;
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.measurement.zzhc zzhcVar) {
        zzhcVar.zzd &= -3;
        zzhcVar.zzf = zzb.zzf;
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.measurement.zzhc zzhcVar) {
        zzhcVar.zzd &= -2;
        zzhcVar.zze = zzb.zze;
    }

    static /* synthetic */ void zzp(com.google.android.gms.internal.measurement.zzhc zzhcVar) {
        zzhcVar.zzd &= -65;
        zzhcVar.zzk = zzb.zzk;
    }

    static /* synthetic */ void zzq(com.google.android.gms.internal.measurement.zzhc zzhcVar) {
        zzhcVar.zzd &= -33;
        zzhcVar.zzj = zzb.zzj;
    }

    static /* synthetic */ void zzr(com.google.android.gms.internal.measurement.zzhc zzhcVar) {
        zzhcVar.zzd &= -17;
        zzhcVar.zzi = zzb.zzi;
    }

    static /* synthetic */ void zzs(com.google.android.gms.internal.measurement.zzhc zzhcVar, java.lang.String str) {
        zzhcVar.zzd |= 4;
        zzhcVar.zzg = str;
    }

    static /* synthetic */ void zzt(com.google.android.gms.internal.measurement.zzhc zzhcVar, java.lang.String str) {
        zzhcVar.zzd |= 2;
        zzhcVar.zzf = str;
    }

    static /* synthetic */ void zzu(com.google.android.gms.internal.measurement.zzhc zzhcVar, java.lang.String str) {
        zzhcVar.zzd |= 1;
        zzhcVar.zze = str;
    }

    static /* synthetic */ void zzv(com.google.android.gms.internal.measurement.zzhc zzhcVar, long j) {
        zzhcVar.zzd |= 8;
        zzhcVar.zzh = j;
    }

    static /* synthetic */ void zzw(com.google.android.gms.internal.measurement.zzhc zzhcVar, long j) {
        zzhcVar.zzd |= 128;
        zzhcVar.zzl = j;
    }

    static /* synthetic */ void zzx(com.google.android.gms.internal.measurement.zzhc zzhcVar, java.lang.String str) {
        zzhcVar.zzd |= 64;
        zzhcVar.zzk = str;
    }

    static /* synthetic */ void zzy(com.google.android.gms.internal.measurement.zzhc zzhcVar, java.lang.String str) {
        zzhcVar.zzd |= 32;
        zzhcVar.zzj = str;
    }

    static /* synthetic */ void zzz(com.google.android.gms.internal.measurement.zzhc zzhcVar, java.lang.String str) {
        zzhcVar.zzd |= 16;
        zzhcVar.zzi = str;
    }

    public final boolean zzA() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzB() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzC() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzD() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzE() {
        return (this.zzd & 128) != 0;
    }

    public final boolean zzF() {
        return (this.zzd & 64) != 0;
    }

    public final boolean zzG() {
        return (this.zzd & 32) != 0;
    }

    public final boolean zzH() {
        return (this.zzd & 16) != 0;
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzl;
    }

    public final java.lang.String zzf() {
        return this.zzg;
    }

    public final java.lang.String zzg() {
        return this.zzf;
    }

    public final java.lang.String zzh() {
        return this.zze;
    }

    public final java.lang.String zzi() {
        return this.zzk;
    }

    public final java.lang.String zzj() {
        return this.zzj;
    }

    public final java.lang.String zzk() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhc();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhb(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
