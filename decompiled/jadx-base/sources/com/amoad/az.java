package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class az {
    static com.amoad.s.c a(com.amoad.s.f fVar, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = com.adjust.sdk.Constants.ENCODING;
        }
        android.content.Context context = fVar.c;
        java.lang.String strTrim = str.trim();
        if (com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON.equals(strTrim) || "".equals(strTrim)) {
            return new com.amoad.s.a(context, strTrim, str2);
        }
        if (fVar instanceof com.amoad.aa) {
            return new com.amoad.ab(context, strTrim, str2);
        }
        if (fVar instanceof com.amoad.be) {
            return new com.amoad.bf(context, strTrim, str2);
        }
        return fVar instanceof com.amoad.ak ? new com.amoad.al(context, strTrim, str2) : new com.amoad.s.b("Response class not found.");
    }
}
