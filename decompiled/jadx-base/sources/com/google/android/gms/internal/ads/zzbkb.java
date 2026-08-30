package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbkb implements com.google.android.gms.internal.ads.zzbjp {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final com.google.android.gms.internal.ads.zzdrw zzb;
    private final com.google.android.gms.internal.ads.zzbsc zzd;
    private final com.google.android.gms.internal.ads.zzebk zze;
    private final com.google.android.gms.internal.ads.zzcmk zzf;
    private com.google.android.gms.ads.internal.overlay.zzaa zzg = null;
    private final com.google.android.gms.internal.ads.zzgcs zzh = com.google.android.gms.internal.ads.zzbzw.zzg;
    private final com.google.android.gms.ads.internal.util.client.zzu zzc = new com.google.android.gms.ads.internal.util.client.zzu(null);

    public zzbkb(com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzbsc zzbscVar, com.google.android.gms.internal.ads.zzebk zzebkVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar, com.google.android.gms.internal.ads.zzcmk zzcmkVar) {
        this.zza = zzbVar;
        this.zzd = zzbscVar;
        this.zze = zzebkVar;
        this.zzb = zzdrwVar;
        this.zzf = zzcmkVar;
    }

    public static int zzb(java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("o");
        if (str == null) {
            return -1;
        }
        if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_P.equalsIgnoreCase(str)) {
            return 7;
        }
        if (androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE.equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static android.net.Uri zzc(android.content.Context context, com.google.android.gms.internal.ads.zzava zzavaVar, android.net.Uri uri, android.view.View view, android.app.Activity activity, com.google.android.gms.internal.ads.zzfcn zzfcnVar) {
        if (zzavaVar == null) {
            return uri;
        }
        try {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlR)).booleanValue() || zzfcnVar == null) {
                if (zzavaVar.zze(uri)) {
                    uri = zzavaVar.zza(uri, context, view, activity);
                }
            } else if (zzavaVar.zze(uri)) {
                uri = zzfcnVar.zza(uri, context, view, activity);
            }
        } catch (com.google.android.gms.internal.ads.zzavb unused) {
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static android.net.Uri zzd(android.net.Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", java.lang.String.valueOf(android.os.SystemClock.uptimeMillis())).build();
            }
        } catch (java.lang.UnsupportedOperationException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error adding click uptime parameter to url: ".concat(java.lang.String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(java.util.Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:116:0x02e9  */
    public final void zzh(java.lang.String str, com.google.android.gms.ads.internal.client.zza zzaVar, java.util.Map map, java.lang.String str2) {
        java.lang.String str3;
        boolean zZzb;
        java.util.HashMap map2;
        java.lang.Object obj;
        boolean z;
        java.lang.String string;
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) zzaVar;
        com.google.android.gms.internal.ads.zzfbo zzfboVarZzD = zzcexVar.zzD();
        com.google.android.gms.internal.ads.zzfbr zzfbrVarZzR = zzcexVar.zzR();
        boolean zZzg = false;
        if (zzfboVarZzD == null || zzfbrVarZzR == null) {
            str3 = "";
            zZzb = false;
        } else {
            java.lang.String str4 = zzfbrVarZzR.zzb;
            zZzb = zzfboVarZzD.zzb();
            str3 = str4;
        }
        boolean z2 = (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkC)).booleanValue() && map.containsKey("sc") && ((java.lang.String) map.get("sc")).equals("0")) ? false : true;
        boolean z3 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmC)).booleanValue() && map.containsKey("ig_cl") && ((java.lang.String) map.get("ig_cl")).equals(com.json.mediationsdk.metadata.a.g);
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcexVar.zzaF()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((com.google.android.gms.internal.ads.zzcgh) zzaVar).zzaL(zzf(map), zzb(map), z2);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlM)).booleanValue() && java.util.Objects.equals(map.get("is_allowed_for_lock_screen"), "1")) {
                zZzg = true;
            }
            if (str != null) {
                ((com.google.android.gms.internal.ads.zzcgh) zzaVar).zzaN(zzf(map), zzb(map), str, z2, zZzg);
                return;
            } else {
                ((com.google.android.gms.internal.ads.zzcgh) zzaVar).zzaM(zzf(map), zzb(map), (java.lang.String) map.get("html"), (java.lang.String) map.get("baseurl"), z2);
                return;
            }
        }
        android.content.Intent uri = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            android.content.Context context = zzcexVar.getContext();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeI)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                zzm(10);
            } else {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeG)).booleanValue()) {
                    int i = com.google.android.gms.internal.ads.zzbdk.zza;
                    if (androidx.browser.customtabs.CustomTabsClient.getPackageName(context, null) != null) {
                        zZzg = true;
                    }
                } else {
                    zZzg = com.google.android.gms.internal.ads.zzbdm.zzg(context);
                }
                if (zZzg) {
                    zzk(true);
                    if (android.text.TextUtils.isEmpty(str)) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    android.net.Uri uriZzd = zzd(zzc(zzcexVar.getContext(), zzcexVar.zzI(), android.net.Uri.parse(str), zzcexVar.zzF(), zzcexVar.zzi(), zzcexVar.zzS()));
                    if (zZzb && this.zze != null && zzl(zzaVar, zzcexVar.getContext(), uriZzd.toString(), str3)) {
                        return;
                    }
                    this.zzg = new com.google.android.gms.internal.ads.zzbjy(this);
                    ((com.google.android.gms.internal.ads.zzcgh) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(null, uriZzd.toString(), null, null, null, null, null, null, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzg).asBinder(), true), z2, z3, str3);
                    return;
                }
                zzm(4);
            }
            map.put("use_first_package", com.json.mediationsdk.metadata.a.g);
            map.put("use_running_process", com.json.mediationsdk.metadata.a.g);
            zzj(zzaVar, map, zZzb, str3, z2, z3);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && com.json.mediationsdk.metadata.a.g.equalsIgnoreCase((java.lang.String) map.get("system_browser"))) {
            zzj(zzaVar, map, zZzb, str3, z2, z3);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzid)).booleanValue()) {
                zzk(true);
                java.lang.String str5 = (java.lang.String) map.get(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P);
                if (str5 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Package name missing from open app action.");
                    return;
                }
                if (zZzb && this.zze != null && zzl(zzaVar, zzcexVar.getContext(), str5, str3)) {
                    return;
                }
                android.content.pm.PackageManager packageManager = zzcexVar.getContext().getPackageManager();
                if (packageManager == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot get package manager from open app action.");
                    return;
                }
                android.content.Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((com.google.android.gms.internal.ads.zzcgh) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z2, z3, str3);
                    return;
                }
                return;
            }
            return;
        }
        zzk(true);
        java.lang.String str6 = (java.lang.String) map.get("intent_url");
        if (!android.text.TextUtils.isEmpty(str6)) {
            try {
                uri = android.content.Intent.parseUri(str6, 0);
            } catch (java.net.URISyntaxException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error parsing the url: ".concat(java.lang.String.valueOf(str6)), e);
            }
        }
        android.content.Intent intent = uri;
        if (intent != null && intent.getData() != null) {
            android.net.Uri data = intent.getData();
            if (!android.net.Uri.EMPTY.equals(data)) {
                android.net.Uri uriZzd2 = zzd(zzc(zzcexVar.getContext(), zzcexVar.zzI(), data, zzcexVar.zzF(), zzcexVar.zzi(), zzcexVar.zzS()));
                if (android.text.TextUtils.isEmpty(intent.getType())) {
                    intent.setData(uriZzd2);
                } else {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzie)).booleanValue()) {
                        intent.setDataAndType(uriZzd2, intent.getType());
                    } else {
                        intent.setData(uriZzd2);
                    }
                }
            }
        }
        boolean z4 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziz)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        java.util.HashMap map3 = new java.util.HashMap();
        if (z4) {
            map2 = map3;
            obj = "event_id";
            this.zzg = new com.google.android.gms.internal.ads.zzbjz(this, z2, zzaVar, map2, map);
            z = false;
        } else {
            map2 = map3;
            obj = "event_id";
            z = z2;
        }
        if (intent != null) {
            if (!zZzb || this.zze == null || !zzl(zzaVar, zzcexVar.getContext(), intent.getData().toString(), str3)) {
                ((com.google.android.gms.internal.ads.zzcgh) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzg), z, z3, str3);
                return;
            } else {
                if (z4) {
                    java.util.HashMap map4 = map2;
                    map4.put((java.lang.String) map.get(obj), true);
                    ((com.google.android.gms.internal.ads.zzbmk) zzaVar).zzd("openIntentAsync", map4);
                    return;
                }
                return;
            }
        }
        java.util.HashMap map5 = map2;
        if (android.text.TextUtils.isEmpty(str)) {
            string = str;
        } else {
            string = zzd(zzc(zzcexVar.getContext(), zzcexVar.zzI(), android.net.Uri.parse(str), zzcexVar.zzF(), zzcexVar.zzi(), zzcexVar.zzS())).toString();
        }
        if (!zZzb || this.zze == null || !zzl(zzaVar, zzcexVar.getContext(), string, str3)) {
            ((com.google.android.gms.internal.ads.zzcgh) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc((java.lang.String) map.get(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT), string, (java.lang.String) map.get("m"), (java.lang.String) map.get(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P), (java.lang.String) map.get("c"), (java.lang.String) map.get("f"), (java.lang.String) map.get("e"), this.zzg), z, z3, str3);
        } else if (z4) {
            map5.put((java.lang.String) map.get(obj), true);
            ((com.google.android.gms.internal.ads.zzbmk) zzaVar).zzd("openIntentAsync", map5);
        }
    }

    private final void zzi(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.zze.zzc(str);
        com.google.android.gms.internal.ads.zzdrw zzdrwVar = this.zzb;
        if (zzdrwVar != null) {
            com.google.android.gms.internal.ads.zzebv.zzd(context, zzdrwVar, this.zze, str, "dialog_not_shown", com.google.android.gms.internal.ads.zzfxq.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x015c A[PHI: r22
  0x015c: PHI (r22v2 java.util.ArrayList) = (r22v1 java.util.ArrayList), (r22v1 java.util.ArrayList), (r22v1 java.util.ArrayList), (r22v3 java.util.ArrayList) binds: [B:32:0x0112, B:33:0x0114, B:35:0x011a, B:66:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v22, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    private final void zzj(com.google.android.gms.ads.internal.client.zza zzaVar, java.util.Map map, boolean z, java.lang.String str, boolean z2, boolean z3) {
        ?? r2;
        java.util.ArrayList arrayList;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.content.pm.ResolveInfo resolveInfoZzc;
        android.content.Intent intentZzb;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z4 = true;
        zzk(true);
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) zzaVar;
        android.content.Context context = zzcexVar.getContext();
        com.google.android.gms.internal.ads.zzava zzavaVarZzI = zzcexVar.zzI();
        android.view.View viewZzF = zzcexVar.zzF();
        com.google.android.gms.internal.ads.zzfcn zzfcnVarZzS = zzcexVar.zzS();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        java.lang.String str2 = (java.lang.String) map.get("u");
        java.lang.Object objBuild = null;
        if (android.text.TextUtils.isEmpty(str2)) {
            r2 = objBuild;
        } else {
            android.net.Uri uriZzd = zzd(zzc(context, zzavaVarZzI, android.net.Uri.parse(str2), viewZzF, null, zzfcnVarZzS));
            boolean z5 = java.lang.Boolean.parseBoolean((java.lang.String) map.get("use_first_package"));
            boolean z6 = java.lang.Boolean.parseBoolean((java.lang.String) map.get("use_running_process"));
            if (!java.lang.Boolean.parseBoolean((java.lang.String) map.get("use_custom_tabs"))) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeC)).booleanValue()) {
                    z4 = false;
                }
            }
            if (androidx.webkit.ProxyConfig.MATCH_HTTP.equalsIgnoreCase(uriZzd.getScheme())) {
                objBuild = uriZzd.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(uriZzd.getScheme())) {
                objBuild = uriZzd.buildUpon().scheme(androidx.webkit.ProxyConfig.MATCH_HTTP).build();
            }
            ?? r3 = objBuild;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.content.Intent intentZza = com.google.android.gms.internal.ads.zzbka.zza(uriZzd, context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
            android.content.Intent intentZza2 = com.google.android.gms.internal.ads.zzbka.zza(r3, context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
            if (z4) {
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzp(context, intentZza);
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzp(context, intentZza2);
            }
            java.util.ArrayList arrayList3 = arrayList2;
            android.content.pm.ResolveInfo resolveInfoZzd = com.google.android.gms.internal.ads.zzbka.zzd(intentZza, arrayList2, context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
            if (resolveInfoZzd != null) {
                objBuild = com.google.android.gms.internal.ads.zzbka.zzb(intentZza, resolveInfoZzd, context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
            } else if (intentZza2 == null || (resolveInfoZzc = com.google.android.gms.internal.ads.zzbka.zzc(intentZza2, context, zzavaVarZzI, viewZzF, zzfcnVarZzS)) == null) {
                r2 = intentZzb;
                if (!arrayList3.isEmpty()) {
                    if (z6 || activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                        arrayList = arrayList3;
                        if (z5) {
                            objBuild = com.google.android.gms.internal.ads.zzbka.zzb(intentZza, (android.content.pm.ResolveInfo) arrayList.get(0), context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
                        }
                    } else {
                        int size = arrayList3.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                java.util.ArrayList arrayList4 = arrayList3;
                                android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) arrayList4.get(i);
                                java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                while (true) {
                                    int i2 = i + 1;
                                    if (!it.hasNext()) {
                                        arrayList3 = arrayList4;
                                        i = i2;
                                    } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                        objBuild = com.google.android.gms.internal.ads.zzbka.zzb(intentZza, resolveInfo, context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
                                    }
                                }
                            } else {
                                arrayList = arrayList3;
                                if (z5) {
                                    objBuild = com.google.android.gms.internal.ads.zzbka.zzb(intentZza, (android.content.pm.ResolveInfo) arrayList.get(0), context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
                                }
                            }
                        }
                    }
                }
                r2 = intentZza;
            } else {
                intentZzb = com.google.android.gms.internal.ads.zzbka.zzb(intentZza, resolveInfoZzc, context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
                if (com.google.android.gms.internal.ads.zzbka.zzc(intentZzb, context, zzavaVarZzI, viewZzF, zzfcnVarZzS) == null) {
                    r2 = intentZzb;
                    if (!arrayList3.isEmpty()) {
                        if (z6) {
                            arrayList = arrayList3;
                            if (z5) {
                                objBuild = com.google.android.gms.internal.ads.zzbka.zzb(intentZza, (android.content.pm.ResolveInfo) arrayList.get(0), context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
                            }
                        } else {
                            arrayList = arrayList3;
                            if (z5) {
                                objBuild = com.google.android.gms.internal.ads.zzbka.zzb(intentZza, (android.content.pm.ResolveInfo) arrayList.get(0), context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
                            }
                        }
                    }
                    r2 = intentZza;
                }
            }
            r2 = objBuild;
        }
        if (!z || this.zze == null || r2 == 0) {
            zzaVar2 = zzaVar;
        } else {
            zzaVar2 = zzaVar;
            if (zzl(zzaVar2, zzcexVar.getContext(), r2.getData().toString(), str)) {
                return;
            }
        }
        try {
            ((com.google.android.gms.internal.ads.zzcgh) zzaVar2).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(r2, this.zzg), z2, z3, str);
        } catch (android.content.ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(e.getMessage());
        }
    }

    private final void zzk(boolean z) {
        com.google.android.gms.internal.ads.zzbsc zzbscVar = this.zzd;
        if (zzbscVar != null) {
            zzbscVar.zza(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzit)).booleanValue() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzio)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzin)).booleanValue()) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza zzaVar, android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzbtk zzbtkVar;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar;
        com.google.android.gms.internal.ads.zzdrw zzdrwVar = this.zzb;
        if (zzdrwVar != null) {
            com.google.android.gms.internal.ads.zzebv.zzc(context, zzdrwVar, this.zze, str2, "offline_open");
        }
        if (com.google.android.gms.ads.internal.zzv.zzp().zzA(context)) {
            this.zze.zzh(this.zzc, str2);
            return false;
        }
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) zzaVar;
        com.google.android.gms.internal.ads.zzfbo zzfboVarZzD = zzcexVar.zzD();
        boolean z = (zzfboVarZzD == null || (zzwVar = zzfboVarZzD.zzay) == null || zzwVar.zzc()) ? false : true;
        boolean z2 = (zzfboVarZzD == null || (zzbtkVar = zzfboVarZzD.zzad) == null || !zzbtkVar.zza || zzbtkVar.zzb == null || !zzbtkVar.zzc) ? false : true;
        if (!z) {
            if (z2) {
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzbr zzbrVarZzA = com.google.android.gms.ads.internal.util.zzs.zzA(context);
            com.google.android.gms.ads.internal.zzv.zzq();
            boolean zAreNotificationsEnabled = androidx.core.app.NotificationManagerCompat.from(context).areNotificationsEnabled();
            boolean zZzi = com.google.android.gms.ads.internal.zzv.zzr().zzi(context, "offline_notification_channel");
            boolean z3 = zzcexVar.zzO().zzi() && zzcexVar.zzi() == null;
            if (!zAreNotificationsEnabled) {
                com.google.android.gms.ads.internal.zzv.zzq();
                if (!androidx.core.app.NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                }
                zzi(context, str2, "notifications_disabled");
                return false;
            }
            if (zZzi) {
                zzi(context, str2, "notification_channel_disabled");
                return false;
            }
            if (zzbrVarZzA == null) {
                zzi(context, str2, "work_manager_unavailable");
                return false;
            }
            if (z3) {
                zzi(context, str2, "ad_no_activity");
                return false;
            }
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzil)).booleanValue()) {
                zzi(context, str2, "notification_flow_disabled");
                return false;
            }
            if (zzcexVar.zzL() == null || zzcexVar.zzi() == null) {
                ((com.google.android.gms.internal.ads.zzcgh) zzaVar).zzaK(str2, str, 14);
            } else {
                com.google.android.gms.internal.ads.zzebw zzebwVarZze = com.google.android.gms.internal.ads.zzebx.zze();
                zzebwVarZze.zza(zzcexVar.zzi());
                zzebwVarZze.zzb(null);
                zzebwVarZze.zzc(str2);
                zzebwVarZze.zzd(str);
                try {
                    zzcexVar.zzL().zzf(zzebwVarZze.zze());
                } catch (java.lang.Exception e) {
                    zzi(context, str2, e.getMessage());
                    return false;
                }
            }
            zzaVar.onAdClicked();
            return true;
        }
        com.google.android.gms.internal.ads.zzdrw zzdrwVar2 = this.zzb;
        if (zzdrwVar2 != null) {
            com.google.android.gms.internal.ads.zzebv.zzc(context, zzdrwVar2, this.zze, str2, "onfs");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i) {
        com.google.android.gms.internal.ads.zzdrw zzdrwVar;
        java.lang.String str;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeF)).booleanValue() || (zzdrwVar = this.zzb) == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = zzdrwVar.zza();
        zzdrvVarZza.zzb("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdrvVarZza.zzb("cct_open_status", str);
        zzdrvVarZza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        java.lang.String str = (java.lang.String) map.get("u");
        java.util.Map map2 = new java.util.HashMap();
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) zzaVar;
        if (zzcexVar.zzD() != null) {
            map2 = zzcexVar.zzD().zzaw;
        }
        java.lang.String strZzc = com.google.android.gms.internal.ads.zzbyk.zzc(str, zzcexVar.getContext(), true, map2);
        java.lang.String str2 = (java.lang.String) map.get(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
        if (str2 == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzc()) {
            com.google.android.gms.internal.ads.zzgch.zzr((((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjT)).booleanValue() && this.zzf != null && com.google.android.gms.internal.ads.zzcmk.zzj(strZzc)) ? this.zzf.zzb(strZzc, com.google.android.gms.ads.internal.client.zzbc.zze()) : com.google.android.gms.internal.ads.zzgch.zzh(strZzc), new com.google.android.gms.internal.ads.zzbjx(this, map, zzaVar, str2), this.zzh);
        } else {
            zzbVar.zzb(strZzc);
        }
    }
}
