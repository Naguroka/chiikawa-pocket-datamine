package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class zu {
    private com.json.mediationsdk.model.NetworkSettings b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<java.lang.String> f3642a = new java.util.ArrayList<>();
    private org.json.JSONObject c = null;
    private boolean d = true;

    zu() {
    }

    public static com.json.zu a() {
        return new com.json.zu();
    }

    public void a(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        this.b = networkSettings;
    }

    public void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f3642a.add(str);
    }

    public void a(org.json.JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public org.json.JSONObject b() {
        return this.c;
    }

    public com.json.mediationsdk.model.NetworkSettings c() {
        return this.b;
    }

    public java.util.ArrayList<java.lang.String> d() {
        return this.f3642a;
    }

    public boolean e() {
        return this.d;
    }
}
