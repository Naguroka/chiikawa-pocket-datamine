package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class dk {
    private static final java.lang.String b = "dk";
    private static final java.lang.String c = "supersonic_shared_preferen";
    private static final java.lang.String d = "version";
    private static final java.lang.String e = "back_button_state";
    private static final java.lang.String f = "search_keys";
    private static final java.lang.String g = "^\\d+_\\d+$";
    private static com.json.dk h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.SharedPreferences f2586a;

    private dk(android.content.Context context) {
        this.f2586a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized com.json.dk a(android.content.Context context) {
        if (h == null) {
            h = new com.json.dk(context);
        }
        return h;
    }

    private boolean b(java.lang.String str) {
        return str.matches(g);
    }

    public static synchronized com.json.dk e() {
        return h;
    }

    public java.lang.String a(java.lang.String str) {
        java.lang.String string = this.f2586a.getString(str, null);
        return string != null ? string : com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
    }

    public java.util.ArrayList<java.lang.String> a() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.lang.String[] strArr = (java.lang.String[]) this.f2586a.getAll().keySet().toArray(new java.lang.String[0]);
        android.content.SharedPreferences.Editor editorEdit = this.f2586a.edit();
        for (java.lang.String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return arrayList;
    }

    public void a(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor editorEdit = this.f2586a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String string = this.f2586a.getString("ssaUserData", null);
        if (android.text.TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put(com.ironsource.aa.a.d, str);
            android.content.SharedPreferences.Editor editorEdit = this.f2586a.edit();
            editorEdit.putString("ssaUserData", jSONObject.toString());
            editorEdit.apply();
            return true;
        } catch (org.json.JSONException e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public com.ironsource.zg.a b() {
        int i = java.lang.Integer.parseInt(this.f2586a.getString(e, "2"));
        if (i == 0) {
            return com.ironsource.zg.a.None;
        }
        if (i == 1) {
            return com.ironsource.zg.a.Device;
        }
        return i == 2 ? com.ironsource.zg.a.Controller : com.ironsource.zg.a.Controller;
    }

    public java.lang.String c() {
        return this.f2586a.getString("version", "-1");
    }

    public void c(java.lang.String str) {
        android.content.SharedPreferences.Editor editorEdit = this.f2586a.edit();
        editorEdit.putString(e, str);
        editorEdit.apply();
    }

    public java.util.List<java.lang.String> d() {
        java.lang.String string = this.f2586a.getString(f, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (string != null) {
            com.json.br brVar = new com.json.br(string);
            if (brVar.a(com.ironsource.y8.h.R)) {
                try {
                    arrayList.addAll(brVar.a((org.json.JSONArray) brVar.b(com.ironsource.y8.h.R)));
                } catch (org.json.JSONException e2) {
                    com.json.l9.d().a(e2);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                }
            }
        }
        return arrayList;
    }

    public void d(java.lang.String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = this.f2586a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    public void e(java.lang.String str) {
        android.content.SharedPreferences.Editor editorEdit = this.f2586a.edit();
        editorEdit.putString(f, str);
        editorEdit.apply();
    }
}
