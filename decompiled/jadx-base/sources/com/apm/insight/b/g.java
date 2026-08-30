package com.apm.insight.b;

/* JADX INFO: compiled from: LooperDispatchMonitor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    private static int r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.apm.insight.b.g.c f370a;
    private int b;
    private volatile int c;
    private int d;
    private int e;
    private com.apm.insight.b.g.f f;
    private long g;
    private long h;
    private int i;
    private long j;
    private java.lang.String k;
    private java.lang.String l;
    private com.apm.insight.b.e m;
    private volatile boolean n;
    private boolean o;
    private final com.apm.insight.runtime.r p;
    private volatile boolean q;
    private java.lang.Runnable s;

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public interface c {
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class d {
    }

    static /* synthetic */ com.apm.insight.b.g.b c() {
        return null;
    }

    static /* synthetic */ com.apm.insight.runtime.r e() {
        return null;
    }

    static /* synthetic */ int d(com.apm.insight.b.g gVar) {
        int i = gVar.b;
        gVar.b = i + 1;
        return i;
    }

    public g() {
        this((byte) 0);
    }

    private g(byte b2) {
        this.b = 0;
        this.c = 0;
        this.d = 100;
        this.e = 200;
        this.g = -1L;
        this.h = -1L;
        this.i = -1;
        this.j = -1L;
        this.n = false;
        this.o = false;
        this.q = false;
        this.s = new java.lang.Runnable() { // from class: com.apm.insight.b.g.2
            private long b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f372a = 0;
            private int c = -1;
            private int d = 0;
            private int e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                if (com.apm.insight.b.g.c().f374a != null) {
                    com.apm.insight.b.g.b bVar = null;
                    com.apm.insight.b.g.a aVar = bVar.f374a;
                    throw null;
                }
                com.apm.insight.b.g.a aVar2 = new com.apm.insight.b.g.a((byte) 0);
                if (this.c == com.apm.insight.b.g.this.c) {
                    this.d++;
                } else {
                    this.d = 0;
                    this.e = 0;
                    this.b = jUptimeMillis;
                }
                this.c = com.apm.insight.b.g.this.c;
                int i = this.d;
                if (i > 0 && i - this.e >= com.apm.insight.b.g.r && this.f372a != 0 && jUptimeMillis - this.b > 700 && com.apm.insight.b.g.this.q) {
                    aVar2.f = android.os.Looper.getMainLooper().getThread().getStackTrace();
                    this.e = this.d;
                }
                aVar2.d = com.apm.insight.b.g.this.q;
                aVar2.c = (jUptimeMillis - this.f372a) - 300;
                aVar2.f373a = jUptimeMillis;
                long jUptimeMillis2 = android.os.SystemClock.uptimeMillis();
                this.f372a = jUptimeMillis2;
                aVar2.b = jUptimeMillis2 - jUptimeMillis;
                aVar2.e = com.apm.insight.b.g.this.c;
                com.apm.insight.b.g.e().a(com.apm.insight.b.g.this.s, 300L);
                com.apm.insight.b.g.c().a(aVar2);
            }
        };
        this.f370a = new com.apm.insight.b.g.c() { // from class: com.apm.insight.b.g.1
        };
        this.p = null;
    }

    public final void a() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.d = 100;
        this.e = com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT;
        this.f = new com.apm.insight.b.g.f(this.d);
        this.m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void a(java.lang.String str) {
                com.apm.insight.b.g.this.q = true;
                com.apm.insight.b.g.this.l = str;
                super.a(str);
                com.apm.insight.b.g.a(com.apm.insight.b.g.this, true, com.apm.insight.b.e.f368a);
            }

            @Override // com.apm.insight.b.e
            public final void b(java.lang.String str) {
                super.b(str);
                com.apm.insight.b.g.d(com.apm.insight.b.g.this);
                com.apm.insight.b.g.a(com.apm.insight.b.g.this, false, com.apm.insight.b.e.f368a);
                com.apm.insight.b.g gVar = com.apm.insight.b.g.this;
                gVar.k = gVar.l;
                com.apm.insight.b.g.this.l = "no message running";
                com.apm.insight.b.g.this.q = false;
            }
        };
        com.apm.insight.b.h.a();
        com.apm.insight.b.h.a(this.m);
        com.apm.insight.b.j.a(com.apm.insight.b.j.a());
    }

    private void a(int i, long j, java.lang.String str) {
        a(i, j, str, true);
    }

    private void a(int i, long j, java.lang.String str, boolean z) {
        this.o = true;
        com.apm.insight.b.g.e eVarA = this.f.a(i);
        eVarA.f = j - this.g;
        if (z) {
            long jCurrentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
            eVarA.g = jCurrentThreadTimeMillis - this.j;
            this.j = jCurrentThreadTimeMillis;
        } else {
            eVarA.g = -1L;
        }
        eVarA.e = this.b;
        eVarA.h = str;
        eVarA.i = this.k;
        eVarA.f375a = this.g;
        eVarA.b = j;
        eVarA.c = this.h;
        this.f.a(eVarA);
        this.b = 0;
        this.g = j;
    }

    public final org.json.JSONArray b() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            int i = 0;
            for (com.apm.insight.b.g.e eVar : this.f.a()) {
                if (eVar != null) {
                    i++;
                    jSONArray.put(eVar.a().put("id", i));
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return jSONArray;
    }

    public final com.apm.insight.b.g.e a(long j) {
        com.apm.insight.b.g.e eVar = new com.apm.insight.b.g.e();
        eVar.h = this.l;
        eVar.i = this.k;
        eVar.f = j - this.h;
        eVar.g = a(this.i) - this.j;
        eVar.e = this.b;
        return eVar;
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f376a;
        private int b;
        private com.apm.insight.b.g.e c;
        private java.util.List<com.apm.insight.b.g.e> d = new java.util.ArrayList();

        f(int i) {
            this.f376a = i;
        }

        final com.apm.insight.b.g.e a(int i) {
            com.apm.insight.b.g.e eVar = this.c;
            if (eVar != null) {
                eVar.d = i;
                com.apm.insight.b.g.e eVar2 = this.c;
                this.c = null;
                return eVar2;
            }
            com.apm.insight.b.g.e eVar3 = new com.apm.insight.b.g.e();
            eVar3.d = i;
            return eVar3;
        }

        final void a(com.apm.insight.b.g.e eVar) {
            int size = this.d.size();
            int i = this.f376a;
            if (size < i) {
                this.d.add(eVar);
                this.b = this.d.size();
                return;
            }
            int i2 = this.b % i;
            this.b = i2;
            com.apm.insight.b.g.e eVar2 = this.d.set(i2, eVar);
            eVar2.b();
            this.c = eVar2;
            this.b++;
        }

        final java.util.List<com.apm.insight.b.g.e> a() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = 0;
            if (this.d.size() == this.f376a) {
                for (int i2 = this.b; i2 < this.d.size(); i2++) {
                    arrayList.add(this.d.get(i2));
                }
                while (i < this.b - 1) {
                    arrayList.add(this.d.get(i));
                    i++;
                }
            } else {
                while (i < this.d.size()) {
                    arrayList.add(this.d.get(i));
                    i++;
                }
            }
            return arrayList;
        }
    }

    public static java.lang.String a(java.lang.String str) {
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            java.lang.String[] strArrSplit = str.split(":");
            java.lang.String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (java.lang.Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                java.lang.String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                java.lang.String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (java.lang.Throwable unused2) {
            return str;
        }
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f375a;
        long b;
        long c;
        int d;
        int e;
        long f;
        long g;
        java.lang.String h;
        public java.lang.String i;
        private java.lang.String j;
        private com.apm.insight.b.g.d k;

        public final org.json.JSONObject a() {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, com.apm.insight.b.g.a(this.h));
                jSONObject.put("cpuDuration", this.g);
                jSONObject.put("duration", this.f);
                jSONObject.put("type", this.d);
                jSONObject.put("count", this.e);
                jSONObject.put("messageCount", this.e);
                jSONObject.put("lastDuration", this.b - this.c);
                jSONObject.put(androidx.media3.extractor.text.ttml.TtmlNode.START, this.f375a);
                jSONObject.put(androidx.media3.extractor.text.ttml.TtmlNode.END, this.b);
                jSONObject.put("block_uuid", (java.lang.Object) null);
                jSONObject.put("sblock_uuid", (java.lang.Object) null);
                jSONObject.put("belong_frame", false);
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        final void b() {
            this.d = -1;
            this.e = -1;
            this.f = -1L;
            this.h = null;
            this.j = null;
            this.k = null;
            this.i = null;
        }
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.apm.insight.b.g.a f374a;
        private int b;

        final void a(com.apm.insight.b.g.a aVar) {
            java.util.List list = null;
            list.size();
            throw null;
        }
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f373a;
        long b;
        long c;
        boolean d;
        int e;
        java.lang.StackTraceElement[] f;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    private static long a(int i) {
        if (i < 0) {
            return 0L;
        }
        try {
            return com.apm.insight.runtime.f.a(i);
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    static /* synthetic */ void a(com.apm.insight.b.g gVar, boolean z, long j) {
        int i = gVar.c + 1;
        gVar.c = i;
        gVar.c = i & 65535;
        gVar.o = false;
        if (gVar.g < 0) {
            gVar.g = j;
        }
        if (gVar.h < 0) {
            gVar.h = j;
        }
        if (gVar.i < 0) {
            gVar.i = android.os.Process.myTid();
            gVar.j = android.os.SystemClock.currentThreadTimeMillis();
        }
        long j2 = j - gVar.g;
        int i2 = gVar.e;
        if (j2 > i2) {
            long j3 = gVar.h;
            if (j - j3 <= i2) {
                gVar.a(9, j, gVar.l);
            } else if (z) {
                if (gVar.b == 0) {
                    gVar.a(1, j, "no message running");
                } else {
                    gVar.a(9, j3, gVar.k);
                    gVar.a(1, j, "no message running", false);
                }
            } else if (gVar.b == 0) {
                gVar.a(8, j, gVar.l, true);
            } else {
                gVar.a(9, j3, gVar.k, false);
                gVar.a(8, j, gVar.l, true);
            }
        }
        gVar.h = j;
    }
}
