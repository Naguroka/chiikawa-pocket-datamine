package com.bytedance.sdk.openadsdk.multipro.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class bX implements com.bytedance.sdk.openadsdk.multipro.bg {
    private android.content.Context bg;

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public java.lang.String bg() {
        return "t_sp";
    }

    private android.content.Context IL() {
        android.content.Context context = this.bg;
        return context == null ? com.bytedance.sdk.openadsdk.core.VzQ.bg() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public android.database.Cursor bg(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        java.util.Map<java.lang.String, ?> mapBX;
        if (!uri.getPath().split("/")[2].equals("get_all") || (mapBX = com.bytedance.sdk.openadsdk.multipro.eqN.IL.bX(IL(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(new java.lang.String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (java.lang.String str3 : mapBX.keySet()) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str3;
            java.lang.Object obj = mapBX.get(str3);
            objArr[2] = obj;
            if (obj instanceof java.lang.Boolean) {
                objArr[1] = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN;
            } else if (obj instanceof java.lang.String) {
                objArr[1] = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING;
            } else if (obj instanceof java.lang.Integer) {
                objArr[1] = "int";
            } else if (obj instanceof java.lang.Long) {
                objArr[1] = com.adjust.sdk.Constants.LONG;
            } else if (obj instanceof java.lang.Float) {
                objArr[1] = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT;
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public java.lang.String bg(android.net.Uri uri) {
        java.lang.String[] strArrSplit = uri.getPath().split("/");
        java.lang.String str = strArrSplit[2];
        java.lang.String str2 = strArrSplit[3];
        if (str.equals("contain")) {
            return java.lang.String.valueOf(com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(IL(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public android.net.Uri bg(android.net.Uri uri, android.content.ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        java.lang.String str = uri.getPath().split("/")[3];
        java.lang.Object obj = contentValues.get("value");
        if (obj != null) {
            com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(IL(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public int bg(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        java.lang.String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit[2].equals("clean")) {
            com.bytedance.sdk.openadsdk.multipro.eqN.IL.IL(IL(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        java.lang.String str2 = strArrSplit[3];
        if (com.bytedance.sdk.openadsdk.multipro.eqN.IL.bg(IL(), uri.getQueryParameter("sp_file_name"), str2)) {
            com.bytedance.sdk.openadsdk.multipro.eqN.IL.IL(IL(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.bg
    public int bg(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        bg(uri, contentValues);
        return 0;
    }
}
