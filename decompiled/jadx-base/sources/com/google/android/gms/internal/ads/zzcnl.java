package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcnl implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;

    public zzcnl(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcelZza = ((com.google.android.gms.internal.ads.zzchs) this.zza).zza();
        org.json.JSONObject jSONObject = (org.json.JSONObject) this.zzb.zzb();
        java.lang.String str = (java.lang.String) this.zzc.zzb();
        boolean zEquals = com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE.equals(str);
        com.google.android.gms.ads.internal.zzv.zzq();
        return new com.google.android.gms.internal.ads.zzayg(java.util.UUID.randomUUID().toString(), versionInfoParcelZza, str, jSONObject, false, zEquals);
    }
}
