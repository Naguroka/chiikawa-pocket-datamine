package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqr implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzqr zza = new com.google.android.gms.internal.measurement.zzqr();
    private final com.google.common.base.Supplier zzb = com.google.common.base.Suppliers.ofInstance(new com.google.android.gms.internal.measurement.zzqt());

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzb() {
        zza.get().zza();
        return true;
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzc() {
        return zza.get().zzb();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzd() {
        return zza.get().zzc();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zze() {
        return zza.get().zzd();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzf() {
        return zza.get().zze();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzg() {
        return zza.get().zzf();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzh() {
        return zza.get().zzg();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzi() {
        return zza.get().zzh();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzj() {
        return zza.get().zzi();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzqs get() {
        return (com.google.android.gms.internal.measurement.zzqs) this.zzb.get();
    }
}
