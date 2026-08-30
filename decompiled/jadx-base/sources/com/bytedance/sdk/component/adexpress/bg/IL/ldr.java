package com.bytedance.sdk.component.adexpress.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class ldr {
    private static volatile com.bytedance.sdk.component.adexpress.bg.IL.ldr IL = null;
    public static int bg = 20;
    private volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bX> zx;
    private final java.lang.Object eqN = new java.lang.Object();
    private java.util.concurrent.atomic.AtomicBoolean ldr = new java.util.concurrent.atomic.AtomicBoolean(false);
    private android.util.LruCache<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.IL> iR = new android.util.LruCache<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.IL>(bg) { // from class: com.bytedance.sdk.component.adexpress.bg.IL.ldr.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public int sizeOf(java.lang.String str, com.bytedance.sdk.component.adexpress.bg.bX.IL il) {
            return 1;
        }
    };
    private java.util.Set<java.lang.String> bX = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public static java.lang.String bX() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    public static void bg(int i) {
        bg = i;
    }

    public static com.bytedance.sdk.component.adexpress.bg.IL.ldr bg() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.component.adexpress.bg.IL.ldr.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.component.adexpress.bg.IL.ldr();
                }
            }
        }
        return IL;
    }

    private ldr() {
    }

    com.bytedance.sdk.component.adexpress.bg.bX.IL bg(java.lang.String str) {
        com.bytedance.sdk.component.adexpress.bg.bX.IL il;
        com.bytedance.sdk.component.adexpress.bg.bX.IL ilBg;
        if (android.text.TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().IL() == null) {
            return null;
        }
        synchronized (this.eqN) {
            il = this.iR.get(java.lang.String.valueOf(str));
        }
        if (il != null) {
            return il;
        }
        android.database.Cursor cursorBg = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().IL().bg("template_diff_new", null, "id=?", new java.lang.String[]{str}, null, null, null);
        if (cursorBg != null) {
            try {
                if (cursorBg.moveToFirst()) {
                    do {
                        java.lang.String string = cursorBg.getString(cursorBg.getColumnIndex("rit"));
                        java.lang.String string2 = cursorBg.getString(cursorBg.getColumnIndex("id"));
                        java.lang.String string3 = cursorBg.getString(cursorBg.getColumnIndex("md5"));
                        java.lang.String string4 = cursorBg.getString(cursorBg.getColumnIndex("url"));
                        java.lang.String string5 = cursorBg.getString(cursorBg.getColumnIndex("data"));
                        ilBg = new com.bytedance.sdk.component.adexpress.bg.bX.IL().bg(string).IL(string2).bX(string3).eqN(string4).zx(string5).ldr(cursorBg.getString(cursorBg.getColumnIndex("version"))).bg(java.lang.Long.valueOf(cursorBg.getLong(cursorBg.getColumnIndex("update_time"))));
                        synchronized (this.eqN) {
                            this.iR.put(string2, ilBg);
                        }
                        this.bX.add(string2);
                    } while (cursorBg.moveToNext());
                    cursorBg.close();
                    return ilBg;
                }
            } catch (java.lang.Throwable th) {
                try {
                    com.bytedance.sdk.component.utils.PX.bg("TmplDbHelper", "getTemplate error", th);
                } finally {
                    cursorBg.close();
                }
            }
        }
        return null;
    }

    java.util.Set<java.lang.String> IL(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().IL() != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            android.database.Cursor cursorBg = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().IL().bg("template_diff_new", null, "rit=?", new java.lang.String[]{str}, null, null, null);
            try {
                if (cursorBg != null) {
                    try {
                        if (cursorBg.moveToFirst()) {
                            do {
                                hashSet.add(cursorBg.getString(cursorBg.getColumnIndex("id")));
                            } while (cursorBg.moveToNext());
                            return hashSet;
                        }
                    } catch (java.lang.Exception e) {
                        android.util.Log.e("TmplDbHelper", "", e);
                    }
                }
            } finally {
                cursorBg.close();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00f0 A[DONT_GENERATE] */
    java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.IL> IL() {
        if (com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().IL() == null) {
            return null;
        }
        boolean z = this.ldr.get();
        this.ldr.set(true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursorBg = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().IL().bg("template_diff_new", null, null, null, null, null, null);
        if (cursorBg != null) {
            while (cursorBg.moveToNext()) {
                try {
                    java.lang.String string = cursorBg.getString(cursorBg.getColumnIndex("rit"));
                    java.lang.String string2 = cursorBg.getString(cursorBg.getColumnIndex("id"));
                    java.lang.String string3 = cursorBg.getString(cursorBg.getColumnIndex("md5"));
                    java.lang.String string4 = cursorBg.getString(cursorBg.getColumnIndex("url"));
                    java.lang.String string5 = cursorBg.getString(cursorBg.getColumnIndex("data"));
                    java.lang.String string6 = cursorBg.getString(cursorBg.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.bg.bX.IL().bg(string).IL(string2).bX(string3).eqN(string4).zx(string5).ldr(string6).bg(java.lang.Long.valueOf(cursorBg.getLong(cursorBg.getColumnIndex("update_time")))));
                    synchronized (this.eqN) {
                        this.iR.put(string2, (com.bytedance.sdk.component.adexpress.bg.bX.IL) arrayList.get(arrayList.size() - 1));
                    }
                    this.bX.add(string2);
                    if (!z && com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().ldr() != null) {
                        if (this.zx == null) {
                            this.zx = new java.util.concurrent.ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.zx.contains(string2)) {
                            this.zx.put(string2, new com.bytedance.sdk.component.adexpress.bg.bX.bX(string, string2, string3));
                        }
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        com.bytedance.sdk.component.utils.PX.bg("TmplDbHelper", "getTemplate error", th);
                    } finally {
                        if (cursorBg != null) {
                            cursorBg.close();
                        }
                    }
                }
            }
            if (cursorBg != null) {
            }
        }
        return arrayList;
    }

    void bg(com.bytedance.sdk.component.adexpress.bg.bX.IL il, boolean z) {
        if (il == null || com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().IL() == null || android.text.TextUtils.isEmpty(il.IL())) {
            return;
        }
        android.database.Cursor cursorBg = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().IL().bg("template_diff_new", null, "id=?", new java.lang.String[]{il.IL()}, null, null, null);
        boolean z2 = cursorBg != null && cursorBg.getCount() > 0;
        java.lang.String string = null;
        if (cursorBg != null) {
            try {
                string = cursorBg.moveToFirst() ? cursorBg.getString(cursorBg.getColumnIndex("rit")) : null;
                cursorBg.close();
            } catch (java.lang.Throwable unused) {
            }
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("rit", il.bg());
        contentValues.put("id", il.IL());
        contentValues.put("md5", il.bX());
        contentValues.put("url", il.eqN());
        contentValues.put("data", il.zx());
        contentValues.put("version", il.ldr());
        contentValues.put("update_time", il.iR());
        if (z2) {
            com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().IL().bg("template_diff_new", contentValues, "id=?", new java.lang.String[]{il.IL()});
        } else {
            com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().IL().bg("template_diff_new", contentValues);
        }
        synchronized (this.eqN) {
            this.iR.put(il.IL(), il);
        }
        this.bX.add(il.IL());
        if (z) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().ldr() == null) {
                return;
            }
            if (this.zx == null) {
                this.zx = new java.util.concurrent.ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.bg.bX.bX bXVar = new com.bytedance.sdk.component.adexpress.bg.bX.bX(il.bg(), il.IL(), il.bX());
            this.zx.put(il.IL(), bXVar);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().ldr();
                bXVar.IL();
            }
            com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().ldr();
            il.bg();
        } catch (java.lang.Throwable unused2) {
        }
    }

    void bg(java.util.Set<java.lang.String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().IL() == null) {
            return;
        }
        java.lang.String[] strArr = (java.lang.String[]) set.toArray(new java.lang.String[set.size()]);
        if (strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                eqN(strArr[i]);
                com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().IL().bg("template_diff_new", "id=?", new java.lang.String[]{strArr[i]});
                bX(strArr[i]);
            }
        }
    }

    void bX(java.lang.String str) {
        com.bytedance.sdk.component.adexpress.bg.bX.bX bXVar;
        try {
            if (this.zx == null || this.zx.isEmpty() || (bXVar = this.zx.get(str)) == null) {
                return;
            }
            if (!android.text.TextUtils.isEmpty(bXVar.bg()) && com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().ldr() != null) {
                com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().ldr();
            }
            this.zx.remove(str);
        } catch (java.lang.Throwable unused) {
        }
    }

    private void eqN(java.lang.String str) {
        android.util.LruCache<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.IL> lruCache;
        if (android.text.TextUtils.isEmpty(str) || (lruCache = this.iR) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.eqN) {
            this.iR.remove(str);
        }
    }
}
