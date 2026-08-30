package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class d4 {
    private static final java.util.List e = java.util.Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f702a;
    private final com.applovin.impl.sdk.n b;
    private final com.applovin.impl.dg c;
    private com.applovin.impl.d4.d d;

    public interface e {
        void a(java.lang.String str, int i, java.lang.String str2, java.lang.Object obj);

        void a(java.lang.String str, java.lang.Object obj, int i);
    }

    public d4(com.applovin.impl.sdk.j jVar) {
        this.f702a = jVar;
        this.b = jVar.I();
        com.applovin.impl.dg dgVar = new com.applovin.impl.dg(jVar);
        this.c = dgVar;
        dgVar.a();
    }

    private class c implements androidx.core.util.Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f704a;
        private final com.applovin.impl.sdk.network.a b;
        private final java.lang.String c;
        private final java.lang.Object d;
        private final boolean e;
        private final com.applovin.impl.d4.b f;
        private final com.applovin.impl.d4.e g;

        private c(java.lang.String str, com.applovin.impl.sdk.network.a aVar, java.lang.String str2, java.lang.Object obj, boolean z, com.applovin.impl.d4.b bVar, com.applovin.impl.d4.e eVar) {
            this.f704a = str;
            this.b = aVar;
            this.c = str2;
            this.d = obj;
            this.e = z;
            this.f = bVar;
            this.g = eVar;
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(com.applovin.impl.dg.d dVar) {
            int i;
            long jE = dVar.e();
            java.lang.Object objA = null;
            int iA = 0;
            try {
                int iC = dVar.c();
                try {
                    if (iC <= 0) {
                        com.applovin.impl.d4.this.a(this.c, this.f704a, iC, jE, (java.lang.Throwable) null);
                        this.g.a(this.f704a, iC, null, null);
                        return;
                    }
                    if (iC >= 200 && iC < 400) {
                        com.applovin.impl.d4.b bVar = this.f;
                        if (bVar != null) {
                            bVar.a(jE);
                        }
                        com.applovin.impl.d4.this.a(this.c, this.f704a, iC, jE);
                        byte[] bArrD = dVar.d();
                        if (com.applovin.impl.yp.f(com.applovin.impl.sdk.j.m()) && (!this.e || com.applovin.impl.vi.b(bArrD) != com.applovin.impl.vi.a.V2)) {
                            com.applovin.impl.d4.this.f702a.q().a(bArrD != null ? new java.lang.String(dVar.d(), java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING)) : "", this.f704a, this.b.b() != null ? this.b.b().toString() : "");
                        }
                        if (bArrD != null) {
                            java.lang.String str = new java.lang.String(dVar.d(), java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING));
                            com.applovin.impl.d4.b bVar2 = this.f;
                            if (bVar2 != null) {
                                bVar2.b(bArrD.length);
                                if (this.b.r()) {
                                    com.applovin.impl.d4.this.d = new com.applovin.impl.d4.d(this.b.f(), bArrD.length, jE);
                                }
                            }
                            if (this.e) {
                                java.lang.String strB = com.applovin.impl.vi.b(bArrD, com.applovin.impl.d4.this.f702a.a0(), com.applovin.impl.d4.this.f702a);
                                if (strB == null) {
                                    java.util.HashMap map = new java.util.HashMap(2);
                                    map.put("request", com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(this.f704a));
                                    map.put(com.json.hs.n, str);
                                    com.applovin.impl.d4.this.f702a.z().trackEvent("rdf", map);
                                }
                                str = strB;
                            }
                            try {
                                this.g.a(this.f704a, com.applovin.impl.d4.this.a(str, this.d), iC);
                                return;
                            } catch (java.lang.Throwable th) {
                                java.lang.String str2 = "Unable to parse response from " + com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(this.f704a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                                com.applovin.impl.sdk.n unused = com.applovin.impl.d4.this.b;
                                if (com.applovin.impl.sdk.n.a()) {
                                    com.applovin.impl.d4.this.b.a("ConnectionManager", str2, th);
                                }
                                com.applovin.impl.d4.this.f702a.C().c(com.applovin.impl.ba.n);
                                com.applovin.impl.d4.this.f702a.D().a("ConnectionManager", "failedToParseResponse", th, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(this.f704a)));
                                this.g.a(this.f704a, com.applovin.sdk.AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                return;
                            }
                        }
                        this.g.a(this.f704a, this.d, iC);
                        return;
                    }
                    this.g.a(this.f704a, iC, null, null);
                } catch (java.net.MalformedURLException e) {
                    e = e;
                    i = iC;
                    if (this.d == null) {
                        com.applovin.impl.d4.this.a(this.c, this.f704a, i, jE);
                        this.g.a(this.f704a, this.d, -901);
                    } else {
                        com.applovin.impl.d4.this.a(this.c, this.f704a, i, jE, e);
                        this.g.a(this.f704a, -901, e.getMessage(), null);
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    iA = iC;
                    if (((java.lang.Boolean) com.applovin.impl.d4.this.f702a.a(com.applovin.impl.sj.q)).booleanValue()) {
                        iA = dVar.b();
                    }
                    if (iA == 0) {
                        iA = com.applovin.impl.d4.this.a(th);
                    }
                    int i2 = iA;
                    try {
                        byte[] bArrF = dVar.f();
                        java.lang.String str3 = new java.lang.String(bArrF);
                        if (bArrF != null) {
                            if (this.e) {
                                str3 = com.applovin.impl.vi.b(bArrF, com.applovin.impl.d4.this.f702a.a0(), com.applovin.impl.d4.this.f702a);
                            }
                            objA = com.applovin.impl.d4.this.a(str3, this.d);
                        }
                    } catch (java.lang.Throwable unused2) {
                    }
                    com.applovin.impl.d4.this.a(this.c, this.f704a, i2, jE, th);
                    this.g.a(this.f704a, i2, th.getMessage(), objA);
                }
            } catch (java.net.MalformedURLException e2) {
                e = e2;
                i = 0;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f703a;
        private long b;

        public long a() {
            return this.f703a;
        }

        public long b() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            this.f703a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j) {
            this.b = j;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f705a = java.lang.System.currentTimeMillis();
        private final java.lang.String b;
        private final long c;
        private final long d;

        public java.lang.String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public d(java.lang.String str, long j, long j2) {
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        protected boolean a(java.lang.Object obj) {
            return obj instanceof com.applovin.impl.d4.d;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.d4.d)) {
                return false;
            }
            com.applovin.impl.d4.d dVar = (com.applovin.impl.d4.d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            java.lang.String strD = d();
            java.lang.String strD2 = dVar.d();
            return strD != null ? strD.equals(strD2) : strD2 == null;
        }

        public int hashCode() {
            long jC = c();
            long jB = b();
            int i = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            java.lang.String strD = d();
            return (((i * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (strD == null ? 43 : strD.hashCode());
        }

        public long c() {
            return this.f705a;
        }

        public java.lang.String d() {
            return this.b;
        }

        public long b() {
            return this.c;
        }

        public long a() {
            return this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(java.lang.Throwable th) {
        if (th instanceof java.net.UnknownHostException) {
            return -1009;
        }
        if (th instanceof java.net.SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof java.io.IOException) {
            return -100;
        }
        return th instanceof org.json.JSONException ? -104 : -1;
    }

    public com.applovin.impl.d4.d a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object a(java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof org.json.JSONObject) {
                return new org.json.JSONObject(str);
            }
            if (obj instanceof com.applovin.impl.es) {
                return com.applovin.impl.fs.a(str, this.f702a);
            }
            if (obj instanceof java.lang.String) {
                return str;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0247 A[Catch: all -> 0x0299, TryCatch #0 {all -> 0x0299, blocks: (B:44:0x012b, B:46:0x013b, B:50:0x0166, B:49:0x0162, B:51:0x0177, B:54:0x019c, B:56:0x01b8, B:60:0x01d9, B:76:0x022d, B:79:0x023c, B:81:0x0247, B:62:0x01dd, B:65:0x01e5, B:71:0x01fd, B:73:0x0203, B:74:0x0219, B:57:0x01c6, B:82:0x024a, B:84:0x0250, B:85:0x0264, B:67:0x01f6), top: B:98:0x012b, inners: #1 }] */
    public void a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.d4.b bVar, com.applovin.impl.d4.e eVar) {
        byte[] bytes;
        byte[] bArrA;
        if (aVar != null) {
            java.lang.String strF = aVar.f();
            java.lang.String strH = aVar.h();
            if (strF == null) {
                throw new java.lang.IllegalArgumentException("No endpoint specified");
            }
            if (strH == null) {
                throw new java.lang.IllegalArgumentException("No method specified");
            }
            if (eVar != null) {
                if (!strF.toLowerCase().startsWith(androidx.webkit.ProxyConfig.MATCH_HTTP)) {
                    java.lang.String str = "Requested postback submission to non HTTP endpoint " + strF + "; skipping...";
                    com.applovin.impl.sdk.n.h("ConnectionManager", str);
                    eVar.a(strF, com.applovin.sdk.AppLovinErrorCodes.INVALID_URL, str, null);
                    return;
                }
                if (((java.lang.Boolean) this.f702a.a(com.applovin.impl.sj.W2)).booleanValue() && !strF.contains("https://")) {
                    this.f702a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f702a.I().k("ConnectionManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
                    }
                    strF = strF.replace("http://", "https://");
                }
                java.util.HashMap map = new java.util.HashMap(2);
                boolean zM = aVar.m();
                com.applovin.impl.vi.a aVarA = ((java.lang.Boolean) this.f702a.a(com.applovin.impl.sj.e5)).booleanValue() ? com.applovin.impl.vi.a.a(((java.lang.Integer) this.f702a.a(com.applovin.impl.sj.b5)).intValue()) : aVar.e();
                long jA = com.applovin.impl.yp.a(this.f702a);
                if ((aVar.i() != null && !aVar.i().isEmpty()) || aVar.c() > 0) {
                    java.util.Map mapI = aVar.i();
                    java.lang.Boolean bool = (java.lang.Boolean) this.f702a.a(com.applovin.impl.sj.k3);
                    if (mapI != null && aVar.c() > 0) {
                        mapI.put("current_retry_attempt", java.lang.String.valueOf(aVar.c()));
                    }
                    if (zM) {
                        java.lang.String strA = com.applovin.impl.yp.a(mapI, bool.booleanValue());
                        java.lang.String strB = com.applovin.impl.vi.b(strA, jA, aVarA, this.f702a.a0(), this.f702a);
                        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA) && android.text.TextUtils.isEmpty(strB)) {
                            map.put("query", strA);
                        }
                        strF = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameter(strF, androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, strB);
                    } else {
                        strF = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameters(strF, mapI, bool.booleanValue());
                    }
                }
                java.lang.String str2 = strF;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                try {
                    java.lang.Boolean boolEndsWith = com.applovin.impl.sdk.utils.StringUtils.endsWith(com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(str2), e);
                    if (com.applovin.impl.sdk.n.a()) {
                        this.b.d("ConnectionManager", "Sending " + strH + " request to id=#" + str2.hashCode() + " \"" + (boolEndsWith.booleanValue() ? str2 : com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(str2)) + "\"...");
                    }
                    com.applovin.impl.dg.c.a aVarA2 = new com.applovin.impl.dg.c.a().a(str2).b(strH).a(aVar.g()).a(aVar.l());
                    if (aVar.b() != null) {
                        if (zM) {
                            bytes = com.applovin.impl.vi.a(aVar.b().toString(), jA, aVarA, this.f702a.a0(), this.f702a);
                            if (bytes == null) {
                                map.put("body", aVar.b().toString());
                            }
                        } else {
                            bytes = aVar.b().toString().getBytes(com.adjust.sdk.Constants.ENCODING);
                        }
                        byte[] bArr = bytes;
                        if ((!zM || aVarA != com.applovin.impl.vi.a.V2) && aVar.o() && bArr != null && bArr.length > ((java.lang.Integer) this.f702a.a(com.applovin.impl.sj.x5)).intValue()) {
                            try {
                                bArrA = com.applovin.impl.yp.a(bArr);
                            } catch (java.lang.Throwable th) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.b.a("ConnectionManager", "Failed to gzip POST body for request " + a(str2), th);
                                }
                                this.f702a.D().a("ConnectionManager", "gzip", th, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("url", com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(str2)));
                                bArrA = null;
                            }
                            aVarA2.a("Content-Type", "application/json; charset=utf-8");
                            if (!aVar.o() && bArrA != null) {
                                aVarA2.a(com.google.common.net.HttpHeaders.CONTENT_ENCODING, "gzip");
                                aVarA2.a(bArrA);
                            } else if (bArr != null) {
                                aVarA2.a(bArr);
                            }
                        } else {
                            bArrA = null;
                            aVarA2.a("Content-Type", "application/json; charset=utf-8");
                            if (!aVar.o()) {
                                if (bArr != null) {
                                    aVarA2.a(bArr);
                                }
                            } else if (bArr != null) {
                                aVarA2.a(bArr);
                            }
                        }
                    }
                    if (!map.isEmpty()) {
                        map.put("request", com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(str2));
                        this.f702a.z().trackEvent("ref", map);
                    }
                    this.c.a(aVarA2.a(new com.applovin.impl.d4.c(str2, aVar, strH, aVar.d(), zM, bVar, eVar)).a(this.f702a.i0().c()).a());
                    return;
                } catch (java.lang.Throwable th2) {
                    a(strH, str2, 0, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, th2);
                    eVar.a(str2, 0, th2.getMessage(), null);
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException("No callback specified");
        }
        throw new java.lang.IllegalArgumentException("No request specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, java.lang.String str2, int i, long j) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.d("ConnectionManager", "Successful " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + com.applovin.impl.e4.g(this.f702a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, java.lang.String str2, int i, long j, java.lang.Throwable th) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("ConnectionManager", "Failed " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + com.applovin.impl.e4.g(this.f702a) + " to " + a(str2), th);
        }
    }

    private java.lang.String a(java.lang.String str) {
        return "#" + str.hashCode() + " \"" + com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(str) + "\"";
    }
}
