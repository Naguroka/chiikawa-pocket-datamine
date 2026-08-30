package com.apm.insight.b;

/* JADX INFO: compiled from: ANRManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static volatile boolean z = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.apm.insight.b.c f361a;
    private final android.content.Context b;
    private volatile boolean c;
    private org.json.JSONObject g;
    private org.json.JSONObject h;
    private org.json.JSONArray m;
    private org.json.JSONObject n;
    private org.json.JSONArray q;
    private org.json.JSONArray r;
    private org.json.JSONObject s;
    private boolean t;
    private volatile boolean v;
    private long d = -1;
    private java.io.File e = null;
    private boolean f = true;
    private java.lang.String i = "unknown";
    private java.lang.String j = "unknown";
    private java.lang.String k = "unknown";
    private java.lang.String l = "npth_inner_default";
    private int o = 0;
    private long p = -1;
    private final java.lang.Object u = new java.lang.Object();
    private long w = -1;
    private long x = 0;
    private final java.lang.Runnable y = new java.lang.Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                com.apm.insight.b.b.this.g();
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            }
        }
    };
    private int A = 0;
    private java.util.List<java.util.regex.Pattern> B = null;
    private java.util.regex.Pattern C = null;
    private java.io.File D = null;

    private static java.lang.String a(float f) {
        if (f <= 0.0f) {
            return "0%";
        }
        if (f <= 0.1f) {
            return "0% - 10%";
        }
        if (f <= 0.3f) {
            return "10% - 30%";
        }
        if (f <= 0.6f) {
            return "30% - 60%";
        }
        return f <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    public b(android.content.Context context) {
        this.b = context;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.f361a = new com.apm.insight.b.c(this);
        this.d = com.apm.insight.e.j();
        this.c = true;
    }

    public final void b() {
        if (this.c) {
            this.c = false;
            com.apm.insight.b.c cVar = this.f361a;
            if (cVar != null) {
                cVar.b();
            }
            this.f361a = null;
        }
    }

    public final void c() {
        com.apm.insight.b.c cVar = this.f361a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        synchronized (this.u) {
        }
        this.y.run();
    }

    public final void e() {
        if (com.apm.insight.nativecrash.NativeImpl.h()) {
            try {
                com.apm.insight.l.f.a(i(), java.lang.String.valueOf(this.A + 1), false);
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            }
        }
        this.w = android.os.SystemClock.uptimeMillis();
        this.v = true;
    }

    public final void f() {
        java.io.File fileI = i();
        try {
            int iIntValue = java.lang.Integer.decode(com.apm.insight.l.f.a(fileI.getAbsolutePath(), "\n")).intValue();
            this.A = iIntValue;
            if (iIntValue >= 2) {
                com.apm.insight.nativecrash.NativeImpl.a(false);
            } else {
                com.apm.insight.nativecrash.NativeImpl.a(true);
            }
        } catch (java.io.IOException unused) {
            com.apm.insight.nativecrash.NativeImpl.a(true);
        } catch (java.lang.Throwable unused2) {
            com.apm.insight.l.f.a(fileI);
        }
    }

    private boolean a(long j) {
        if (this.v) {
            this.v = false;
            b(j);
        }
        return false;
    }

    private boolean h() {
        boolean z2 = !com.apm.insight.l.a.a(this.b);
        if (!z2 || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z2;
        }
        return false;
    }

    private void b(long j) {
        if (this.x != this.w) {
            try {
                this.p = java.lang.System.currentTimeMillis();
                this.r = com.apm.insight.b.f.b().b();
                this.q = com.apm.insight.b.j.a(j);
                this.h = com.apm.insight.b.f.b().a(j).a();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                this.s = jSONObject;
                com.apm.insight.l.a.a(this.b, jSONObject);
                this.t = h();
                this.f = !com.apm.insight.Npth.hasCrash();
            } catch (java.lang.Throwable unused) {
            }
            try {
                this.d = this.p;
                java.lang.String strB = com.apm.insight.l.j.b();
                java.io.File file = new java.io.File(new java.io.File(com.apm.insight.l.j.f(this.b), strB), "trace_" + com.apm.insight.l.a.d(this.b).replace(':', '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file, com.apm.insight.l.b.a().format(new java.util.Date(java.lang.System.currentTimeMillis())) + "\n", false);
                com.apm.insight.runtime.p.a("anr_trace", strB);
                com.apm.insight.nativecrash.NativeImpl.i(file.getAbsolutePath());
                try {
                    org.json.JSONArray jSONArrayA = com.apm.insight.l.f.a(file.getAbsolutePath());
                    this.m = jSONArrayA;
                    a(jSONArrayA);
                } catch (java.io.IOException unused2) {
                } catch (java.lang.Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                }
                if (this.g == null) {
                    this.g = com.apm.insight.b.d.a();
                }
            } catch (java.lang.Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th2, "NPTH_CATCH");
            }
            com.apm.insight.a.d();
        } else {
            try {
                this.d = this.p;
                java.lang.String strB2 = com.apm.insight.l.j.b();
                java.io.File file2 = new java.io.File(new java.io.File(com.apm.insight.l.j.f(this.b), strB2), "trace" + com.apm.insight.l.a.d(this.b).replace(':', '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file2, com.apm.insight.l.b.a().format(new java.util.Date(java.lang.System.currentTimeMillis())) + "\n", false);
                com.apm.insight.runtime.p.a("anr_trace", strB2);
                com.apm.insight.nativecrash.NativeImpl.i(file2.getAbsolutePath());
                try {
                    org.json.JSONArray jSONArrayA2 = com.apm.insight.l.f.a(file2.getAbsolutePath());
                    this.m = jSONArrayA2;
                    a(jSONArrayA2);
                } catch (java.io.IOException unused3) {
                } catch (java.lang.Throwable th3) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th3, "NPTH_CATCH");
                }
                if (this.g == null) {
                    this.g = com.apm.insight.b.d.a();
                }
            } catch (java.lang.Throwable th4) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th4, "NPTH_CATCH");
            }
        }
        long j2 = this.w;
        this.x = j2;
        this.w = -1L;
        if (j2 == -1) {
            this.x = (-1) - 1;
        }
    }

    private void a(org.json.JSONArray jSONArray) {
        int[] iArrB;
        int[] iArrB2;
        if (jSONArray == null) {
            return;
        }
        this.g = null;
        this.n = null;
        this.o = 0;
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        org.json.JSONArray jSONArray3 = new org.json.JSONArray();
        org.json.JSONArray jSONArray4 = new org.json.JSONArray();
        this.i = "unknown";
        this.j = "unknown";
        this.k = "unknown";
        int[] iArr = {0, 0, 0};
        org.json.JSONArray jSONArray5 = jSONArray4;
        java.lang.String strTrim = null;
        boolean z2 = false;
        for (int i = 0; i < jSONArray.length(); i++) {
            java.lang.String strOptString = jSONArray.optString(i);
            if (android.text.TextUtils.isEmpty(strOptString)) {
                if (jSONArray5.length() > 0 && !android.text.TextUtils.isEmpty(strTrim)) {
                    if (this.g == null && com.ironsource.y8.h.Z.equals(strTrim)) {
                        this.g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(strTrim, jSONArray5));
                    }
                    try {
                        if (!com.ironsource.y8.h.Z.equals(strTrim)) {
                            strTrim = strTrim.substring(0, strTrim.indexOf(40)).trim();
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                    java.lang.String str = strTrim;
                    if (!a(str)) {
                        try {
                            iArrB2 = b(jSONArray5);
                        } catch (java.lang.IllegalArgumentException e) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.k.a(e, "NPTH_CATCH");
                            iArrB2 = null;
                        } catch (java.lang.Throwable unused2) {
                            iArrB2 = null;
                        }
                        if (iArrB2 != null) {
                            int i2 = iArrB2[0];
                            if (i2 > iArr[0]) {
                                iArr[0] = i2;
                                this.i = str;
                            }
                            int i3 = iArrB2[1];
                            if (i3 > iArr[1]) {
                                iArr[1] = i3;
                                this.j = str;
                            }
                            int i4 = iArrB2[2];
                            if (i4 > iArr[2]) {
                                iArr[2] = i4;
                                this.k = str;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new org.json.JSONArray();
                }
                strTrim = null;
            } else if (!z2) {
                if (strOptString.startsWith("DALVIK THREADS") || strOptString.startsWith("suspend") || strOptString.startsWith("\"")) {
                    z2 = true;
                }
                jSONArray3.put(strOptString);
            } else if (z2) {
                if (strOptString.contains(" prio=")) {
                    if (jSONArray5.length() > 0 && !android.text.TextUtils.isEmpty(strTrim)) {
                        if (this.g == null && com.ironsource.y8.h.Z.equals(strTrim)) {
                            this.g = c(jSONArray5);
                        } else {
                            jSONArray2.put(a(strTrim, jSONArray5));
                        }
                        try {
                            if (!com.ironsource.y8.h.Z.equals(strTrim)) {
                                strTrim = strTrim.substring(0, strTrim.indexOf(40)).trim();
                            }
                        } catch (java.lang.Throwable unused3) {
                        }
                        java.lang.String str2 = strTrim;
                        if (!a(str2)) {
                            try {
                                iArrB = b(jSONArray5);
                            } catch (java.lang.IllegalArgumentException e2) {
                                com.apm.insight.c.a();
                                com.apm.insight.runtime.k.a(e2, "NPTH_CATCH");
                                iArrB = null;
                            } catch (java.lang.Throwable unused4) {
                                iArrB = null;
                            }
                            if (iArrB != null) {
                                int i5 = iArrB[0];
                                if (i5 > iArr[0]) {
                                    iArr[0] = i5;
                                    this.i = str2;
                                }
                                int i6 = iArrB[1];
                                if (i6 > iArr[1]) {
                                    iArr[1] = i6;
                                    this.j = str2;
                                }
                                int i7 = iArrB[2];
                                if (i7 > iArr[2]) {
                                    iArr[2] = i7;
                                    this.k = str2;
                                }
                            }
                        }
                    }
                    java.lang.String strSubstring = strOptString.substring(1, strOptString.indexOf(34, 1));
                    strTrim = !com.ironsource.y8.h.Z.equals(strSubstring) ? strSubstring + "  (" + strOptString.substring(strOptString.indexOf(34, 2) + 1) + " )" : strSubstring;
                    if (jSONArray5.length() > 0) {
                        jSONArray5 = new org.json.JSONArray();
                    }
                    jSONArray5.put(strOptString);
                } else if (android.text.TextUtils.isEmpty(strTrim)) {
                    jSONArray3.put(strOptString);
                } else {
                    jSONArray5.put(strOptString);
                }
            }
        }
        if (jSONArray2.length() > 0) {
            this.m = jSONArray3;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                this.n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.n.put("thread_stacks", jSONArray2);
            } catch (org.json.JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    private boolean a(java.lang.String str) {
        if (this.B == null) {
            org.json.JSONArray jSONArrayB = com.apm.insight.runtime.a.b();
            if (jSONArrayB != null) {
                this.B = new java.util.LinkedList();
                this.l = jSONArrayB.optString(0);
                for (int i = 1; i < jSONArrayB.length(); i++) {
                    try {
                        this.B.add(java.util.regex.Pattern.compile(jSONArrayB.optString(i)));
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
            if (this.B == null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                this.B = linkedList;
                linkedList.add(java.util.regex.Pattern.compile("^main$"));
                this.B.add(java.util.regex.Pattern.compile("^default_npth_thread$"));
                this.B.add(java.util.regex.Pattern.compile("^RenderThread$"));
                this.B.add(java.util.regex.Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        java.util.Iterator<java.util.regex.Pattern> it = this.B.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private int[] b(org.json.JSONArray jSONArray) throws java.lang.IllegalArgumentException {
        for (int i = 0; i < jSONArray.length(); i++) {
            java.lang.String strOptString = jSONArray.optString(i);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.C == null) {
                    this.C = java.util.regex.Pattern.compile("[^0-9]+");
                }
                java.lang.String[] strArrSplit = this.C.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    return null;
                }
                try {
                    int iIntValue = java.lang.Integer.decode(strArrSplit[1]).intValue();
                    int iIntValue2 = java.lang.Integer.decode(strArrSplit[2]).intValue();
                    return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
                } catch (java.lang.Throwable unused) {
                    throw new java.lang.IllegalArgumentException("Err stack line: ".concat(java.lang.String.valueOf(strOptString)));
                }
            }
        }
        return null;
    }

    private org.json.JSONObject c(org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i = 0; i < jSONArrayB.length(); i++) {
                sb.append(jSONArrayB.getString(i)).append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private org.json.JSONObject a(java.lang.String str, org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArrayB);
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private java.io.File i() {
        if (this.D == null) {
            this.D = new java.io.File(this.b.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.d(this.b).replaceAll(":", "_"));
        }
        return this.D;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:114:0x0202  */
    /* JADX WARN: Code duplicated, block: B:115:0x0205  */
    /* JADX WARN: Code duplicated, block: B:116:0x0208  */
    /* JADX WARN: Code duplicated, block: B:117:0x020b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0217  */
    /* JADX WARN: Code duplicated, block: B:122:0x0225  */
    /* JADX WARN: Code duplicated, block: B:123:0x0228 A[PHI: r28
  0x0228: PHI (r28v2 char) = (r8v20 char), (r28v16 char) binds: [B:121:0x0223, B:115:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x0232  */
    /* JADX WARN: Code duplicated, block: B:126:0x0236 A[PHI: r28
  0x0236: PHI (r28v3 char) = (r28v2 char), (r28v17 char) binds: [B:124:0x0230, B:114:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0240  */
    /* JADX WARN: Code duplicated, block: B:129:0x0244 A[PHI: r28
  0x0244: PHI (r28v4 char) = (r28v3 char), (r28v18 char) binds: [B:127:0x023e, B:113:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x024c  */
    /* JADX WARN: Code duplicated, block: B:132:0x024e A[PHI: r28
  0x024e: PHI (r28v14 char) = (r28v4 char), (r28v19 char) binds: [B:130:0x024a, B:111:0x01fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x0256  */
    /* JADX WARN: Code duplicated, block: B:135:0x0258 A[PHI: r28
  0x0258: PHI (r28v5 char) = (r28v14 char), (r28v19 char) binds: [B:133:0x0254, B:111:0x01fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x025d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0282  */
    /* JADX WARN: Code duplicated, block: B:143:0x0285  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:154:0x02bd A[LOOP:2: B:98:0x01e6->B:154:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x035b  */
    /* JADX WARN: Code duplicated, block: B:183:0x0360 A[PHI: r3 r15 r16 r22 r23 r25 r26
  0x0360: PHI (r3v8 java.lang.String) = (r3v7 java.lang.String), (r3v4 java.lang.String) binds: [B:181:0x0359, B:157:0x02d3] A[DONT_GENERATE, DONT_INLINE]
  0x0360: PHI (r15v11 java.lang.String) = (r15v10 java.lang.String), (r15v1 java.lang.String) binds: [B:181:0x0359, B:157:0x02d3] A[DONT_GENERATE, DONT_INLINE]
  0x0360: PHI (r16v12 java.lang.String) = (r16v10 java.lang.String), (r16v1 java.lang.String) binds: [B:181:0x0359, B:157:0x02d3] A[DONT_GENERATE, DONT_INLINE]
  0x0360: PHI (r22v4 char) = (r22v3 char), (r22v6 char) binds: [B:181:0x0359, B:157:0x02d3] A[DONT_GENERATE, DONT_INLINE]
  0x0360: PHI (r23v3 int) = (r23v2 int), (r23v4 int) binds: [B:181:0x0359, B:157:0x02d3] A[DONT_GENERATE, DONT_INLINE]
  0x0360: PHI (r25v9 java.util.HashMap) = (r25v8 java.util.HashMap), (r25v11 java.util.HashMap) binds: [B:181:0x0359, B:157:0x02d3] A[DONT_GENERATE, DONT_INLINE]
  0x0360: PHI (r26v9 java.util.HashMap) = (r26v8 java.util.HashMap), (r26v11 java.util.HashMap) binds: [B:181:0x0359, B:157:0x02d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x036c  */
    /* JADX WARN: Code duplicated, block: B:187:0x037e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0383 A[LOOP:4: B:188:0x0380->B:190:0x0383, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x0394 A[EDGE_INSN: B:241:0x0394->B:192:0x0394 BREAK  A[LOOP:2: B:98:0x01e6->B:154:0x02bd], PHI: r15 r16 r22 r25 r26
  0x0394: PHI (r15v12 java.lang.String) = 
  (r15v11 java.lang.String)
  (r15v1 java.lang.String)
  (r15v1 java.lang.String)
  (r15v1 java.lang.String)
  (r15v1 java.lang.String)
 binds: [B:184:0x036a, B:156:0x02cb, B:155:0x02c5, B:242:0x0394, B:241:0x0394] A[DONT_GENERATE, DONT_INLINE]
  0x0394: PHI (r16v13 java.lang.String) = 
  (r16v12 java.lang.String)
  (r16v1 java.lang.String)
  (r16v1 java.lang.String)
  (r16v1 java.lang.String)
  (r16v1 java.lang.String)
 binds: [B:184:0x036a, B:156:0x02cb, B:155:0x02c5, B:242:0x0394, B:241:0x0394] A[DONT_GENERATE, DONT_INLINE]
  0x0394: PHI (r22v5 char) = (r22v4 char), (r22v7 char), (r22v7 char), (r22v7 char), (r22v7 char) binds: [B:184:0x036a, B:156:0x02cb, B:155:0x02c5, B:242:0x0394, B:241:0x0394] A[DONT_GENERATE, DONT_INLINE]
  0x0394: PHI (r25v10 java.util.HashMap) = 
  (r25v9 java.util.HashMap)
  (r25v12 java.util.HashMap)
  (r25v13 java.util.HashMap)
  (r25v17 java.util.HashMap)
  (r25v17 java.util.HashMap)
 binds: [B:184:0x036a, B:156:0x02cb, B:155:0x02c5, B:242:0x0394, B:241:0x0394] A[DONT_GENERATE, DONT_INLINE]
  0x0394: PHI (r26v10 java.util.HashMap) = 
  (r26v9 java.util.HashMap)
  (r26v12 java.util.HashMap)
  (r26v13 java.util.HashMap)
  (r26v16 java.util.HashMap)
  (r26v16 java.util.HashMap)
 binds: [B:184:0x036a, B:156:0x02cb, B:155:0x02c5, B:242:0x0394, B:241:0x0394] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:199:0x03ca A[PHI: r8 r15 r16 r20 r22 r25 r26
  0x03ca: PHI (r8v8 char) = (r8v5 char), (r8v10 char), (r8v14 char), (r8v47 char) binds: [B:197:0x03bc, B:194:0x039d, B:192:0x0394, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03ca: PHI (r15v7 java.lang.String) = (r15v1 java.lang.String), (r15v1 java.lang.String), (r15v12 java.lang.String), (r15v1 java.lang.String) binds: [B:197:0x03bc, B:194:0x039d, B:192:0x0394, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03ca: PHI (r16v6 java.lang.String) = (r16v1 java.lang.String), (r16v1 java.lang.String), (r16v13 java.lang.String), (r16v1 java.lang.String) binds: [B:197:0x03bc, B:194:0x039d, B:192:0x0394, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03ca: PHI (r20v5 java.lang.String) = (r20v2 java.lang.String), (r20v6 java.lang.String), (r20v6 java.lang.String), (r20v6 java.lang.String) binds: [B:197:0x03bc, B:194:0x039d, B:192:0x0394, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03ca: PHI (r22v2 char) = (r22v1 char), (r22v3 char), (r22v5 char), (r22v8 char) binds: [B:197:0x03bc, B:194:0x039d, B:192:0x0394, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03ca: PHI (r25v7 java.util.HashMap) = (r25v4 java.util.HashMap), (r25v8 java.util.HashMap), (r25v10 java.util.HashMap), (r25v21 java.util.HashMap) binds: [B:197:0x03bc, B:194:0x039d, B:192:0x0394, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x03ca: PHI (r26v7 java.util.HashMap) = (r26v4 java.util.HashMap), (r26v8 java.util.HashMap), (r26v10 java.util.HashMap), (r26v22 java.util.HashMap) binds: [B:197:0x03bc, B:194:0x039d, B:192:0x0394, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:208:0x041f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0423  */
    /* JADX WARN: Code duplicated, block: B:212:0x043a  */
    /* JADX WARN: Code duplicated, block: B:213:0x043e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0455  */
    /* JADX WARN: Code duplicated, block: B:218:0x0459  */
    /* JADX WARN: Code duplicated, block: B:237:0x03f6 A[EDGE_INSN: B:237:0x03f6->B:206:0x03f6 BREAK  A[LOOP:0: B:3:0x0038->B:204:0x03df], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0394 A[EDGE_INSN: B:241:0x0394->B:192:0x0394 BREAK  A[LOOP:2: B:98:0x01e6->B:154:0x02bd], SYNTHETIC] */
    private void a(java.lang.String str, org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.util.HashMap map;
        java.lang.String str2;
        char c;
        char c2;
        char c3;
        int i;
        boolean z2;
        java.lang.String str3;
        java.lang.String strTrim;
        java.lang.String[] strArrSplit;
        int i2;
        java.lang.String string;
        java.util.HashMap map2;
        java.lang.String str4;
        int i3;
        char c4;
        java.lang.String str5;
        java.lang.String[] strArr;
        float fFloatValue;
        android.os.SystemClock.uptimeMillis();
        java.lang.String[] strArrSplit2 = str.split("\n");
        float[] fArr = {-1.0f, -1.0f, -1.0f};
        java.util.HashMap map3 = new java.util.HashMap();
        java.util.HashMap map4 = new java.util.HashMap();
        java.util.HashMap map5 = new java.util.HashMap();
        java.util.HashMap map6 = new java.util.HashMap();
        java.util.HashMap map7 = new java.util.HashMap();
        int length = strArrSplit2.length;
        java.lang.String str6 = "unknown";
        java.lang.String strTrim2 = "unknown";
        java.lang.String str7 = strTrim2;
        int i4 = 0;
        char c5 = 0;
        boolean z3 = false;
        while (true) {
            if (i4 >= length) {
                map = map6;
                map7 = map7;
                break;
            }
            java.lang.String strTrim3 = strArrSplit2[i4];
            if (!android.text.TextUtils.isEmpty(strTrim3)) {
                if (c5 != 0) {
                    str2 = str6;
                    if (c5 == 1) {
                        map = map6;
                        map7 = map7;
                        c2 = c5;
                        i = 0;
                        strTrim3 = strTrim3.trim();
                        java.lang.String lowerCase = strTrim3.toLowerCase();
                        if (lowerCase.startsWith("shortmsg")) {
                            strTrim3.substring(strTrim3.indexOf(58));
                            z2 = false;
                        } else {
                            if (lowerCase.startsWith("reason:")) {
                                strTrim3.substring(strTrim3.indexOf(58));
                                z2 = true;
                            } else {
                                c = 3;
                                if (lowerCase.contains("appfreeze")) {
                                    str7 = "AppFreeze";
                                    c5 = '\n';
                                } else {
                                    c5 = c2;
                                }
                            }
                            c3 = 4;
                        }
                        if (lowerCase.contains("input dispatch")) {
                            str3 = "Input dispatching timed out";
                        } else if (lowerCase.contains("broadcast of intent")) {
                            str3 = "Broadcast of Intent";
                        } else {
                            if (lowerCase.contains("executing service")) {
                                if ("null".equalsIgnoreCase(strTrim2)) {
                                    strTrim2 = strTrim3.substring(strTrim3.indexOf("service ") + 8).trim();
                                }
                                str7 = "executing service";
                            } else if (lowerCase.contains("service.startforeground")) {
                                str3 = "not call Service.startForeground";
                            } else {
                                str7 = str2;
                            }
                            if (z2) {
                                c3 = 4;
                                c = 3;
                                c5 = 2;
                            } else {
                                strTrim = strTrim3.trim();
                                if (strTrim.startsWith("Load:")) {
                                    strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                                    c = 3;
                                    if (3 == strArrSplit.length) {
                                        for (i2 = i; i2 < strArrSplit.length; i2++) {
                                            fArr[i2] = java.lang.Float.valueOf(strArrSplit[i2]).floatValue();
                                        }
                                    }
                                    c5 = 3;
                                } else {
                                    c = 3;
                                    c5 = c2;
                                }
                                c3 = 4;
                            }
                        }
                        str7 = str3;
                        if (z2) {
                            c3 = 4;
                            c = 3;
                            c5 = 2;
                        } else {
                            strTrim = strTrim3.trim();
                            if (strTrim.startsWith("Load:")) {
                                strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                                c = 3;
                                if (3 == strArrSplit.length) {
                                    while (i2 < strArrSplit.length) {
                                        fArr[i2] = java.lang.Float.valueOf(strArrSplit[i2]).floatValue();
                                    }
                                }
                                c5 = 3;
                            } else {
                                c = 3;
                                c5 = c2;
                            }
                            c3 = 4;
                        }
                    } else if (c5 == 2) {
                        map = map6;
                        map7 = map7;
                        c2 = c5;
                        i = 0;
                        strTrim = strTrim3.trim();
                        if (strTrim.startsWith("Load:")) {
                            strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                            c = 3;
                            if (3 == strArrSplit.length) {
                                while (i2 < strArrSplit.length) {
                                    fArr[i2] = java.lang.Float.valueOf(strArrSplit[i2]).floatValue();
                                }
                            }
                            c5 = 3;
                        } else {
                            c = 3;
                            c5 = c2;
                        }
                        c3 = 4;
                    } else if (c5 != 3) {
                        map = map6;
                        map7 = map7;
                        c = 3;
                        c2 = c5;
                        c5 = c2;
                        c3 = 4;
                    } else {
                        java.lang.String[] strArrSplit3 = strTrim3.split("\\s");
                        c2 = c5;
                        if (strArrSplit3.length >= 2) {
                            if ("CPU".equalsIgnoreCase(strArrSplit3[0]) && "usage".equalsIgnoreCase(strArrSplit3[1])) {
                                if (strTrim3.contains("ago")) {
                                    z3 = true;
                                }
                                if (map3.isEmpty() && map4.isEmpty() && map5.isEmpty() && map7.isEmpty() && map6.isEmpty()) {
                                    map = map6;
                                    map7 = map7;
                                    c5 = c2;
                                    c3 = 4;
                                    c = 3;
                                }
                            } else if (map3.isEmpty() || map4.isEmpty() || map5.isEmpty() || map7.isEmpty() || map6.isEmpty()) {
                                if (map3.isEmpty() && strArrSplit3[1].equalsIgnoreCase("TOTAL:")) {
                                    string = "";
                                    map2 = map3;
                                } else if (strTrim3.contains(this.b.getPackageName())) {
                                    string = "";
                                    int i5 = 0;
                                    while (i5 < strArrSplit3.length) {
                                        if (strArrSplit3[i5].contains(this.b.getPackageName())) {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            java.lang.String str8 = strArrSplit3[i5];
                                            string = sb.append(str8.substring(str8.indexOf(47) + 1, strArrSplit3[i5].length() - 1)).append('_').toString();
                                        }
                                        i5++;
                                        this = this;
                                    }
                                    map2 = map5;
                                } else if (map4.isEmpty() && strTrim3.contains("system_server:")) {
                                    string = "";
                                    map2 = map4;
                                } else if (map7.isEmpty() && strTrim3.contains("kswapd")) {
                                    string = "";
                                    map2 = map7;
                                } else if (map6.isEmpty() && strTrim3.contains("dex2oat")) {
                                    string = "";
                                    map2 = map6;
                                } else {
                                    string = "";
                                    map2 = null;
                                }
                                if (map2 != null) {
                                    int i6 = 0;
                                    do {
                                        str4 = "%";
                                        if (strArrSplit3[i6].contains("%")) {
                                            break;
                                        } else {
                                            i6++;
                                        }
                                    } while (i6 < strArrSplit3.length);
                                    try {
                                        float fFloatValue2 = java.lang.Float.valueOf(strArrSplit3[i6].replace("%", "")).floatValue();
                                        map = map6;
                                        try {
                                            java.lang.String str9 = string + com.ironsource.y8.h.l;
                                            if (map2 != map3) {
                                                fFloatValue2 /= com.apm.insight.l.d.d();
                                            }
                                            try {
                                                map2.put(str9, java.lang.Float.valueOf(fFloatValue2));
                                            } catch (java.lang.Throwable unused) {
                                                map2.put(string + com.ironsource.y8.h.l, java.lang.Float.valueOf(-1.0f));
                                            }
                                        } catch (java.lang.Throwable unused2) {
                                            map7 = map7;
                                            map2.put(string + com.ironsource.y8.h.l, java.lang.Float.valueOf(-1.0f));
                                            i3 = i6 + 3;
                                            c4 = 0;
                                            while (i3 < strArrSplit3.length) {
                                                str5 = "softirq";
                                                if (c4 != 0) {
                                                    if ("user".equalsIgnoreCase(strArrSplit3[i3])) {
                                                        str5 = "user";
                                                        c4 = 1;
                                                    }
                                                    if (str5 != null) {
                                                        fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                        strArr = strArrSplit3;
                                                        java.lang.String str10 = string + str5;
                                                        if (map2 == map3) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map2.put(str10, java.lang.Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArr = strArrSplit3;
                                                        str4 = str4;
                                                    }
                                                    if (c4 < 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i3 += 3;
                                                        strArrSplit3 = strArr;
                                                        str4 = str4;
                                                    }
                                                } else {
                                                    if (c4 != 1) {
                                                        if (c4 != 2) {
                                                            c4 = c4;
                                                            if ("iowait".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                str5 = "iowait";
                                                                c4 = 3;
                                                            } else if ("irq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                str5 = "irq";
                                                                c4 = 4;
                                                            } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                c4 = 5;
                                                            } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                c4 = 6;
                                                            }
                                                            if (str5 != null) {
                                                                fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                                strArr = strArrSplit3;
                                                                java.lang.String str11 = string + str5;
                                                                if (map2 == map3) {
                                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                                }
                                                                map2.put(str11, java.lang.Float.valueOf(fFloatValue));
                                                            } else {
                                                                strArr = strArrSplit3;
                                                                str4 = str4;
                                                            }
                                                            if (c4 < 6) {
                                                                break;
                                                                break;
                                                            } else {
                                                                i3 += 3;
                                                                strArrSplit3 = strArr;
                                                                str4 = str4;
                                                            }
                                                        } else if (c4 != 3) {
                                                            c4 = c4;
                                                            if ("irq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                str5 = "irq";
                                                                c4 = 4;
                                                            } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                c4 = 5;
                                                            } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                c4 = 6;
                                                            }
                                                            if (str5 != null) {
                                                                fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                                strArr = strArrSplit3;
                                                                java.lang.String str12 = string + str5;
                                                                if (map2 == map3) {
                                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                                }
                                                                map2.put(str12, java.lang.Float.valueOf(fFloatValue));
                                                            } else {
                                                                strArr = strArrSplit3;
                                                                str4 = str4;
                                                            }
                                                            if (c4 < 6) {
                                                                break;
                                                                break;
                                                            } else {
                                                                i3 += 3;
                                                                strArrSplit3 = strArr;
                                                                str4 = str4;
                                                            }
                                                        } else if (c4 != 4) {
                                                            c4 = c4;
                                                            if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                c4 = 5;
                                                            } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                c4 = 6;
                                                            }
                                                            if (str5 != null) {
                                                                fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                                strArr = strArrSplit3;
                                                                java.lang.String str13 = string + str5;
                                                                if (map2 == map3) {
                                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                                }
                                                                map2.put(str13, java.lang.Float.valueOf(fFloatValue));
                                                            } else {
                                                                strArr = strArrSplit3;
                                                                str4 = str4;
                                                            }
                                                            if (c4 < 6) {
                                                                break;
                                                                break;
                                                            } else {
                                                                i3 += 3;
                                                                strArrSplit3 = strArr;
                                                                str4 = str4;
                                                            }
                                                        } else {
                                                            c4 = c4;
                                                            if (c4 != 5) {
                                                                if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                    c4 = 6;
                                                                }
                                                            }
                                                            if (str5 != null) {
                                                                try {
                                                                    fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                                    strArr = strArrSplit3;
                                                                    try {
                                                                        java.lang.String str14 = string + str5;
                                                                        if (map2 == map3) {
                                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                                        }
                                                                        try {
                                                                            map2.put(str14, java.lang.Float.valueOf(fFloatValue));
                                                                        } catch (java.lang.Throwable unused3) {
                                                                            map2.put(string + str5, java.lang.Float.valueOf(-1.0f));
                                                                        }
                                                                    } catch (java.lang.Throwable unused4) {
                                                                        str4 = str4;
                                                                        map2.put(string + str5, java.lang.Float.valueOf(-1.0f));
                                                                        if (c4 < 6) {
                                                                            i3 += 3;
                                                                            strArrSplit3 = strArr;
                                                                            str4 = str4;
                                                                        } else {
                                                                            break;
                                                                            c = 3;
                                                                            c5 = c2;
                                                                            c3 = 4;
                                                                            if (c5 >= c3) {
                                                                                break;
                                                                                jSONObject.put("anr_tag", strTrim2);
                                                                                jSONObject.put("anr_has_ago", java.lang.String.valueOf(z3));
                                                                                jSONObject.put("anr_reason", str7);
                                                                                a(map5, jSONObject, "app");
                                                                                a(map3, jSONObject, com.ironsource.y8.h.l);
                                                                                if (map4.isEmpty()) {
                                                                                    jSONObject.put("npth_anr_systemserver_total", "not found");
                                                                                } else {
                                                                                    jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
                                                                                }
                                                                                if (map7.isEmpty()) {
                                                                                    jSONObject.put("npth_anr_kswapd_total", "not found");
                                                                                } else {
                                                                                    jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
                                                                                }
                                                                                if (map.isEmpty()) {
                                                                                    jSONObject.put("npth_anr_dex2oat_total", "not found");
                                                                                } else {
                                                                                    jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
                                                                                }
                                                                            }
                                                                            i4++;
                                                                            strArrSplit2 = strArrSplit2;
                                                                            length = length;
                                                                            str6 = str2;
                                                                            map6 = map;
                                                                            map7 = map7;
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable unused5) {
                                                                    strArr = strArrSplit3;
                                                                }
                                                            } else {
                                                                strArr = strArrSplit3;
                                                                str4 = str4;
                                                            }
                                                            if (c4 < 6) {
                                                                break;
                                                            }
                                                            i3 += 3;
                                                            strArrSplit3 = strArr;
                                                            str4 = str4;
                                                        }
                                                    }
                                                    c4 = c4;
                                                    str5 = null;
                                                    if (str5 != null) {
                                                        fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                        strArr = strArrSplit3;
                                                        java.lang.String str15 = string + str5;
                                                        if (map2 == map3) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map2.put(str15, java.lang.Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArr = strArrSplit3;
                                                        str4 = str4;
                                                    }
                                                    if (c4 < 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i3 += 3;
                                                        strArrSplit3 = strArr;
                                                        str4 = str4;
                                                    }
                                                }
                                                if ("kernel".equalsIgnoreCase(strArrSplit3[i3])) {
                                                    str5 = "kernel";
                                                    c4 = 2;
                                                } else if ("iowait".equalsIgnoreCase(strArrSplit3[i3])) {
                                                    str5 = "iowait";
                                                    c4 = 3;
                                                } else if ("irq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                    str5 = "irq";
                                                    c4 = 4;
                                                } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                    c4 = 5;
                                                } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                    c4 = 6;
                                                } else {
                                                    c4 = c4;
                                                    str5 = null;
                                                }
                                                if (str5 != null) {
                                                    fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                    strArr = strArrSplit3;
                                                    java.lang.String str16 = string + str5;
                                                    if (map2 == map3) {
                                                        fFloatValue /= com.apm.insight.l.d.d();
                                                    }
                                                    map2.put(str16, java.lang.Float.valueOf(fFloatValue));
                                                } else {
                                                    strArr = strArrSplit3;
                                                    str4 = str4;
                                                }
                                                if (c4 < 6) {
                                                    break;
                                                    break;
                                                } else {
                                                    i3 += 3;
                                                    strArrSplit3 = strArr;
                                                    str4 = str4;
                                                }
                                            }
                                            c = 3;
                                            c5 = c2;
                                            c3 = 4;
                                            if (c5 >= c3) {
                                                break;
                                                jSONObject.put("anr_tag", strTrim2);
                                                jSONObject.put("anr_has_ago", java.lang.String.valueOf(z3));
                                                jSONObject.put("anr_reason", str7);
                                                a(map5, jSONObject, "app");
                                                a(map3, jSONObject, com.ironsource.y8.h.l);
                                                if (map4.isEmpty()) {
                                                    jSONObject.put("npth_anr_systemserver_total", "not found");
                                                } else {
                                                    jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
                                                }
                                                if (map7.isEmpty()) {
                                                    jSONObject.put("npth_anr_kswapd_total", "not found");
                                                } else {
                                                    jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
                                                }
                                                if (map.isEmpty()) {
                                                    jSONObject.put("npth_anr_dex2oat_total", "not found");
                                                } else {
                                                    jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
                                                }
                                            }
                                            i4++;
                                            strArrSplit2 = strArrSplit2;
                                            length = length;
                                            str6 = str2;
                                            map6 = map;
                                            map7 = map7;
                                        }
                                    } catch (java.lang.Throwable unused6) {
                                        map = map6;
                                    }
                                    i3 = i6 + 3;
                                    c4 = 0;
                                    while (i3 < strArrSplit3.length) {
                                        str5 = "softirq";
                                        if (c4 != 0) {
                                            if ("user".equalsIgnoreCase(strArrSplit3[i3])) {
                                                str5 = "user";
                                                c4 = 1;
                                            }
                                            if (str5 != null) {
                                                fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                strArr = strArrSplit3;
                                                java.lang.String str17 = string + str5;
                                                if (map2 == map3) {
                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                }
                                                map2.put(str17, java.lang.Float.valueOf(fFloatValue));
                                            } else {
                                                strArr = strArrSplit3;
                                                str4 = str4;
                                            }
                                            if (c4 < 6) {
                                                break;
                                                break;
                                            } else {
                                                i3 += 3;
                                                strArrSplit3 = strArr;
                                                str4 = str4;
                                            }
                                        } else {
                                            if (c4 != 1) {
                                                if (c4 != 2) {
                                                    c4 = c4;
                                                    if ("iowait".equalsIgnoreCase(strArrSplit3[i3])) {
                                                        str5 = "iowait";
                                                        c4 = 3;
                                                    } else if ("irq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                        str5 = "irq";
                                                        c4 = 4;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                        c4 = 5;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                        c4 = 6;
                                                    }
                                                    if (str5 != null) {
                                                        fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                        strArr = strArrSplit3;
                                                        java.lang.String str18 = string + str5;
                                                        if (map2 == map3) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map2.put(str18, java.lang.Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArr = strArrSplit3;
                                                        str4 = str4;
                                                    }
                                                    if (c4 < 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i3 += 3;
                                                        strArrSplit3 = strArr;
                                                        str4 = str4;
                                                    }
                                                } else if (c4 != 3) {
                                                    c4 = c4;
                                                    if ("irq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                        str5 = "irq";
                                                        c4 = 4;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                        c4 = 5;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                        c4 = 6;
                                                    }
                                                    if (str5 != null) {
                                                        fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                        strArr = strArrSplit3;
                                                        java.lang.String str19 = string + str5;
                                                        if (map2 == map3) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map2.put(str19, java.lang.Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArr = strArrSplit3;
                                                        str4 = str4;
                                                    }
                                                    if (c4 < 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i3 += 3;
                                                        strArrSplit3 = strArr;
                                                        str4 = str4;
                                                    }
                                                } else if (c4 != 4) {
                                                    c4 = c4;
                                                    if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                        c4 = 5;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                        c4 = 6;
                                                    }
                                                    if (str5 != null) {
                                                        fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                        strArr = strArrSplit3;
                                                        java.lang.String str110 = string + str5;
                                                        if (map2 == map3) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map2.put(str110, java.lang.Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArr = strArrSplit3;
                                                        str4 = str4;
                                                    }
                                                    if (c4 < 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i3 += 3;
                                                        strArrSplit3 = strArr;
                                                        str4 = str4;
                                                    }
                                                } else {
                                                    c4 = c4;
                                                    if (c4 != 5) {
                                                        if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                            c4 = 6;
                                                        }
                                                    }
                                                    if (str5 != null) {
                                                        fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                        strArr = strArrSplit3;
                                                        java.lang.String str111 = string + str5;
                                                        if (map2 == map3) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map2.put(str111, java.lang.Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArr = strArrSplit3;
                                                        str4 = str4;
                                                    }
                                                    if (c4 < 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i3 += 3;
                                                        strArrSplit3 = strArr;
                                                        str4 = str4;
                                                    }
                                                }
                                            }
                                            c4 = c4;
                                            str5 = null;
                                            if (str5 != null) {
                                                fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                                strArr = strArrSplit3;
                                                java.lang.String str112 = string + str5;
                                                if (map2 == map3) {
                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                }
                                                map2.put(str112, java.lang.Float.valueOf(fFloatValue));
                                            } else {
                                                strArr = strArrSplit3;
                                                str4 = str4;
                                            }
                                            if (c4 < 6) {
                                                break;
                                                break;
                                            } else {
                                                i3 += 3;
                                                strArrSplit3 = strArr;
                                                str4 = str4;
                                            }
                                        }
                                        if ("kernel".equalsIgnoreCase(strArrSplit3[i3])) {
                                            str5 = "kernel";
                                            c4 = 2;
                                        } else if ("iowait".equalsIgnoreCase(strArrSplit3[i3])) {
                                            str5 = "iowait";
                                            c4 = 3;
                                        } else if ("irq".equalsIgnoreCase(strArrSplit3[i3])) {
                                            str5 = "irq";
                                            c4 = 4;
                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                            c4 = 5;
                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                            c4 = 6;
                                        } else {
                                            c4 = c4;
                                            str5 = null;
                                        }
                                        if (str5 != null) {
                                            fFloatValue = java.lang.Float.valueOf(strArrSplit3[i3 - 1].replace(str4, "")).floatValue();
                                            strArr = strArrSplit3;
                                            java.lang.String str113 = string + str5;
                                            if (map2 == map3) {
                                                fFloatValue /= com.apm.insight.l.d.d();
                                            }
                                            map2.put(str113, java.lang.Float.valueOf(fFloatValue));
                                        } else {
                                            strArr = strArrSplit3;
                                            str4 = str4;
                                        }
                                        if (c4 < 6) {
                                            break;
                                            break;
                                        } else {
                                            i3 += 3;
                                            strArrSplit3 = strArr;
                                            str4 = str4;
                                        }
                                    }
                                } else {
                                    map = map6;
                                    map7 = map7;
                                }
                            }
                            map = map6;
                            map7 = map7;
                            c3 = 4;
                            c = 3;
                            c5 = 4;
                        } else {
                            map = map6;
                            map7 = map7;
                        }
                        c = 3;
                        c5 = c2;
                        c3 = 4;
                    }
                } else {
                    map = map6;
                    map7 = map7;
                    str2 = str6;
                    c2 = c5;
                    c = 3;
                    java.lang.String strTrim4 = strTrim3.trim();
                    if (strTrim4.startsWith("tag:")) {
                        strTrim2 = strTrim4.replace("tag:", "").trim();
                        c3 = 4;
                        c5 = 1;
                    } else {
                        c5 = c2;
                        c3 = 4;
                    }
                }
                if (c5 >= c3) {
                    break;
                }
            } else {
                map = map6;
                map7 = map7;
                str2 = str6;
                c = 3;
            }
            i4++;
            strArrSplit2 = strArrSplit2;
            length = length;
            str6 = str2;
            map6 = map;
            map7 = map7;
        }
        jSONObject.put("anr_tag", strTrim2);
        jSONObject.put("anr_has_ago", java.lang.String.valueOf(z3));
        jSONObject.put("anr_reason", str7);
        a(map5, jSONObject, "app");
        a(map3, jSONObject, com.ironsource.y8.h.l);
        if (map4.isEmpty()) {
            jSONObject.put("npth_anr_systemserver_total", "not found");
        } else {
            jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
        }
        if (map7.isEmpty()) {
            jSONObject.put("npth_anr_kswapd_total", "not found");
        } else {
            jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
        }
        if (map.isEmpty()) {
            jSONObject.put("npth_anr_dex2oat_total", "not found");
        } else {
            jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
        }
    }

    private static void a(java.util.HashMap<java.lang.String, java.lang.Float> map, org.json.JSONObject jSONObject, java.lang.String str) throws org.json.JSONException {
        java.lang.String strConcat = "npth_anr_".concat(java.lang.String.valueOf(str));
        if (map.isEmpty()) {
            jSONObject.put(strConcat + "_total", "not found");
            return;
        }
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 0.0f;
        float fFloatValue4 = 0.0f;
        float fFloatValue5 = 0.0f;
        for (java.util.Map.Entry<java.lang.String, java.lang.Float> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            if (key.endsWith("user")) {
                fFloatValue += entry.getValue().floatValue();
            } else if (key.endsWith("kernel")) {
                fFloatValue2 += entry.getValue().floatValue();
            } else if (key.endsWith("iowait")) {
                fFloatValue3 += entry.getValue().floatValue();
            } else if (key.endsWith("irq")) {
                fFloatValue4 += entry.getValue().floatValue();
            } else if (key.endsWith("softirq")) {
                fFloatValue5 += entry.getValue().floatValue();
            }
        }
        float f = fFloatValue + fFloatValue2 + fFloatValue3 + fFloatValue4 + fFloatValue5;
        jSONObject.put(strConcat + "_total", b(f));
        jSONObject.put(strConcat + "_kernel_user_ratio", a(fFloatValue2, f));
        jSONObject.put(strConcat + "_iowait_user_ratio", a(fFloatValue3, f));
    }

    private static java.lang.String a(float f, float f2) {
        if (f2 > 0.0f) {
            return a(f / f2);
        }
        return f > 0.0f ? "100%" : "0%";
    }

    private static java.lang.String b(float f) {
        return a(f / 100.0f);
    }

    private static void b(java.lang.String str, org.json.JSONArray jSONArray) {
        for (com.apm.insight.ICrashCallback iCrashCallback : com.apm.insight.runtime.m.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(com.apm.insight.CrashType.ANR, str, (java.lang.Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(com.apm.insight.CrashType.ANR, str, null);
                }
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            }
        }
    }

    final boolean g() {
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONArray jSONArrayB;
        org.json.JSONArray jSONArrayA;
        org.json.JSONObject jSONObject;
        boolean z2;
        org.json.JSONObject jSONObjectA;
        boolean z3;
        java.lang.String str3;
        java.lang.String str4;
        org.json.JSONArray jSONArray;
        final long j;
        org.json.JSONObject jSONObjectA2;
        org.json.JSONObject jSONObject2;
        java.lang.String str5;
        org.json.JSONObject jSONObject3;
        boolean zB = com.apm.insight.runtime.j.a().b();
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        a(jUptimeMillis);
        java.lang.String strA = com.apm.insight.b.d.a(this.b);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str6 = com.adjust.sdk.Constants.NORMAL;
        android.text.TextUtils.isEmpty(strA);
        if (android.text.TextUtils.isEmpty(strA)) {
            str = "unknown";
            str2 = "unknown";
            jSONArrayB = null;
            jSONArrayA = null;
            jSONObject = null;
            z2 = false;
            jSONObjectA = null;
            z3 = false;
            str3 = com.adjust.sdk.Constants.NORMAL;
            str4 = "unknown";
            jSONArray = null;
            j = jCurrentTimeMillis;
            jSONObjectA2 = null;
        } else {
            synchronized (this.u) {
            }
            if (this.g == null || java.lang.System.currentTimeMillis() - this.d > 20000) {
                if (this.v) {
                    this.v = false;
                    str6 = "trace_after";
                }
                b(jUptimeMillis);
            } else {
                str6 = "trace_last";
            }
            org.json.JSONObject jSONObject4 = this.g;
            java.lang.String str7 = this.i;
            java.lang.String str8 = this.j;
            java.lang.String str9 = this.k;
            org.json.JSONArray jSONArray2 = this.m;
            org.json.JSONArray jSONArray3 = this.r;
            org.json.JSONArray jSONArray4 = this.q;
            org.json.JSONObject jSONObject5 = this.s;
            org.json.JSONObject jSONObject6 = this.h;
            z3 = this.t;
            long j2 = this.p;
            this.g = null;
            this.m = null;
            this.q = null;
            this.h = null;
            this.r = null;
            this.i = "unknown";
            this.j = "unknown";
            this.k = "unknown";
            this.o = 0;
            jSONArrayA = jSONArray4;
            str2 = str9;
            str4 = str7;
            jSONArray = jSONArray2;
            jSONObjectA = jSONObject6;
            jSONObject = jSONObject5;
            jSONArrayB = jSONArray3;
            str = str8;
            str3 = str6;
            j = j2;
            jSONObjectA2 = jSONObject4;
            z2 = true;
        }
        if (android.text.TextUtils.isEmpty(strA)) {
            if (this.g != null && java.lang.System.currentTimeMillis() - this.d > 20000) {
                this.g = null;
                this.m = null;
                this.q = null;
                this.h = null;
                this.r = null;
                this.i = "unknown";
                this.j = "unknown";
                this.k = "unknown";
                this.o = 0;
                this.e = null;
                return false;
            }
            if (this.g == null || java.lang.System.currentTimeMillis() - this.d <= 2000 || !com.apm.insight.nativecrash.NativeImpl.h()) {
                return false;
            }
            com.apm.insight.l.f.a(i());
            return false;
        }
        if (jSONObjectA2 == null) {
            if (jSONArrayA == null) {
                try {
                    jSONArrayB = com.apm.insight.b.f.b().b();
                    jSONArrayA = com.apm.insight.b.j.a(jUptimeMillis);
                    jSONObject3 = jSONObjectA2;
                    try {
                        jSONObjectA = com.apm.insight.b.f.b().a(jUptimeMillis).a();
                        org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                        try {
                            com.apm.insight.l.a.a(this.b, jSONObject7);
                            jSONObject = jSONObject7;
                        } catch (java.lang.Throwable unused) {
                            jSONObject = jSONObject7;
                            jSONObjectA2 = jSONObject3;
                        }
                    } catch (java.lang.Throwable unused2) {
                    }
                } catch (java.lang.Throwable unused3) {
                    jSONObject3 = jSONObjectA2;
                }
            } else {
                jSONObject3 = jSONObjectA2;
            }
            jSONObjectA2 = com.apm.insight.b.d.a();
        }
        org.json.JSONObject jSONObject8 = jSONObjectA;
        if (jSONObjectA2 != null && jSONObjectA2.length() > 0) {
            try {
                jSONObjectA2.put("pid", android.os.Process.myPid());
                jSONObjectA2.put("package", this.b.getPackageName());
                jSONObjectA2.put("is_remote_process", 0);
                jSONObjectA2.put("is_new_stack", 10);
                com.apm.insight.entity.a aVar = new com.apm.insight.entity.a(new org.json.JSONObject());
                java.lang.String str10 = str2;
                aVar.a("data", (java.lang.Object) jSONObjectA2.toString());
                org.json.JSONObject jSONObject9 = jSONObjectA2;
                aVar.a("is_anr", (java.lang.Object) 1);
                aVar.a("anrType", (java.lang.Object) str3);
                aVar.a("history_message", (java.lang.Object) jSONArrayB);
                aVar.a("current_message", jSONObject8);
                aVar.a("pending_messages", (java.lang.Object) jSONArrayA);
                aVar.a("anr_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                aVar.a("crash_time", java.lang.Long.valueOf(j));
                com.apm.insight.c.a.b();
                aVar.c(jSONObject);
                aVar.a("anr_info", (java.lang.Object) strA);
                if (jSONArray != null) {
                    aVar.a("dump_trace", (java.lang.Object) jSONArray);
                }
                org.json.JSONObject jSONObject10 = this.n;
                aVar.a("all_thread_stacks", (jSONObject10 == null || jSONObject10.length() == 0) ? com.apm.insight.l.m.b((java.lang.String) null) : this.n);
                com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(com.apm.insight.CrashType.ANR, aVar);
                aVarA.a("is_background", java.lang.Boolean.valueOf(z3));
                aVarA.a("logcat", (java.lang.Object) com.apm.insight.runtime.i.a(com.apm.insight.e.f()));
                aVarA.a("has_dump", (java.lang.Object) com.json.mediationsdk.metadata.a.g);
                aVarA.a("crash_uuid", (java.lang.Object) com.apm.insight.e.a(j, com.apm.insight.CrashType.ANR, false, false));
                aVarA.a("jiffy", java.lang.Long.valueOf(com.apm.insight.runtime.o.a.a()));
                org.json.JSONObject jSONObjectOptJSONObject = aVarA.c().optJSONObject("filters");
                com.apm.insight.entity.d.b(aVarA.c());
                if (jSONObjectOptJSONObject == null) {
                    try {
                        jSONObject2 = new org.json.JSONObject();
                        try {
                            aVarA.a("filters", jSONObject2);
                        } catch (java.lang.Throwable unused4) {
                            jSONObjectOptJSONObject = jSONObject2;
                            jSONObject2 = jSONObjectOptJSONObject;
                        }
                    } catch (java.lang.Throwable unused5) {
                        jSONObject2 = jSONObjectOptJSONObject;
                    }
                } else {
                    jSONObject2 = jSONObjectOptJSONObject;
                }
                jSONObject2.put("anrType", str3);
                jSONObject2.put("max_utm_thread", str4);
                jSONObject2.put("max_stm_thread", str);
                jSONObject2.put("max_utm_stm_thread", str10);
                jSONObject2.put("max_utm_thread_version", this.l);
                long j3 = j - com.apm.insight.e.j();
                if (j3 < 30000) {
                    str5 = "0 - 30s";
                } else if (j3 < 60000) {
                    str5 = "30s - 1min";
                } else if (j3 < com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                    str5 = "1min - 2min";
                } else if (j3 < 300000) {
                    str5 = "2min - 5min";
                } else if (j3 < com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME) {
                    str5 = "5min - 10min";
                } else if (j3 < 1800000) {
                    str5 = "10min - 30min";
                } else {
                    str5 = j3 < 3600000 ? "30min - 1h" : "1h - ";
                }
                jSONObject2.put("crash_length", str5);
                jSONObject2.put("disable_looper_monitor", java.lang.String.valueOf(com.apm.insight.runtime.a.c()));
                jSONObject2.put("npth_force_apm_crash", java.lang.String.valueOf(com.apm.insight.c.a.b()));
                jSONObject2.put("sdk_version", "1.3.8.nourl-rc.1");
                jSONObject2.put("has_logcat", java.lang.String.valueOf(aVarA.a()));
                jSONObject2.put("memory_leak", java.lang.String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
                jSONObject2.put("fd_leak", java.lang.String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
                jSONObject2.put("threads_leak", java.lang.String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
                jSONObject2.put("is_64_devices", java.lang.String.valueOf(com.apm.insight.entity.Header.a()));
                jSONObject2.put("is_64_runtime", java.lang.String.valueOf(com.apm.insight.nativecrash.NativeImpl.f()));
                jSONObject2.put("is_x86_devices", java.lang.String.valueOf(com.apm.insight.entity.Header.b()));
                jSONObject2.put("has_meminfo_file", java.lang.String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
                jSONObject2.put("is_root", com.apm.insight.nativecrash.a.k() ? com.json.mediationsdk.metadata.a.g : "false");
                jSONObject2.put("anr_normal_trace", java.lang.String.valueOf(!this.v));
                jSONObject2.put("anr_no_run", java.lang.String.valueOf(zB));
                jSONObject2.put("crash_after_crash", com.apm.insight.Npth.hasCrash() ? com.json.mediationsdk.metadata.a.g : "false");
                jSONObject2.put("from_file", java.lang.String.valueOf(com.apm.insight.b.d.b()));
                jSONObject2.put("has_dump", com.json.mediationsdk.metadata.a.g);
                jSONObject2.put("from_kill", "false");
                jSONObject2.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
                int i = this.o;
                if (i > 0) {
                    jSONObject2.put("may_have_stack_overflow", java.lang.String.valueOf(i));
                }
                try {
                    a(strA, jSONObject2);
                } catch (java.lang.Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                }
                com.apm.insight.a.a.a();
                com.apm.insight.CrashType crashType = com.apm.insight.CrashType.ANR;
                com.apm.insight.e.e();
                try {
                    if (com.apm.insight.a.e().length() > 1024) {
                        aVarA.a("has_system_traces", com.json.mediationsdk.metadata.a.g);
                    }
                } catch (java.lang.Throwable unused6) {
                }
                try {
                    org.json.JSONArray jSONArrayA2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                    jSONObject2.put("leak_threads_count", java.lang.String.valueOf(jSONArrayA2.length()));
                    if (jSONArrayA2.length() > 0) {
                        com.apm.insight.l.f.a(com.apm.insight.l.j.g(com.apm.insight.e.f()), jSONArrayA2);
                    }
                } catch (java.lang.Throwable unused7) {
                }
                java.lang.String strOptString = jSONObject9.optString("mainStackFromTrace");
                org.json.JSONArray jSONArrayA3 = com.apm.insight.entity.b.a(strOptString);
                com.apm.insight.entity.b.a(aVarA.c(), jSONArrayA3, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.b.b.2
                    @Override // com.apm.insight.entity.b.a
                    public final void a(org.json.JSONObject jSONObject11) {
                        com.apm.insight.k.d.a().a(jSONObject11, j, com.apm.insight.b.b.this.f);
                    }
                });
                b(strOptString, jSONArrayA3);
            } catch (java.lang.Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th2, "NPTH_CATCH");
            }
        }
        return z2;
    }
}
