package com.bytedance.sdk.openadsdk.multipro;

/* JADX INFO: loaded from: classes4.dex */
public class zx implements com.bytedance.sdk.openadsdk.multipro.bg {
    private static java.lang.ref.WeakReference<android.content.Context> IL;
    private static final java.util.List<com.bytedance.sdk.openadsdk.multipro.bg> bX;
    private static volatile com.bytedance.sdk.openadsdk.multipro.zx bg;

    private boolean bX(android.net.Uri uri) {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public java.lang.String bg() {
        return "";
    }

    static {
        java.util.List<com.bytedance.sdk.openadsdk.multipro.bg> listSynchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        bX = listSynchronizedList;
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.eqN.bX());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.bg.IL());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.bX.bg());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.eqN.bg.zx(new com.bytedance.sdk.component.ldr.bg.IL.IL.IL()));
        java.util.Iterator<com.bytedance.sdk.openadsdk.multipro.bg> it = listSynchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static com.bytedance.sdk.openadsdk.multipro.zx bg(android.content.Context context) {
        if (context != null) {
            IL = new java.lang.ref.WeakReference<>(context.getApplicationContext());
        }
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.multipro.zx.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.multipro.zx();
                }
            }
        }
        return bg;
    }

    private zx() {
    }

    private com.bytedance.sdk.openadsdk.multipro.bg IL(android.net.Uri uri) {
        if (uri == null || !bX(uri)) {
            return null;
        }
        java.lang.String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit.length < 2) {
            return null;
        }
        java.lang.String str = strArrSplit[1];
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.bytedance.sdk.openadsdk.multipro.bg bgVar : bX) {
            if (str.equals(bgVar.bg())) {
                return bgVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public android.database.Cursor bg(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        try {
            com.bytedance.sdk.openadsdk.multipro.bg bgVarIL = IL(uri);
            if (bgVarIL != null) {
                return bgVarIL.bg(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public java.lang.String bg(android.net.Uri uri) {
        try {
            com.bytedance.sdk.openadsdk.multipro.bg bgVarIL = IL(uri);
            if (bgVarIL != null) {
                return bgVarIL.bg(uri);
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public android.net.Uri bg(android.net.Uri uri, android.content.ContentValues contentValues) {
        try {
            com.bytedance.sdk.openadsdk.multipro.bg bgVarIL = IL(uri);
            if (bgVarIL != null) {
                return bgVarIL.bg(uri, contentValues);
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public int bg(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        try {
            com.bytedance.sdk.openadsdk.multipro.bg bgVarIL = IL(uri);
            if (bgVarIL != null) {
                return bgVarIL.bg(uri, str, strArr);
            }
            return 0;
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public int bg(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        try {
            com.bytedance.sdk.openadsdk.multipro.bg bgVarIL = IL(uri);
            if (bgVarIL != null) {
                return bgVarIL.bg(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }
}
