package com.bytedance.sdk.openadsdk.multipro.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL implements com.bytedance.sdk.openadsdk.multipro.bg {
    private static final java.lang.Object IL = new java.lang.Object();
    private android.content.Context bg;

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public java.lang.String bg() {
        return "t_db";
    }

    private boolean IL(android.net.Uri uri) {
        return uri == null || android.text.TextUtils.isEmpty(uri.getPath());
    }

    private android.content.Context IL() {
        android.content.Context context = this.bg;
        return context == null ? com.bytedance.sdk.openadsdk.core.VzQ.bg() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public android.database.Cursor bg(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        synchronized (IL) {
            if (IL(uri)) {
                return null;
            }
            java.lang.String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 4) {
                java.lang.String str3 = strArrSplit[2];
                java.lang.String str4 = strArrSplit[3];
                if (!"ttopensdk.db".equals(str3)) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.core.zx.bg(IL()).bg().bg(str4, strArr, str, strArr2, null, null, str2);
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public java.lang.String bg(android.net.Uri uri) {
        synchronized (IL) {
            if (IL(uri)) {
                return null;
            }
            java.lang.String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 5) {
                java.lang.String str = strArrSplit[2];
                java.lang.String str2 = strArrSplit[4];
                if ("ttopensdk.db".equals(str)) {
                    if ("execSQL".equals(str2)) {
                        java.lang.String queryParameter = uri.getQueryParameter("sql");
                        if (!android.text.TextUtils.isEmpty(queryParameter)) {
                            com.bytedance.sdk.openadsdk.core.zx.bg(IL()).bg().bg(android.net.Uri.decode(queryParameter));
                        }
                    } else if ("transactionBegin".equals(str2)) {
                        com.bytedance.sdk.openadsdk.core.zx.bg(IL()).bg().IL();
                    } else if ("transactionSetSuccess".equals(str2)) {
                        com.bytedance.sdk.openadsdk.core.zx.bg(IL()).bg().bX();
                    } else if ("transactionEnd".equals(str2)) {
                        com.bytedance.sdk.openadsdk.core.zx.bg(IL()).bg().eqN();
                    }
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public android.net.Uri bg(android.net.Uri uri, android.content.ContentValues contentValues) {
        synchronized (IL) {
            if (IL(uri)) {
                return null;
            }
            java.lang.String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 4) {
                java.lang.String str = strArrSplit[2];
                java.lang.String str2 = strArrSplit[3];
                if ("ttopensdk.db".equals(str)) {
                    com.bytedance.sdk.openadsdk.core.zx.bg(IL()).bg().bg(str2, (java.lang.String) null, contentValues);
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public int bg(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        synchronized (IL) {
            if (IL(uri)) {
                return 0;
            }
            java.lang.String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 4) {
                java.lang.String str2 = strArrSplit[2];
                java.lang.String str3 = strArrSplit[3];
                if (!"ttopensdk.db".equals(str2)) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.zx.bg(IL()).bg().bg(str3, str, strArr);
            }
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public int bg(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        synchronized (IL) {
            if (IL(uri)) {
                return 0;
            }
            java.lang.String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 4) {
                java.lang.String str2 = strArrSplit[2];
                java.lang.String str3 = strArrSplit[3];
                if (!"ttopensdk.db".equals(str2)) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.zx.bg(IL()).bg().bg(str3, contentValues, str, strArr);
            }
            return 0;
        }
    }
}
