package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class oq implements com.applovin.impl.hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.net.Uri f1133a;
    private android.net.Uri b;
    private com.applovin.impl.oq.a c;
    private java.lang.String d;
    private int f;
    private int g;
    private long h;

    public enum a {
        Progressive,
        Streaming
    }

    private oq() {
    }

    public java.lang.String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f1133a + ", videoUri=" + this.b + ", deliveryType=" + this.c + ", fileType='" + this.d + "', width=" + this.f + ", height=" + this.g + ", bitrate=" + this.h + '}';
    }

    public static com.applovin.impl.oq a(com.applovin.impl.es esVar, com.applovin.impl.sdk.j jVar) {
        if (esVar == null) {
            throw new java.lang.IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            try {
                java.lang.String strD = esVar.d();
                if (android.webkit.URLUtil.isValidUrl(strD)) {
                    android.net.Uri uri = android.net.Uri.parse(strD);
                    com.applovin.impl.oq oqVar = new com.applovin.impl.oq();
                    oqVar.f1133a = uri;
                    oqVar.b = uri;
                    oqVar.h = a(esVar);
                    oqVar.c = a((java.lang.String) esVar.a().get(com.json.s.g));
                    oqVar.g = com.applovin.impl.sdk.utils.StringUtils.parseInt((java.lang.String) esVar.a().get("height"));
                    oqVar.f = com.applovin.impl.sdk.utils.StringUtils.parseInt((java.lang.String) esVar.a().get("width"));
                    oqVar.d = ((java.lang.String) esVar.a().get("type")).toLowerCase(java.util.Locale.ENGLISH);
                    return oqVar;
                }
                jVar.I();
                if (!com.applovin.impl.sdk.n.a()) {
                    return null;
                }
                jVar.I().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            } catch (java.lang.Throwable th) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("VastVideoFile", "Error occurred while initializing", th);
                }
                jVar.D().a("VastVideoFile", th);
                return null;
            }
        }
        throw new java.lang.IllegalArgumentException("No sdk specified.");
    }

    public android.net.Uri d() {
        return this.f1133a;
    }

    public android.net.Uri e() {
        return this.b;
    }

    public java.lang.String c() {
        return this.d;
    }

    public long b() {
        return this.h;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.oq)) {
            return false;
        }
        com.applovin.impl.oq oqVar = (com.applovin.impl.oq) obj;
        if (this.f != oqVar.f || this.g != oqVar.g || this.h != oqVar.h) {
            return false;
        }
        android.net.Uri uri = this.f1133a;
        if (uri == null ? oqVar.f1133a != null : !uri.equals(oqVar.f1133a)) {
            return false;
        }
        android.net.Uri uri2 = this.b;
        if (uri2 == null ? oqVar.b != null : !uri2.equals(oqVar.b)) {
            return false;
        }
        if (this.c != oqVar.c) {
            return false;
        }
        java.lang.String str = this.d;
        java.lang.String str2 = oqVar.d;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        android.net.Uri uri = this.f1133a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        android.net.Uri uri2 = this.b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        com.applovin.impl.oq.a aVar = this.c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        java.lang.String str = this.d;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f) * 31) + this.g) * 31) + java.lang.Long.valueOf(this.h).hashCode();
    }

    public static com.applovin.impl.oq a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        android.net.Uri uri = android.net.Uri.parse(string);
        if (android.text.TextUtils.isEmpty(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        android.net.Uri uri2 = android.net.Uri.parse(string);
        java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "file_type", null);
        if (android.text.TextUtils.isEmpty(string2)) {
            return null;
        }
        com.applovin.impl.oq.a aVarValueOf = com.applovin.impl.oq.a.valueOf(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "delivery_type", com.applovin.impl.oq.a.Progressive.toString()));
        int i = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, "width", 0);
        int i2 = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, "height", 0);
        int i3 = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, "bitrate", 0);
        com.applovin.impl.oq oqVar = new com.applovin.impl.oq();
        oqVar.f1133a = uri;
        oqVar.b = uri2;
        oqVar.c = aVarValueOf;
        oqVar.d = string2;
        oqVar.f = i;
        oqVar.g = i2;
        oqVar.h = i3;
        return oqVar;
    }

    private static long a(com.applovin.impl.es esVar) {
        java.util.Map mapA = esVar.a();
        long j = com.applovin.impl.sdk.utils.StringUtils.parseLong((java.lang.String) mapA.get("bitrate"), 0L);
        return j != 0 ? j : (com.applovin.impl.sdk.utils.StringUtils.parseLong((java.lang.String) mapA.get("minBitrate"), 0L) + com.applovin.impl.sdk.utils.StringUtils.parseLong((java.lang.String) mapA.get("maxBitrate"), 0L)) / 2;
    }

    private static com.applovin.impl.oq.a a(java.lang.String str) {
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return com.applovin.impl.oq.a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return com.applovin.impl.oq.a.Streaming;
            }
        }
        return com.applovin.impl.oq.a.Progressive;
    }

    public void a(android.net.Uri uri) {
        this.b = uri;
    }

    @Override // com.applovin.impl.hh
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        android.net.Uri uri = this.f1133a;
        if (uri != null) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        android.net.Uri uri2 = this.b;
        if (uri2 != null) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        com.applovin.impl.oq.a aVar = this.c;
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "file_type", this.d);
        com.applovin.impl.sdk.utils.JsonUtils.putInt(jSONObject, "width", this.f);
        com.applovin.impl.sdk.utils.JsonUtils.putInt(jSONObject, "height", this.g);
        com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, "bitrate", this.h);
        return jSONObject;
    }
}
