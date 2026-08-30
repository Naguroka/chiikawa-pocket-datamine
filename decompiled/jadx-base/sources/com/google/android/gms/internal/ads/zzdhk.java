package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdhk implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;

    public zzdhk(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcelZza = ((com.google.android.gms.internal.ads.zzchs) this.zza).zza();
        com.google.android.gms.ads.internal.zzv.zzq();
        return new com.google.android.gms.internal.ads.zzayg(java.util.UUID.randomUUID().toString(), versionInfoParcelZza, com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE, new org.json.JSONObject(), false, true);
    }
}
