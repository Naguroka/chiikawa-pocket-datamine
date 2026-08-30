package com.bykv.vk.openvk.bg.bg.IL.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    private static volatile com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX IL;
    private final com.bykv.vk.openvk.bg.bg.IL.IL.IL.eqN bX;
    private final android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg>> bg;
    private final java.util.concurrent.Executor eqN;
    private volatile android.database.sqlite.SQLiteStatement zx;

    private bX(android.content.Context context) {
        android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg>> sparseArray = new android.util.SparseArray<>(2);
        this.bg = sparseArray;
        this.eqN = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque(), new com.bytedance.sdk.component.Kg.WR(5, "video_proxy_db"));
        this.bX = new com.bykv.vk.openvk.bg.bg.IL.IL.IL.eqN(context.getApplicationContext());
        sparseArray.put(0, new java.util.concurrent.ConcurrentHashMap());
        sparseArray.put(1, new java.util.concurrent.ConcurrentHashMap());
    }

    public static com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX bg(android.content.Context context) {
        if (IL == null) {
            synchronized (com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.class) {
                if (IL == null) {
                    IL = new com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX(context);
                }
            }
        }
        return IL;
    }

    public com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bg(java.lang.String str, int i) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.Map<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg> map = this.bg.get(i);
        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVar = map == null ? null : map.get(str);
        if (bgVar != null) {
            return bgVar;
        }
        try {
            android.database.Cursor cursorQuery = this.bX.getReadableDatabase().query("video_http_header_t", null, "key=? AND flag=?", new java.lang.String[]{str, java.lang.String.valueOf(i)}, null, null, null, "1");
            if (cursorQuery != null) {
                if (cursorQuery.getCount() > 0 && cursorQuery.moveToNext()) {
                    bgVar = new com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg(cursorQuery.getString(cursorQuery.getColumnIndex(com.ironsource.y8.h.W)), cursorQuery.getString(cursorQuery.getColumnIndex("mime")), cursorQuery.getInt(cursorQuery.getColumnIndex("contentLength")), i, cursorQuery.getString(cursorQuery.getColumnIndex("extra")));
                }
                cursorQuery.close();
            }
            if (bgVar != null && map != null) {
                map.put(str, bgVar);
            }
            return bgVar;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public void bg(final com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVar) {
        if (bgVar != null) {
            java.util.Map<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg> map = this.bg.get(bgVar.eqN);
            if (map != null) {
                map.put(bgVar.bg, bgVar);
            }
            this.eqN.execute(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.this.zx != null) {
                            com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.this.zx.clearBindings();
                        } else {
                            com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX bXVar = com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.this;
                            bXVar.zx = bXVar.bX.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                        }
                        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.this.zx.bindString(1, bgVar.bg);
                        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.this.zx.bindString(2, bgVar.IL);
                        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.this.zx.bindLong(3, bgVar.bX);
                        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.this.zx.bindLong(4, bgVar.eqN);
                        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.this.zx.bindString(5, bgVar.zx);
                        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.this.zx.executeInsert();
                    } catch (java.lang.Throwable unused) {
                    }
                }
            });
        }
    }

    public void bg(java.util.Collection<java.lang.String> collection, int i) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        int size = collection.size() + 1;
        java.lang.String[] strArr = new java.lang.String[size];
        java.util.Map<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg> map = this.bg.get(i);
        int i2 = -1;
        for (java.lang.String str : collection) {
            if (map != null) {
                map.remove(str);
            }
            i2++;
            strArr[i2] = str;
        }
        strArr[i2 + 1] = java.lang.String.valueOf(i);
        try {
            this.bX.getWritableDatabase().delete("video_http_header_t", "key IN(" + IL(size) + ") AND flag=?", strArr);
        } catch (java.lang.Throwable unused) {
        }
    }

    private java.lang.String IL(int i) {
        if (i <= 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i << 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    public void bg(final int i) {
        java.util.Map<java.lang.String, com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg> map = this.bg.get(i);
        if (map != null) {
            map.clear();
        }
        this.eqN.execute(new java.lang.Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.this.bX.getWritableDatabase().delete("video_http_header_t", "flag=?", new java.lang.String[]{java.lang.String.valueOf(i)});
                } catch (java.lang.Throwable unused) {
                }
            }
        });
    }
}
