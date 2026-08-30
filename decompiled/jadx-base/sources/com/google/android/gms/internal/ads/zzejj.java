package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzejj {
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.Map zzb = new java.util.HashMap();
    private final java.util.Map zzc = new java.util.HashMap();
    private final java.util.Map zzd = new java.util.HashMap();
    private final java.util.Map zze = new java.util.HashMap();
    private final java.util.concurrent.Executor zzf;
    private org.json.JSONObject zzg;

    zzejj(java.util.concurrent.Executor executor) {
        this.zzf = executor;
    }

    private final synchronized com.google.android.gms.internal.ads.zzfxq zzh(java.lang.String str) {
        java.util.HashMap map;
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc())) {
            boolean zMatches = java.util.regex.Pattern.matches((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdn), str);
            boolean zMatches2 = java.util.regex.Pattern.matches((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdo), str);
            if (zMatches) {
                map = new java.util.HashMap(this.zze);
            } else if (zMatches2) {
                map = new java.util.HashMap(this.zzd);
            }
            return com.google.android.gms.internal.ads.zzfxq.zzc(map);
        }
        return com.google.android.gms.internal.ads.zzfxq.zzd();
    }

    private final synchronized java.util.List zzi(org.json.JSONObject jSONObject, java.lang.String str) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        if (jSONObject != null) {
            android.os.Bundle bundleZzo = zzo(jSONObject.optJSONObject("data"));
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
            if (jSONArrayOptJSONArray != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    java.lang.String strOptString = jSONArrayOptJSONArray.optString(i, "");
                    if (!android.text.TextUtils.isEmpty(strOptString)) {
                        arrayList2.add(strOptString);
                    }
                }
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    java.lang.String str2 = (java.lang.String) arrayList2.get(i2);
                    zzg(str2);
                    if (((com.google.android.gms.internal.ads.zzejl) this.zza.get(str2)) != null) {
                        arrayList.add(new com.google.android.gms.internal.ads.zzejl(str2, str, bundleZzo));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzj() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzm();
        zzn();
        zzk();
    }

    private final synchronized void zzk() {
        org.json.JSONObject jSONObjectZzf;
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzber.zzb.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbU)).booleanValue() && (jSONObjectZzf = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzf()) != null) {
                try {
                    org.json.JSONArray jSONArray = jSONObjectZzf.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                        java.lang.String strOptString = jSONObject.optString("adapter_class_name");
                        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!android.text.TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                org.json.JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                                boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                java.lang.String strOptString2 = jSONObject2.optString(com.json.ce.A);
                                com.google.android.gms.internal.ads.zzejn zzejnVar = new com.google.android.gms.internal.ads.zzejn(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new android.os.Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.zzd.put(strOptString, zzejnVar);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.zze.put(strOptString, zzejnVar);
                                }
                            }
                        }
                    }
                } catch (org.json.JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private final synchronized void zzl(java.lang.String str, java.lang.String str2, java.util.List list) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        java.util.Map map = (java.util.Map) this.zzc.get(str);
        if (map == null) {
            map = new java.util.HashMap();
        }
        this.zzc.put(str, map);
        java.util.List arrayList = (java.util.List) map.get(str2);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        arrayList.addAll(list);
        map.put(str2, arrayList);
    }

    private final synchronized void zzm() {
        org.json.JSONArray jSONArrayOptJSONArray;
        org.json.JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzf();
        if (jSONObjectZzf != null) {
            try {
                org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
                this.zzg = jSONObjectZzf.optJSONObject("ad_unit_patterns");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                        org.json.JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                        java.lang.String lowerCase = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkM)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(java.util.Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                        java.lang.String strOptString = jSONObject.optString("format", "");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                arrayList.addAll(zzi(jSONArrayOptJSONArray.getJSONObject(i2), strOptString));
                            }
                        }
                        zzl(strOptString, lowerCase, arrayList);
                    }
                }
            } catch (org.json.JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
            }
        }
    }

    private final synchronized void zzn() {
        org.json.JSONObject jSONObjectZzf;
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzber.zze.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbT)).booleanValue() && (jSONObjectZzf = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzf()) != null) {
                try {
                    org.json.JSONArray jSONArray = jSONObjectZzf.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                        android.os.Bundle bundleZzo = zzo(jSONObject.optJSONObject("data"));
                        java.lang.String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!android.text.TextUtils.isEmpty(strOptString)) {
                            this.zzb.put(strOptString, new com.google.android.gms.internal.ads.zzejn(strOptString, zOptBoolean2, zOptBoolean, true, bundleZzo));
                        }
                    }
                } catch (org.json.JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private static final android.os.Bundle zzo(org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized java.util.Map zza(java.lang.String str, java.lang.String str2) {
        java.util.HashMap map;
        java.util.Map mapZzb = zzb(str, str2);
        com.google.android.gms.internal.ads.zzfxq zzfxqVarZzh = zzh(str2);
        map = new java.util.HashMap();
        for (java.util.Map.Entry entry : ((com.google.android.gms.internal.ads.zzfxq) mapZzb).entrySet()) {
            java.lang.String str3 = (java.lang.String) entry.getKey();
            if (zzfxqVarZzh.containsKey(str3)) {
                com.google.android.gms.internal.ads.zzejn zzejnVar = (com.google.android.gms.internal.ads.zzejn) zzfxqVarZzh.get(str3);
                java.util.List list = (java.util.List) entry.getValue();
                map.put(str3, new com.google.android.gms.internal.ads.zzejn(str3, zzejnVar.zzb, zzejnVar.zzc, zzejnVar.zzd, (list == null || list.isEmpty()) ? new android.os.Bundle() : (android.os.Bundle) list.get(0)));
            }
        }
        com.google.android.gms.internal.ads.zzfzt zzfztVarZze = zzfxqVarZzh.entrySet().iterator();
        while (zzfztVarZze.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) zzfztVarZze.next();
            java.lang.String str4 = (java.lang.String) entry2.getKey();
            if (!map.containsKey(str4) && ((com.google.android.gms.internal.ads.zzejn) entry2.getValue()).zzd) {
                map.put(str4, (com.google.android.gms.internal.ads.zzejn) entry2.getValue());
            }
        }
        return map;
    }

    public final synchronized java.util.Map zzb(java.lang.String str, java.lang.String str2) {
        java.util.Map map;
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc()) && (map = (java.util.Map) this.zzc.get(str)) != null) {
            java.util.List<com.google.android.gms.internal.ads.zzejl> list = (java.util.List) map.get(str2);
            if (list == null) {
                java.lang.String strZza = com.google.android.gms.internal.ads.zzdpt.zza(this.zzg, str2, str);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkM)).booleanValue()) {
                    strZza = strZza.toLowerCase(java.util.Locale.ROOT);
                }
                list = (java.util.List) map.get(strZza);
            }
            if (list != null) {
                java.util.HashMap map2 = new java.util.HashMap();
                for (com.google.android.gms.internal.ads.zzejl zzejlVar : list) {
                    java.lang.String str3 = zzejlVar.zza;
                    if (!map2.containsKey(str3)) {
                        map2.put(str3, new java.util.ArrayList());
                    }
                    ((java.util.List) map2.get(str3)).add(zzejlVar.zzb);
                }
                return com.google.android.gms.internal.ads.zzfxq.zzc(map2);
            }
        }
        return com.google.android.gms.internal.ads.zzfxq.zzd();
    }

    public final synchronized java.util.Map zzc() {
        if (android.text.TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc())) {
            return com.google.android.gms.internal.ads.zzfxq.zzd();
        }
        return com.google.android.gms.internal.ads.zzfxq.zzc(this.zzb);
    }

    public final void zze() {
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeji
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
        this.zzf.execute(new com.google.android.gms.internal.ads.zzejh(this));
    }

    final /* synthetic */ void zzf() {
        this.zzf.execute(new com.google.android.gms.internal.ads.zzejh(this));
    }

    public final synchronized void zzg(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && !this.zza.containsKey(str)) {
            this.zza.put(str, new com.google.android.gms.internal.ads.zzejl(str, "", new android.os.Bundle()));
        }
    }
}
