package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdlp {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdkt zzb;
    private final com.google.android.gms.internal.ads.zzava zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final com.google.android.gms.internal.ads.zzbbj zzf;
    private final java.util.concurrent.Executor zzg;
    private final com.google.android.gms.internal.ads.zzbfl zzh;
    private final com.google.android.gms.internal.ads.zzdmh zzi;
    private final com.google.android.gms.internal.ads.zzdow zzj;
    private final java.util.concurrent.ScheduledExecutorService zzk;
    private final com.google.android.gms.internal.ads.zzdnr zzl;
    private final com.google.android.gms.internal.ads.zzdrw zzm;
    private final com.google.android.gms.internal.ads.zzfja zzn;
    private final com.google.android.gms.internal.ads.zzebk zzo;
    private final com.google.android.gms.internal.ads.zzebv zzp;
    private final com.google.android.gms.internal.ads.zzfcn zzq;

    public zzdlp(android.content.Context context, com.google.android.gms.internal.ads.zzdkt zzdktVar, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, com.google.android.gms.internal.ads.zzbbj zzbbjVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.internal.ads.zzdmh zzdmhVar, com.google.android.gms.internal.ads.zzdow zzdowVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzebk zzebkVar, com.google.android.gms.internal.ads.zzdnr zzdnrVar, com.google.android.gms.internal.ads.zzebv zzebvVar, com.google.android.gms.internal.ads.zzfcn zzfcnVar) {
        this.zza = context;
        this.zzb = zzdktVar;
        this.zzc = zzavaVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbbjVar;
        this.zzg = executor;
        this.zzh = zzfcjVar.zzi;
        this.zzi = zzdmhVar;
        this.zzj = zzdowVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdrwVar;
        this.zzn = zzfjaVar;
        this.zzo = zzebkVar;
        this.zzl = zzdnrVar;
        this.zzp = zzebvVar;
        this.zzq = zzfcnVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzez zzi(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(jSONObjectOptJSONObject);
    }

    public static final java.util.List zzj(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return com.google.android.gms.internal.ads.zzfxn.zzn();
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return com.google.android.gms.internal.ads.zzfxn.zzn();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzez zzezVarZzr = zzr(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzezVarZzr != null) {
                arrayList.add(zzezVarZzr);
            }
        }
        return com.google.android.gms.internal.ads.zzfxn.zzl(arrayList);
    }

    private static com.google.common.util.concurrent.ListenableFuture zzl(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Object obj) {
        final java.lang.Object obj2 = null;
        return com.google.android.gms.internal.ads.zzgch.zzf(listenableFuture, java.lang.Exception.class, new com.google.android.gms.internal.ads.zzgbo(obj2) { // from class: com.google.android.gms.internal.ads.zzdlk
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (java.lang.Exception) obj3);
                return com.google.android.gms.internal.ads.zzgch.zzh(null);
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    private static com.google.common.util.concurrent.ListenableFuture zzm(boolean z, final com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Object obj) {
        return z ? com.google.android.gms.internal.ads.zzgch.zzn(listenableFuture, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdll
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj2) {
                return obj2 != null ? listenableFuture : com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzegu(1, "Retrieve required value in native ad response failed."));
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg) : zzl(listenableFuture, null);
    }

    private final com.google.common.util.concurrent.ListenableFuture zzn(org.json.JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        final java.lang.String strOptString = jSONObject.optString("url");
        if (android.text.TextUtils.isEmpty(strOptString)) {
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzbfj(null, android.net.Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return zzm(jSONObject.optBoolean("require"), com.google.android.gms.internal.ads.zzgch.zzm(this.zzb.zzb(strOptString, dOptDouble, zOptBoolean), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzdld
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return new com.google.android.gms.internal.ads.zzbfj(new android.graphics.drawable.BitmapDrawable(android.content.res.Resources.getSystem(), (android.graphics.Bitmap) obj), android.net.Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.zzg), null);
    }

    private final com.google.common.util.concurrent.ListenableFuture zzo(org.json.JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return com.google.android.gms.internal.ads.zzgch.zzh(java.util.Collections.emptyList());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return com.google.android.gms.internal.ads.zzgch.zzm(com.google.android.gms.internal.ads.zzgch.zzd(arrayList), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzdli
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.google.android.gms.internal.ads.zzbfj zzbfjVar : (java.util.List) obj) {
                    if (zzbfjVar != null) {
                        arrayList2.add(zzbfjVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final com.google.common.util.concurrent.ListenableFuture zzp(org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar) {
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfboVar, zzfbrVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return com.google.android.gms.internal.ads.zzgch.zzn(listenableFutureZzb, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdlf
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws com.google.android.gms.internal.ads.zzegu {
                com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
                if (zzcexVar == null || zzcexVar.zzq() == null) {
                    throw new com.google.android.gms.internal.ads.zzegu(1, "Retrieve video view in html5 ad response failed.");
                }
                return listenableFutureZzb;
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    private static java.lang.Integer zzq(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return java.lang.Integer.valueOf(android.graphics.Color.rgb(jSONObject2.getInt(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzez zzr(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String strOptString = jSONObject.optString("reason");
        java.lang.String strOptString2 = jSONObject.optString("ping_url");
        if (android.text.TextUtils.isEmpty(strOptString) || android.text.TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzez(strOptString, strOptString2);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbfg zza(org.json.JSONObject jSONObject, java.util.List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.lang.String strOptString = jSONObject.optString("text");
        java.lang.Integer numZzq = zzq(jSONObject, "bg_color");
        java.lang.Integer numZzq2 = zzq(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new com.google.android.gms.internal.ads.zzbfg(strOptString, list, numZzq, numZzq2, iOptInt > 0 ? java.lang.Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar, java.lang.String str, java.lang.String str2, java.lang.Object obj) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzcex zzcexVarZza = this.zzj.zza(zzsVar, zzfboVar, zzfbrVar);
        final com.google.android.gms.internal.ads.zzcaa zzcaaVarZza = com.google.android.gms.internal.ads.zzcaa.zza(zzcexVarZza);
        com.google.android.gms.internal.ads.zzdno zzdnoVarZzb = this.zzl.zzb();
        zzcexVarZza.zzN().zzV(zzdnoVarZzb, zzdnoVarZzb, zzdnoVarZzb, zzdnoVarZzb, zzdnoVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzo, this.zzn, this.zzm, null, zzdnoVarZzb, null, null, null, null);
        zzcexVarZza.zzag("/getNativeAdViewSignals", com.google.android.gms.internal.ads.zzbjo.zzs);
        zzcexVarZza.zzag("/getNativeClickMeta", com.google.android.gms.internal.ads.zzbjo.zzt);
        zzcexVarZza.zzN().zzF(true);
        zzcexVarZza.zzN().zzC(new com.google.android.gms.internal.ads.zzcgn() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza(boolean z, int i, java.lang.String str3, java.lang.String str4) {
                com.google.android.gms.internal.ads.zzcaa zzcaaVar = zzcaaVarZza;
                if (z) {
                    zzcaaVar.zzb();
                    return;
                }
                zzcaaVar.zzd(new com.google.android.gms.internal.ads.zzegu(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcexVarZza.zzae(str, str2, null);
        return zzcaaVarZza;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.String str, java.lang.Object obj) throws java.lang.Exception {
        com.google.android.gms.ads.internal.zzv.zzA();
        com.google.android.gms.internal.ads.zzcex zzcexVarZza = com.google.android.gms.internal.ads.zzcfk.zza(this.zza, com.google.android.gms.internal.ads.zzcgr.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzp, this.zzq);
        final com.google.android.gms.internal.ads.zzcaa zzcaaVarZza = com.google.android.gms.internal.ads.zzcaa.zza(zzcexVarZza);
        zzcexVarZza.zzN().zzC(new com.google.android.gms.internal.ads.zzcgn() { // from class: com.google.android.gms.internal.ads.zzdlc
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza(boolean z, int i, java.lang.String str2, java.lang.String str3) {
                zzcaaVarZza.zzb();
            }
        });
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfi)).booleanValue()) {
            zzcexVarZza.loadData(android.util.Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zzcexVarZza.loadData(str, "text/html", com.adjust.sdk.Constants.ENCODING);
        }
        return zzcaaVarZza;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzd(org.json.JSONObject jSONObject, java.lang.String str) {
        final org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.json.z8.ATTRIBUTION);
        if (jSONObjectOptJSONObject == null) {
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new org.json.JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzm(jSONObjectOptJSONObject.optBoolean("require"), com.google.android.gms.internal.ads.zzgch.zzm(zzo(jSONArrayOptJSONArray, false, true), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzdlj
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.zza.zza(jSONObjectOptJSONObject, (java.util.List) obj);
            }
        }, this.zzg), null);
    }

    public final com.google.common.util.concurrent.ListenableFuture zze(org.json.JSONObject jSONObject, java.lang.String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzf(org.json.JSONObject jSONObject, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbfl zzbflVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbflVar.zzb, zzbflVar.zzd);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzg(org.json.JSONObject jSONObject, java.lang.String str, final com.google.android.gms.internal.ads.zzfbo zzfboVar, final com.google.android.gms.internal.ads.zzfbr zzfbrVar) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjS)).booleanValue()) {
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        final java.lang.String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzs zzsVarZzk = zzk(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (android.text.TextUtils.isEmpty(strOptString2)) {
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzh(null), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdlg
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzb(zzsVarZzk, zzfboVar, zzfbrVar, strOptString, strOptString2, obj);
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzf);
        return com.google.android.gms.internal.ads.zzgch.zzn(listenableFutureZzn, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdlh
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws com.google.android.gms.internal.ads.zzegu {
                if (((com.google.android.gms.internal.ads.zzcex) obj) != null) {
                    return listenableFutureZzn;
                }
                throw new com.google.android.gms.internal.ads.zzegu(1, "Retrieve Web View from image ad response failed.");
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzh(org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar) {
        com.google.common.util.concurrent.ListenableFuture listenableFutureZza;
        org.json.JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbs.zzh(jSONObject, "html_containers", "instream");
        if (jSONObjectZzh != null) {
            return zzp(jSONObjectZzh, zzfboVar, zzfbrVar);
        }
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        java.lang.String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z = false;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjR)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z = true;
        }
        if (!android.text.TextUtils.isEmpty(strOptString)) {
            if (!z) {
                listenableFutureZza = this.zzi.zza(jSONObjectOptJSONObject);
            }
            return zzl(com.google.android.gms.internal.ads.zzgch.zzo(listenableFutureZza, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdS)).intValue(), java.util.concurrent.TimeUnit.SECONDS, this.zzk), null);
        }
        if (!z) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Required field 'vast_xml' or 'html' is missing");
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        listenableFutureZza = zzp(jSONObjectOptJSONObject, zzfboVar, zzfbrVar);
        return zzl(com.google.android.gms.internal.ads.zzgch.zzo(listenableFutureZza, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdS)).intValue(), java.util.concurrent.TimeUnit.SECONDS, this.zzk), null);
    }

    private final com.google.android.gms.ads.internal.client.zzs zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzs.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzs(this.zza, new com.google.android.gms.ads.AdSize(i, i2));
    }
}
