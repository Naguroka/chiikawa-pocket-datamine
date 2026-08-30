package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f2613a = "adunit_data";

    private org.json.JSONObject a(android.content.Context context, com.ironsource.ce.a aVar) throws org.json.JSONException {
        java.lang.String strName = aVar.name();
        org.json.JSONObject jSONObjectB = com.json.de.b().b(context);
        org.json.JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(f2613a);
        org.json.JSONObject jSONObjectA = a(jSONObjectB);
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optJSONObject(strName) != null) {
            org.json.JSONObject jSONObject = jSONObjectOptJSONObject.getJSONObject(strName);
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                jSONObjectA.putOpt(next, jSONObject.opt(next));
            }
        }
        return jSONObjectA;
    }

    private org.json.JSONObject a(android.content.Context context, java.util.List<java.lang.String> list) throws org.json.JSONException {
        return a(a(com.json.de.b().b(context)), (java.lang.String[]) list.toArray(new java.lang.String[list.size()]));
    }

    private org.json.JSONObject a(org.json.JSONObject jSONObject) {
        jSONObject.remove(f2613a);
        return jSONObject;
    }

    private org.json.JSONObject a(org.json.JSONObject jSONObject, java.lang.String[] strArr) throws org.json.JSONException {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.lang.String str : strArr) {
            if (jSONObject.has(str)) {
                jSONObject2.put(str, jSONObject.opt(str));
            }
        }
        return jSONObject2;
    }

    public org.json.JSONObject a(android.content.Context context, java.lang.String[] strArr) throws org.json.JSONException {
        return a(a(com.json.de.b().b(context)), strArr);
    }

    public org.json.JSONObject a(java.util.List<java.lang.String> list) throws org.json.JSONException {
        return a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), list);
    }

    public org.json.JSONObject a(java.util.List<java.lang.String> list, com.ironsource.ce.a aVar) throws org.json.JSONException {
        return a(a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), aVar), (java.lang.String[]) list.toArray(new java.lang.String[list.size()]));
    }

    public org.json.JSONObject a(java.lang.String[] strArr) throws org.json.JSONException {
        return a(a(com.json.de.b().b(com.json.environment.ContextProvider.getInstance().getApplicationContext())), strArr);
    }
}
