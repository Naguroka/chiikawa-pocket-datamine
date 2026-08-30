package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgc implements com.google.android.gms.internal.play_billing.zzgj {
    private final com.google.android.gms.internal.play_billing.zzgj[] zza;

    zzgc(com.google.android.gms.internal.play_billing.zzgj... zzgjVarArr) {
        this.zza = zzgjVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgj
    public final com.google.android.gms.internal.play_billing.zzgi zzb(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            com.google.android.gms.internal.play_billing.zzgj zzgjVar = this.zza[i];
            if (zzgjVar.zzc(cls)) {
                return zzgjVar.zzb(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(java.lang.String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.play_billing.zzgj
    public final boolean zzc(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
