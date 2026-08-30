package com.bytedance.sdk.component.bg;

/* JADX INFO: loaded from: classes3.dex */
public final class Lq {
    private final java.util.Map<java.lang.String, java.lang.Object> bg = new java.util.concurrent.ConcurrentHashMap();

    public static com.bytedance.sdk.component.bg.Lq bg() {
        return new com.bytedance.sdk.component.bg.Lq();
    }

    private Lq() {
    }

    public com.bytedance.sdk.component.bg.Lq bg(java.lang.String str, java.lang.Object obj) {
        if (!android.text.TextUtils.isEmpty(str) && obj != null) {
            this.bg.put(str, obj);
        }
        return this;
    }

    public java.lang.String IL() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.bg.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (org.json.JSONException unused) {
            return "";
        }
    }
}
