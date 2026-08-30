package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public interface zx {
    public static final com.bytedance.sdk.openadsdk.core.settings.zx.IL<org.json.JSONObject> bg = new com.bytedance.sdk.openadsdk.core.settings.zx.IL<org.json.JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.zx.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.zx.IL
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public org.json.JSONObject IL(java.lang.String str) {
            try {
                return new org.json.JSONObject(str);
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("ISettingsDataRepository", "", e);
                return null;
            }
        }
    };
    public static final com.bytedance.sdk.openadsdk.core.settings.zx.IL<java.util.Set<java.lang.String>> IL = new com.bytedance.sdk.openadsdk.core.settings.zx.IL<java.util.Set<java.lang.String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.zx.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.zx.IL
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public java.util.Set<java.lang.String> IL(java.lang.String str) {
            java.util.HashSet hashSet = new java.util.HashSet();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("ISettingsDataRepository", "", e);
            }
            return hashSet;
        }
    };

    public interface IL<T> {
        T IL(java.lang.String str);
    }

    public interface bg {
        com.bytedance.sdk.openadsdk.core.settings.zx.bg bg(java.lang.String str);

        com.bytedance.sdk.openadsdk.core.settings.zx.bg bg(java.lang.String str, float f);

        com.bytedance.sdk.openadsdk.core.settings.zx.bg bg(java.lang.String str, int i);

        com.bytedance.sdk.openadsdk.core.settings.zx.bg bg(java.lang.String str, long j);

        com.bytedance.sdk.openadsdk.core.settings.zx.bg bg(java.lang.String str, java.lang.String str2);

        com.bytedance.sdk.openadsdk.core.settings.zx.bg bg(java.lang.String str, boolean z);

        void bg();
    }

    void bg(org.json.JSONObject jSONObject);
}
