package com.bykv.vk.openvk.preload.geckox;

/* JADX INFO: compiled from: GeckoClient.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List<java.lang.String> f1709a = new java.util.ArrayList();
    private com.bykv.vk.openvk.preload.falconx.a.a b = new com.bykv.vk.openvk.preload.falconx.a.a();
    private java.util.Queue<java.lang.String> c = new java.util.concurrent.LinkedBlockingQueue();
    private com.bykv.vk.openvk.preload.geckox.b d;
    private java.io.File e;

    private a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        this.d = bVar;
        java.io.File fileL = bVar.l();
        this.e = fileL;
        fileL.mkdirs();
        com.bykv.vk.openvk.preload.geckox.statistic.b.a(this, this.d);
    }

    public static com.bykv.vk.openvk.preload.geckox.a a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        java.util.List<java.lang.String> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            throw new java.lang.IllegalArgumentException("access key empty");
        }
        return new com.bykv.vk.openvk.preload.geckox.a(bVar);
    }

    private boolean b(java.util.Map<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.TargetChannel>> map) {
        if (map != null && !map.isEmpty()) {
            java.util.List<java.lang.String> listE = this.d.e();
            for (java.util.Map.Entry<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                java.util.Iterator<java.lang.String> it = listE.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (android.text.TextUtils.equals(it.next(), entry.getKey())) {
                        z = true;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean a() {
        java.util.List<java.lang.String> listD = this.d.d();
        java.util.List<java.lang.String> listE = this.d.e();
        if (listD == null || listD.isEmpty() || listE == null || listE.isEmpty()) {
            return false;
        }
        for (java.lang.String str : listE) {
            java.util.Iterator<java.lang.String> it = listD.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (android.text.TextUtils.equals(str, it.next())) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final void a(java.lang.Class<? extends com.bykv.vk.openvk.preload.b.d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        this.b.a(cls, aVar);
    }

    public final void a(final java.util.Map<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.TargetChannel>> map) {
        final java.lang.String str = "default";
        if (android.text.TextUtils.isEmpty("default")) {
            throw new java.lang.IllegalArgumentException("groupType == null");
        }
        if (!a()) {
            throw new java.lang.IllegalArgumentException("deployments keys not in local keys");
        }
        if (!b(map)) {
            throw new java.lang.IllegalArgumentException("target keys not in deployments keys");
        }
        com.bykv.vk.openvk.preload.geckox.b.h().execute(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1
            private /* synthetic */ com.bykv.vk.openvk.preload.geckox.e.a.a b = null;
            private /* synthetic */ java.util.Map c = null;

            @Override // java.lang.Runnable
            public final void run() {
                com.bykv.vk.openvk.preload.geckox.a.a.b bVarA;
                com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "start check update...", str);
                if (com.bykv.vk.openvk.preload.geckox.a.this.d.b() != null) {
                    bVarA = com.bykv.vk.openvk.preload.geckox.a.this.d.b().a();
                    bVarA.a(com.bykv.vk.openvk.preload.geckox.a.this.d.b(), com.bykv.vk.openvk.preload.geckox.a.this.d.l(), com.bykv.vk.openvk.preload.geckox.a.this.d.e());
                } else {
                    bVarA = null;
                }
                try {
                    try {
                        com.bykv.vk.openvk.preload.geckox.a.this.d.a(new org.json.JSONObject());
                        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "update finished", com.bykv.vk.openvk.preload.geckox.g.a.a(com.bykv.vk.openvk.preload.geckox.a.this.e, com.bykv.vk.openvk.preload.geckox.a.this.d, com.bykv.vk.openvk.preload.geckox.a.this.b, map, str).a(str));
                        if (bVarA != null) {
                            bVarA.a();
                        }
                        com.bykv.vk.openvk.preload.geckox.a.this.d.n().upload("download_gecko_end", com.bykv.vk.openvk.preload.geckox.a.this.d.f());
                        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                    } catch (java.lang.Throwable th) {
                        if (bVarA != null) {
                            bVarA.a();
                        }
                        com.bykv.vk.openvk.preload.geckox.a.this.d.n().upload("download_gecko_end", com.bykv.vk.openvk.preload.geckox.a.this.d.f());
                        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                        throw th;
                    }
                } catch (java.lang.Exception e) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("success", false);
                        jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, e.toString());
                        jSONObject.put("code", 2);
                        com.bykv.vk.openvk.preload.geckox.a.this.d.a(jSONObject);
                    } catch (java.lang.Throwable unused) {
                    }
                    com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("gecko-debug-tag", "Gecko update failed:", e);
                    if (bVarA != null) {
                        bVarA.a();
                    }
                    com.bykv.vk.openvk.preload.geckox.a.this.d.n().upload("download_gecko_end", com.bykv.vk.openvk.preload.geckox.a.this.d.f());
                    com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                }
                com.bykv.vk.openvk.preload.geckox.a.d(com.bykv.vk.openvk.preload.geckox.a.this);
            }
        });
    }

    static /* synthetic */ void d(com.bykv.vk.openvk.preload.geckox.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(aVar.d.e());
        try {
            java.lang.String strA = com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(new com.bykv.vk.openvk.preload.geckox.a.c(arrayList));
            if (aVar.c.size() < 10) {
                aVar.c.add(strA);
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
