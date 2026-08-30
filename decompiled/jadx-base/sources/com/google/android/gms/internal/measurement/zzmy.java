package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmy implements com.google.android.gms.internal.measurement.zznf {
    private final com.google.android.gms.internal.measurement.zznf[] zza;

    zzmy(com.google.android.gms.internal.measurement.zznf... zznfVarArr) {
        this.zza = zznfVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final com.google.android.gms.internal.measurement.zzne zzb(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            com.google.android.gms.internal.measurement.zznf zznfVar = this.zza[i];
            if (zznfVar.zzc(cls)) {
                return zznfVar.zzb(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(java.lang.String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final boolean zzc(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
