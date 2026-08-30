package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdla {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final com.google.android.gms.internal.ads.zzdlp zzb;
    private final com.google.android.gms.internal.ads.zzdlu zzc;

    public zzdla(com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzdlp zzdlpVar, com.google.android.gms.internal.ads.zzdlu zzdluVar) {
        this.zza = zzgcsVar;
        this.zzb = zzdlpVar;
        this.zzc = zzdluVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final /* synthetic */ com.google.android.gms.internal.ads.zzdif zzb(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.common.util.concurrent.ListenableFuture listenableFuture2, com.google.common.util.concurrent.ListenableFuture listenableFuture3, com.google.common.util.concurrent.ListenableFuture listenableFuture4, com.google.common.util.concurrent.ListenableFuture listenableFuture5, org.json.JSONObject jSONObject, com.google.common.util.concurrent.ListenableFuture listenableFuture6, com.google.common.util.concurrent.ListenableFuture listenableFuture7, com.google.common.util.concurrent.ListenableFuture listenableFuture8, com.google.common.util.concurrent.ListenableFuture listenableFuture9, com.google.common.util.concurrent.ListenableFuture listenableFuture10) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzdif zzdifVar = (com.google.android.gms.internal.ads.zzdif) listenableFuture.get();
        zzdifVar.zzP((java.util.List) listenableFuture2.get());
        zzdifVar.zzM((com.google.android.gms.internal.ads.zzbfw) listenableFuture3.get());
        zzdifVar.zzQ((com.google.android.gms.internal.ads.zzbfw) listenableFuture4.get());
        zzdifVar.zzJ((com.google.android.gms.internal.ads.zzbfp) listenableFuture5.get());
        zzdifVar.zzS(com.google.android.gms.internal.ads.zzdlp.zzj(jSONObject));
        zzdifVar.zzL(com.google.android.gms.internal.ads.zzdlp.zzi(jSONObject));
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) listenableFuture6.get();
        if (zzcexVar != null) {
            zzdifVar.zzad(zzcexVar);
            zzdifVar.zzac(zzcexVar.zzF());
            zzdifVar.zzab(zzcexVar.zzq());
        }
        zzdifVar.zzd().putAll((android.os.Bundle) listenableFuture7.get());
        com.google.android.gms.internal.ads.zzcex zzcexVar2 = (com.google.android.gms.internal.ads.zzcex) listenableFuture8.get();
        if (zzcexVar2 != null) {
            zzdifVar.zzO(zzcexVar2);
            zzdifVar.zzae(zzcexVar2.zzF());
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfl)).booleanValue() || zzc(jSONObject)) {
            com.google.android.gms.internal.ads.zzcex zzcexVar3 = (com.google.android.gms.internal.ads.zzcex) listenableFuture9.get();
            if (zzcexVar3 != null) {
                zzdifVar.zzT(zzcexVar3);
            }
        } else {
            zzdifVar.zzU(listenableFuture9);
            zzdifVar.zzX(new com.google.android.gms.internal.ads.zzcab());
        }
        for (com.google.android.gms.internal.ads.zzdlt zzdltVar : (java.util.List) listenableFuture10.get()) {
            if (zzdltVar.zza != 1) {
                zzdifVar.zzN(zzdltVar.zzb, zzdltVar.zzd);
            } else {
                zzdifVar.zzZ(zzdltVar.zzb, zzdltVar.zzc);
            }
        }
        return zzdifVar;
    }

    private static final boolean zzc(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzfca zzfcaVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar, final org.json.JSONObject jSONObject) {
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzh;
        org.json.JSONObject jSONObjectOptJSONObject;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzh2;
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzb = this.zza.zzb(new java.util.concurrent.Callable(this) { // from class: com.google.android.gms.internal.ads.zzdkv
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws com.google.android.gms.internal.ads.zzegu {
                com.google.android.gms.internal.ads.zzdif zzdifVar = new com.google.android.gms.internal.ads.zzdif();
                org.json.JSONObject jSONObject2 = jSONObject;
                zzdifVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdifVar.zzK(jSONObject2.optString("custom_template_id"));
                org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                java.lang.String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                com.google.android.gms.internal.ads.zzfca zzfcaVar2 = zzfcaVar;
                zzdifVar.zzV(strOptString);
                com.google.android.gms.internal.ads.zzfcj zzfcjVar = zzfcaVar2.zza.zza;
                if (!zzfcjVar.zzg.contains(java.lang.Integer.toString(zzdifVar.zzc()))) {
                    throw new com.google.android.gms.internal.ads.zzegu(1, "Invalid template ID: " + zzdifVar.zzc());
                }
                if (zzdifVar.zzc() == 3) {
                    if (zzdifVar.zzA() == null) {
                        throw new com.google.android.gms.internal.ads.zzegu(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfcjVar.zzh.contains(zzdifVar.zzA())) {
                        throw new com.google.android.gms.internal.ads.zzegu(1, "Unexpected custom template id in the response.");
                    }
                }
                com.google.android.gms.internal.ads.zzfbo zzfboVar2 = zzfboVar;
                zzdifVar.zzY(jSONObject2.optDouble("rating", -1.0d));
                java.lang.String strOptString2 = jSONObject2.optString("headline", null);
                if (zzfboVar2.zzM) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    strOptString2 = com.google.android.gms.ads.internal.util.zzs.zzz() + " : " + strOptString2;
                }
                zzdifVar.zzZ("headline", strOptString2);
                zzdifVar.zzZ("body", jSONObject2.optString("body", null));
                zzdifVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdifVar.zzZ(com.ironsource.y8.h.U, jSONObject2.optString(com.ironsource.y8.h.U, null));
                zzdifVar.zzZ("price", jSONObject2.optString("price", null));
                zzdifVar.zzZ(com.ironsource.y8.h.F0, jSONObject2.optString(com.ironsource.y8.h.F0, null));
                return zzdifVar;
            }
        });
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzf = this.zzb.zzf(jSONObject, "images");
        com.google.android.gms.internal.ads.zzfbr zzfbrVar = zzfcaVar.zzb.zzb;
        com.google.android.gms.internal.ads.zzdlp zzdlpVar = this.zzb;
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzg = zzdlpVar.zzg(jSONObject, "images", zzfboVar, zzfbrVar);
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZze = zzdlpVar.zze(jSONObject, "secondary_image");
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZze2 = zzdlpVar.zze(jSONObject, "app_icon");
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzd = zzdlpVar.zzd(jSONObject, com.json.z8.ATTRIBUTION);
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzh3 = this.zzb.zzh(jSONObject, zzfboVar, zzfcaVar.zzb.zzb);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmO)).booleanValue() && ((java.lang.Integer) java.util.Optional.ofNullable(jSONObject.optJSONObject("video")).map(new java.util.function.Function() { // from class: com.google.android.gms.internal.ads.zzdkw
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((org.json.JSONObject) obj).optJSONArray("flags");
            }
        }).map(new java.util.function.Function() { // from class: com.google.android.gms.internal.ads.zzdkx
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                for (int i = 0; i < jSONArray.length(); i++) {
                    org.json.JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2.optString(com.ironsource.y8.h.W).equals("afma_video_player_type")) {
                        return jSONObjectOptJSONObject2.optString("value");
                    }
                }
                return null;
            }
        }).map(new java.util.function.Function() { // from class: com.google.android.gms.internal.ads.zzdky
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) obj));
            }
        }).orElse(0)).intValue() == 3) {
            com.google.android.gms.internal.ads.zzdlp zzdlpVar2 = this.zzb;
            com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
            com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzh3, new com.google.android.gms.internal.ads.zzdlo(zzdlpVar2, zzcabVar), com.google.android.gms.internal.ads.zzbzw.zzf);
            listenableFutureZzh = zzcabVar;
        } else {
            listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzh(new android.os.Bundle());
        }
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZza = this.zzc.zza(jSONObject, "custom_assets");
        final com.google.android.gms.internal.ads.zzdlp zzdlpVar3 = this.zzb;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final java.lang.String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            listenableFutureZzh2 = android.text.TextUtils.isEmpty(strOptString) ? com.google.android.gms.internal.ads.zzgch.zzh(null) : com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzh(null), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdle
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return zzdlpVar3.zzc(strOptString, obj);
                }
            }, com.google.android.gms.internal.ads.zzbzw.zzf);
        } else {
            listenableFutureZzh2 = com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        final com.google.common.util.concurrent.ListenableFuture listenableFuture = listenableFutureZzh2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(listenableFutureZzb);
        arrayList.add(listenableFutureZzf);
        arrayList.add(listenableFutureZzg);
        arrayList.add(listenableFutureZze);
        arrayList.add(listenableFutureZze2);
        arrayList.add(listenableFutureZzd);
        arrayList.add(listenableFutureZzh3);
        arrayList.add(listenableFutureZzh);
        arrayList.add(listenableFutureZza);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfl)).booleanValue() || zzc(jSONObject)) {
            arrayList.add(listenableFuture);
        }
        return com.google.android.gms.internal.ads.zzgch.zza(arrayList).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdkz
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzdla.zzb(listenableFutureZzb, listenableFutureZzf, listenableFutureZze2, listenableFutureZze, listenableFutureZzd, jSONObject, listenableFutureZzh3, listenableFutureZzh, listenableFutureZzg, listenableFuture, listenableFutureZza);
            }
        }, this.zza);
    }
}
