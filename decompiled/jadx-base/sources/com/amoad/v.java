package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class v {
    static java.lang.String a(android.content.Context context) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        android.os.LocaleList locales = context.getResources().getConfiguration().getLocales();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(locales.get(i));
        }
        return sb.toString();
    }
}
