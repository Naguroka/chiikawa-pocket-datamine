package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhep implements com.google.android.gms.internal.ads.zzher {
    private com.google.android.gms.internal.ads.zzhfa zza;

    public static void zza(com.google.android.gms.internal.ads.zzhfa zzhfaVar, com.google.android.gms.internal.ads.zzhfa zzhfaVar2) {
        com.google.android.gms.internal.ads.zzhep zzhepVar = (com.google.android.gms.internal.ads.zzhep) zzhfaVar;
        if (zzhepVar.zza != null) {
            throw new java.lang.IllegalStateException();
        }
        zzhepVar.zza = zzhfaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzhfa zzhfaVar = this.zza;
        if (zzhfaVar != null) {
            return zzhfaVar.zzb();
        }
        throw new java.lang.IllegalStateException();
    }
}
