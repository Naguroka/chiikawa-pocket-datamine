package com.bytedance.sdk.component.ldr.bg.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class ldr implements com.bytedance.sdk.component.ldr.bg.ldr.zx {
    private android.content.Context bg;

    public static java.lang.String IL() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    public ldr(android.content.Context context) {
        this.bg = context;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0092 A[DONT_GENERATE, PHI: r1
  0x0092: PHI (r1v4 android.database.Cursor) = (r1v3 android.database.Cursor), (r1v1 android.database.Cursor) binds: [B:27:0x00a4, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.sdk.component.ldr.bg.ldr.zx
    public java.util.List<com.bytedance.sdk.component.ldr.bg.ldr.eqN> bg() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor cursorBg = com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(this.bg, "trackurl", null, null, null, null, null, null);
        if (cursorBg != null) {
            while (cursorBg.moveToNext()) {
                try {
                    java.lang.String string = cursorBg.getString(cursorBg.getColumnIndex("id"));
                    java.lang.String string2 = cursorBg.getString(cursorBg.getColumnIndex("url"));
                    boolean z = cursorBg.getInt(cursorBg.getColumnIndex("replaceholder")) > 0;
                    int i = cursorBg.getInt(cursorBg.getColumnIndex("retry"));
                    int i2 = cursorBg.getInt(cursorBg.getColumnIndex("url_type"));
                    java.lang.String string3 = cursorBg.getString(cursorBg.getColumnIndex("ad_id"));
                    java.lang.String string4 = cursorBg.getString(cursorBg.getColumnIndex("error_code"));
                    java.lang.String string5 = cursorBg.getString(cursorBg.getColumnIndex("error_msg"));
                    com.bytedance.sdk.component.ldr.bg.ldr.eqN eqn = new com.bytedance.sdk.component.ldr.bg.ldr.eqN(string, string2, z, i2, string3);
                    eqn.bg(i);
                    if (!android.text.TextUtils.isEmpty(string4)) {
                        eqn.bg(string4);
                    }
                    if (!android.text.TextUtils.isEmpty(string5)) {
                        eqn.IL(string5);
                    }
                    linkedList.add(eqn);
                } catch (java.lang.Throwable unused) {
                    if (cursorBg != null) {
                        try {
                            cursorBg.close();
                            cursorBg = null;
                        } finally {
                            if (cursorBg != null) {
                                cursorBg.close();
                            }
                        }
                    }
                }
            }
            if (cursorBg != null) {
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.ldr.zx
    public com.bytedance.sdk.component.ldr.bg.ldr.eqN bg(java.lang.String str) {
        android.database.Cursor cursorBg = com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(this.bg, "trackurl", null, "id=?", new java.lang.String[]{str}, null, null, null);
        if (cursorBg != null && cursorBg.moveToFirst()) {
            try {
                java.lang.String string = cursorBg.getString(cursorBg.getColumnIndex("id"));
                java.lang.String string2 = cursorBg.getString(cursorBg.getColumnIndex("url"));
                boolean z = cursorBg.getInt(cursorBg.getColumnIndex("replaceholder")) > 0;
                int i = cursorBg.getInt(cursorBg.getColumnIndex("retry"));
                int i2 = cursorBg.getInt(cursorBg.getColumnIndex("url_type"));
                java.lang.String string3 = cursorBg.getString(cursorBg.getColumnIndex("ad_id"));
                java.lang.String string4 = cursorBg.getString(cursorBg.getColumnIndex("error_code"));
                java.lang.String string5 = cursorBg.getString(cursorBg.getColumnIndex("error_msg"));
                com.bytedance.sdk.component.ldr.bg.ldr.eqN eqn = new com.bytedance.sdk.component.ldr.bg.ldr.eqN(string, string2, z, i2, string3);
                eqn.bg(i);
                if (!android.text.TextUtils.isEmpty(string4)) {
                    eqn.bg(string4);
                }
                if (!android.text.TextUtils.isEmpty(string5)) {
                    eqn.IL(string5);
                }
                cursorBg.close();
                return eqn;
            } catch (java.lang.Throwable th) {
                try {
                    th.getMessage();
                    cursorBg.close();
                    cursorBg = null;
                } catch (java.lang.Throwable th2) {
                    cursorBg.close();
                    throw th2;
                }
            }
        }
        if (cursorBg != null) {
            cursorBg.close();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.ldr.zx
    public void bg(com.bytedance.sdk.component.ldr.bg.ldr.eqN eqn) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("id", eqn.bg());
        contentValues.put("url", eqn.IL());
        contentValues.put("replaceholder", java.lang.Integer.valueOf(eqn.bX() ? 1 : 0));
        contentValues.put("retry", java.lang.Integer.valueOf(eqn.eqN()));
        contentValues.put("url_type", java.lang.Integer.valueOf(eqn.zx()));
        contentValues.put("ad_id", eqn.ldr());
        contentValues.put("error_code", eqn.iR());
        contentValues.put("error_msg", eqn.WR());
        com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(this.bg, "trackurl", contentValues);
    }

    @Override // com.bytedance.sdk.component.ldr.bg.ldr.zx
    public void IL(com.bytedance.sdk.component.ldr.bg.ldr.eqN eqn) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("id", eqn.bg());
        contentValues.put("url", eqn.IL());
        contentValues.put("replaceholder", java.lang.Integer.valueOf(eqn.bX() ? 1 : 0));
        contentValues.put("retry", java.lang.Integer.valueOf(eqn.eqN()));
        contentValues.put("error_code", eqn.iR());
        contentValues.put("error_msg", eqn.WR());
        contentValues.put("url_type", java.lang.Integer.valueOf(eqn.zx()));
        contentValues.put("ad_id", eqn.ldr());
        com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(this.bg, "trackurl", contentValues, "id=?", new java.lang.String[]{eqn.bg()});
    }

    @Override // com.bytedance.sdk.component.ldr.bg.ldr.zx
    public void bX(com.bytedance.sdk.component.ldr.bg.ldr.eqN eqn) {
        com.bytedance.sdk.component.ldr.bg.bg.bg.bX.bg(this.bg, "trackurl", "id=?", new java.lang.String[]{eqn.bg()});
    }
}
