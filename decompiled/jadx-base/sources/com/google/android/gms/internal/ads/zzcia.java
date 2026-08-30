package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcia implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;

    public zzcia(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzbve zzb() {
        android.content.Context contextZza = ((com.google.android.gms.internal.ads.zzche) this.zza).zza();
        com.google.android.gms.internal.ads.zzfhk zzfhkVar = (com.google.android.gms.internal.ads.zzfhk) this.zzb.zzb();
        com.google.android.gms.ads.internal.zzv.zzg().zzb(contextZza, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), zzfhkVar).zza("google.afma.request.getAdDictionary", com.google.android.gms.internal.ads.zzbod.zza, com.google.android.gms.internal.ads.zzbod.zza);
        com.google.android.gms.internal.ads.zzbog zzbogVarZzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(contextZza, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), zzfhkVar);
        com.google.android.gms.internal.ads.zzboa zzboaVar = com.google.android.gms.internal.ads.zzbod.zza;
        return new com.google.android.gms.internal.ads.zzbvg(contextZza, zzbogVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzboaVar, zzboaVar), com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage());
    }
}
