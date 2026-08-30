package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class ab extends com.amoad.s.d {
    public java.lang.String d;
    public java.lang.String e;
    public long f;
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.String i;
    public com.amoad.ab.a j;
    public java.lang.String k;
    public int l;
    public int m;
    public boolean n;
    public java.lang.String o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;

    public interface a {
    }

    public final class b implements com.amoad.ab.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f185a;
        public java.lang.String b;
        public java.lang.String c;
        public java.lang.String d;
        public java.util.List<java.lang.String> e;
        public android.graphics.Bitmap f;

        b(org.json.JSONObject jSONObject, java.lang.String str) throws org.json.JSONException {
            com.amoad.ab.this.t = true;
            this.f185a = jSONObject.optString("color");
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ads");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return;
            }
            org.json.JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(0);
            if (jSONObject2 != null) {
                com.amoad.ab.this.g = jSONObject2.optString("imp");
                this.b = com.amoad.l.b(jSONObject2.optString(com.ironsource.y8.h.D0), str);
                this.c = jSONObject2.optString("src");
                this.d = jSONObject2.optString("href");
                com.amoad.ab.this.o = jSONObject2.optString("appId");
                com.amoad.ab.this.p = jSONObject2.optInt("useDirectStore") == 1;
                org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("measurementLinks");
                if (jSONArrayOptJSONArray2 != null) {
                    int length = jSONArrayOptJSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        if (this.e == null) {
                            this.e = new java.util.ArrayList();
                        }
                        this.e.add(jSONArrayOptJSONArray2.getString(i));
                    }
                }
                try {
                    this.f = android.graphics.BitmapFactory.decodeStream(new java.net.URL(this.c).openStream());
                } catch (java.lang.Throwable th) {
                    com.amoad.ab.this.n = true;
                    com.amoad.Logger.w("DisplayAdResponse", th);
                }
            }
        }
    }

    public final class c implements com.amoad.ab.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f186a;
        public java.lang.String b;

        c(org.json.JSONObject jSONObject, java.lang.String str) {
            com.amoad.ab.this.t = true;
            this.f186a = com.amoad.l.b(jSONObject.optString("iframeLocation"), str);
            this.b = com.amoad.l.b(jSONObject.optString("html"), str);
            if (android.text.TextUtils.isEmpty(this.f186a) && android.text.TextUtils.isEmpty(this.b)) {
                com.amoad.ab.this.n = true;
            }
        }
    }

    public final class d implements com.amoad.ab.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f187a;
        public java.lang.String b;
        public java.util.List<java.lang.String> c;
        public double d;
        public android.graphics.Bitmap e;
        public com.amoad.ac f;

        d(org.json.JSONObject jSONObject) {
            com.amoad.ab.this.t = true;
            this.f187a = jSONObject.optString("src");
            this.b = jSONObject.optString("href");
            this.d = jSONObject.optDouble("scale", 1.0d);
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("measurementLinks");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (this.c == null) {
                        this.c = new java.util.ArrayList();
                    }
                    this.c.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            java.io.InputStream inputStream = null;
            try {
                java.net.URL url = new java.net.URL(this.f187a);
                java.io.InputStream inputStreamOpenStream = url.openStream();
                if (com.amoad.ac.a(url)) {
                    com.amoad.ac acVar = new com.amoad.ac(inputStreamOpenStream);
                    this.f = acVar;
                    com.amoad.ab.this.n = acVar.a();
                } else {
                    this.e = android.graphics.BitmapFactory.decodeStream(inputStreamOpenStream);
                }
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
            } catch (java.lang.Throwable th) {
                try {
                    com.amoad.ab.this.n = true;
                    com.amoad.Logger.w("DisplayAdResponse", th);
                } finally {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                }
            }
        }
    }

    public final class e implements com.amoad.ab.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f188a;
        public java.util.List<java.lang.String> b;
        public java.lang.String c;
        public android.media.MediaPlayer d;
        public int e;
        public int f;

        e(org.json.JSONObject jSONObject) {
            com.amoad.ab.this.t = false;
            this.c = jSONObject.optString("src");
            this.f188a = jSONObject.optString("href");
            this.e = jSONObject.optInt("creative_width");
            this.f = jSONObject.optInt("creative_height");
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("measurementLinks");
            if (jSONArrayOptJSONArray != null) {
                this.b = new java.util.ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.b.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            android.media.MediaPlayer mediaPlayerB = com.amoad.y.a(com.amoad.ab.this.c).b(this.c);
            this.d = mediaPlayerB;
            if (mediaPlayerB != null) {
                return;
            }
            java.io.InputStream inputStreamOpenStream = null;
            try {
                inputStreamOpenStream = new java.net.URL(this.c).openStream();
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStreamOpenStream.read(bArr);
                    if (i2 <= 0) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                }
                android.media.MediaPlayer mediaPlayerA = com.amoad.y.a(com.amoad.ab.this.c).a(this.c, byteArrayOutputStream.toByteArray());
                this.d = mediaPlayerA;
                if (mediaPlayerA == null) {
                    com.amoad.ab.this.n = true;
                }
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (java.lang.Exception unused) {
                    }
                }
            } catch (java.lang.Throwable th) {
                try {
                    com.amoad.ab.this.n = true;
                    com.amoad.Logger.w("DisplayAdResponse", th);
                } finally {
                    if (inputStreamOpenStream != null) {
                        try {
                            inputStreamOpenStream.close();
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                }
            }
        }

        protected final void finalize() throws java.lang.Throwable {
            android.media.MediaPlayer mediaPlayer = this.d;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            super.finalize();
        }
    }

    protected ab(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.amoad.ab.a dVar;
        super(context, str, str2);
        this.k = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.d = jSONObject.optString("fq");
        this.e = jSONObject.optString(com.json.tk.SESSION_HISTORY_KEY_AD_ID);
        this.f = jSONObject.optLong(androidx.constraintlayout.motion.widget.Key.ROTATION, -1L);
        this.i = jSONObject.optString("type");
        this.g = jSONObject.optString("imp");
        this.q = java.lang.Math.max(jSONObject.optInt("impDelayMillis"), 0);
        this.h = jSONObject.optString("vimp");
        this.l = jSONObject.optInt("width");
        this.m = jSONObject.optInt("height");
        this.o = jSONObject.optString("appId");
        this.p = jSONObject.optInt("useDirectStore") == 1;
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("confirmations");
        if (jSONObjectOptJSONObject != null) {
            this.r = jSONObjectOptJSONObject.optInt("completed") == 1;
            this.s = jSONObjectOptJSONObject.optInt(com.ironsource.y8.h.f0) == 1;
        }
        if ("giftext".equals(this.i)) {
            dVar = new com.amoad.ab.b(jSONObject, str2);
        } else if ("html".equals(this.i)) {
            dVar = new com.amoad.ab.c(jSONObject, str2);
        } else {
            if (!"img".equals(this.i)) {
                if ("movie".equals(this.i)) {
                    this.j = new com.amoad.ab.e(jSONObject);
                    return;
                }
                return;
            }
            dVar = new com.amoad.ab.d(jSONObject);
        }
        this.j = dVar;
    }

    @Override // com.amoad.s.d
    public final /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }
}
