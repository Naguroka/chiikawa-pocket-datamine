package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeqb implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;

    public zzeqb(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4) {
        this.zza = zzhfjVar2;
        this.zzb = zzhfjVar3;
        this.zzc = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzesd zzesdVar;
        com.google.android.gms.internal.ads.zzero zzeroVarZza = com.google.android.gms.internal.ads.zzerq.zza();
        com.google.android.gms.internal.ads.zzeoj zzeojVar = (com.google.android.gms.internal.ads.zzeoj) this.zza.zzb();
        java.util.List list = (java.util.List) this.zzb.zzb();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            zzesdVar = new com.google.android.gms.internal.ads.zzesd(zzeojVar, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmb)).intValue(), scheduledExecutorService);
        } else {
            zzesdVar = new com.google.android.gms.internal.ads.zzesd(zzeroVarZza, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmb)).intValue(), scheduledExecutorService);
        }
        return zzesdVar;
    }
}
