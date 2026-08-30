package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.IL> bg = new java.util.concurrent.ConcurrentHashMap<>();

    public static void bg(boolean z) {
        java.lang.String strBg;
        java.io.File fileIL = IL();
        if (!fileIL.exists()) {
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                strBg = com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL("tt_sdk_settings", "ad_slot_conf", null);
            } else {
                strBg = com.bytedance.sdk.openadsdk.utils.aGH.bg("tt_sdk_settings", com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg("ad_slot_conf", (java.lang.String) null);
            }
            if (android.text.TextUtils.isEmpty(strBg)) {
                return;
            }
            try {
                java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.IL> mapIL = IL(new org.json.JSONArray(strBg));
                if (mapIL.isEmpty()) {
                    return;
                }
                java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.IL> concurrentHashMap = bg;
                concurrentHashMap.clear();
                concurrentHashMap.putAll(mapIL);
                return;
            } catch (java.lang.Exception unused) {
                return;
            }
        }
        try {
            java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.IL> mapIL2 = IL(new org.json.JSONArray(new java.lang.String(com.bytedance.sdk.component.utils.ldr.eqN(fileIL))));
            if (mapIL2.isEmpty()) {
                return;
            }
            for (java.util.Map.Entry<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.IL> entry : mapIL2.entrySet()) {
                java.lang.String key = entry.getKey();
                com.bytedance.sdk.openadsdk.core.settings.IL value = entry.getValue();
                if (value.ayS && !z) {
                    com.bytedance.sdk.openadsdk.core.settings.IL il = bg.get(key);
                    if (il != null) {
                        il.bN = value.Dxa;
                    }
                } else {
                    bg.put(key, value);
                }
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    private static java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.IL> IL(org.json.JSONArray jSONArray) {
        java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.IL> map = new java.util.HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                com.bytedance.sdk.openadsdk.core.settings.IL ilBg = bg(jSONArray.getJSONObject(i));
                if (ilBg != null) {
                    map.put(ilBg.bg, ilBg);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return map;
    }

    private static java.io.File IL() {
        return new java.io.File(com.bytedance.sdk.openadsdk.core.VzQ.bg().getFilesDir(), "tt_ads_conf");
    }

    private static com.bytedance.sdk.openadsdk.core.settings.IL bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.settings.IL(jSONObject);
    }

    public static com.bytedance.sdk.openadsdk.core.settings.IL bg(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.settings.IL il = bg.get(str);
        return il == null ? IL(str) : il;
    }

    private static com.bytedance.sdk.openadsdk.core.settings.IL IL(java.lang.String str) {
        return new com.bytedance.sdk.openadsdk.core.settings.IL(str, 1);
    }

    public static void bg(org.json.JSONArray jSONArray) throws java.lang.Throwable {
        if (jSONArray == null) {
            return;
        }
        java.io.File fileIL = IL();
        java.io.File file = new java.io.File(fileIL.getParent(), fileIL.getName() + ".tmp");
        java.io.FileWriter fileWriter = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                java.io.FileWriter fileWriter2 = new java.io.FileWriter(file);
                try {
                    fileWriter2.write(jSONArray.toString());
                    file.renameTo(fileIL);
                    com.bytedance.sdk.openadsdk.utils.aGH.bg("tt_sdk_settings", com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg("ad_slot_conf");
                    if (file.exists()) {
                        file.delete();
                    }
                    com.bytedance.sdk.openadsdk.utils.eo.bg(fileWriter2);
                } catch (java.lang.Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    android.util.Log.e("SdkSettings.AdSlot", "saveAdSlotToLocal: ", e);
                    if (file.exists()) {
                        file.delete();
                    }
                    com.bytedance.sdk.openadsdk.utils.eo.bg(fileWriter);
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    if (file.exists()) {
                        file.delete();
                    }
                    com.bytedance.sdk.openadsdk.utils.eo.bg(fileWriter);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
        java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.IL> mapIL = IL(jSONArray);
        if (mapIL.isEmpty()) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.IL> entry : mapIL.entrySet()) {
            java.lang.String key = entry.getKey();
            com.bytedance.sdk.openadsdk.core.settings.IL value = entry.getValue();
            if (value.ayS) {
                com.bytedance.sdk.openadsdk.core.settings.IL il = bg.get(key);
                if (il != null) {
                    il.bN = value.Dxa;
                }
            } else {
                bg.put(key, value);
            }
        }
    }

    public static void bg() {
        java.io.File fileIL = IL();
        if (fileIL.exists()) {
            fileIL.delete();
        }
    }
}
