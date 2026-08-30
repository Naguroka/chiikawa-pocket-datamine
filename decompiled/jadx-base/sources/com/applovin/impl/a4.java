package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.applovin.impl.a4.a f578a = new com.applovin.impl.a4.a("Age Restricted User", com.applovin.impl.uj.m);
    private static final com.applovin.impl.a4.a b = new com.applovin.impl.a4.a("Has User Consent", com.applovin.impl.uj.l);
    private static final com.applovin.impl.a4.a c = new com.applovin.impl.a4.a("\"Do Not Sell\"", com.applovin.impl.uj.n);

    public static com.applovin.impl.a4.a b() {
        return b;
    }

    public static com.applovin.impl.a4.a c() {
        return f578a;
    }

    public static boolean b(boolean z, android.content.Context context) {
        return a(com.applovin.impl.uj.l, java.lang.Boolean.valueOf(z), context);
    }

    private static boolean a(com.applovin.impl.uj ujVar, java.lang.Boolean bool, android.content.Context context) {
        if (context == null) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Failed to update compliance value for key: " + ujVar);
            return false;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) com.applovin.impl.vj.a(ujVar, (java.lang.Object) null, context);
        com.applovin.impl.vj.b(ujVar, bool, context);
        return bool2 == null || bool2 != bool;
    }

    public static com.applovin.impl.a4.a a() {
        return c;
    }

    public static boolean a(boolean z, android.content.Context context) {
        return a(com.applovin.impl.uj.n, java.lang.Boolean.valueOf(z), context);
    }

    public static java.lang.String a(android.content.Context context) {
        return a(b, context) + a(c, context);
    }

    private static java.lang.String a(com.applovin.impl.a4.a aVar, android.content.Context context) {
        return "\n" + aVar.f579a + " - " + aVar.a(context);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f579a;
        private final com.applovin.impl.uj b;

        a(java.lang.String str, com.applovin.impl.uj ujVar) {
            this.f579a = str;
            this.b = ujVar;
        }

        public java.lang.Boolean b(android.content.Context context) {
            if (context == null) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "Failed to get value for key: " + this.b);
                return null;
            }
            return (java.lang.Boolean) com.applovin.impl.vj.a(this.b, (java.lang.Object) null, context);
        }

        public java.lang.String a() {
            return this.f579a;
        }

        public java.lang.String a(android.content.Context context) {
            java.lang.Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }
}
