package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class kq implements com.applovin.impl.hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f967a;
    private java.lang.String b;
    private java.lang.String c;
    private long d = -1;
    private int f = -1;

    public java.lang.String toString() {
        return "VastTracker{identifier='" + this.f967a + "', event='" + this.b + "', uriString='" + this.c + "', offsetSeconds=" + this.d + ", offsetPercent=" + this.f + '}';
    }

    private kq() {
    }

    public static com.applovin.impl.kq a(com.applovin.impl.es esVar, com.applovin.impl.eq eqVar, com.applovin.impl.sdk.j jVar) {
        java.util.List<java.lang.String> listExplode;
        int size;
        long seconds;
        if (esVar == null) {
            throw new java.lang.IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            try {
                java.lang.String strD = esVar.d();
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strD)) {
                    com.applovin.impl.kq kqVar = new com.applovin.impl.kq();
                    kqVar.c = strD;
                    kqVar.f967a = (java.lang.String) esVar.a().get("id");
                    kqVar.b = (java.lang.String) esVar.a().get(androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                    kqVar.f = a(kqVar.b(), eqVar);
                    java.lang.String str = (java.lang.String) esVar.a().get(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET);
                    if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
                        java.lang.String strTrim = str.trim();
                        if (strTrim.contains("%")) {
                            kqVar.f = com.applovin.impl.sdk.utils.StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                        } else if (strTrim.contains(":") && (size = (listExplode = com.applovin.impl.sdk.utils.CollectionUtils.explode(strTrim, ":")).size()) > 0) {
                            int i = size - 1;
                            long j = 0;
                            for (int i2 = i; i2 >= 0; i2--) {
                                java.lang.String str2 = listExplode.get(i2);
                                if (com.applovin.impl.sdk.utils.StringUtils.isNumeric(str2)) {
                                    int i3 = java.lang.Integer.parseInt(str2);
                                    if (i2 == i) {
                                        seconds = i3;
                                    } else if (i2 == size - 2) {
                                        seconds = java.util.concurrent.TimeUnit.MINUTES.toSeconds(i3);
                                    } else if (i2 == size - 3) {
                                        seconds = java.util.concurrent.TimeUnit.HOURS.toSeconds(i3);
                                    }
                                    j += seconds;
                                }
                            }
                            kqVar.d = j;
                            kqVar.f = -1;
                        }
                    }
                    return kqVar;
                }
                jVar.I();
                if (!com.applovin.impl.sdk.n.a()) {
                    return null;
                }
                jVar.I().b("VastTracker", "Unable to create tracker. Could not find URL.");
                return null;
            } catch (java.lang.Throwable th) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("VastTracker", "Error occurred while initializing", th);
                }
                jVar.D().a("VastTracker", th);
                return null;
            }
        }
        throw new java.lang.IllegalArgumentException("No sdk specified.");
    }

    public java.lang.String b() {
        return this.b;
    }

    public java.lang.String c() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.kq)) {
            return false;
        }
        com.applovin.impl.kq kqVar = (com.applovin.impl.kq) obj;
        if (this.d != kqVar.d || this.f != kqVar.f) {
            return false;
        }
        java.lang.String str = this.f967a;
        if (str == null ? kqVar.f967a != null : !str.equals(kqVar.f967a)) {
            return false;
        }
        java.lang.String str2 = this.b;
        if (str2 == null ? kqVar.b == null : str2.equals(kqVar.b)) {
            return this.c.equals(kqVar.c);
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.f967a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.b;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode()) * 31;
        long j = this.d;
        return ((iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.f;
    }

    public static com.applovin.impl.kq a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        com.applovin.impl.kq kqVar = new com.applovin.impl.kq();
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "uri_string", "");
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        kqVar.c = string;
        kqVar.f967a = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "identifier", "");
        kqVar.b = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, androidx.core.app.NotificationCompat.CATEGORY_EVENT, "");
        kqVar.d = com.applovin.impl.sdk.utils.JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        kqVar.f = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return kqVar;
    }

    public boolean a(long j, int i) {
        long j2 = this.d;
        boolean z = j2 >= 0;
        boolean z2 = j >= j2;
        int i2 = this.f;
        boolean z3 = i2 >= 0;
        boolean z4 = i >= i2;
        if (z && z2) {
            return true;
        }
        return z3 && z4;
    }

    private static int a(java.lang.String str, com.applovin.impl.eq eqVar) {
        if (androidx.media3.extractor.text.ttml.TtmlNode.START.equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (eqVar != null) {
            return eqVar.g();
        }
        return 95;
    }

    @Override // com.applovin.impl.hh
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "identifier", this.f967a);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, androidx.core.app.NotificationCompat.CATEGORY_EVENT, this.b);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "uri_string", this.c);
        com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, "offset_seconds", this.d);
        com.applovin.impl.sdk.utils.JsonUtils.putInt(jSONObject, "offset_percent", this.f);
        return jSONObject;
    }
}
