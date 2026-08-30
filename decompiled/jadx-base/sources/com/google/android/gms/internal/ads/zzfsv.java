package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfsv extends com.google.android.gms.internal.ads.zzfro {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfsw zza;
    private final com.google.android.gms.internal.ads.zzftb zzb;

    zzfsv(com.google.android.gms.internal.ads.zzfsw zzfswVar, com.google.android.gms.internal.ads.zzftb zzftbVar) {
        this.zza = zzfswVar;
        this.zzb = zzftbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrp
    public final void zzb(android.os.Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        java.lang.String string = bundle.getString("sessionToken");
        com.google.android.gms.internal.ads.zzfsz zzfszVarZzc = com.google.android.gms.internal.ads.zzfta.zzc();
        zzfszVarZzc.zzb(i);
        if (string != null) {
            zzfszVarZzc.zza(string);
        }
        this.zzb.zza(zzfszVarZzc.zzc());
        if (i == 8157) {
            this.zza.zza();
        }
    }
}
