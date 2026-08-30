package com.bytedance.sdk.component.bg;

/* JADX INFO: loaded from: classes3.dex */
class Kg {
    private com.bytedance.sdk.component.bg.PX bg;

    static com.bytedance.sdk.component.bg.Kg bg(com.bytedance.sdk.component.bg.PX px) {
        return new com.bytedance.sdk.component.bg.Kg(px);
    }

    private Kg(com.bytedance.sdk.component.bg.PX px) {
        this.bg = px;
    }

    <T> T bg(java.lang.String str, java.lang.reflect.Type type) throws org.json.JSONException {
        bg(str);
        if (type.equals(org.json.JSONObject.class) || ((type instanceof java.lang.Class) && org.json.JSONObject.class.isAssignableFrom((java.lang.Class) type))) {
            return (T) new org.json.JSONObject(str);
        }
        return (T) this.bg.bg(str, type);
    }

    <T> java.lang.String bg(T t) {
        java.lang.String string;
        if (t == null) {
            return com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
        }
        if ((t instanceof org.json.JSONObject) || (t instanceof org.json.JSONArray)) {
            string = t.toString();
        } else {
            string = this.bg.bg(t);
        }
        bg(string);
        return string;
    }

    private static void bg(java.lang.String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        com.bytedance.sdk.component.bg.WR.bg(new java.lang.IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(java.lang.String.valueOf(str))));
    }
}
