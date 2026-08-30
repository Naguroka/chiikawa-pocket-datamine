package com.bytedance.sdk.component.ldr.bg.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private static android.content.ContentResolver bX() {
        try {
            if (com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() != null) {
                return com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr().getContentResolver();
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static void bg() {
        if (com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() == null) {
            return;
        }
        try {
            android.content.ContentResolver contentResolverBX = bX();
            if (contentResolverBX != null) {
                contentResolverBX.getType(android.net.Uri.parse(eqN() + "adLogStart"));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void IL() {
        if (com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() == null) {
            return;
        }
        try {
            android.content.ContentResolver contentResolverBX = bX();
            if (contentResolverBX != null) {
                contentResolverBX.getType(android.net.Uri.parse(eqN() + "adLogStop"));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        if (bgVar == null) {
            return;
        }
        try {
            android.content.ContentResolver contentResolverBX = bX();
            if (contentResolverBX != null) {
                contentResolverBX.getType(android.net.Uri.parse(eqN() + "adLogDispatch?event=" + com.bytedance.sdk.component.ldr.bg.bg.bg.ldr.bg(bgVar.ldr())));
            }
        } catch (java.lang.Throwable th) {
            th.toString();
        }
    }

    public static void bg(java.lang.String str, java.util.List<java.lang.String> list, boolean z) {
        if (android.text.TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(com.bytedance.sdk.component.ldr.bg.bg.bg.ldr.bg(it.next())).append(",");
            }
            java.lang.String str2 = "?did=" + java.lang.String.valueOf(str) + "&track=" + java.lang.String.valueOf(com.bytedance.sdk.component.ldr.bg.bg.bg.ldr.bg(sb.toString())) + "&replace=" + java.lang.String.valueOf(z);
            android.content.ContentResolver contentResolverBX = bX();
            if (contentResolverBX != null) {
                contentResolverBX.getType(android.net.Uri.parse(eqN() + "trackAdUrl" + str2));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            android.content.ContentResolver contentResolverBX = bX();
            if (contentResolverBX != null) {
                contentResolverBX.getType(android.net.Uri.parse(eqN() + "trackAdFailed?did=" + java.lang.String.valueOf(str)));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private static java.lang.String eqN() {
        return com.bytedance.sdk.component.ldr.bg.bg.bg.iR.IL + "/ad_log_event/";
    }
}
