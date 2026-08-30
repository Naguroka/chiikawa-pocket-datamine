package com.google.android.gms.ads.nonagon.util.logging.csi;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class CsiParamDefaults_Factory implements com.google.android.gms.internal.ads.zzher<com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults> {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;

    public CsiParamDefaults_Factory(com.google.android.gms.internal.ads.zzhfj<android.content.Context> zzhfjVar, com.google.android.gms.internal.ads.zzhfj<com.google.android.gms.ads.internal.util.client.VersionInfoParcel> zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    public static com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory create(com.google.android.gms.internal.ads.zzhfj<android.content.Context> zzhfjVar, com.google.android.gms.internal.ads.zzhfj<com.google.android.gms.ads.internal.util.client.VersionInfoParcel> zzhfjVar2) {
        return new com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory(zzhfjVar, zzhfjVar2);
    }

    public static com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults newInstance(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        return new com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults(context, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults zzb() {
        return newInstance((android.content.Context) this.zza.zzb(), (com.google.android.gms.ads.internal.util.client.VersionInfoParcel) this.zzb.zzb());
    }
}
