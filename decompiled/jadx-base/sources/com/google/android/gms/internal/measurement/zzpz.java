package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpz implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzpz zza = new com.google.android.gms.internal.measurement.zzpz();
    private final com.google.common.base.Supplier zzb = com.google.common.base.Suppliers.ofInstance(new com.google.android.gms.internal.measurement.zzqb());

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzb() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzqa get() {
        return (com.google.android.gms.internal.measurement.zzqa) this.zzb.get();
    }
}
