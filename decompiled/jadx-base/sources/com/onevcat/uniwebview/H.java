package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class H implements com.onevcat.uniwebview.c2 {
    @Override // com.onevcat.uniwebview.c2
    public final void a(java.lang.String name, com.onevcat.uniwebview.d2 method, com.onevcat.uniwebview.Y1 payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        java.util.HashMap map = new java.util.HashMap();
        map.put("identifier", payload.f3701a);
        map.put("resultCode", payload.b);
        map.put("data", payload.c);
        org.json.JSONObject jSONObject = payload.d;
        if (jSONObject != null) {
            map.put("extra", java.lang.String.valueOf(jSONObject));
        }
        java.lang.String string = new org.json.JSONObject(map).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "obj.toString()");
        a(name, method, string);
    }

    @Override // com.onevcat.uniwebview.c2
    public final void a(java.lang.String name, com.onevcat.uniwebview.d2 method, java.lang.String parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
    }
}
