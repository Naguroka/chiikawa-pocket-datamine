package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f2685a = "adunit_data";

    public void a(android.content.Context context) {
        com.json.de.b().c(context);
    }

    public void a(java.lang.String str, com.ironsource.ce.a aVar) {
        org.json.JSONObject jSONObjectOptJSONObject;
        try {
            java.lang.String strName = aVar.name();
            com.json.de deVarB = com.json.de.b();
            org.json.JSONObject jSONObjectOptJSONObject2 = deVarB.b(com.json.environment.ContextProvider.getInstance().getApplicationContext()).optJSONObject(f2685a);
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(strName)) == null || jSONObjectOptJSONObject.remove(str) == null) {
                return;
            }
            deVarB.b(f2685a, jSONObjectOptJSONObject2.put(strName, jSONObjectOptJSONObject));
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
        }
    }

    public void a(java.lang.String str, java.lang.Object obj) {
        com.json.de.b().b(str, obj);
    }

    public void a(java.lang.String str, java.lang.Object obj, com.ironsource.ce.a aVar) {
        try {
            java.lang.String strName = aVar.name();
            com.json.de deVarB = com.json.de.b();
            org.json.JSONObject jSONObjectOptJSONObject = deVarB.b(com.json.environment.ContextProvider.getInstance().getApplicationContext()).optJSONObject(f2685a);
            if (jSONObjectOptJSONObject == null) {
                deVarB.b(f2685a, new org.json.JSONObject().put(strName, new org.json.JSONObject().put(str, obj)));
                return;
            }
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strName);
            if (jSONObjectOptJSONObject2 == null) {
                deVarB.b(f2685a, jSONObjectOptJSONObject.put(strName, new org.json.JSONObject().put(str, obj)));
            } else {
                deVarB.b(f2685a, jSONObjectOptJSONObject.put(strName, jSONObjectOptJSONObject2.put(str, obj)));
            }
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
        }
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.json.de.b().a(str, jSONObject);
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.json.de.b().a(map);
    }
}
