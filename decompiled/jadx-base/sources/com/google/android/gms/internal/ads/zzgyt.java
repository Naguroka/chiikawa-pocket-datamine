package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgyt implements com.google.android.gms.internal.ads.zzgza {
    private final com.google.android.gms.internal.ads.zzgza[] zza;

    zzgyt(com.google.android.gms.internal.ads.zzgza... zzgzaVarArr) {
        this.zza = zzgzaVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final com.google.android.gms.internal.ads.zzgyz zzb(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            com.google.android.gms.internal.ads.zzgza zzgzaVar = this.zza[i];
            if (zzgzaVar.zzc(cls)) {
                return zzgzaVar.zzb(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(java.lang.String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final boolean zzc(java.lang.Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
