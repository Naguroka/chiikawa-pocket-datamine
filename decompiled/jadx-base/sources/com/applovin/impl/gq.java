package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class gq implements com.applovin.impl.hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Set f832a = new java.util.HashSet();
    public final java.util.Set b = new java.util.HashSet();
    private android.net.Uri c;
    private android.net.Uri d;
    private int f;
    private int g;

    public java.lang.String toString() {
        return "VastIndustryIcon{imageUri='" + e() + "', clickUri='" + c() + "', width=" + g() + ", height=" + d() + "}";
    }

    public static com.applovin.impl.gq a(com.applovin.impl.es esVar, com.applovin.impl.sdk.j jVar) {
        if (esVar == null) {
            throw new java.lang.IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            com.applovin.impl.es esVarC = esVar.c("StaticResource");
            if (esVarC != null && android.webkit.URLUtil.isValidUrl(esVarC.d())) {
                com.applovin.impl.gq gqVar = new com.applovin.impl.gq();
                gqVar.c = android.net.Uri.parse(esVarC.d());
                com.applovin.impl.es esVarB = esVar.b("IconClickThrough");
                if (esVarB != null && android.webkit.URLUtil.isValidUrl(esVarB.d())) {
                    gqVar.d = android.net.Uri.parse(esVarB.d());
                }
                java.lang.String str = (java.lang.String) esVar.a().get("width");
                int i = 0;
                int i2 = (str == null || java.lang.Integer.parseInt(str) <= 0) ? 0 : java.lang.Integer.parseInt(str);
                java.lang.String str2 = (java.lang.String) esVar.a().get("height");
                if (str2 != null && java.lang.Integer.parseInt(str2) > 0) {
                    i = java.lang.Integer.parseInt(str2);
                }
                int iIntValue = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.M4)).intValue();
                if (i2 > 0 && i > 0) {
                    double d = i2 / i;
                    int iMin = java.lang.Math.min(java.lang.Math.max(i2, i), iIntValue);
                    if (i2 >= i) {
                        gqVar.f = iMin;
                        gqVar.g = (int) (((double) iMin) / d);
                    } else {
                        gqVar.g = iMin;
                        gqVar.f = (int) (((double) iMin) * d);
                    }
                } else {
                    gqVar.g = iIntValue;
                    gqVar.f = iIntValue;
                }
                return gqVar;
            }
            jVar.I();
            if (!com.applovin.impl.sdk.n.a()) {
                return null;
            }
            jVar.I().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        throw new java.lang.IllegalArgumentException("No sdk specified.");
    }

    public android.net.Uri e() {
        return this.c;
    }

    public android.net.Uri c() {
        return this.d;
    }

    public int g() {
        return this.f;
    }

    public int d() {
        return this.g;
    }

    public java.util.Set b() {
        return this.f832a;
    }

    public java.util.Set f() {
        return this.b;
    }

    public static com.applovin.impl.gq a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.kq kqVarA;
        com.applovin.impl.kq kqVarA2;
        if (jSONObject == null) {
            return null;
        }
        com.applovin.impl.gq gqVar = new com.applovin.impl.gq();
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "image_uri", null);
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        gqVar.c = android.net.Uri.parse(string);
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "click_trackers", new org.json.JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null);
            if (jSONObject2 != null && (kqVarA2 = com.applovin.impl.kq.a(jSONObject2, jVar)) != null) {
                gqVar.f832a.add(kqVarA2);
            }
        }
        org.json.JSONArray jSONArray2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "view_trackers", new org.json.JSONArray());
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            org.json.JSONObject jSONObject3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray2, i2, (org.json.JSONObject) null);
            if (jSONObject3 != null && (kqVarA = com.applovin.impl.kq.a(jSONObject3, jVar)) != null) {
                gqVar.b.add(kqVarA);
            }
        }
        java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "click_uri", null);
        gqVar.d = com.applovin.impl.sdk.utils.StringUtils.isValidString(string2) ? android.net.Uri.parse(string2) : null;
        gqVar.f = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, "width", 0);
        gqVar.g = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, "height", 0);
        return gqVar;
    }

    @Override // com.applovin.impl.hh
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.f832a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((com.applovin.impl.kq) it.next()).a());
        }
        com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        java.util.Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((com.applovin.impl.kq) it2.next()).a());
        }
        com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        android.net.Uri uri = this.c;
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        android.net.Uri uri2 = this.d;
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        com.applovin.impl.sdk.utils.JsonUtils.putInt(jSONObject, "width", this.f);
        com.applovin.impl.sdk.utils.JsonUtils.putInt(jSONObject, "height", this.g);
        return jSONObject;
    }

    public static android.widget.ImageView a(android.net.Uri uri, android.content.Context context, com.applovin.impl.sdk.j jVar) {
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        com.applovin.impl.sdk.utils.ImageViewUtils.setImageUri(imageView, uri, jVar);
        return imageView;
    }
}
