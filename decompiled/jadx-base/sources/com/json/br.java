package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class br {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f2540a;

    public br() {
        this.f2540a = new org.json.JSONObject();
    }

    public br(java.lang.String str) {
        f(str);
    }

    private java.lang.Object a(java.lang.Object obj) throws org.json.JSONException {
        if (obj == org.json.JSONObject.NULL) {
            return null;
        }
        if (obj instanceof org.json.JSONObject) {
            return b((org.json.JSONObject) obj);
        }
        return obj instanceof org.json.JSONArray ? a((org.json.JSONArray) obj) : obj;
    }

    public static boolean a(org.json.JSONObject jSONObject) {
        return jSONObject.names() == null;
    }

    public static java.lang.Object b(java.lang.Object obj) throws org.json.JSONException {
        if (!(obj instanceof java.util.Map)) {
            if (!(obj instanceof java.lang.Iterable)) {
                return obj;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            return jSONArray;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map map = (java.util.Map) obj;
        for (java.lang.Object obj2 : map.keySet()) {
            if (obj2 != null) {
                jSONObject.put(obj2.toString(), b(map.get(obj2)));
            }
        }
        return jSONObject;
    }

    private java.util.Map<java.lang.String, java.lang.Object> b(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)));
        }
        return map;
    }

    private void f(java.lang.String str) {
        try {
            this.f2540a = new org.json.JSONObject(str);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            this.f2540a = new org.json.JSONObject();
        }
    }

    public int a(java.lang.String str, int i) {
        return this.f2540a.optInt(str, i);
    }

    public java.lang.String a(java.lang.String str, java.lang.String str2) {
        return this.f2540a.optString(str, str2);
    }

    public java.util.List a(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.get(i)));
        }
        return arrayList;
    }

    public org.json.JSONObject a() {
        return this.f2540a;
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            this.f2540a.put(str, jSONObject);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
        }
    }

    public boolean a(java.lang.String str) {
        return a().has(str);
    }

    public java.lang.Object b(java.lang.String str) {
        try {
            return a().get(str);
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            return null;
        }
    }

    public void b(java.lang.String str, java.lang.String str2) {
        try {
            this.f2540a.put(str, str2);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
        }
    }

    public boolean c(java.lang.String str) {
        return this.f2540a.optBoolean(str);
    }

    public java.lang.String d(java.lang.String str) {
        return this.f2540a.optString(str, null);
    }

    public boolean e(java.lang.String str) {
        return a().isNull(str);
    }

    public java.lang.String toString() {
        org.json.JSONObject jSONObject = this.f2540a;
        return jSONObject == null ? "" : jSONObject.toString();
    }
}
