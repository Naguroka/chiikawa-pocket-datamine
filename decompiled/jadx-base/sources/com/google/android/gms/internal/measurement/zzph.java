package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzph implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzph zza = new com.google.android.gms.internal.measurement.zzph();
    private final com.google.common.base.Supplier zzb = com.google.common.base.Suppliers.ofInstance(new com.google.android.gms.internal.measurement.zzpj());

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

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzpi get() {
        return (com.google.android.gms.internal.measurement.zzpi) this.zzb.get();
    }
}
