package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class aa extends com.amoad.s.f {
    aa(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4) {
        super(context);
        this.d = com.amoad.bg.a(context).f274a;
        a("sid", str);
        a("uid", str2);
        a("id_type", str3);
        a("app", "1");
        a("version", com.amoad.AMoAdBuildConfig.SDK_VERSION);
        a("appdomain", context.getPackageName());
        a("locale", com.amoad.v.a(context));
        a("ssl", "1");
        if (!android.text.TextUtils.isEmpty(str4)) {
            a(com.json.tk.SESSION_HISTORY_KEY_AD_ID, str4);
        }
        if (z) {
            a("optout", "1");
        }
        java.lang.String strA = com.amoad.w.a(context);
        if (android.text.TextUtils.isEmpty(strA)) {
            return;
        }
        a("network", strA);
    }

    @Override // com.amoad.s.f
    public final java.lang.String b() {
        return com.amoad.AMoAdBuildConfig.API_URL_AD;
    }
}
