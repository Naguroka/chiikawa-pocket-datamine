package com.apm.insight.runtime;

/* JADX INFO: compiled from: RuntimeContext.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.apm.insight.runtime.q f495a;
    private java.io.File b;
    private java.io.File c;
    private java.io.File d;
    private android.content.Context e;
    private com.apm.insight.runtime.q.a f = null;

    public static com.apm.insight.runtime.q a() {
        if (f495a == null) {
            f495a = new com.apm.insight.runtime.q(com.apm.insight.e.g());
        }
        return f495a;
    }

    private q(android.content.Context context) {
        java.io.File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.b = fileC;
        this.c = new java.io.File(fileC, "did");
        this.d = new java.io.File(fileC, "device_uuid");
        this.e = context;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    public final void a(java.util.Map<java.lang.String, java.lang.Object> map, org.json.JSONArray jSONArray) {
        char c;
        org.json.JSONObject jSONObjectA = com.apm.insight.entity.Header.a(this.e).a(map);
        if (com.apm.insight.entity.Header.c(jSONObjectA)) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f == null) {
            c(".ctx");
        }
        com.apm.insight.runtime.q.a aVar = this.f;
        if (aVar == null) {
            a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
            return;
        }
        org.json.JSONObject jSONObjectA2 = aVar.a();
        if (com.apm.insight.entity.Header.c(jSONObjectA2)) {
            c = 2;
        } else if (com.apm.insight.entity.Header.c(jSONObjectA)) {
            c = 0;
        } else if (java.lang.String.valueOf(jSONObjectA.opt("update_version_code")).equals(java.lang.String.valueOf(jSONObjectA2.opt("update_version_code"))) && com.apm.insight.entity.Header.d(jSONObjectA2)) {
            c = 1;
        } else {
            c = 2;
        }
        if (c == 1) {
            a(aVar.f497a, jCurrentTimeMillis, jSONObjectA, jSONArray);
            com.apm.insight.l.f.a(aVar.c);
        } else if (c == 2) {
            a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
        }
        try {
            java.util.ArrayList<com.apm.insight.runtime.q.a> arrayListC = c("");
            if (arrayListC.size() <= 6) {
                return;
            }
            for (com.apm.insight.runtime.q.a aVar2 : arrayListC) {
                if (com.apm.insight.runtime.q.a.a(aVar2, jCurrentTimeMillis)) {
                    com.apm.insight.runtime.q.a.d(aVar2);
                }
            }
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        }
    }

    private void a(long j, long j2, org.json.JSONObject jSONObject, org.json.JSONArray jSONArray) {
        java.io.File file = new java.io.File(this.b, j + "-" + j2 + ".ctx");
        java.io.File file2 = new java.io.File(this.b, j + "-" + j2 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f = new com.apm.insight.runtime.q.a(file, (byte) 0);
        } catch (java.io.IOException e) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(e, "NPTH_CATCH");
        }
    }

    protected final java.lang.String b() {
        try {
            return com.apm.insight.l.f.a(this.c.getAbsolutePath(), "\n");
        } catch (java.lang.Throwable unused) {
            return "0";
        }
    }

    public final java.lang.String c() {
        try {
            return com.apm.insight.l.f.a(this.d.getAbsolutePath(), "\n");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    protected final void a(java.lang.String str) {
        try {
            com.apm.insight.l.f.a(this.c, str, false);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void b(java.lang.String str) {
        try {
            com.apm.insight.l.f.a(this.d, str, false);
        } catch (java.lang.Throwable unused) {
        }
    }

    private java.util.ArrayList<com.apm.insight.runtime.q.a> c(final java.lang.String str) {
        java.io.File[] fileArrListFiles = this.b.listFiles(new java.io.FilenameFilter() { // from class: com.apm.insight.runtime.q.1
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str2) {
                return str2.endsWith(str) && java.util.regex.Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        java.util.ArrayList<com.apm.insight.runtime.q.a> arrayList = new java.util.ArrayList<>();
        if (fileArrListFiles == null) {
            return arrayList;
        }
        com.apm.insight.a.a((java.lang.Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
        byte b = 0;
        com.apm.insight.runtime.q.a aVar = null;
        for (java.io.File file : fileArrListFiles) {
            try {
                com.apm.insight.runtime.q.a aVar2 = new com.apm.insight.runtime.q.a(file, b);
                arrayList.add(aVar2);
                if (this.f == null && ".ctx".equals(str) && (aVar == null || aVar2.b >= aVar.b)) {
                    aVar = aVar2;
                }
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            }
        }
        if (this.f == null && aVar != null) {
            this.f = aVar;
        }
        return arrayList;
    }

    /* JADX INFO: compiled from: RuntimeContext.java */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f497a;
        private long b;
        private java.io.File c;
        private org.json.JSONObject d;

        /* synthetic */ a(java.io.File file, byte b) {
            this(file);
        }

        private a(java.io.File file) {
            this.d = null;
            this.c = file;
            java.lang.String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f497a = java.lang.Long.parseLong(strArrSplit[0]);
                this.b = java.lang.Long.parseLong(strArrSplit[1]);
                return;
            }
            java.lang.String name = file.getName();
            if (android.text.TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            java.lang.String strSubstring = name.substring(0, 13);
            if (android.text.TextUtils.isDigitsOnly(strSubstring)) {
                long j = java.lang.Long.parseLong(strSubstring);
                this.f497a = j;
                this.b = j;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public org.json.JSONObject a() {
            if (this.d == null) {
                try {
                    this.d = new org.json.JSONObject(com.apm.insight.l.f.a(this.c.getAbsolutePath(), "\n"));
                } catch (java.lang.Throwable unused) {
                }
                if (this.d == null) {
                    this.d = new org.json.JSONObject();
                }
            }
            return this.d;
        }

        static /* synthetic */ boolean a(com.apm.insight.runtime.q.a aVar, long j) {
            long j2 = aVar.f497a;
            if (j2 > j && j2 - j > 604800000) {
                return true;
            }
            long j3 = aVar.b;
            if (j3 >= j || j - j3 <= 604800000) {
                return aVar.c.lastModified() < j && j - aVar.c.lastModified() > 604800000;
            }
            return true;
        }

        static /* synthetic */ void d(com.apm.insight.runtime.q.a aVar) {
            aVar.c.delete();
        }
    }

    public final org.json.JSONObject a(long j) {
        org.json.JSONObject jSONObject;
        java.io.File file;
        boolean z;
        java.lang.String strA;
        java.util.Iterator<com.apm.insight.runtime.q.a> it = c(".ctx").iterator();
        while (true) {
            jSONObject = null;
            if (!it.hasNext()) {
                file = null;
                break;
            }
            com.apm.insight.runtime.q.a next = it.next();
            if (j >= next.f497a && j <= next.b) {
                file = next.c;
                break;
            }
        }
        if (file == null) {
            com.apm.insight.runtime.q.a aVar = null;
            for (com.apm.insight.runtime.q.a aVar2 : c(".ctx")) {
                if (aVar == null || java.lang.Math.abs(aVar.b - j) > java.lang.Math.abs(aVar2.b - j)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.c;
            z = true;
        } else {
            z = false;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    jSONObject = new org.json.JSONObject(strA);
                } catch (java.lang.Throwable th) {
                    th = th;
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(new java.io.IOException("content :".concat(java.lang.String.valueOf(strA)), th), "NPTH_CATCH");
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                strA = null;
            }
        }
        if (jSONObject != null && z) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (org.json.JSONException e) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(e, "NPTH_CATCH");
            }
        }
        return jSONObject;
    }

    public final org.json.JSONArray b(long j) {
        java.io.File file;
        java.lang.String strA;
        java.util.Iterator<com.apm.insight.runtime.q.a> it = c(".allData").iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            com.apm.insight.runtime.q.a next = it.next();
            if (j >= next.f497a && j <= next.b) {
                file = next.c;
                break;
            }
        }
        if (file == null) {
            com.apm.insight.runtime.q.a aVar = null;
            for (com.apm.insight.runtime.q.a aVar2 : c(".allData")) {
                if (aVar == null || java.lang.Math.abs(aVar.b - j) > java.lang.Math.abs(aVar2.b - j)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.c;
        }
        if (file == null) {
            return null;
        }
        try {
            strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
            try {
                return new org.json.JSONArray(strA);
            } catch (java.lang.Throwable th) {
                th = th;
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(new java.io.IOException("content :".concat(java.lang.String.valueOf(strA)), th), "NPTH_CATCH");
                return null;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            strA = null;
        }
    }
}
