package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeqh implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;
    private final com.google.android.gms.internal.ads.zzhfj zzd;

    public zzeqh(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzesd zzesdVar;
        com.google.android.gms.internal.ads.zzetf zzetfVarZzb = ((com.google.android.gms.internal.ads.zzeth) this.zza).zzb();
        com.google.android.gms.internal.ads.zzeoj zzeojVar = (com.google.android.gms.internal.ads.zzeoj) this.zzb.zzb();
        java.util.List list = (java.util.List) this.zzc.zzb();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("35")) {
            zzesdVar = new com.google.android.gms.internal.ads.zzesd(zzeojVar, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlW)).intValue(), scheduledExecutorService);
        } else {
            zzesdVar = new com.google.android.gms.internal.ads.zzesd(zzetfVarZzb, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlW)).intValue(), scheduledExecutorService);
        }
        return zzesdVar;
    }
}
