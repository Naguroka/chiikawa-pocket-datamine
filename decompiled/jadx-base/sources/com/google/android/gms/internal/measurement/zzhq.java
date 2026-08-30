package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhq extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhq zzb;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.measurement.zzmj zzj = zzcn();

    static {
        com.google.android.gms.internal.measurement.zzhq zzhqVar = new com.google.android.gms.internal.measurement.zzhq();
        zzb = zzhqVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzhq.class, zzhqVar);
    }

    private zzhq() {
    }

    public static com.google.android.gms.internal.measurement.zzhp zze() {
        return (com.google.android.gms.internal.measurement.zzhp) zzb.zzcg();
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzhq zzhqVar, java.lang.Iterable iterable) {
        zzhqVar.zzz();
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzhqVar.zzj);
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.measurement.zzhq zzhqVar, com.google.android.gms.internal.measurement.zzhq zzhqVar2) {
        zzhqVar2.getClass();
        zzhqVar.zzz();
        zzhqVar.zzj.add(zzhqVar2);
    }

    static /* synthetic */ void zzm(com.google.android.gms.internal.measurement.zzhq zzhqVar) {
        zzhqVar.zzd &= -17;
        zzhqVar.zzi = 0.0d;
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.measurement.zzhq zzhqVar) {
        zzhqVar.zzd &= -5;
        zzhqVar.zzg = 0L;
    }

    static /* synthetic */ void zzp(com.google.android.gms.internal.measurement.zzhq zzhqVar) {
        zzhqVar.zzd &= -3;
        zzhqVar.zzf = zzb.zzf;
    }

    static /* synthetic */ void zzq(com.google.android.gms.internal.measurement.zzhq zzhqVar, double d) {
        zzhqVar.zzd |= 16;
        zzhqVar.zzi = d;
    }

    static /* synthetic */ void zzr(com.google.android.gms.internal.measurement.zzhq zzhqVar, long j) {
        zzhqVar.zzd |= 4;
        zzhqVar.zzg = j;
    }

    static /* synthetic */ void zzs(com.google.android.gms.internal.measurement.zzhq zzhqVar, java.lang.String str) {
        str.getClass();
        zzhqVar.zzd |= 1;
        zzhqVar.zze = str;
    }

    static /* synthetic */ void zzt(com.google.android.gms.internal.measurement.zzhq zzhqVar, java.lang.String str) {
        str.getClass();
        zzhqVar.zzd |= 2;
        zzhqVar.zzf = str;
    }

    private final void zzz() {
        com.google.android.gms.internal.measurement.zzmj zzmjVar = this.zzj;
        if (zzmjVar.zzc()) {
            return;
        }
        this.zzj = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
    }

    public final double zza() {
        return this.zzi;
    }

    public final float zzb() {
        return this.zzh;
    }

    public final int zzc() {
        return this.zzj.size();
    }

    public final long zzd() {
        return this.zzg;
    }

    public final java.lang.String zzg() {
        return this.zze;
    }

    public final java.lang.String zzh() {
        return this.zzf;
    }

    public final java.util.List zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", com.google.android.gms.internal.measurement.zzhq.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhq();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhp(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean zzu() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzv() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzw() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzx() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzy() {
        return (this.zzd & 2) != 0;
    }
}
