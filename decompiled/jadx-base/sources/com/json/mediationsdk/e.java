package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2973a = "1";
    private final java.lang.String b = "102";
    private final java.lang.String c = "102";
    private final java.lang.String d = "GenericNotifications";
    private com.json.mediationsdk.f e;
    private com.ironsource.mediationsdk.IronSource.AD_UNIT f;
    private com.json.l5 g;
    private com.json.p4 h;
    private com.json.mediationsdk.ISBannerSize i;

    public static class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected com.json.p4 f2974a;
        protected com.ironsource.mediationsdk.d.a b;
        protected int c;
        protected java.lang.String d;
        protected long e;
        protected int f;
        private int h;
        private final java.net.URL k;
        private final org.json.JSONObject l;
        private final boolean m;
        private final int n;
        private final long o;
        private final boolean p;
        private final boolean q;
        protected java.lang.String g = "other";
        protected java.lang.String i = "";
        protected int j = 0;

        public a(com.json.p4 p4Var, java.net.URL url, org.json.JSONObject jSONObject, boolean z, int i, long j, boolean z2, boolean z3, int i2) {
            this.f2974a = p4Var;
            this.k = url;
            this.l = jSONObject;
            this.m = z;
            this.n = i;
            this.o = j;
            this.p = z2;
            this.q = z3;
            this.h = i2;
        }

        private java.lang.String a() {
            return this.h == 2 ? com.json.jb.b().d() : com.json.jb.b().c();
        }

        private java.lang.String a(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
            java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(httpURLConnection.getInputStream());
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(line);
            }
        }

        private java.net.HttpURLConnection a(java.net.URL url, long j) throws java.io.IOException {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        private org.json.JSONObject a(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
            java.lang.String strDecode = com.json.mediationsdk.utils.IronSourceAES.decode(str, str2);
            if (android.text.TextUtils.isEmpty(strDecode)) {
                throw new org.json.JSONException("decryption error");
            }
            return new org.json.JSONObject(strDecode);
        }

        private void a(long j, long j2) {
            long time = j - (new java.util.Date().getTime() - j2);
            if (time > 0) {
                android.os.SystemClock.sleep(time);
            }
        }

        private void a(java.net.HttpURLConnection httpURLConnection, org.json.JSONObject jSONObject, boolean z) throws java.lang.Exception {
            java.lang.String strA;
            java.lang.String strEncode;
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(outputStream, com.adjust.sdk.Constants.ENCODING);
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(outputStreamWriter);
            if (this.h == 2) {
                try {
                    strA = com.json.jb.b().a();
                } catch (org.json.JSONException e) {
                    com.json.l9.d().a(e);
                    this.i = e.getLocalizedMessage();
                    this.j = 1015;
                    this.h = 1;
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error("get encrypted session key exception " + e.getMessage());
                    strA = "";
                }
            } else {
                strA = "";
            }
            java.lang.String string = jSONObject.toString();
            java.lang.String strA2 = a();
            if (z) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strEncode = com.json.mediationsdk.utils.IronSourceAES.compressAndEncrypt(strA2, string);
            } else {
                strEncode = com.json.mediationsdk.utils.IronSourceAES.encode(strA2, string);
            }
            bufferedWriter.write(this.h == 2 ? java.lang.String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", strA, strEncode) : java.lang.String.format("{\"request\" : \"%1$s\"}", strEncode));
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        private org.json.JSONObject b(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            java.lang.String strDecryptAndDecompress = com.json.mediationsdk.utils.IronSourceAES.decryptAndDecompress(str, str2);
            if (strDecryptAndDecompress != null) {
                return new org.json.JSONObject(strDecryptAndDecompress);
            }
            throw new org.json.JSONException("decompression error");
        }

        protected org.json.JSONObject a(org.json.JSONObject jSONObject, boolean z) throws org.json.JSONException {
            java.lang.String strA = a();
            java.lang.String string = jSONObject.getString(this.h == 2 ? "ct" : com.json.hs.n);
            return z ? b(strA, string) : a(strA, string);
        }

        protected void a(java.lang.String str, boolean z, boolean z2) throws org.json.JSONException {
            if (android.text.TextUtils.isEmpty(str)) {
                throw new org.json.JSONException("empty response");
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (z) {
                jSONObject = a(jSONObject, z2);
            }
            com.ironsource.mediationsdk.d.a aVarA = com.json.mediationsdk.d.b().a(jSONObject);
            this.b = aVarA;
            this.c = aVarA.c();
            this.d = this.b.d();
        }

        protected void a(boolean z, com.json.p4 p4Var, long j) {
            if (z) {
                p4Var.a(this.b.h(), this.b.a(), this.b.e(), this.b.f(), this.b.b(), this.f + 1, j, this.j, this.i);
            } else {
                p4Var.a(this.c, this.d, this.f + 1, this.g, j);
            }
        }

        protected boolean b() {
            java.lang.String str;
            this.e = new java.util.Date().getTime();
            try {
                this.h = this.j == 1015 ? 1 : this.h;
                this.f = 0;
                java.net.HttpURLConnection httpURLConnectionA = null;
                while (true) {
                    int i = this.f;
                    int i2 = this.n;
                    if (i >= i2) {
                        this.f = i2 - 1;
                        this.g = "trials_fail";
                        return false;
                    }
                    try {
                        long time = new java.util.Date().getTime();
                        java.lang.String str2 = "Auction Handler: auction trial " + (this.f + 1) + " out of " + this.n + " max trials";
                        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, str2, 0);
                        com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(str2);
                        httpURLConnectionA = a(this.k, this.o);
                        a(httpURLConnectionA, this.l, this.p);
                        int responseCode = httpURLConnectionA.getResponseCode();
                        if (responseCode == 200 || responseCode == 204) {
                            try {
                                a(a(httpURLConnectionA), this.m, this.q);
                                httpURLConnectionA.disconnect();
                                return true;
                            } catch (org.json.JSONException e) {
                                com.json.l9.d().a(e);
                                if (e.getMessage() != null && e.getMessage().equalsIgnoreCase("decryption error")) {
                                    this.c = 1003;
                                    str = "Auction decryption error";
                                } else if (e.getMessage() == null || !e.getMessage().equalsIgnoreCase("decompression error")) {
                                    this.c = 1002;
                                    str = "Auction parsing error";
                                } else {
                                    this.c = 1008;
                                    str = "Auction decompression error";
                                }
                                this.d = str;
                                this.g = "parsing";
                                com.json.mediationsdk.logger.IronLog.INTERNAL.error("Auction handle response exception " + e.getMessage());
                                httpURLConnectionA.disconnect();
                                return false;
                            }
                        }
                        this.c = 1001;
                        java.lang.String str3 = "Auction response code not valid, error code response from server - " + responseCode;
                        this.d = str3;
                        com.json.mediationsdk.logger.IronLog.INTERNAL.error(str3);
                        httpURLConnectionA.disconnect();
                        if (this.f < this.n - 1) {
                            a(this.o, time);
                        }
                        this.f++;
                    } catch (java.net.SocketTimeoutException e2) {
                        com.json.l9.d().a(e2);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.c = 1006;
                        this.d = "Connection timed out";
                        com.json.mediationsdk.logger.IronLog.INTERNAL.error("Auction socket timeout exception " + e2.getMessage());
                    } catch (java.lang.Throwable th) {
                        com.json.l9.d().a(th);
                        com.json.mediationsdk.logger.IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.c = 1000;
                        this.d = th.getMessage();
                        this.g = "other";
                        return false;
                    }
                }
            } catch (java.lang.Exception e3) {
                com.json.l9.d().a(e3);
                this.c = 1007;
                this.d = e3.getMessage();
                this.f = 0;
                this.g = "other";
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("Auction request exception " + e3.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zB = b();
            com.json.p4 p4Var = this.f2974a;
            if (p4Var == null) {
                return;
            }
            a(zB, p4Var, new java.util.Date().getTime() - this.e);
        }
    }

    @java.lang.Deprecated
    public e(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, com.json.l5 l5Var, com.json.p4 p4Var) {
        this.f = ad_unit;
        this.g = l5Var;
        this.h = p4Var;
    }

    public e(com.json.mediationsdk.f fVar) {
        this.e = fVar;
    }

    private org.json.JSONObject a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, com.json.mediationsdk.h hVar, int i, boolean z, com.json.mediationsdk.IronSourceSegment ironSourceSegment) throws org.json.JSONException {
        com.json.mediationsdk.i iVar = new com.json.mediationsdk.i(this.f);
        iVar.a(map);
        iVar.a(list);
        iVar.a(hVar);
        iVar.a(i);
        iVar.a(this.i);
        iVar.a(ironSourceSegment);
        iVar.b(z);
        return com.json.mediationsdk.d.b().a(iVar);
    }

    public void a(android.content.Context context, com.json.mediationsdk.i iVar, com.json.p4 p4Var) {
        try {
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.e.a(context, iVar, p4Var));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            if (p4Var != null) {
                p4Var.a(1000, e.getMessage(), 0, "other", 0L);
            }
        }
    }

    @java.lang.Deprecated
    public void a(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, com.json.mediationsdk.h hVar, int i, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        try {
            boolean zIsEncryptedResponse = com.json.mediationsdk.utils.IronSourceUtils.isEncryptedResponse();
            com.json.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new com.ironsource.mediationsdk.e.a(this.h, new java.net.URL(this.g.a(false)), a(map, list, hVar, i, zIsEncryptedResponse, ironSourceSegment), zIsEncryptedResponse, this.g.g(), this.g.m(), this.g.n(), this.g.o(), this.g.d()));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            this.h.a(1000, e.getMessage(), 0, "other", 0L);
        }
    }

    @java.lang.Deprecated
    public void a(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, com.json.mediationsdk.h hVar, int i, com.json.mediationsdk.IronSourceSegment ironSourceSegment, com.json.mediationsdk.ISBannerSize iSBannerSize) {
        this.i = iSBannerSize;
        a(context, map, list, hVar, i, ironSourceSegment);
    }

    public void a(com.json.j5 j5Var, int i, com.json.j5 j5Var2) {
        java.util.Iterator<java.lang.String> it = j5Var.h().iterator();
        while (it.hasNext()) {
            com.json.mediationsdk.d.b().a("reportLoadSuccess", j5Var.c(), com.json.mediationsdk.d.b().a(it.next(), i, j5Var, "", "", ""));
        }
        if (j5Var2 != null) {
            java.util.Iterator<java.lang.String> it2 = j5Var2.h().iterator();
            while (it2.hasNext()) {
                com.json.mediationsdk.d.b().a("reportLoadSuccess", "GenericNotifications", com.json.mediationsdk.d.b().a(it2.next(), i, j5Var, "", "102", ""));
            }
        }
    }

    public void a(com.json.j5 j5Var, int i, com.json.j5 j5Var2, java.lang.String str) {
        java.util.Iterator<java.lang.String> it = j5Var.b().iterator();
        while (it.hasNext()) {
            com.json.mediationsdk.d.b().a("reportImpression", j5Var.c(), com.json.mediationsdk.d.b().a(it.next(), i, j5Var, "", "", str));
        }
        if (j5Var2 != null) {
            java.util.Iterator<java.lang.String> it2 = j5Var2.b().iterator();
            while (it2.hasNext()) {
                com.json.mediationsdk.d.b().a("reportImpression", "GenericNotifications", com.json.mediationsdk.d.b().a(it2.next(), i, j5Var, "", "102", str));
            }
        }
    }

    public void a(java.util.ArrayList<java.lang.String> arrayList, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.j5> concurrentHashMap, int i, com.json.j5 j5Var, com.json.j5 j5Var2) {
        int iJ = j5Var2.j();
        for (java.lang.String str : arrayList) {
            if (!str.equals(j5Var2.c())) {
                com.json.j5 j5Var3 = concurrentHashMap.get(str);
                int iJ2 = j5Var3.j();
                java.lang.String strI = j5Var3.i();
                java.lang.String str2 = iJ2 < iJ ? "1" : "102";
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("instance=" + j5Var3.c() + ", instancePriceOrder= " + iJ2 + ", loseReasonCode=" + str2 + ", winnerInstance=" + j5Var2.c() + ", winnerInstancePriceOrder=" + iJ);
                java.util.Iterator<java.lang.String> it = j5Var3.g().iterator();
                while (it.hasNext()) {
                    com.json.mediationsdk.d.b().a("reportAuctionLose", j5Var3.c(), com.json.mediationsdk.d.b().a(it.next(), i, j5Var2, strI, str2, ""));
                }
            }
        }
        if (j5Var != null) {
            java.util.Iterator<java.lang.String> it2 = j5Var.g().iterator();
            while (it2.hasNext()) {
                com.json.mediationsdk.d.b().a("reportAuctionLose", "GenericNotifications", com.json.mediationsdk.d.b().a(it2.next(), i, j5Var2, "", "102", ""));
            }
        }
    }

    public void a(java.util.concurrent.CopyOnWriteArrayList<com.json.mediationsdk.y> copyOnWriteArrayList, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.j5> concurrentHashMap, int i, com.json.j5 j5Var, com.json.j5 j5Var2) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.json.mediationsdk.y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i, j5Var, j5Var2);
    }

    public boolean a() {
        return this.e.a();
    }
}
