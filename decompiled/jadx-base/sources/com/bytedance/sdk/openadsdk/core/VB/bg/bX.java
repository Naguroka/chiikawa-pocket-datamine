package com.bytedance.sdk.openadsdk.core.VB.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private static volatile com.bytedance.sdk.openadsdk.core.VB.bg.bX IL = null;
    public static int bg = 20;
    private final java.lang.Object bX = new java.lang.Object();
    private final android.util.LruCache<java.lang.String, com.bytedance.sdk.openadsdk.core.VB.bg.bg> eqN = new android.util.LruCache<java.lang.String, com.bytedance.sdk.openadsdk.core.VB.bg.bg>(bg) { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.bX.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public int sizeOf(java.lang.String str, com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVar) {
            return 1;
        }
    };

    public static java.lang.String bX() {
        return "CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)";
    }

    public static java.lang.String eqN() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    private bX() {
    }

    public static com.bytedance.sdk.openadsdk.core.VB.bg.bX bg() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.VB.bg.bX.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.openadsdk.core.VB.bg.bX();
                }
            }
        }
        return IL;
    }

    com.bytedance.sdk.openadsdk.core.VB.bg.bg bg(java.lang.String str, java.lang.String str2) {
        com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVar;
        com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVarBg;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.bX) {
            bgVar = this.eqN.get(str);
        }
        if (bgVar != null) {
            if (android.text.TextUtils.equals(str2, bgVar.IL())) {
                return bgVar;
            }
            IL(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.bX bXVar = new com.bytedance.sdk.openadsdk.multipro.aidl.bX(com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "ugen_template", null, "id=? AND md5=?", new java.lang.String[]{str, str2}, null, null, null));
        try {
            if (bXVar.moveToFirst()) {
                do {
                    int columnIndex = bXVar.getColumnIndex("id");
                    int columnIndex2 = bXVar.getColumnIndex("md5");
                    int columnIndex3 = bXVar.getColumnIndex("url");
                    int columnIndex4 = bXVar.getColumnIndex("data");
                    int columnIndex5 = bXVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = bXVar.getColumnIndex("rit");
                        java.lang.String string = bXVar.getString(columnIndex);
                        java.lang.String string2 = bXVar.getString(columnIndex2);
                        java.lang.String string3 = bXVar.getString(columnIndex3);
                        java.lang.String string4 = bXVar.getString(columnIndex4);
                        if (android.text.TextUtils.isEmpty(string4)) {
                            bXVar.close();
                            return null;
                        }
                        bgVarBg = new com.bytedance.sdk.openadsdk.core.VB.bg.bg().bg(string).IL(string2).eqN(string4).bX(string3).zx(columnIndex6 != -1 ? bXVar.getString(columnIndex6) : null).bg(java.lang.Long.valueOf(bXVar.getLong(columnIndex5)));
                        synchronized (this.bX) {
                            this.eqN.put(string, bgVarBg);
                        }
                    }
                    bXVar.close();
                    return null;
                } while (bXVar.moveToNext());
                bXVar.close();
                return bgVarBg;
            }
        } catch (java.lang.Throwable th) {
            try {
                com.bytedance.sdk.component.utils.PX.bg("UGTmplDbHelper", "getGgenTemplate error", th);
            } finally {
                bXVar.close();
            }
        }
        return null;
    }

    void bg(com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVar) {
        if (bgVar == null || android.text.TextUtils.isEmpty(bgVar.bg())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.bX bXVar = new com.bytedance.sdk.openadsdk.multipro.aidl.bX(com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "ugen_template", null, "id=?", new java.lang.String[]{bgVar.bg()}, null, null, null));
        boolean z = bXVar.getCount() > 0;
        try {
            bXVar.close();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("id", bgVar.bg());
            contentValues.put("md5", bgVar.IL());
            contentValues.put("url", bgVar.bX());
            contentValues.put("data", bgVar.zx());
            contentValues.put("rit", bgVar.ldr());
            contentValues.put("update_time", bgVar.eqN());
            if (z) {
                com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "ugen_template", contentValues, "id=?", new java.lang.String[]{bgVar.bg()});
            } else {
                com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "ugen_template", contentValues);
            }
            synchronized (this.bX) {
                this.eqN.put(bgVar.bg(), bgVar);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    java.util.List<com.bytedance.sdk.openadsdk.core.VB.bg.bg> IL() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.bX bXVar = new com.bytedance.sdk.openadsdk.multipro.aidl.bX(com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "ugen_template", null, null, null, null, null, null));
        try {
            if (bXVar.moveToFirst()) {
                do {
                    int columnIndex = bXVar.getColumnIndex("id");
                    int columnIndex2 = bXVar.getColumnIndex("md5");
                    int columnIndex3 = bXVar.getColumnIndex("url");
                    int columnIndex4 = bXVar.getColumnIndex("data");
                    int columnIndex5 = bXVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = bXVar.getColumnIndex("rit");
                        java.lang.String string = columnIndex6 != -1 ? bXVar.getString(columnIndex6) : null;
                        java.lang.String string2 = bXVar.getString(columnIndex);
                        java.lang.String string3 = bXVar.getString(columnIndex2);
                        java.lang.String string4 = bXVar.getString(columnIndex3);
                        com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVarBg = new com.bytedance.sdk.openadsdk.core.VB.bg.bg().bg(string2).IL(string3).bX(string4).eqN(bXVar.getString(columnIndex4)).zx(string).bg(java.lang.Long.valueOf(bXVar.getLong(columnIndex5)));
                        arrayList.add(bgVarBg);
                        synchronized (this.bX) {
                            this.eqN.put(string2, bgVarBg);
                        }
                    }
                } while (bXVar.moveToNext());
            }
        } catch (java.lang.Throwable th) {
            try {
                com.bytedance.sdk.component.utils.PX.bg("UGTmplDbHelper", "getUgenTemplate error", th);
            } finally {
                bXVar.close();
            }
        }
        return arrayList;
    }

    java.util.Set<com.bytedance.sdk.openadsdk.core.VB.bg.bg> bg(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVar;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.bX bXVar = new com.bytedance.sdk.openadsdk.multipro.aidl.bX(com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "ugen_template", null, "rit=?", new java.lang.String[]{str}, null, null, null));
        try {
            if (bXVar.moveToFirst()) {
                do {
                    int columnIndex = bXVar.getColumnIndex("id");
                    if (columnIndex != -1) {
                        java.lang.String string = bXVar.getString(columnIndex);
                        if (!android.text.TextUtils.isEmpty(string)) {
                            synchronized (this.bX) {
                                bgVar = this.eqN.get(string);
                            }
                            if (bgVar != null) {
                                hashSet.add(bgVar);
                            } else {
                                com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVar2 = new com.bytedance.sdk.openadsdk.core.VB.bg.bg();
                                int columnIndex2 = bXVar.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    java.lang.String string2 = bXVar.getString(columnIndex2);
                                    if (!android.text.TextUtils.isEmpty(string2)) {
                                        bgVar2.eqN(string2);
                                        bgVar2.bg(string);
                                        bgVar2.zx(str);
                                        int columnIndex3 = bXVar.getColumnIndex("md5");
                                        int columnIndex4 = bXVar.getColumnIndex("url");
                                        int columnIndex5 = bXVar.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            bgVar2.IL(bXVar.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            bgVar2.bX(bXVar.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            bgVar2.bg(java.lang.Long.valueOf(bXVar.getLong(columnIndex5)));
                                        }
                                        hashSet.add(bgVar2);
                                        synchronized (this.bX) {
                                            this.eqN.put(string, bgVar2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (bXVar.moveToNext());
            }
        } catch (java.lang.Throwable th) {
            try {
                com.bytedance.sdk.component.utils.PX.bg("UGTmplDbHelper", "getUgenTemplateFormRit error", th);
            } finally {
                bXVar.close();
            }
        }
        return hashSet;
    }

    void bg(java.util.Set<java.lang.String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        java.lang.String[] strArr = (java.lang.String[]) set.toArray(new java.lang.String[set.size()]);
        if (strArr.length > 0) {
            for (java.lang.String str : strArr) {
                IL(str);
                com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "ugen_template", "id=?", new java.lang.String[]{str});
            }
        }
    }

    private void IL(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && this.eqN.size() > 0) {
            synchronized (this.bX) {
                this.eqN.remove(str);
            }
        }
    }
}
