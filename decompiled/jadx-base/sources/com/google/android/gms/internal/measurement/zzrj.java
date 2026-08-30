package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrj implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzrj zza = new com.google.android.gms.internal.measurement.zzrj();
    private final com.google.common.base.Supplier zzb = com.google.common.base.Suppliers.ofInstance(new com.google.android.gms.internal.measurement.zzrl());

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzb() {
        return zza.get().zza();
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

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzrk get() {
        return (com.google.android.gms.internal.measurement.zzrk) this.zzb.get();
    }
}
