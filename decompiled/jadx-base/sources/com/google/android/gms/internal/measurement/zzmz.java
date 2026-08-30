package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmz implements com.google.android.gms.internal.measurement.zznt {
    private static final com.google.android.gms.internal.measurement.zznf zza = new com.google.android.gms.internal.measurement.zzmx();
    private final com.google.android.gms.internal.measurement.zznf zzb;

    public zzmz() {
        com.google.android.gms.internal.measurement.zznf zznfVar = zza;
        int i = com.google.android.gms.internal.measurement.zznp.zza;
        com.google.android.gms.internal.measurement.zzmy zzmyVar = new com.google.android.gms.internal.measurement.zzmy(com.google.android.gms.internal.measurement.zzly.zza(), zznfVar);
        byte[] bArr = com.google.android.gms.internal.measurement.zzmk.zzb;
        this.zzb = zzmyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final com.google.android.gms.internal.measurement.zzns zza(java.lang.Class cls) {
        int i = com.google.android.gms.internal.measurement.zznu.zza;
        if (!com.google.android.gms.internal.measurement.zzmd.class.isAssignableFrom(cls)) {
            int i2 = com.google.android.gms.internal.measurement.zznp.zza;
        }
        com.google.android.gms.internal.measurement.zzne zzneVarZzb = this.zzb.zzb(cls);
        if (zzneVarZzb.zzb()) {
            int i3 = com.google.android.gms.internal.measurement.zznp.zza;
            return com.google.android.gms.internal.measurement.zznl.zzc(com.google.android.gms.internal.measurement.zznu.zzm(), com.google.android.gms.internal.measurement.zzls.zza(), zzneVarZzb.zza());
        }
        int i4 = com.google.android.gms.internal.measurement.zznp.zza;
        return com.google.android.gms.internal.measurement.zznk.zzl(cls, zzneVarZzb, com.google.android.gms.internal.measurement.zznn.zza(), com.google.android.gms.internal.measurement.zzmv.zza(), com.google.android.gms.internal.measurement.zznu.zzm(), zzneVarZzb.zzc() + (-1) != 1 ? com.google.android.gms.internal.measurement.zzls.zza() : null, com.google.android.gms.internal.measurement.zznd.zza());
    }
}
