package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbjo {
    public static final com.google.android.gms.internal.ads.zzbjp zza = new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzbim
        @Override // com.google.android.gms.internal.ads.zzbjp
        public final void zza(java.lang.Object obj, java.util.Map map) {
            com.google.android.gms.internal.ads.zzcge zzcgeVar = (com.google.android.gms.internal.ads.zzcge) obj;
            com.google.android.gms.internal.ads.zzbjp zzbjpVar = com.google.android.gms.internal.ads.zzbjo.zza;
            java.lang.String str = (java.lang.String) map.get("urls");
            if (android.text.TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            java.lang.String[] strArrSplit = str.split(",");
            java.util.HashMap map2 = new java.util.HashMap();
            android.content.pm.PackageManager packageManager = zzcgeVar.getContext().getPackageManager();
            for (java.lang.String str2 : strArrSplit) {
                java.lang.String[] strArrSplit2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new android.content.Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", android.net.Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z = false;
                }
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                map2.put(str2, boolValueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((com.google.android.gms.internal.ads.zzbmk) zzcgeVar).zzd("openableURLs", map2);
        }
    };
    public static final com.google.android.gms.internal.ads.zzbjp zzb = new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzbio
        @Override // com.google.android.gms.internal.ads.zzbjp
        public final void zza(java.lang.Object obj, java.util.Map map) {
            com.google.android.gms.internal.ads.zzcge zzcgeVar = (com.google.android.gms.internal.ads.zzcge) obj;
            com.google.android.gms.internal.ads.zzbjp zzbjpVar = com.google.android.gms.internal.ads.zzbjo.zza;
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzid)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            java.lang.String str = (java.lang.String) map.get(com.ironsource.y8.h.V);
            if (android.text.TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            java.util.HashMap map2 = new java.util.HashMap();
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zzcgeVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
            ((com.google.android.gms.internal.ads.zzbmk) zzcgeVar).zzd("openableApp", map2);
        }
    };
    public static final com.google.android.gms.internal.ads.zzbjp zzc = new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzbir
        @Override // com.google.android.gms.internal.ads.zzbjp
        public final void zza(java.lang.Object obj, java.util.Map map) {
            com.google.android.gms.internal.ads.zzbjo.zzb((com.google.android.gms.internal.ads.zzcge) obj, map);
        }
    };
    public static final com.google.android.gms.internal.ads.zzbjp zzd = new com.google.android.gms.internal.ads.zzbjg();
    public static final com.google.android.gms.internal.ads.zzbjp zze = new com.google.android.gms.internal.ads.zzbjh();
    public static final com.google.android.gms.internal.ads.zzbjp zzf = new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzbis
        @Override // com.google.android.gms.internal.ads.zzbjp
        public final void zza(java.lang.Object obj, java.util.Map map) {
            com.google.android.gms.internal.ads.zzcge zzcgeVar = (com.google.android.gms.internal.ads.zzcge) obj;
            com.google.android.gms.internal.ads.zzbjp zzbjpVar = com.google.android.gms.internal.ads.zzbjo.zza;
            java.lang.String str = (java.lang.String) map.get("u");
            if (str == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from httpTrack GMSG.");
                return;
            }
            com.google.android.gms.internal.ads.zzceo zzceoVar = (com.google.android.gms.internal.ads.zzceo) zzcgeVar;
            new com.google.android.gms.ads.internal.util.zzbw(zzcgeVar.getContext(), ((com.google.android.gms.internal.ads.zzcgl) zzcgeVar).zzn().afmaVersion, str, null, zzceoVar.zzD() != null ? zzceoVar.zzD().zzax : null).zzb();
        }
    };
    public static final com.google.android.gms.internal.ads.zzbjp zzg = new com.google.android.gms.internal.ads.zzbji();
    public static final com.google.android.gms.internal.ads.zzbjp zzh = new com.google.android.gms.internal.ads.zzbjj();
    public static final com.google.android.gms.internal.ads.zzbjp zzi = new com.google.android.gms.internal.ads.zzbjp() { // from class: com.google.android.gms.internal.ads.zzbip
        @Override // com.google.android.gms.internal.ads.zzbjp
        public final void zza(java.lang.Object obj, java.util.Map map) {
            com.google.android.gms.internal.ads.zzcgk zzcgkVar = (com.google.android.gms.internal.ads.zzcgk) obj;
            com.google.android.gms.internal.ads.zzbjp zzbjpVar = com.google.android.gms.internal.ads.zzbjo.zza;
            java.lang.String str = (java.lang.String) map.get("tx");
            java.lang.String str2 = (java.lang.String) map.get("ty");
            java.lang.String str3 = (java.lang.String) map.get("td");
            try {
                int i = java.lang.Integer.parseInt(str);
                int i2 = java.lang.Integer.parseInt(str2);
                int i3 = java.lang.Integer.parseInt(str3);
                com.google.android.gms.internal.ads.zzava zzavaVarZzI = zzcgkVar.zzI();
                if (zzavaVarZzI != null) {
                    zzavaVarZzI.zzc().zzl(i, i2, i3);
                }
            } catch (java.lang.NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final com.google.android.gms.internal.ads.zzbjp zzj = new com.google.android.gms.internal.ads.zzbjk();
    public static final com.google.android.gms.internal.ads.zzbjp zzk = new com.google.android.gms.internal.ads.zzbjl();
    public static final com.google.android.gms.internal.ads.zzbjp zzl = new com.google.android.gms.internal.ads.zzccs();
    public static final com.google.android.gms.internal.ads.zzbjp zzm = new com.google.android.gms.internal.ads.zzcct();
    public static final com.google.android.gms.internal.ads.zzbjp zzn = new com.google.android.gms.internal.ads.zzbii();
    public static final com.google.android.gms.internal.ads.zzbkf zzo = new com.google.android.gms.internal.ads.zzbkf();
    public static final com.google.android.gms.internal.ads.zzbjp zzp = new com.google.android.gms.internal.ads.zzbjm();
    public static final com.google.android.gms.internal.ads.zzbjp zzq = new com.google.android.gms.internal.ads.zzbjn();
    public static final com.google.android.gms.internal.ads.zzbjp zzr = new com.google.android.gms.internal.ads.zzbit();
    public static final com.google.android.gms.internal.ads.zzbjp zzs = new com.google.android.gms.internal.ads.zzbiu();
    public static final com.google.android.gms.internal.ads.zzbjp zzt = new com.google.android.gms.internal.ads.zzbiv();
    public static final com.google.android.gms.internal.ads.zzbjp zzu = new com.google.android.gms.internal.ads.zzbiw();
    public static final com.google.android.gms.internal.ads.zzbjp zzv = new com.google.android.gms.internal.ads.zzbix();
    public static final com.google.android.gms.internal.ads.zzbjp zzw = new com.google.android.gms.internal.ads.zzbiy();
    public static final com.google.android.gms.internal.ads.zzbjp zzx = new com.google.android.gms.internal.ads.zzbiz();
    public static final com.google.android.gms.internal.ads.zzbjp zzy = new com.google.android.gms.internal.ads.zzbja();
    public static final com.google.android.gms.internal.ads.zzbjp zzz = new com.google.android.gms.internal.ads.zzbjb();
    public static final com.google.android.gms.internal.ads.zzbjp zzA = new com.google.android.gms.internal.ads.zzbjc();
    public static final com.google.android.gms.internal.ads.zzbjp zzB = new com.google.android.gms.internal.ads.zzbje();
    public static final com.google.android.gms.internal.ads.zzbjp zzC = new com.google.android.gms.internal.ads.zzbjf();

    public static com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcex zzcexVar, java.lang.String str) {
        android.net.Uri uriZza = android.net.Uri.parse(str);
        try {
            com.google.android.gms.internal.ads.zzava zzavaVarZzI = zzcexVar.zzI();
            com.google.android.gms.internal.ads.zzfcn zzfcnVarZzS = zzcexVar.zzS();
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlR)).booleanValue() || zzfcnVarZzS == null) {
                if (zzavaVarZzI != null && zzavaVarZzI.zzf(uriZza)) {
                    uriZza = zzavaVarZzI.zza(uriZza, zzcexVar.getContext(), zzcexVar.zzF(), zzcexVar.zzi());
                }
            } else if (zzavaVarZzI != null && zzavaVarZzI.zzf(uriZza)) {
                uriZza = zzfcnVarZzS.zza(uriZza, zzcexVar.getContext(), zzcexVar.zzF(), zzcexVar.zzi());
            }
        } catch (com.google.android.gms.internal.ads.zzavb unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to append parameter to URL: ".concat(str));
        }
        java.util.Map map = new java.util.HashMap();
        if (zzcexVar.zzD() != null) {
            map = zzcexVar.zzD().zzaw;
        }
        final java.lang.String strZzb = com.google.android.gms.internal.ads.zzbyk.zzb(uriZza, zzcexVar.getContext(), map);
        long jLongValue = ((java.lang.Long) com.google.android.gms.internal.ads.zzbek.zze.zze()).longValue();
        return (jLongValue <= 0 || jLongValue > 244410203) ? com.google.android.gms.internal.ads.zzgch.zzh(strZzb) : (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zze((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzm((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zze(com.google.android.gms.internal.ads.zzgby.zzu(zzcexVar.zzT()), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzbij
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Throwable th = (java.lang.Throwable) obj;
                com.google.android.gms.internal.ads.zzbjp zzbjpVar = com.google.android.gms.internal.ads.zzbjo.zza;
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbek.zzi.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzbik
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.String str2;
                java.lang.String str3;
                android.net.Uri uri;
                java.lang.String str4 = (java.lang.String) obj;
                com.google.android.gms.internal.ads.zzbjp zzbjpVar = com.google.android.gms.internal.ads.zzbjo.zza;
                java.lang.String strReplace = strZzb;
                if (str4 != null) {
                    if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbek.zzf.zze()).booleanValue()) {
                        java.lang.String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        java.lang.String host = android.net.Uri.parse(strReplace).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (host.endsWith(strArr[i])) {
                                str2 = (java.lang.String) com.google.android.gms.internal.ads.zzbek.zza.zze();
                                str3 = (java.lang.String) com.google.android.gms.internal.ads.zzbek.zzb.zze();
                                if (!android.text.TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!android.text.TextUtils.isEmpty(str3)) {
                                    uri = android.net.Uri.parse(strReplace);
                                    if (!android.text.TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (java.lang.String) com.google.android.gms.internal.ads.zzbek.zza.zze();
                        str3 = (java.lang.String) com.google.android.gms.internal.ads.zzbek.zzb.zze();
                        if (!android.text.TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!android.text.TextUtils.isEmpty(str3)) {
                            uri = android.net.Uri.parse(strReplace);
                            if (!android.text.TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzbil
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Throwable th = (java.lang.Throwable) obj;
                com.google.android.gms.internal.ads.zzbjp zzbjpVar = com.google.android.gms.internal.ads.zzbjo.zza;
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbek.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcge zzcgeVar, java.util.Map map) {
        android.content.Intent uri;
        android.content.pm.PackageManager packageManager = zzcgeVar.getContext().getPackageManager();
        try {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONObject((java.lang.String) map.get("data")).getJSONArray("intents");
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        java.lang.String strOptString = jSONObject2.optString("id");
                        java.lang.String strOptString2 = jSONObject2.optString("u");
                        java.lang.String strOptString3 = jSONObject2.optString(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT);
                        java.lang.String strOptString4 = jSONObject2.optString("m");
                        java.lang.String strOptString5 = jSONObject2.optString(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P);
                        java.lang.String strOptString6 = jSONObject2.optString("c");
                        java.lang.String strOptString7 = jSONObject2.optString("intent_url");
                        android.content.pm.ResolveInfo resolveInfoResolveActivity = null;
                        if (android.text.TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = android.content.Intent.parseUri(strOptString7, 0);
                            } catch (java.net.URISyntaxException e) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error parsing the url: ".concat(java.lang.String.valueOf(strOptString7)), e);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new android.content.Intent();
                            if (!android.text.TextUtils.isEmpty(strOptString2)) {
                                uri.setData(android.net.Uri.parse(strOptString2));
                            }
                            if (!android.text.TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!android.text.TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!android.text.TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!android.text.TextUtils.isEmpty(strOptString6)) {
                                java.lang.String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new android.content.ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        android.content.Intent intent = uri;
                        try {
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (java.lang.NullPointerException e2) {
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, intent.toString());
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (org.json.JSONException e3) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error constructing openable urls response.", e3);
                        }
                    } catch (org.json.JSONException e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error parsing the intent data.", e4);
                    }
                }
                ((com.google.android.gms.internal.ads.zzbmk) zzcgeVar).zze("openableIntents", jSONObject);
            } catch (org.json.JSONException unused) {
                ((com.google.android.gms.internal.ads.zzbmk) zzcgeVar).zze("openableIntents", new org.json.JSONObject());
            }
        } catch (org.json.JSONException unused2) {
            ((com.google.android.gms.internal.ads.zzbmk) zzcgeVar).zze("openableIntents", new org.json.JSONObject());
        }
    }

    public static void zzc(java.util.Map map, com.google.android.gms.internal.ads.zzdds zzddsVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkD)).booleanValue() && map.containsKey("sc") && ((java.lang.String) map.get("sc")).equals("1") && zzddsVar != null) {
            zzddsVar.zzdd();
        }
    }
}
