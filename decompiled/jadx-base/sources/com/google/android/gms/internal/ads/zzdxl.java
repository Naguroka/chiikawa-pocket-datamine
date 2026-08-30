package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdxl {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\?");
    private final com.google.android.gms.internal.ads.zzcgx zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.internal.ads.zzfcj zze;
    private final java.util.concurrent.Executor zzf;
    private final java.util.concurrent.ScheduledExecutorService zzg;
    private final java.lang.String zzh;
    private final com.google.android.gms.internal.ads.zzfhh zzi;
    private final com.google.android.gms.internal.ads.zzdrq zzj;
    private final java.lang.Object zzk = new java.lang.Object();
    private final com.google.android.gms.internal.ads.zzbvs zzl;

    zzdxl(com.google.android.gms.internal.ads.zzcgx zzcgxVar, android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfcj zzfcjVar, java.util.concurrent.Executor executor, java.lang.String str, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzdrq zzdrqVar, com.google.android.gms.internal.ads.zzbvs zzbvsVar, com.google.android.gms.internal.ads.zzdzq zzdzqVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzb = zzcgxVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfcjVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfhhVar;
        zzcgxVar.zzx();
        this.zzj = zzdrqVar;
        this.zzl = zzbvsVar;
        this.zzg = scheduledExecutorService;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String str, final java.lang.String str2) {
        java.lang.String string;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzh;
        java.lang.String str3 = "";
        if (android.text.TextUtils.isEmpty(str)) {
            return com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzegu(15, "Invalid ad string."));
        }
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = com.google.android.gms.internal.ads.zzfgv.zza(this.zzc, 11);
        zzfgwVarZza.zzi();
        final com.google.android.gms.internal.ads.zzbnw zzbnwVarZza = com.google.android.gms.ads.internal.zzv.zzg().zza(this.zzc, this.zzd, this.zzb.zzz()).zza("google.afma.response.normalize", com.google.android.gms.internal.ads.zzbod.zza, com.google.android.gms.internal.ads.zzbod.zza);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgS)).booleanValue()) {
            try {
                string = new org.json.JSONObject(str).optString("fetch_url", "");
            } catch (org.json.JSONException unused) {
                string = "";
            }
            if (android.text.TextUtils.isEmpty(string)) {
                listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzh(str);
                this.zzj.zzc("sst", "1");
            } else {
                this.zzj.zzc("sst", "2");
                java.lang.String str4 = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgU);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgT)).booleanValue()) {
                    java.util.List listZzf = com.google.android.gms.internal.ads.zzfvc.zzc(zza).zzf(string);
                    if (listZzf.size() < 2) {
                        listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzegu(1, "Invalid fetch URL."));
                    } else {
                        str3 = (java.lang.String) listZzf.get(1);
                        com.google.android.gms.ads.internal.zzv.zzq();
                        string = android.net.Uri.parse(string).buildUpon().query(null).build().toString();
                        final com.google.android.gms.internal.ads.zzdzn zzdznVar = new com.google.android.gms.internal.ads.zzdzn(string, 60000, new java.util.HashMap(), str3.getBytes(java.nio.charset.StandardCharsets.UTF_8), str4, false);
                        listenableFutureZzh = (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzf((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzo(com.google.android.gms.internal.ads.zzgby.zzu(com.google.android.gms.internal.ads.zzbzw.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdxj
                            @Override // java.util.concurrent.Callable
                            public final java.lang.Object call() {
                                return this.zza.zzc(zzdznVar);
                            }
                        })), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgV)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzg), java.lang.Exception.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdxk
                            @Override // com.google.android.gms.internal.ads.zzgbo
                            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                                com.google.android.gms.internal.ads.zzegu zzeguVar;
                                java.lang.Exception exc = (java.lang.Exception) obj;
                                com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                                if (exc instanceof java.util.concurrent.TimeoutException) {
                                    zzeguVar = new com.google.android.gms.internal.ads.zzegu(1, "Timed out waiting for ad response.");
                                } else if (exc instanceof com.google.android.gms.internal.ads.zzegu) {
                                    zzeguVar = (com.google.android.gms.internal.ads.zzegu) exc;
                                } else {
                                    zzeguVar = new com.google.android.gms.internal.ads.zzegu(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                                }
                                return com.google.android.gms.internal.ads.zzgch.zzg(zzeguVar);
                            }
                        }, this.zzf);
                    }
                } else {
                    final com.google.android.gms.internal.ads.zzdzn zzdznVar2 = new com.google.android.gms.internal.ads.zzdzn(string, 60000, new java.util.HashMap(), str3.getBytes(java.nio.charset.StandardCharsets.UTF_8), str4, false);
                    listenableFutureZzh = (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzf((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzo(com.google.android.gms.internal.ads.zzgby.zzu(com.google.android.gms.internal.ads.zzbzw.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdxj
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return this.zza.zzc(zzdznVar2);
                        }
                    })), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgV)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzg), java.lang.Exception.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdxk
                        @Override // com.google.android.gms.internal.ads.zzgbo
                        public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                            com.google.android.gms.internal.ads.zzegu zzeguVar;
                            java.lang.Exception exc = (java.lang.Exception) obj;
                            com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                            if (exc instanceof java.util.concurrent.TimeoutException) {
                                zzeguVar = new com.google.android.gms.internal.ads.zzegu(1, "Timed out waiting for ad response.");
                            } else if (exc instanceof com.google.android.gms.internal.ads.zzegu) {
                                zzeguVar = (com.google.android.gms.internal.ads.zzegu) exc;
                            } else {
                                zzeguVar = new com.google.android.gms.internal.ads.zzegu(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                            }
                            return com.google.android.gms.internal.ads.zzgch.zzg(zzeguVar);
                        }
                    }, this.zzf);
                }
            }
        } else {
            listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzh(str);
            this.zzj.zzc("sst", "1");
        }
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzn(listenableFutureZzh, new com.google.android.gms.internal.ads.zzgbo(this) { // from class: com.google.android.gms.internal.ads.zzdxg
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws org.json.JSONException {
                java.lang.String str5 = (java.lang.String) obj;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                java.lang.String str6 = str2;
                try {
                    jSONObject3.put("headers", new org.json.JSONObject());
                    jSONObject3.put("body", str5);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new org.json.JSONObject(str6));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put(com.json.hs.n, jSONObject3);
                    jSONObject.put("flags", new org.json.JSONObject());
                    return com.google.android.gms.internal.ads.zzgch.zzh(jSONObject);
                } catch (org.json.JSONException e) {
                    throw new org.json.JSONException("Preloaded loader: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(e.getCause()))));
                }
            }
        }, this.zzf), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdxh
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return zzbnwVarZza.zzb((org.json.JSONObject) obj);
            }
        }, this.zzf), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdxi
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzb((org.json.JSONObject) obj);
            }
        }, this.zzf);
        com.google.android.gms.internal.ads.zzfhg.zza(listenableFutureZzn, this.zzi, zzfgwVarZza);
        return listenableFutureZzn;
    }

    private final java.lang.String zze(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new org.json.JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private final void zzf(com.google.android.gms.internal.ads.zzdre zzdreVar) {
        android.os.Bundle bundleZza = this.zzj.zza();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgX)).booleanValue()) {
            bundleZza.putLong(zzdreVar.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
    }

    private static final java.lang.String zzg(java.lang.String str) {
        try {
            return new org.json.JSONObject(str).optString("request_id", "");
        } catch (org.json.JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01c6 A[Catch: all -> 0x01da, TryCatch #3 {, blocks: (B:18:0x0051, B:20:0x0072, B:22:0x007a, B:24:0x008d, B:27:0x0096, B:30:0x009d, B:32:0x00a5, B:34:0x00ab, B:38:0x00b4, B:45:0x00ea, B:41:0x00c6, B:44:0x00d3, B:48:0x00f0, B:26:0x0092, B:49:0x0106, B:56:0x011f, B:59:0x0127, B:63:0x014b, B:65:0x0160, B:69:0x0182, B:71:0x0197, B:74:0x01ab, B:76:0x01b1, B:77:0x01be, B:79:0x01c0, B:82:0x01c9, B:81:0x01c6, B:70:0x018c, B:66:0x0172, B:62:0x0135, B:53:0x010f, B:54:0x0114), top: B:113:0x0051, inners: #2, #5 }] */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        java.lang.String strOptString;
        int i;
        java.lang.Boolean bool;
        java.lang.String string;
        java.lang.String strZzb = this.zze.zzd.zzx;
        if (!android.text.TextUtils.isEmpty(strZzb)) {
            java.lang.String strZzg = zzg(strZzb);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgR)).booleanValue() && strZzg.isEmpty()) {
                int iLastIndexOf = strZzb.lastIndexOf("&request_id=");
                strZzg = iLastIndexOf != -1 ? strZzb.substring(iLastIndexOf + 12) : "";
            }
            if (android.text.TextUtils.isEmpty(strZzg)) {
                return com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzegu(15, "Invalid ad string."));
            }
            synchronized (this.zzk) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzv zzvVarZzo = this.zzb.zzo();
                java.lang.String strZzb2 = zzvVarZzo.zzb(strZzg, this.zzj);
                java.lang.String str = null;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgR)).booleanValue()) {
                    com.google.android.gms.internal.ads.zzdrq zzdrqVar = this.zzj;
                    if (!android.text.TextUtils.isEmpty(strZzb2)) {
                        try {
                            bool = new org.json.JSONObject(strZzb2).optString("is_gbid").equals(com.json.mediationsdk.metadata.a.g);
                        } catch (org.json.JSONException unused) {
                        }
                        if (bool.booleanValue()) {
                            int iLastIndexOf2 = strZzb.lastIndexOf(com.ironsource.y8.i.c);
                            java.lang.String strSubstring = iLastIndexOf2 != -1 ? strZzb.substring(0, iLastIndexOf2) : null;
                            if (!android.text.TextUtils.isEmpty(strSubstring)) {
                                try {
                                    byte[] bArrDecode = android.util.Base64.decode(strSubstring, 11);
                                    byte[] bytes = strZzg.getBytes(com.adjust.sdk.Constants.ENCODING);
                                    if (android.text.TextUtils.isEmpty(strZzb2)) {
                                        string = null;
                                    } else {
                                        try {
                                            string = new org.json.JSONObject(strZzb2).getString("arek");
                                        } catch (org.json.JSONException e) {
                                            com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                            string = null;
                                        }
                                    }
                                    strZzb = com.google.android.gms.internal.ads.zzfcy.zzb(bArrDecode, bytes, string, zzdrqVar);
                                } catch (java.io.UnsupportedEncodingException e2) {
                                    com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                    }
                }
                if (android.text.TextUtils.isEmpty(strZzb)) {
                    strOptString = "";
                } else {
                    try {
                        strOptString = new org.json.JSONObject(strZzb).optString("render_id", "");
                    } catch (org.json.JSONException unused2) {
                        strOptString = "";
                    }
                }
                if (android.text.TextUtils.isEmpty(strOptString)) {
                    i = 0;
                } else {
                    java.lang.String str2 = "";
                    try {
                        str2 = new java.lang.String(android.util.Base64.decode(strOptString, 0), java.nio.charset.StandardCharsets.UTF_8);
                    } catch (java.lang.IllegalArgumentException e3) {
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(java.lang.String.valueOf(strOptString)));
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "PreloadedLoader.decodeRenderId");
                    }
                    java.util.List listZzf = com.google.android.gms.internal.ads.zzfvc.zzb(com.google.android.gms.internal.ads.zzfty.zzc(':')).zzf(str2);
                    if (listZzf.size() == 2) {
                        str = (java.lang.String) listZzf.get(0);
                        i = java.lang.Integer.parseInt((java.lang.String) listZzf.get(1));
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(java.lang.String.valueOf(strOptString)));
                        i = 0;
                    }
                }
                android.util.Pair pair = str != null ? new android.util.Pair(str, java.lang.Integer.valueOf(i)) : new android.util.Pair("", 0);
                java.lang.String str3 = (java.lang.String) pair.first;
                int iIntValue = ((java.lang.Integer) pair.second).intValue();
                if (android.text.TextUtils.isEmpty(str3) || iIntValue <= 0) {
                    zzvVarZzo.zzf(strZzg);
                } else {
                    if (zzvVarZzo.zzh(strZzg, str3)) {
                        return com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzegu(10, "The ad has already been shown."));
                    }
                    if (!zzvVarZzo.zzg(strZzg, str3, iIntValue)) {
                        zzvVarZzo.zzf(strZzg);
                    }
                }
                if (!android.text.TextUtils.isEmpty(strZzb2)) {
                    return zzd(strZzb, zze(strZzb2));
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zze.zzd.zzs;
        if (zzcVar != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgJ)).booleanValue()) {
                java.lang.String str4 = zzcVar.zza;
                java.lang.String str5 = zzcVar.zzb;
                java.lang.String strZzg2 = zzg(str4);
                java.lang.String strZzg3 = zzg(str5);
                if (android.text.TextUtils.isEmpty(strZzg3) || !strZzg2.equals(strZzg3)) {
                    this.zzj.zzb().put("ridmm", com.json.mediationsdk.metadata.a.g);
                } else {
                    this.zzb.zzo().zzf(strZzg2);
                    this.zzj.zzb().put("request_id", strZzg2);
                }
            }
            return zzd(zzcVar.zza, zze(zzcVar.zzb));
        }
        return com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzegu(14, "Mismatch request IDs."));
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(org.json.JSONObject jSONObject) throws java.lang.Exception {
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzfca(new com.google.android.gms.internal.ads.zzfbx(this.zze), com.google.android.gms.internal.ads.zzfbz.zza(new java.io.StringReader(jSONObject.toString()), null)));
    }

    final /* synthetic */ java.lang.String zzc(com.google.android.gms.internal.ads.zzdzn zzdznVar) throws java.lang.Exception {
        zzf(com.google.android.gms.internal.ads.zzdre.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                if (i >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgW)).intValue()) {
                    throw new com.google.android.gms.internal.ads.zzegu(1, "Received HTTP error code from ad server: " + i2);
                }
                com.google.android.gms.internal.ads.zzdzo zzdzoVarZzb = new com.google.android.gms.internal.ads.zzdzp(this.zzc, this.zzd.afmaVersion, this.zzl, android.os.Binder.getCallingUid()).zza(zzdznVar);
                com.google.android.gms.internal.ads.zzdzo zzdzoVar = zzdzoVarZzb;
                int i3 = zzdzoVarZzb.zza;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgX)).booleanValue()) {
                    this.zzj.zzc("fr", java.lang.String.valueOf(i));
                }
                if (i3 == 200) {
                    zzf(com.google.android.gms.internal.ads.zzdre.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzdzoVarZzb.zzc;
                }
                i++;
                i2 = i3;
            } catch (java.lang.Exception e) {
                throw new com.google.android.gms.internal.ads.zzegu(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
            }
        }
    }
}
