package com.bytedance.sdk.openadsdk.multipro.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> IL = new java.util.concurrent.ConcurrentHashMap<>();
    public static com.bytedance.sdk.component.ldr.bg.ldr bg;

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x000f A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    public static com.bytedance.sdk.component.ldr.bg.ldr bg(android.content.Context context) {
        if (context == null) {
            try {
                com.bytedance.sdk.openadsdk.core.VzQ.bg();
                if (bg == null) {
                    if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                        bg = com.bytedance.sdk.openadsdk.multipro.aidl.bg.ldr.bg(com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg().bg(5));
                    } else {
                        bg = com.bytedance.sdk.openadsdk.multipro.aidl.bg.ldr.IL();
                    }
                }
            } catch (java.lang.Throwable unused) {
                com.bytedance.sdk.openadsdk.utils.ayS.Kg("binder error");
            }
        } else if (bg == null) {
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                bg = com.bytedance.sdk.openadsdk.multipro.aidl.bg.ldr.bg(com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg().bg(5));
            } else {
                bg = com.bytedance.sdk.openadsdk.multipro.aidl.bg.ldr.IL();
            }
        }
        return bg;
    }

    private static java.lang.String bg() {
        return com.bytedance.sdk.openadsdk.multipro.eqN.IL + "/t_db/ttopensdk.db/";
    }

    public static void bg(android.content.Context context, java.lang.String str, android.content.ContentValues contentValues) {
        if (contentValues == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (bg(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                        com.bytedance.sdk.openadsdk.core.zx.bg(context).bg().bg(str, (java.lang.String) null, contentValues);
                        return;
                    }
                    com.bytedance.sdk.component.ldr.bg.ldr ldrVarBg = bg(context);
                    if (ldrVarBg != null) {
                        ldrVarBg.bg(android.net.Uri.parse(bg() + str), contentValues);
                    }
                } catch (java.lang.Throwable unused) {
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static int bg(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (bg(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                        return com.bytedance.sdk.openadsdk.core.zx.bg(context).bg().bg(str, str2, strArr);
                    }
                    com.bytedance.sdk.component.ldr.bg.ldr ldrVarBg = bg(context);
                    if (ldrVarBg != null) {
                        return ldrVarBg.bg(android.net.Uri.parse(bg() + str), str2, strArr);
                    }
                    return 0;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static int bg(android.content.Context context, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        if (contentValues != null && !android.text.TextUtils.isEmpty(str)) {
            synchronized (bg(str)) {
                try {
                    try {
                        if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                            return com.bytedance.sdk.openadsdk.core.zx.bg(context).bg().bg(str, contentValues, str2, strArr);
                        }
                        com.bytedance.sdk.component.ldr.bg.ldr ldrVarBg = bg(context);
                        if (ldrVarBg != null) {
                            return ldrVarBg.bg(android.net.Uri.parse(bg() + str), contentValues, str2, strArr);
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        return 0;
    }

    public static java.util.Map<java.lang.String, java.util.List<java.lang.String>> bg(android.content.Context context, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (bg(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                        return bg(com.bytedance.sdk.openadsdk.core.zx.bg(context).bg().bg(str, strArr, str2, strArr2, str3, str4, str5));
                    }
                    com.bytedance.sdk.component.ldr.bg.ldr ldrVarBg = bg(context);
                    if (ldrVarBg != null) {
                        return ldrVarBg.bg(android.net.Uri.parse(bg() + str), strArr, str2, strArr2, str5);
                    }
                    return null;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    public static java.util.Map<java.lang.String, java.util.List<java.lang.String>> bg(android.database.Cursor cursor) {
        java.util.HashMap map = new java.util.HashMap();
        if (cursor != null) {
            try {
                java.lang.String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (java.lang.String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new java.util.LinkedList());
                        }
                        ((java.util.List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (java.lang.Throwable unused) {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return map;
    }

    private static java.lang.Object bg(java.lang.String str) {
        java.lang.Object obj;
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> concurrentHashMap = IL;
        java.lang.Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (com.bytedance.sdk.openadsdk.multipro.bg.bg.class) {
            obj = concurrentHashMap.get(str);
            if (obj == null) {
                obj = new java.lang.Object();
                concurrentHashMap.put(str, obj);
            }
        }
        return obj;
    }
}
