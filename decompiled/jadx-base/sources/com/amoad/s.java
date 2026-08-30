package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class s {

    static final class a extends com.amoad.s.d {
        protected a(android.content.Context context, java.lang.String str, java.lang.String str2) {
            super(context, str, str2);
        }
    }

    static final class b implements com.amoad.s.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f337a;

        protected b(java.lang.String str) {
            this.f337a = str;
        }

        public final java.lang.String toString() {
            return "ErrorResponse:" + this.f337a;
        }
    }

    interface c {
    }

    static abstract class d implements com.amoad.s.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final java.lang.String f338a;
        protected final java.lang.String b;
        protected final android.content.Context c;

        protected d(android.content.Context context, java.lang.String str, java.lang.String str2) {
            this.c = context;
            this.f338a = str;
            this.b = str2;
        }

        public java.lang.String toString() {
            return this.f338a;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f339a;
        java.lang.String b;

        e(java.lang.String str, java.lang.String str2) {
            this.f339a = str;
            this.b = str2;
        }
    }

    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f340a = 1000;
        int b = 4000;
        final android.content.Context c;
        java.lang.String d;
        private java.util.List<com.amoad.s.e> e;

        protected f(android.content.Context context) {
            this.c = context;
        }

        private java.lang.String c() {
            if (this.e == null) {
                return "";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("?");
            for (int i = 0; i < this.e.size(); i++) {
                if (i > 0) {
                    sb.append(kotlin.text.Typography.amp);
                }
                com.amoad.s.e eVar = this.e.get(i);
                if (!android.text.TextUtils.isEmpty(eVar.b)) {
                    sb.append(eVar.f339a).append('=').append(com.amoad.l.a(eVar.b, com.adjust.sdk.Constants.ENCODING));
                }
            }
            return sb.toString();
        }

        protected final java.lang.String a() {
            return b() + c();
        }

        protected final void a(java.lang.String str, java.lang.String str2) {
            if (this.e == null) {
                this.e = new java.util.ArrayList();
            }
            this.e.add(new com.amoad.s.e(str, str2));
        }

        protected abstract java.lang.String b();
    }

    static com.amoad.s.c a(com.amoad.s.f fVar) {
        java.lang.String strA = fVar.a();
        java.io.InputStream inputStream = null;
        try {
            try {
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(strA).openConnection();
                httpURLConnection.setConnectTimeout(fVar.f340a);
                httpURLConnection.setReadTimeout(fVar.b);
                httpURLConnection.setRequestMethod("GET");
                java.lang.String str = fVar.d;
                if (!android.text.TextUtils.isEmpty(str)) {
                    httpURLConnection.addRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, str);
                }
                com.amoad.Logger.d("ApiHelper", "--REQUEST:" + fVar.getClass().getSimpleName() + "\n" + strA.replaceAll(",", ",\n"));
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    return new com.amoad.s.b("http status code=".concat(java.lang.String.valueOf(responseCode)));
                }
                java.io.InputStream inputStream2 = httpURLConnection.getInputStream();
                com.amoad.s.c cVarA = com.amoad.az.a(fVar, a(inputStream2), httpURLConnection.getContentEncoding());
                com.amoad.Logger.d("ApiHelper", "--RESPONSE:" + cVarA.getClass().getSimpleName() + "\n" + cVarA.toString().replaceAll(",", ",\n"));
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                return cVarA;
            } catch (java.lang.Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception e2) {
            com.amoad.Logger.w("ApiHelper", e2);
            com.amoad.s.b bVar = new com.amoad.s.b(e2.getMessage());
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused3) {
                }
            }
            return bVar;
        }
    }

    private static java.lang.String a(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            java.lang.String line = bufferedReader.readLine();
            if (line == null) {
                return sb.toString();
            }
            sb.append(line);
        }
    }
}
