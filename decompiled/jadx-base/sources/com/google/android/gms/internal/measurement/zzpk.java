package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpk implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzpk zza = new com.google.android.gms.internal.measurement.zzpk();
    private final com.google.common.base.Supplier zzb = com.google.common.base.Suppliers.ofInstance(new com.google.android.gms.internal.measurement.zzpm());

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzb() {
        return zza.get().zza();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzc() {
        return zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzpl get() {
        return (com.google.android.gms.internal.measurement.zzpl) this.zzb.get();
    }
}
