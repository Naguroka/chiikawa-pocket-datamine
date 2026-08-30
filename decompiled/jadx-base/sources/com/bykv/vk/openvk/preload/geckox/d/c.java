package com.bykv.vk.openvk.preload.geckox.d;

/* JADX INFO: compiled from: GetServerChannelVersionInterceptorMulti.java */
/* JADX INFO: loaded from: classes3.dex */
public class c extends com.bykv.vk.openvk.preload.b.d<java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.Long>>>, java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> e;
    private java.util.Map<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.TargetChannel>> f;
    private com.bykv.vk.openvk.preload.geckox.e.a.a g;
    private java.lang.String h;
    private com.bykv.vk.openvk.preload.geckox.a.a i = new com.bykv.vk.openvk.preload.geckox.a.a();

    @Override // com.bykv.vk.openvk.preload.b.d
    protected final void a(java.lang.Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.e = (java.util.Map) objArr[1];
        this.f = (java.util.Map) objArr[2];
        this.g = (com.bykv.vk.openvk.preload.geckox.e.a.a) objArr[3];
        this.h = (java.lang.String) objArr[4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public java.lang.Object a(com.bykv.vk.openvk.preload.b.b<java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> bVar, java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.Long>>> map) throws java.lang.Exception {
        java.util.List<android.util.Pair<java.lang.String, com.bykv.vk.openvk.preload.geckox.f.a>> listC;
        char c = 2;
        int i = 0;
        char c2 = 1;
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "start get server channel version[v3]... local channel version:", map);
        java.util.Map<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> mapA = a(map);
        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.i);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>>> it = mapA.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Iterator<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                com.bykv.vk.openvk.preload.geckox.model.UpdatePackage next = it2.next();
                long localVersion = next.getLocalVersion();
                long version = next.getVersion();
                if (version < localVersion) {
                    java.lang.Object[] objArr = new java.lang.Object[5];
                    objArr[i] = next.getChannel();
                    objArr[c2] = "rollback：";
                    objArr[c] = java.lang.Long.valueOf(localVersion);
                    objArr[3] = "->";
                    objArr[4] = java.lang.Long.valueOf(version);
                    com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", objArr);
                    java.io.File[] fileArrListFiles = new java.io.File(this.d.l(), next.getAccessKey() + java.io.File.separator + next.getChannel()).listFiles(new java.io.FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.1
                        @Override // java.io.FileFilter
                        public final boolean accept(java.io.File file) {
                            return file.isDirectory();
                        }
                    });
                    if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                        c = 2;
                        c2 = 1;
                        i = 0;
                    } else {
                        int length = fileArrListFiles.length;
                        int i2 = i;
                        while (i2 < length) {
                            java.io.File file = fileArrListFiles[i2];
                            try {
                                long j = java.lang.Long.parseLong(file.getName());
                                if (j > version) {
                                    final java.io.File file2 = new java.io.File(file.getParent(), file.getName() + "--pending-delete");
                                    file.renameTo(file2);
                                    com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.bykv.vk.openvk.preload.geckox.utils.b.a(file2);
                                        }
                                    });
                                } else if (j == version) {
                                    it2.remove();
                                }
                            } catch (java.lang.Exception unused) {
                            }
                            i2++;
                            c = 2;
                            c2 = 1;
                            i = 0;
                        }
                    }
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>>> it3 = mapA.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList.addAll(it3.next().getValue());
        }
        java.lang.Object objA = null;
        try {
            listC = c(arrayList);
            try {
                objA = bVar.a(arrayList);
                b(listC);
                com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "all channel update finished");
            } catch (java.lang.Throwable th) {
                th = th;
                try {
                    com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.e("gecko-debug-tag", "filterChannel:", th);
                    b(listC);
                    com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                } catch (java.lang.Throwable th2) {
                    b(listC);
                    com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            listC = null;
        }
        a(arrayList);
        return objA;
    }

    private void a(java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> list) {
        if (list.isEmpty()) {
            return;
        }
        for (com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage : list) {
            com.bykv.vk.openvk.preload.geckox.a.c.a(new java.io.File(new java.io.File(this.d.l(), updatePackage.getAccessKey()), updatePackage.getChannel()).getAbsolutePath());
        }
    }

    private static void b(java.util.List<android.util.Pair<java.lang.String, com.bykv.vk.openvk.preload.geckox.f.a>> list) {
        if (list == null) {
            return;
        }
        java.util.Iterator<android.util.Pair<java.lang.String, com.bykv.vk.openvk.preload.geckox.f.a>> it = list.iterator();
        while (it.hasNext()) {
            try {
                ((com.bykv.vk.openvk.preload.geckox.f.a) it.next().second).a();
            } catch (java.lang.Exception e) {
                com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.e("gecko-debug-tag", "releaseLock:", e);
            }
        }
    }

    private java.util.List<android.util.Pair<java.lang.String, com.bykv.vk.openvk.preload.geckox.f.a>> c(java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> list) {
        if (list.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage : list) {
            try {
                java.io.File file = new java.io.File(new java.io.File(this.d.l(), updatePackage.getAccessKey()), updatePackage.getChannel());
                if (file.isFile()) {
                    com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
                }
                if (!file.mkdirs() && !file.isDirectory()) {
                    com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "can not create channel dir：", file.getAbsolutePath());
                    throw new java.lang.RuntimeException("can not create channel dir:" + file.getAbsolutePath());
                }
                com.bykv.vk.openvk.preload.geckox.f.a aVarA = com.bykv.vk.openvk.preload.geckox.f.a.a(file.getAbsolutePath() + java.io.File.separator + "update.lock");
                if (aVarA != null) {
                    arrayList.add(new android.util.Pair(updatePackage.getChannel(), aVarA));
                    arrayList2.add(updatePackage);
                } else {
                    com.bykv.vk.openvk.preload.geckox.e.a.a aVar = this.g;
                    updatePackage.getChannel();
                }
            } catch (java.lang.Exception e) {
                com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.e("gecko-debug-tag", "filterChannel:", e);
                updatePackage.getChannel();
                com.bykv.vk.openvk.preload.geckox.e.a.a aVar2 = this.g;
            }
        }
        list.clear();
        list.addAll(arrayList2);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.util.Map<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> a(java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.Long>>> map) throws java.lang.Exception {
        java.lang.String strB = b(map);
        java.lang.String str = "https://" + this.d.j() + "/gecko/server/v3/package";
        try {
            this.i.f = com.bykv.vk.openvk.preload.geckox.utils.e.a(this.d.a());
            com.bykv.vk.openvk.preload.geckox.net.Response responseDoPost = this.d.i().doPost(str, strB);
            this.i.g = responseDoPost.code;
            this.i.d = responseDoPost.msg;
            com.bykv.vk.openvk.preload.geckox.a.a aVar = this.i;
            java.util.Map<java.lang.String, java.lang.String> map2 = responseDoPost.headers;
            java.lang.String str2 = "";
            if (map2 != null && !map2.isEmpty()) {
                java.lang.String str3 = map2.get("x-tt-logid");
                if (android.text.TextUtils.isEmpty(str3)) {
                    str3 = map2.get("X-Tt-Logid");
                    if (android.text.TextUtils.isEmpty(str3)) {
                        java.lang.String str4 = map2.get("X-TT-LOGID");
                        if (!android.text.TextUtils.isEmpty(str4)) {
                            str2 = str4;
                        }
                    } else {
                        str2 = str3;
                    }
                } else {
                    str2 = str3;
                }
            }
            aVar.e = str2;
            if (responseDoPost.code == 200) {
                java.lang.String str5 = responseDoPost.body;
                com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "response:", str5);
                try {
                    com.bykv.vk.openvk.preload.geckox.model.Response response = (com.bykv.vk.openvk.preload.geckox.model.Response) (str5 == null ? null : com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(new java.io.StringReader(str5), new com.bykv.vk.openvk.preload.a.c.a<com.bykv.vk.openvk.preload.geckox.model.Response<com.bykv.vk.openvk.preload.geckox.model.ComponentModel>>() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.3
                    }.b()));
                    if (response.status == 0) {
                        if (response.data == 0) {
                            this.i.d = "check update error：response.data==null";
                            com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.i);
                            throw new com.bykv.vk.openvk.preload.geckox.d.c.a("check update error：response.data==null");
                        }
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.d.a(), ((com.bykv.vk.openvk.preload.geckox.model.ComponentModel) response.data).getUniversalStrategies(), this.d.l(), this.g);
                        java.util.Map<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> packages = ((com.bykv.vk.openvk.preload.geckox.model.ComponentModel) response.data).getPackages();
                        if (packages == null || packages.isEmpty()) {
                            com.bykv.vk.openvk.preload.geckox.a.a.a(this.d);
                            return new java.util.HashMap();
                        }
                        for (java.lang.String str6 : this.d.e()) {
                            java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> list = packages.get(str6);
                            if (list != null && !list.isEmpty()) {
                                for (com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage : list) {
                                    updatePackage.setAccessKey(str6);
                                    updatePackage.setLocalVersion(a(map.get(str6), updatePackage.getChannel()));
                                }
                            }
                        }
                        return packages;
                    }
                    if (response.status == 2000) {
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.d);
                        return new java.util.HashMap();
                    }
                    java.lang.String str7 = "check update error，unknow status code，response.status：" + response.status;
                    this.i.d = str7;
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.i);
                    throw new com.bykv.vk.openvk.preload.geckox.d.c.a(str7);
                } catch (java.lang.Throwable th) {
                    this.i.d = "json parse failed：" + th.getMessage();
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.i);
                    throw new com.bykv.vk.openvk.preload.geckox.d.c.b("json parse failed：" + str5 + " caused by:" + th.getMessage(), th);
                }
            }
            throw new android.accounts.NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
        } catch (java.lang.Exception e) {
            com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.d, this.i);
            throw new com.bykv.vk.openvk.preload.geckox.d.c.C0075c("request failed：url:" + str + ", caused by:" + e.getMessage(), e);
        }
    }

    private static long a(java.util.List<android.util.Pair<java.lang.String, java.lang.Long>> list, java.lang.String str) {
        for (android.util.Pair<java.lang.String, java.lang.Long> pair : list) {
            if (((java.lang.String) pair.first).equals(str)) {
                return ((java.lang.Long) pair.second).longValue();
            }
        }
        return 0L;
    }

    private java.lang.String b(java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.Long>>> map) {
        java.util.List<com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.TargetChannel> list;
        com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel checkRequestBodyModel = new com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel();
        android.content.Context contextA = this.d.a();
        checkRequestBodyModel.setCommon(new com.bykv.vk.openvk.preload.geckox.model.Common(this.d.k(), this.d.m(), this.d.o(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), com.bykv.vk.openvk.preload.geckox.utils.e.a(contextA), null, null));
        java.util.HashMap map2 = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.Long>>> entry : map.entrySet()) {
            java.util.HashMap map3 = new java.util.HashMap();
            for (android.util.Pair<java.lang.String, java.lang.Long> pair : entry.getValue()) {
                com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.LocalChannel localChannel = new com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (java.lang.Long) pair.second;
                map3.put(pair.first, localChannel);
            }
            map2.put(entry.getKey(), map3);
        }
        try {
            com.bykv.vk.openvk.preload.a.d dVarB = com.bykv.vk.openvk.preload.geckox.c.b.a().b();
            this.i.f1711a = dVarB.a(map2);
            checkRequestBodyModel.setLocal(map2);
            java.util.HashMap map4 = new java.util.HashMap();
            for (java.lang.String str : this.d.e()) {
                com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.Group group = new com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.Group();
                group.groupName = this.h;
                java.util.Map<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.TargetChannel>> map5 = this.f;
                if (map5 != null && !map5.isEmpty() && (list = this.f.get(str)) != null && !list.isEmpty()) {
                    group.targetChannels = new java.util.ArrayList();
                    group.targetChannels.addAll(list);
                }
                map4.put(str, group);
            }
            this.i.b = dVarB.a(map4);
            checkRequestBodyModel.setDeployments(map4);
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map6 = this.e;
            if (map6 != null) {
                this.i.c = dVarB.a(map6);
                checkRequestBodyModel.setCustom(this.e);
            }
            return dVarB.a(checkRequestBodyModel);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.d.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GetServerChannelVersionInterceptorMulti.java */
    public static class C0075c extends java.lang.RuntimeException {
        C0075c(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: GetServerChannelVersionInterceptorMulti.java */
    public static class b extends java.lang.RuntimeException {
        b(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: GetServerChannelVersionInterceptorMulti.java */
    public static class a extends java.lang.RuntimeException {
        a(java.lang.String str) {
            super(str);
        }
    }
}
