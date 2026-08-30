package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhg extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhg zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        com.google.android.gms.internal.measurement.zzhg zzhgVar = new com.google.android.gms.internal.measurement.zzhg();
        zzb = zzhgVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzhg.class, zzhgVar);
    }

    private zzhg() {
    }

    public static com.google.android.gms.internal.measurement.zzhf zza() {
        return (com.google.android.gms.internal.measurement.zzhf) zzb.zzcg();
    }

    public static com.google.android.gms.internal.measurement.zzhg zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.measurement.zzhg zzhgVar, boolean z) {
        zzhgVar.zzd |= 32;
        zzhgVar.zzj = z;
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.measurement.zzhg zzhgVar, boolean z) {
        zzhgVar.zzd |= 16;
        zzhgVar.zzi = z;
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.measurement.zzhg zzhgVar, boolean z) {
        zzhgVar.zzd |= 1;
        zzhgVar.zze = z;
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.measurement.zzhg zzhgVar, boolean z) {
        zzhgVar.zzd |= 64;
        zzhgVar.zzk = z;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.measurement.zzhg zzhgVar, boolean z) {
        zzhgVar.zzd |= 2;
        zzhgVar.zzf = z;
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzhg zzhgVar, boolean z) {
        zzhgVar.zzd |= 4;
        zzhgVar.zzg = z;
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzhg zzhgVar, boolean z) {
        zzhgVar.zzd |= 8;
        zzhgVar.zzh = z;
    }

    public final boolean zzk() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhg();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhf(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean zzm() {
        return this.zzi;
    }

    public final boolean zzn() {
        return this.zze;
    }

    public final boolean zzo() {
        return this.zzk;
    }

    public final boolean zzp() {
        return this.zzf;
    }

    public final boolean zzq() {
        return this.zzg;
    }

    public final boolean zzr() {
        return this.zzh;
    }
}
