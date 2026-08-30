package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzra implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzra zza = new com.google.android.gms.internal.measurement.zzra();
    private final com.google.common.base.Supplier zzb = com.google.common.base.Suppliers.ofInstance(new com.google.android.gms.internal.measurement.zzrc());

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzb() {
        zza.get().zza();
        return true;
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzc() {
        return zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzrb get() {
        return (com.google.android.gms.internal.measurement.zzrb) this.zzb.get();
    }
}
