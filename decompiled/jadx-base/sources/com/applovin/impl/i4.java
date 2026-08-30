package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f871a;
    protected final org.json.JSONObject b;

    public enum a {
        NONE,
        IS_AL_GDPR
    }

    public enum b {
        ALERT,
        EVENT,
        HAS_USER_CONSENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION,
        TERMS_FLOW
    }

    public java.lang.String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "}";
    }

    public i4(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        this.f871a = jVar;
        this.b = jSONObject;
    }

    public static com.applovin.impl.i4 a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.i4.b bVarC = c(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "type", null));
        if (bVarC == com.applovin.impl.i4.b.ALERT) {
            return new com.applovin.impl.j4(jSONObject, jVar);
        }
        if (bVarC == com.applovin.impl.i4.b.EVENT) {
            return new com.applovin.impl.l4(jSONObject, jVar);
        }
        return new com.applovin.impl.i4(jSONObject, jVar);
    }

    public java.lang.String b() {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(this.b, "id", null);
    }

    public com.applovin.impl.i4.b c() {
        return c(com.applovin.impl.sdk.utils.JsonUtils.getString(this.b, "type", null));
    }

    private static com.applovin.impl.i4.b c(java.lang.String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return com.applovin.impl.i4.b.ALERT;
        }
        if (androidx.core.app.NotificationCompat.CATEGORY_EVENT.equalsIgnoreCase(str)) {
            return com.applovin.impl.i4.b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return com.applovin.impl.i4.b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return com.applovin.impl.i4.b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return com.applovin.impl.i4.b.DECISION;
        }
        if ("terms_flow".equalsIgnoreCase(str)) {
            return com.applovin.impl.i4.b.TERMS_FLOW;
        }
        if ("huc".equalsIgnoreCase(str)) {
            return com.applovin.impl.i4.b.HAS_USER_CONSENT;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return com.applovin.impl.i4.b.REINIT;
        }
        throw new java.lang.IllegalArgumentException("Invalid type provided: " + str);
    }

    public boolean d() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.b, "is_initial_state", java.lang.Boolean.FALSE).booleanValue();
    }

    public com.applovin.impl.i4.a a() {
        return a(com.applovin.impl.sdk.utils.JsonUtils.getString(this.b, "decision_type", null));
    }

    protected java.lang.String b(java.lang.String str) {
        org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(this.b, str, (org.json.JSONObject) null);
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "replacements", new org.json.JSONArray());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getObjectAtIndex(jSONArray, i, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                java.lang.String str2 = (java.lang.String) this.f871a.x().G().get("app_name");
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.j.a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return com.applovin.impl.sdk.j.a(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, com.ironsource.y8.h.W, null), arrayList);
    }

    public java.lang.String a(java.lang.Boolean bool) {
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(this.b, "destination_state_id", null);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string)) {
            return string;
        }
        if (bool != null) {
            return bool.booleanValue() ? com.applovin.impl.sdk.utils.JsonUtils.getString(this.b, "destination_state_id_true", null) : com.applovin.impl.sdk.utils.JsonUtils.getString(this.b, "destination_state_id_false", null);
        }
        throw new java.lang.IllegalStateException("Decision needed for state: " + string);
    }

    private static com.applovin.impl.i4.a a(java.lang.String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return com.applovin.impl.i4.a.IS_AL_GDPR;
        }
        return com.applovin.impl.i4.a.NONE;
    }
}
