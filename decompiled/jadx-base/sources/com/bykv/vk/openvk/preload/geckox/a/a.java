package com.bykv.vk.openvk.preload.geckox.a;

/* JADX INFO: compiled from: AbandonChannelClenUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f1711a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;
    public java.lang.String f;
    public int g;

    public static void a(final android.content.Context context, java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.geckox.model.ComponentModel.a> map, java.io.File file, final com.bykv.vk.openvk.preload.geckox.e.a.a aVar) {
        final java.util.ArrayList arrayList;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry<java.lang.String, com.bykv.vk.openvk.preload.geckox.model.ComponentModel.a> entry : map.entrySet()) {
                if (new java.io.File(file, entry.getKey()).isDirectory()) {
                    entry.getValue();
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    android.content.Context context2 = context;
                    java.util.List list = arrayList;
                    if (list != null && !list.isEmpty()) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            it.next();
                            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                            boolean zA = com.bykv.vk.openvk.preload.geckox.utils.b.a((java.io.File) null);
                            long jUptimeMillis2 = android.os.SystemClock.uptimeMillis();
                            if (zA) {
                                com.bykv.vk.openvk.preload.geckox.a.b.a(context2).a(200, 0, null, jUptimeMillis2 - jUptimeMillis);
                            } else {
                                com.bykv.vk.openvk.preload.geckox.a.b.a(context2).a(com.ironsource.g3.c.b.INSTANCE_LOAD, 601, "delete failed", jUptimeMillis2 - jUptimeMillis);
                            }
                        }
                    }
                } catch (java.lang.Exception e2) {
                    com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("clean-channel", "", e2);
                }
            }
        });
    }

    public static java.util.List<com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel> a(android.content.Context context) {
        return com.bykv.vk.openvk.preload.geckox.a.b.a(context).a();
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.c()) {
            com.bykv.vk.openvk.preload.geckox.model.Common common = new com.bykv.vk.openvk.preload.geckox.model.Common(bVar.k(), bVar.m(), bVar.o(), com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a()), com.bykv.vk.openvk.preload.geckox.utils.e.a(bVar.a()), null, null);
            com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel statisticModel = new com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(com.bykv.vk.openvk.preload.geckox.a.b.a(bVar.a()).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            java.lang.String str = "https://" + bVar.j() + "/gecko/server/packages/stats";
            try {
                com.bykv.vk.openvk.preload.geckox.net.Response responseDoPost = bVar.i().doPost(str, com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(statisticModel));
                if (responseDoPost.code != 200) {
                    throw new android.accounts.NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                }
                if (new org.json.JSONObject(responseDoPost.body).getInt("status") != 0) {
                    throw new java.lang.RuntimeException("upload failed");
                }
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
