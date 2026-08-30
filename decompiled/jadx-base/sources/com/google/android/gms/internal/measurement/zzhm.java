package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhm extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhm zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzmj zze = zzcn();
    private java.lang.String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        com.google.android.gms.internal.measurement.zzhm zzhmVar = new com.google.android.gms.internal.measurement.zzhm();
        zzb = zzhmVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzhm.class, zzhmVar);
    }

    private zzhm() {
    }

    public static com.google.android.gms.internal.measurement.zzhl zze() {
        return (com.google.android.gms.internal.measurement.zzhl) zzb.zzcg();
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzhm zzhmVar, java.lang.Iterable iterable) {
        zzhmVar.zzv();
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzhmVar.zze);
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.measurement.zzhm zzhmVar, com.google.android.gms.internal.measurement.zzhq zzhqVar) {
        zzhqVar.getClass();
        zzhmVar.zzv();
        zzhmVar.zze.add(zzhqVar);
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.measurement.zzhm zzhmVar, int i) {
        zzhmVar.zzv();
        zzhmVar.zze.remove(i);
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.measurement.zzhm zzhmVar, java.lang.String str) {
        str.getClass();
        zzhmVar.zzd |= 1;
        zzhmVar.zzf = str;
    }

    static /* synthetic */ void zzp(com.google.android.gms.internal.measurement.zzhm zzhmVar, int i, com.google.android.gms.internal.measurement.zzhq zzhqVar) {
        zzhqVar.getClass();
        zzhmVar.zzv();
        zzhmVar.zze.set(i, zzhqVar);
    }

    static /* synthetic */ void zzq(com.google.android.gms.internal.measurement.zzhm zzhmVar, long j) {
        zzhmVar.zzd |= 4;
        zzhmVar.zzh = j;
    }

    static /* synthetic */ void zzr(com.google.android.gms.internal.measurement.zzhm zzhmVar, long j) {
        zzhmVar.zzd |= 2;
        zzhmVar.zzg = j;
    }

    private final void zzv() {
        com.google.android.gms.internal.measurement.zzmj zzmjVar = this.zze;
        if (zzmjVar.zzc()) {
            return;
        }
        this.zze = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final com.google.android.gms.internal.measurement.zzhq zzg(int i) {
        return (com.google.android.gms.internal.measurement.zzhq) this.zze.get(i);
    }

    public final java.lang.String zzh() {
        return this.zzf;
    }

    public final java.util.List zzi() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.measurement.zzhq.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhm();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhl(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean zzs() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 2) != 0;
    }
}
