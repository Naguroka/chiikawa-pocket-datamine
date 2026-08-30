package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbok implements com.google.android.gms.internal.ads.zzbnw {
    private final com.google.android.gms.internal.ads.zzbny zza;
    private final com.google.android.gms.internal.ads.zzbnz zzb;
    private final com.google.android.gms.internal.ads.zzbns zzc;
    private final java.lang.String zzd;

    zzbok(com.google.android.gms.internal.ads.zzbns zzbnsVar, java.lang.String str, com.google.android.gms.internal.ads.zzbnz zzbnzVar, com.google.android.gms.internal.ads.zzbny zzbnyVar) {
        this.zzc = zzbnsVar;
        this.zzd = str;
        this.zzb = zzbnzVar;
        this.zza = zzbnyVar;
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzbok zzbokVar, com.google.android.gms.internal.ads.zzbnm zzbnmVar, com.google.android.gms.internal.ads.zzbnt zzbntVar, java.lang.Object obj, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            java.lang.String string = java.util.UUID.randomUUID().toString();
            com.google.android.gms.internal.ads.zzbjo.zzo.zzc(string, new com.google.android.gms.internal.ads.zzboj(zzbokVar, zzbnmVar, zzcabVar));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", zzbokVar.zzb.zzb(obj));
            zzbntVar.zzl(zzbokVar.zzd, jSONObject);
        } catch (java.lang.Exception e) {
            try {
                zzcabVar.zzd(e);
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbnmVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws java.lang.Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final com.google.common.util.concurrent.ListenableFuture zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        com.google.android.gms.internal.ads.zzbnm zzbnmVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbnmVarZzb.zzj(new com.google.android.gms.internal.ads.zzboh(this, zzbnmVarZzb, obj, zzcabVar), new com.google.android.gms.internal.ads.zzboi(this, zzcabVar, zzbnmVarZzb));
        return zzcabVar;
    }
}
