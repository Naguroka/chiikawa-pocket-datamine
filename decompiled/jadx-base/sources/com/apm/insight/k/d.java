package com.apm.insight.k;

/* JADX INFO: compiled from: CrashUploadManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.apm.insight.k.d f427a;
    private volatile android.content.Context b;

    public static com.apm.insight.k.d a() {
        if (f427a == null) {
            f427a = new com.apm.insight.k.d(com.apm.insight.e.g());
        }
        return f427a;
    }

    private d(android.content.Context context) {
        this.b = context;
    }

    public static boolean a(org.json.JSONObject jSONObject, java.io.File file, java.io.File file2) {
        try {
            return com.apm.insight.k.e.a(com.apm.insight.k.e.g(), jSONObject.toString(), file, file2, com.apm.insight.runtime.p.a(java.lang.System.currentTimeMillis()), new java.io.File(com.apm.insight.h.b.a())).a();
        } catch (java.lang.Throwable th) {
            com.apm.insight.a.b(th);
            return false;
        }
    }

    public final void a(org.json.JSONObject jSONObject, long j, boolean z) {
        java.io.File[] fileArr;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            java.lang.String strC = com.apm.insight.k.e.c();
            int i = 0;
            java.io.File file = new java.io.File(com.apm.insight.l.j.a(this.b), com.apm.insight.e.a(j, com.apm.insight.CrashType.ANR, false, false));
            com.apm.insight.l.f.a(file, file.getName(), strC, jSONObject, com.apm.insight.k.e.b());
            if (z && !com.apm.insight.Npth.isStopUpload()) {
                jSONObject.put("upload_scene", "direct");
                jSONObject.put("crash_uuid", file.getName());
                if (com.apm.insight.runtime.a.h()) {
                    java.util.HashMap<java.lang.String, com.apm.insight.runtime.p.a> mapA = com.apm.insight.runtime.p.a(j, "anr_trace");
                    fileArr = new java.io.File[mapA.size() + 2];
                    for (java.util.Map.Entry<java.lang.String, com.apm.insight.runtime.p.a> entry : mapA.entrySet()) {
                        if (!entry.getKey().equals(com.apm.insight.l.a.d(this.b))) {
                            fileArr[i] = com.apm.insight.l.j.a(this.b, entry.getValue().f494a);
                            i++;
                        }
                    }
                } else {
                    fileArr = new java.io.File[2];
                }
                fileArr[fileArr.length - 1] = com.apm.insight.l.j.a(this.b, com.apm.insight.e.f());
                fileArr[fileArr.length - 2] = com.apm.insight.runtime.p.a(j);
                if (com.apm.insight.k.e.a(strC, jSONObject.toString(), fileArr).a()) {
                    com.apm.insight.l.f.a(file);
                    if (com.apm.insight.Npth.hasCrash()) {
                        return;
                    }
                    com.apm.insight.l.f.a(com.apm.insight.l.j.e(com.apm.insight.e.g()));
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final boolean a(org.json.JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                java.lang.String strC = com.apm.insight.k.e.c();
                java.io.File file = new java.io.File(com.apm.insight.l.j.a(this.b), com.apm.insight.l.j.a(com.apm.insight.e.e()));
                com.apm.insight.l.f.a(file, file.getName(), strC, jSONObject, com.apm.insight.k.e.a());
                jSONObject.put("upload_scene", "direct");
                if (!com.apm.insight.k.e.b(strC, jSONObject.toString()).a()) {
                    return false;
                }
                com.apm.insight.l.f.a(file);
                return true;
            } catch (java.lang.Throwable th) {
                com.apm.insight.a.b(th);
            }
        }
        return false;
    }

    public final void b(org.json.JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            java.lang.String strF = com.apm.insight.k.e.f();
            java.io.File file = new java.io.File(com.apm.insight.l.j.a(this.b), com.apm.insight.l.j.c());
            com.apm.insight.l.f.a(file, file.getName(), strF, jSONObject, com.apm.insight.k.e.b());
            if (com.apm.insight.k.e.a(strF, jSONObject.toString()).a()) {
                com.apm.insight.l.f.a(file);
            }
        } catch (java.lang.Throwable th) {
            com.apm.insight.a.b(th);
        }
    }

    public final void c(final org.json.JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.k.d.1
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String strC = com.apm.insight.k.e.c();
                try {
                    jSONObject.put("upload_scene", "direct");
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }
                com.apm.insight.k.e.b(strC, jSONObject.toString());
            }
        });
    }
}
