package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class eh implements com.json.ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.util.Map<java.lang.String, java.lang.Object> f2614a = new java.util.HashMap();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f2615a;
        java.lang.String b;
        java.lang.String c;
        android.content.Context d;
        java.lang.String e;

        com.ironsource.eh.b a(android.content.Context context) {
            this.d = context;
            return this;
        }

        com.ironsource.eh.b a(java.lang.String str) {
            this.b = str;
            return this;
        }

        public com.json.eh a() {
            return new com.json.eh(this);
        }

        com.ironsource.eh.b b(java.lang.String str) {
            this.c = str;
            return this;
        }

        com.ironsource.eh.b c(java.lang.String str) {
            this.f2615a = str;
            return this;
        }

        com.ironsource.eh.b d(java.lang.String str) {
            this.e = str;
            return this;
        }
    }

    private eh(com.ironsource.eh.b bVar) {
        a(bVar);
        a(bVar.d);
    }

    private void a(android.content.Context context) {
        f2614a.put(com.json.zb.e, com.json.v8.b(context));
        f2614a.put(com.json.zb.f, com.json.v8.d(context));
    }

    private void a(com.ironsource.eh.b bVar) {
        android.content.Context context = bVar.d;
        com.json.wa waVarB = com.json.wa.b(context);
        f2614a.put(com.json.zb.j, com.json.sdk.utils.SDKUtils.encodeString(waVarB.e()));
        f2614a.put(com.json.zb.k, com.json.sdk.utils.SDKUtils.encodeString(waVarB.f()));
        f2614a.put(com.json.zb.l, java.lang.Integer.valueOf(waVarB.a()));
        f2614a.put(com.json.zb.m, com.json.sdk.utils.SDKUtils.encodeString(waVarB.d()));
        f2614a.put(com.json.zb.n, com.json.sdk.utils.SDKUtils.encodeString(waVarB.c()));
        f2614a.put(com.json.zb.d, com.json.sdk.utils.SDKUtils.encodeString(context.getPackageName()));
        f2614a.put(com.json.zb.g, com.json.sdk.utils.SDKUtils.encodeString(bVar.b));
        f2614a.put("sessionid", com.json.sdk.utils.SDKUtils.encodeString(bVar.f2615a));
        f2614a.put(com.json.zb.b, com.json.sdk.utils.SDKUtils.encodeString(com.json.sdk.utils.SDKUtils.getSDKVersion()));
        f2614a.put(com.json.zb.o, com.json.zb.t);
        f2614a.put("origin", com.json.zb.q);
        if (android.text.TextUtils.isEmpty(bVar.e)) {
            return;
        }
        f2614a.put(com.json.zb.i, com.json.sdk.utils.SDKUtils.encodeString(bVar.e));
    }

    public static void a(java.lang.String str) {
        f2614a.put(com.json.zb.e, com.json.sdk.utils.SDKUtils.encodeString(str));
    }

    public static void b(java.lang.String str) {
        f2614a.put(com.json.zb.f, com.json.sdk.utils.SDKUtils.encodeString(str));
    }

    @Override // com.json.ye
    public java.util.Map<java.lang.String, java.lang.Object> a() {
        return f2614a;
    }
}
