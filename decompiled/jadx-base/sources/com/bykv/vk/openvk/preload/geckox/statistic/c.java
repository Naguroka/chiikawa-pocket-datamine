package com.bykv.vk.openvk.preload.geckox.statistic;

/* JADX INFO: compiled from: UploadStatistic.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.a.a aVar) {
        com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor iStatisticMonitorN = bVar.n();
        if (iStatisticMonitorN != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("params_for_special", "gecko");
                jSONObject.put("device_id", bVar.o());
                jSONObject.put(com.json.ce.y, 0);
                jSONObject.put("app_version", bVar.m());
                jSONObject.put("api_version", "v3");
                jSONObject.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, bVar.k());
                jSONObject.put("x_tt_logid", aVar.e);
                jSONObject.put("http_status", aVar.g);
                jSONObject.put("err_msg", aVar.d);
                if (android.text.TextUtils.isEmpty(aVar.e)) {
                    jSONObject.put("deployments_info", aVar.b);
                    jSONObject.put("local_info", aVar.f1711a);
                    jSONObject.put("custom_info", aVar.c);
                } else {
                    jSONObject.put("deployments_info", "");
                    jSONObject.put("local_info", "");
                    jSONObject.put("custom_info", "");
                }
                jSONObject.put("os_version", new java.lang.StringBuilder().append(android.os.Build.VERSION.SDK_INT).toString());
                jSONObject.put("device_platform", "android");
                jSONObject.put("device_model", android.os.Build.MODEL);
                jSONObject.put("ac", aVar.f);
                iStatisticMonitorN.upload("geckosdk_query_pkgs", jSONObject);
            } catch (java.lang.Throwable th) {
                com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
    }

    private static java.lang.Integer a(java.util.List<com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return java.lang.Integer.valueOf(list.size());
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar, java.util.List<com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel> list) {
        if (aVar.B && aVar.C) {
            com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel packageStatisticModel = new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.f1751a;
            packageStatisticModel.groupName = aVar.b;
            packageStatisticModel.channel = aVar.c;
            packageStatisticModel.ac = aVar.p;
            packageStatisticModel.id = aVar.r;
            packageStatisticModel.downloadRetryTimes = a(aVar.w);
            packageStatisticModel.downloadUrl = aVar.v;
            packageStatisticModel.downloadFailRecords = b(aVar.w);
            packageStatisticModel.downloadDuration = java.lang.Long.valueOf(aVar.y - aVar.x);
            if (aVar.D) {
                com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel packageStatisticModel2 = new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.f1751a;
                packageStatisticModel2.groupName = aVar.b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.id = aVar.r;
                packageStatisticModel2.channel = aVar.c;
                packageStatisticModel2.activeCheckDuration = java.lang.Long.valueOf(aVar.z - aVar.y);
                packageStatisticModel2.applyDuration = java.lang.Long.valueOf(aVar.A - aVar.z);
                return;
            }
            com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel packageStatisticModel3 = new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.f1751a;
            packageStatisticModel3.groupName = aVar.b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.id = aVar.r;
            packageStatisticModel3.channel = aVar.c;
            packageStatisticModel3.errMsg = aVar.F;
            return;
        }
        com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel packageStatisticModel4 = new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.f1751a;
        packageStatisticModel4.groupName = aVar.b;
        packageStatisticModel4.channel = aVar.c;
        packageStatisticModel4.ac = aVar.p;
        packageStatisticModel4.id = aVar.r;
        packageStatisticModel4.downloadRetryTimes = a(aVar.w);
        packageStatisticModel4.downloadUrl = aVar.v;
        packageStatisticModel4.downloadFailRecords = b(aVar.w);
        if (!aVar.B) {
            packageStatisticModel4.errCode = "300";
            if (aVar.w == null || aVar.w.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.w.get(0).reason;
            return;
        }
        if (aVar.C) {
            return;
        }
        packageStatisticModel4.errCode = "450";
        packageStatisticModel4.errMsg = aVar.E;
    }

    private static java.util.List<com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel.DownloadFailRecords> b(java.util.List<com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    public static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.statistic.a aVar) {
        com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel statisticModel;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.d != null || aVar2.f != 0) {
                if (aVar2.h && aVar2.i) {
                    com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel packageStatisticModel = new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.b;
                    packageStatisticModel.accessKey = aVar2.f1751a;
                    packageStatisticModel.channel = aVar2.c;
                    packageStatisticModel.ac = aVar2.p;
                    packageStatisticModel.id = aVar2.r;
                    packageStatisticModel.patchId = aVar2.q;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.e);
                    packageStatisticModel.downloadUrl = aVar2.d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.e);
                    packageStatisticModel.downloadDuration = java.lang.Long.valueOf(aVar2.g - aVar2.f);
                    if (!aVar2.j) {
                        com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel packageStatisticModel2 = new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.t;
                        packageStatisticModel2.ac = aVar2.p;
                        packageStatisticModel2.patchId = aVar2.q;
                        packageStatisticModel2.id = aVar2.r;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.e);
                        packageStatisticModel2.downloadUrl = aVar2.d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.e);
                    } else if (aVar2.k) {
                        com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel packageStatisticModel3 = new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f1751a;
                        packageStatisticModel3.groupName = aVar2.b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.q;
                        packageStatisticModel3.id = aVar2.r;
                        packageStatisticModel3.channel = aVar2.c;
                        packageStatisticModel3.activeCheckDuration = java.lang.Long.valueOf(aVar2.n - aVar2.g);
                        packageStatisticModel3.applyDuration = java.lang.Long.valueOf(aVar2.o - aVar2.n);
                    } else {
                        com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel packageStatisticModel4 = new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f1751a;
                        packageStatisticModel4.groupName = aVar2.b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.c;
                        packageStatisticModel4.patchId = aVar2.q;
                        packageStatisticModel4.id = aVar2.r;
                        packageStatisticModel4.errMsg = aVar2.u;
                        a(aVar2, arrayList);
                    }
                } else {
                    com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel packageStatisticModel5 = new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f1751a;
                    packageStatisticModel5.groupName = aVar2.b;
                    packageStatisticModel5.channel = aVar2.c;
                    packageStatisticModel5.ac = aVar2.p;
                    packageStatisticModel5.patchId = aVar2.q;
                    packageStatisticModel5.id = aVar2.r;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.e);
                    packageStatisticModel5.downloadUrl = aVar2.d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.e);
                    if (!aVar2.h) {
                        packageStatisticModel5.errCode = "301";
                        if (aVar2.e != null && !aVar2.e.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.e.get(0).reason;
                        }
                    } else if (!aVar2.i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.s;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        android.content.Context contextA = bVar.a();
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.a.a(contextA));
        if (arrayList.isEmpty()) {
            statisticModel = null;
        } else {
            com.bykv.vk.openvk.preload.geckox.model.Common common = new com.bykv.vk.openvk.preload.geckox.model.Common(bVar.k(), bVar.m(), bVar.o(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), com.bykv.vk.openvk.preload.geckox.utils.e.a(contextA), null, null);
            com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel statisticModel2 = new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel();
            statisticModel2.common = common;
            statisticModel2.packages = arrayList;
            java.lang.String string = java.util.UUID.randomUUID().toString();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel) it.next()).logId = string;
            }
            statisticModel = statisticModel2;
        }
        if (statisticModel == null || statisticModel.packages == null) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor iStatisticMonitorN = bVar.n();
        if (iStatisticMonitorN != null) {
            try {
                for (com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel packageStatisticModel6 : statisticModel.packages) {
                    com.bykv.vk.openvk.preload.geckox.model.Common common2 = statisticModel.common;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("params_for_special", "gecko");
                    jSONObject.put(androidx.media3.extractor.text.ttml.TtmlNode.TAG_REGION, common2.region);
                    jSONObject.put("err_code", packageStatisticModel6.errCode);
                    jSONObject.put("err_msg", packageStatisticModel6.errMsg);
                    jSONObject.put("sdk_version", common2.sdkVersion);
                    jSONObject.put("access_key", packageStatisticModel6.accessKey);
                    jSONObject.put("stats_type", packageStatisticModel6.statsType);
                    jSONObject.put("device_id", common2.deviceId);
                    jSONObject.put("patch_id", packageStatisticModel6.patchId == null ? 0L : packageStatisticModel6.patchId.longValue());
                    jSONObject.put("group_name", packageStatisticModel6.groupName);
                    jSONObject.put(com.json.ce.y, common2.os);
                    jSONObject.put("app_version", common2.appVersion);
                    jSONObject.put("device_model", common2.deviceModel);
                    jSONObject.put("channel", packageStatisticModel6.channel);
                    jSONObject.put("id", packageStatisticModel6.id == null ? 0L : packageStatisticModel6.id.longValue());
                    jSONObject.put("ac", common2.ac);
                    jSONObject.put("download_retry_times", packageStatisticModel6.downloadRetryTimes == null ? 0 : packageStatisticModel6.downloadRetryTimes.intValue());
                    java.lang.Object obj = "";
                    jSONObject.put("download_url", packageStatisticModel6.downloadUrl == null ? "" : packageStatisticModel6.downloadUrl);
                    jSONObject.put("download_duration", packageStatisticModel6.downloadDuration);
                    if (packageStatisticModel6.downloadFailRecords != null) {
                        obj = packageStatisticModel6.downloadFailRecords;
                    }
                    jSONObject.put("download_fail_records", obj);
                    jSONObject.put("log_id", packageStatisticModel6.logId);
                    jSONObject.put("active_check_duration", packageStatisticModel6.activeCheckDuration == null ? 0L : packageStatisticModel6.activeCheckDuration.longValue());
                    jSONObject.put("apply_duration", packageStatisticModel6.applyDuration == null ? 0L : packageStatisticModel6.applyDuration.longValue());
                    iStatisticMonitorN.upload("geckosdk_update_stats", jSONObject);
                }
            } catch (java.lang.Throwable th) {
                com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
        if (bVar.c()) {
            try {
                final java.lang.String strA = com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(statisticModel);
                if (android.text.TextUtils.isEmpty(strA)) {
                    return;
                }
                final java.lang.String str = "https://" + bVar.j() + "/gecko/server/packages/stats";
                com.bykv.vk.openvk.preload.geckox.b.g().execute(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (int i = 0; i < 3; i++) {
                            try {
                                com.bykv.vk.openvk.preload.geckox.net.Response responseDoPost = bVar.i().doPost(str, strA);
                                if (responseDoPost.code != 200) {
                                    throw new android.accounts.NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                                }
                                if (new org.json.JSONObject(responseDoPost.body).getInt("status") == 0) {
                                    return;
                                }
                            } catch (java.lang.Exception e) {
                                com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("gecko-debug-tag", "upload statistic:", e);
                            }
                        }
                    }
                });
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
