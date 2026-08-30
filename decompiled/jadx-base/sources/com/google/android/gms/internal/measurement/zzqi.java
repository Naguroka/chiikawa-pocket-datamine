package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqi implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzqi zza = new com.google.android.gms.internal.measurement.zzqi();
    private final com.google.common.base.Supplier zzb = com.google.common.base.Suppliers.ofInstance(new com.google.android.gms.internal.measurement.zzqk());

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzb() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzqj get() {
        return (com.google.android.gms.internal.measurement.zzqj) this.zzb.get();
    }
}
