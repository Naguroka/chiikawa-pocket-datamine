package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3701a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final org.json.JSONObject d;

    public Y1(java.lang.String identifier, java.lang.String resultCode, java.lang.String data, java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.f3701a = identifier;
        this.b = resultCode;
        this.c = data;
        if (map != null) {
            this.d = new org.json.JSONObject(map);
        }
    }

    public final java.lang.String toString() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("identifier", this.f3701a);
        map.put("resultCode", this.b);
        map.put("data", this.c);
        org.json.JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            map.put("extra", java.lang.String.valueOf(jSONObject));
        }
        java.lang.String string = new org.json.JSONObject(map).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "obj.toString()");
        return string;
    }
}
