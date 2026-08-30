package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdlu {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.internal.ads.zzdlp zzb;

    public zzdlu(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdlp zzdlpVar) {
        this.zza = executor;
        this.zzb = zzdlpVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(org.json.JSONObject jSONObject, java.lang.String str) {
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzh;
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return com.google.android.gms.internal.ads.zzgch.zzh(java.util.Collections.emptyList());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzh(null);
            } else {
                final java.lang.String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzh(null);
                } else {
                    java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    listenableFutureZzh = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING.equals(strOptString2) ? com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzdlt(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? com.google.android.gms.internal.ads.zzgch.zzm(this.zzb.zze(jSONObjectOptJSONObject, "image_value"), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzdlr
                        @Override // com.google.android.gms.internal.ads.zzfuc
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return new com.google.android.gms.internal.ads.zzdlt(strOptString, (com.google.android.gms.internal.ads.zzbfj) obj);
                        }
                    }, this.zza) : com.google.android.gms.internal.ads.zzgch.zzh(null);
                }
            }
            arrayList.add(listenableFutureZzh);
        }
        return com.google.android.gms.internal.ads.zzgch.zzm(com.google.android.gms.internal.ads.zzgch.zzd(arrayList), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzdls
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.google.android.gms.internal.ads.zzdlt zzdltVar : (java.util.List) obj) {
                    if (zzdltVar != null) {
                        arrayList2.add(zzdltVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
