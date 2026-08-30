package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class al extends com.amoad.s.d {
    final int d;
    final int e;
    final int f;
    final int g;
    final int h;
    final int i;
    final long j;
    final com.amoad.b k;
    java.util.List<com.amoad.al.a> l;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f211a;
        final java.lang.String b;
        final java.lang.String c;
        final java.lang.String d;
        final java.lang.String e;
        final java.lang.String f;
        final java.lang.String g;
        final java.lang.String h;
        final com.amoad.al.b i;
        final java.lang.String j;
        final java.lang.String k;
        final java.lang.String l;
        final java.lang.String m;
        final boolean n;
        final java.lang.String o;
        final java.lang.String p;
        final java.util.List<java.lang.String> q;

        /* JADX WARN: Code duplicated, block: B:10:0x009d  */
        /* JADX WARN: Multi-variable type inference failed */
        private a(org.json.JSONObject jSONObject) {
            com.amoad.al.b bVar;
            this.f211a = jSONObject.optInt("NATIVE_UNIT_NO");
            this.b = jSONObject.optString("appId");
            this.c = jSONObject.optString("advId");
            this.d = jSONObject.optString("NATIVE_ICON_URL");
            this.e = jSONObject.optString("NATIVE_IMAGE_URL");
            this.f = jSONObject.optString("NATIVE_TITLE_SHORT");
            this.g = jSONObject.optString("NATIVE_TITLE_LONG");
            this.h = jSONObject.optString("NATIVE_SERVICE_NAME");
            this.j = jSONObject.optString("NATIVE_LINK");
            this.k = jSONObject.optString("NATIVE_LINK_ENCODE");
            this.l = jSONObject.optString("NATIVE_LINK_BUTTON_URL");
            this.m = jSONObject.optString("NATIVE_LINK_ON_TAP_BUTTON_URL");
            java.lang.Object[] objArr = 0;
            this.n = jSONObject.optInt("useDirectStore") == 1;
            this.o = jSONObject.optString("NATIVE_IMP_URL");
            this.p = jSONObject.optString("NATIVE_VIMP_URL");
            if (!jSONObject.isNull("video")) {
                bVar = new com.amoad.al.b(jSONObject.getJSONObject("video"), objArr == true ? 1 : 0);
                bVar = android.text.TextUtils.isEmpty(bVar.b) ^ true ? bVar : null;
            }
            this.i = bVar;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("measurementLinks");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            this.q = arrayList.isEmpty() ? null : java.util.Collections.unmodifiableList(arrayList);
        }

        /* synthetic */ a(org.json.JSONObject jSONObject, byte b) {
            this(jSONObject);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f212a;
        final java.lang.String b;
        final int c;
        final int d;
        final long e;
        final boolean f;
        final float g;
        final boolean h;
        final float i;
        final float j;
        final com.amoad.bd k;
        final com.amoad.bd l;
        final java.util.List<com.amoad.bd> m;

        private b(org.json.JSONObject jSONObject) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediaFile");
            jSONObjectOptJSONObject = jSONObjectOptJSONObject == null ? new org.json.JSONObject() : jSONObjectOptJSONObject;
            this.f212a = jSONObjectOptJSONObject.optString("src");
            this.b = jSONObjectOptJSONObject.optString("endCardUrl");
            this.c = jSONObjectOptJSONObject.optInt("width");
            this.d = jSONObjectOptJSONObject.optInt("height");
            long jOptLong = jSONObjectOptJSONObject.optLong("durationMillis");
            this.e = jOptLong;
            this.f = jSONObject.optInt("sound") == 1;
            this.g = (float) jSONObject.optDouble("volumeRatio");
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("trackingEvents");
            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject2 == null ? new org.json.JSONObject() : jSONObjectOptJSONObject2;
            this.k = !jSONObjectOptJSONObject2.isNull("fullscreen") ? new com.amoad.bd(jSONObjectOptJSONObject2.getString("fullscreen"), 0L) : null;
            this.l = jSONObjectOptJSONObject2.isNull("closeLinear") ? null : new com.amoad.bd(jSONObjectOptJSONObject2.getString("closeLinear"), 0L);
            this.m = com.amoad.bd.a(jSONObjectOptJSONObject2, jOptLong);
            org.json.JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("extensions");
            jSONObjectOptJSONObject3 = jSONObjectOptJSONObject3 == null ? new org.json.JSONObject() : jSONObjectOptJSONObject3;
            this.h = jSONObjectOptJSONObject3.optInt("autoPlay") == 1;
            this.i = (float) jSONObjectOptJSONObject3.optDouble("inviewRatio");
            this.j = (float) jSONObjectOptJSONObject3.optDouble("outviewRatio");
        }

        /* synthetic */ b(org.json.JSONObject jSONObject, byte b) {
            this(jSONObject);
        }
    }

    protected al(android.content.Context context, java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        super(context, str, str2);
        this.l = new java.util.ArrayList();
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String strOptString = jSONObject.optString("type");
        if (!com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE.equals(strOptString)) {
            throw new org.json.JSONException("Must be native type:".concat(java.lang.String.valueOf(strOptString)));
        }
        this.f = java.lang.Math.max(jSONObject.optInt("numOfAd"), 1);
        byte b2 = 0;
        this.g = java.lang.Math.max(jSONObject.optInt("impDelayMillis"), 0);
        this.h = java.lang.Math.min(java.lang.Math.max(jSONObject.optInt("numOfUnit"), 1), 32);
        this.i = java.lang.Math.min(java.lang.Math.max(jSONObject.optInt("numOfCache"), 1), 32);
        this.j = jSONObject.optInt("expireTimeSec");
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ads");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                com.amoad.al.a aVar = new com.amoad.al.a(jSONArrayOptJSONArray.optJSONObject(i), b2);
                if ((android.text.TextUtils.isEmpty(aVar.o) || android.text.TextUtils.isEmpty(aVar.j)) ? false : true) {
                    this.l.add(aVar);
                }
            }
        }
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("listView");
        this.d = jSONObjectOptJSONObject == null ? -1 : jSONObjectOptJSONObject.optInt("interval", -1);
        this.e = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("beginIndex", -1) : -1;
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("closeButton");
        if (jSONObjectOptJSONObject2 == null) {
            this.k = com.amoad.b.f266a;
        } else {
            this.k = new com.amoad.b(com.amoad.AMoAdPlacement.fromName(jSONObjectOptJSONObject2.optString(com.ironsource.y8.h.L)), com.amoad.AMoAdButtonType.fromNo(jSONObjectOptJSONObject2.optInt("buttonTypeNo")), (float) jSONObjectOptJSONObject2.optDouble("car", 1.0d));
        }
    }
}
