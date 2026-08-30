package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbos implements com.google.android.gms.internal.ads.zzgbo {
    private final java.lang.String zza = "google.afma.activeView.handleUpdate";
    private final com.google.common.util.concurrent.ListenableFuture zzb;

    zzbos(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.String str, com.google.android.gms.internal.ads.zzbnz zzbnzVar, com.google.android.gms.internal.ads.zzbny zzbnyVar) {
        this.zzb = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws java.lang.Exception {
        return zzb(obj);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(final java.lang.Object obj) {
        return com.google.android.gms.internal.ads.zzgch.zzn(this.zzb, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzboq
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj2) {
                return this.zza.zzc(obj, (com.google.android.gms.internal.ads.zzbnt) obj2);
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Object obj, com.google.android.gms.internal.ads.zzbnt zzbntVar) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        com.google.android.gms.ads.internal.zzv.zzq();
        java.lang.String string = java.util.UUID.randomUUID().toString();
        com.google.android.gms.internal.ads.zzbjo.zzo.zzc(string, new com.google.android.gms.internal.ads.zzbor(this, zzcabVar));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (org.json.JSONObject) obj);
        zzbntVar.zzl(this.zza, jSONObject);
        return zzcabVar;
    }
}
