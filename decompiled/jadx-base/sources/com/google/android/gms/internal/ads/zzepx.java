package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzepx implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;

    public zzepx(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzfxs zzfxsVarZzn;
        com.google.android.gms.internal.ads.zzeqv zzeqvVarZzb = ((com.google.android.gms.internal.ads.zzeqx) this.zza).zzb();
        android.content.Context contextZza = ((com.google.android.gms.internal.ads.zzche) this.zzb).zza();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlk)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(contextZza)) {
                zzfxsVarZzn = com.google.android.gms.internal.ads.zzfxs.zzo(zzeqvVarZzb);
            } else {
                zzfxsVarZzn = com.google.android.gms.internal.ads.zzfxs.zzn();
            }
        } else {
            zzfxsVarZzn = com.google.android.gms.internal.ads.zzfxs.zzn();
        }
        com.google.android.gms.internal.ads.zzhez.zzb(zzfxsVarZzn);
        return zzfxsVarZzn;
    }
}
