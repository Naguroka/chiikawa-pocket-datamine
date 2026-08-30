package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class ak extends com.amoad.s.f {
    ak(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        this(context, str, str2, str3, z, 0);
    }

    ak(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i) {
        super(context);
        this.d = com.amoad.bg.a(context).f274a;
        a("sid", str);
        a("uid", str2);
        a("id_type", str3);
        a("version", com.amoad.AMoAdBuildConfig.SDK_VERSION);
        a("app", "1");
        a("appdomain", context.getPackageName());
        a("locale", com.amoad.v.a(context));
        if (z) {
            a("optout", "1");
        }
        if (i > 1) {
            a("cache", java.lang.String.valueOf(i - 1));
        }
        java.lang.String strA = com.amoad.w.a(context);
        if (!android.text.TextUtils.isEmpty(strA)) {
            a("network", strA);
        }
        a("ssl", "1");
    }

    @Override // com.amoad.s.f
    public final java.lang.String b() {
        return com.amoad.AMoAdBuildConfig.API_URL_NATIVE_AD;
    }
}
