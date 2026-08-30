package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbi implements com.google.android.gms.internal.ads.zzgbo {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.internal.ads.zzdwz zzb;

    public zzbi(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdwz zzdwzVar) {
        this.zza = executor;
        this.zzb = zzdwzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws java.lang.Exception {
        final com.google.android.gms.internal.ads.zzbvk zzbvkVar = (com.google.android.gms.internal.ads.zzbvk) obj;
        return com.google.android.gms.internal.ads.zzgch.zzn(this.zzb.zzc(zzbvkVar), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj2) {
                com.google.android.gms.internal.ads.zzdyi zzdyiVar = (com.google.android.gms.internal.ads.zzdyi) obj2;
                com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzbk(new android.util.JsonReader(new java.io.InputStreamReader(zzdyiVar.zzb())), zzdyiVar.zza());
                com.google.android.gms.internal.ads.zzbvk zzbvkVar2 = zzbvkVar;
                try {
                    zzbkVar.zzb = com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(zzbvkVar2.zza).toString();
                } catch (org.json.JSONException unused) {
                    zzbkVar.zzb = com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
                }
                if (!zzbvkVar2.zzn.isEmpty()) {
                    try {
                        zzbkVar.zzc = com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(zzbvkVar2.zzn).toString();
                    } catch (org.json.JSONException unused2) {
                    }
                }
                return com.google.android.gms.internal.ads.zzgch.zzh(zzbkVar);
            }
        }, this.zza);
    }
}
