package com.bytedance.sdk.component.ldr.bg.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public static com.bytedance.sdk.component.ldr.bg.ldr bg;

    public java.lang.String bX() {
        return "ad_log_event";
    }

    public int bg(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    public int bg(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    public android.database.Cursor bg(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    public android.net.Uri bg(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    public static com.bytedance.sdk.component.ldr.bg.ldr bg(android.content.Context context) {
        try {
            if (bg == null) {
                bg = com.bytedance.sdk.component.ldr.bg.Kg.iR().vb().VB();
            }
        } catch (java.lang.Exception unused) {
        }
        return bg;
    }

    public static void bg() {
        if (com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() == null) {
            return;
        }
        try {
            com.bytedance.sdk.component.ldr.bg.ldr ldrVarBg = bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr());
            if (ldrVarBg != null) {
                ldrVarBg.bg(android.net.Uri.parse(eqN() + "adLogStart"));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void IL() {
        if (com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() == null) {
            return;
        }
        try {
            com.bytedance.sdk.component.ldr.bg.ldr ldrVarBg = bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr());
            if (ldrVarBg != null) {
                ldrVarBg.bg(android.net.Uri.parse(eqN() + "adLogStop"));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar) {
        if (bgVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.component.ldr.bg.ldr ldrVarBg = bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr());
            if (ldrVarBg != null) {
                ldrVarBg.bg(android.net.Uri.parse(eqN() + "adLogDispatch?event=" + com.bytedance.sdk.component.ldr.bg.bg.bg.ldr.bg(bgVar.ldr())));
            }
        } catch (java.lang.Throwable th) {
            th.toString();
        }
    }

    public static void bg(java.lang.String str, java.util.List<java.lang.String> list, boolean z, int i, java.lang.String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(com.bytedance.sdk.component.ldr.bg.bg.bg.ldr.bg(it.next())).append(",");
            }
            java.lang.String str3 = "?did=" + java.lang.String.valueOf(str) + "&track=" + java.lang.String.valueOf(com.bytedance.sdk.component.ldr.bg.bg.bg.ldr.bg(sb.toString())) + "&replace=" + java.lang.String.valueOf(z) + "&urlType=" + java.lang.String.valueOf(i) + "&adId=" + str2;
            com.bytedance.sdk.component.ldr.bg.ldr ldrVarBg = bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr());
            if (ldrVarBg != null) {
                ldrVarBg.bg(android.net.Uri.parse(eqN() + "trackAdUrl" + str3));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void bg(java.lang.String str, boolean z) {
        if (com.bytedance.sdk.component.ldr.bg.Kg.iR().vb().ldr() == 0 && android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.component.ldr.bg.ldr ldrVarBg = bg(com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr());
            if (ldrVarBg != null) {
                ldrVarBg.bg(android.net.Uri.parse(eqN() + "trackAdFailed?did=" + java.lang.String.valueOf(str) + "&triggerOnInit=" + z));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private static java.lang.String eqN() {
        return com.bytedance.sdk.component.ldr.bg.bg.bg.iR.IL + "/ad_log_event/";
    }

    public java.lang.String bg(android.net.Uri uri) {
        com.bytedance.sdk.component.ldr.bg.eqN.bg bgVarBX;
        byte b = 2;
        java.lang.String str = uri.getPath().split("/")[2];
        str.hashCode();
        int i = 0;
        switch (str.hashCode()) {
            case -482705237:
                b = str.equals("trackAdFailed") ? (byte) 0 : (byte) -1;
                break;
            case -171493183:
                b = str.equals("adLogStart") ? (byte) 1 : (byte) -1;
                break;
            case 964299715:
                if (!str.equals("adLogStop")) {
                    b = -1;
                }
                break;
            case 1025736635:
                b = str.equals("adLogDispatch") ? (byte) 3 : (byte) -1;
                break;
            case 1131732929:
                b = str.equals("trackAdUrl") ? (byte) 4 : (byte) -1;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                com.bytedance.sdk.component.ldr.bg.ldr.bg.bg().bg(uri.getQueryParameter("did"), uri.getBooleanQueryParameter("triggerOnInit", false));
                break;
            case 1:
                com.bytedance.sdk.component.ldr.bg.Kg.iR().WR();
                break;
            case 2:
                com.bytedance.sdk.component.ldr.bg.Kg.iR().VB();
                break;
            case 3:
                java.lang.String queryParameter = uri.getQueryParameter(androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                if (!android.text.TextUtils.isEmpty(queryParameter) && (bgVarBX = com.bytedance.sdk.component.ldr.bg.eqN.bg.bg.bX(com.bytedance.sdk.component.ldr.bg.bg.bg.ldr.IL(queryParameter))) != null) {
                    com.bytedance.sdk.component.ldr.bg.eqN.bg.bg(bgVarBX);
                    break;
                }
                break;
            case 4:
                try {
                    java.lang.String queryParameter2 = uri.getQueryParameter("did");
                    boolean zBooleanValue = java.lang.Boolean.valueOf(uri.getQueryParameter("replace")).booleanValue();
                    java.lang.String queryParameter3 = uri.getQueryParameter("track");
                    java.lang.String queryParameter4 = uri.getQueryParameter("urlType");
                    java.lang.String queryParameter5 = uri.getQueryParameter(com.ironsource.sdk.controller.f.b.c);
                    java.lang.String[] strArrSplit = com.bytedance.sdk.component.ldr.bg.bg.bg.ldr.IL(queryParameter3).split(",");
                    if (strArrSplit.length > 0) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.String str2 : strArrSplit) {
                            java.lang.String strIL = com.bytedance.sdk.component.ldr.bg.bg.bg.ldr.IL(str2);
                            if (!android.text.TextUtils.isEmpty(strIL)) {
                                arrayList.add(strIL);
                            }
                        }
                        try {
                            if (!android.text.TextUtils.isEmpty(queryParameter4)) {
                                i = java.lang.Integer.parseInt(queryParameter4);
                            }
                            break;
                        } catch (java.lang.Exception unused) {
                        }
                        com.bytedance.sdk.component.ldr.bg.ldr.bg.bg().bg(queryParameter2, arrayList, zBooleanValue, null, i, queryParameter5);
                    }
                } catch (java.lang.Throwable unused2) {
                    return null;
                }
                break;
        }
        return null;
    }
}
