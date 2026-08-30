package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzic extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzic zzb;
    private com.google.android.gms.internal.measurement.zzmi zzd = zzcl();
    private com.google.android.gms.internal.measurement.zzmi zze = zzcl();
    private com.google.android.gms.internal.measurement.zzmj zzf = zzcn();
    private com.google.android.gms.internal.measurement.zzmj zzg = zzcn();

    static {
        com.google.android.gms.internal.measurement.zzic zzicVar = new com.google.android.gms.internal.measurement.zzic();
        zzb = zzicVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzic.class, zzicVar);
    }

    private zzic() {
    }

    public static com.google.android.gms.internal.measurement.zzib zze() {
        return (com.google.android.gms.internal.measurement.zzib) zzb.zzcg();
    }

    public static com.google.android.gms.internal.measurement.zzic zzg() {
        return zzb;
    }

    static /* synthetic */ void zzm(com.google.android.gms.internal.measurement.zzic zzicVar, java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmj zzmjVar = zzicVar.zzf;
        if (!zzmjVar.zzc()) {
            zzicVar.zzf = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
        }
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzicVar.zzf);
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.measurement.zzic zzicVar, java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmi zzmiVar = zzicVar.zze;
        if (!zzmiVar.zzc()) {
            zzicVar.zze = com.google.android.gms.internal.measurement.zzmd.zzcm(zzmiVar);
        }
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzicVar.zze);
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.measurement.zzic zzicVar, java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmj zzmjVar = zzicVar.zzg;
        if (!zzmjVar.zzc()) {
            zzicVar.zzg = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
        }
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzicVar.zzg);
    }

    static /* synthetic */ void zzp(com.google.android.gms.internal.measurement.zzic zzicVar, java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmi zzmiVar = zzicVar.zzd;
        if (!zzmiVar.zzc()) {
            zzicVar.zzd = com.google.android.gms.internal.measurement.zzmd.zzcm(zzmiVar);
        }
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzicVar.zzd);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final int zzd() {
        return this.zzd.size();
    }

    public final java.util.List zzh() {
        return this.zzf;
    }

    public final java.util.List zzi() {
        return this.zze;
    }

    public final java.util.List zzj() {
        return this.zzg;
    }

    public final java.util.List zzk() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new java.lang.Object[]{"zzd", "zze", "zzf", com.google.android.gms.internal.measurement.zzhk.class, "zzg", com.google.android.gms.internal.measurement.zzie.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzic();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzib(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
