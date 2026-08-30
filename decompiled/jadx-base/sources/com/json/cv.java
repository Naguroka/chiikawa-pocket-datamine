package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class cv {
    public static void a(android.content.Context context, java.lang.String str) throws java.lang.Exception {
        a(context, str, null);
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.Exception("url is null");
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(str));
        if (!android.text.TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        context.startActivity(intent);
    }
}
