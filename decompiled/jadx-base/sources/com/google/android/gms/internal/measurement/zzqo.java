package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqo implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzqo zza = new com.google.android.gms.internal.measurement.zzqo();
    private final com.google.common.base.Supplier zzb = com.google.common.base.Suppliers.ofInstance(new com.google.android.gms.internal.measurement.zzqq());

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static double zza() {
        return zza.get().zza();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static long zzb() {
        return zza.get().zzb();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static long zzc() {
        return zza.get().zzc();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static long zzd() {
        return zza.get().zzd();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static java.lang.String zzf() {
        return zza.get().zze();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzg() {
        return zza.get().zzf();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzqp get() {
        return (com.google.android.gms.internal.measurement.zzqp) this.zzb.get();
    }
}
