package com.bytedance.sdk.openadsdk.tool;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    public static java.lang.String bg(java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list) {
        if (list == null) {
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.bytedance.sdk.openadsdk.FilterWord> it = list.iterator();
        while (it.hasNext()) {
            org.json.JSONObject jSONObjectBg = bg(it.next());
            if (jSONObjectBg != null) {
                jSONArray.put(jSONObjectBg);
            }
        }
        return jSONArray.toString();
    }

    public static java.util.List<com.bytedance.sdk.openadsdk.FilterWord> bg(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                com.bytedance.sdk.openadsdk.FilterWord filterWordBg = bg(jSONArray.optJSONObject(i));
                if (filterWordBg != null && filterWordBg.isValid()) {
                    arrayList.add(filterWordBg);
                }
            }
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("MaterialMetaTools", e.getMessage());
        }
        return arrayList;
    }

    private static com.bytedance.sdk.openadsdk.FilterWord bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.FilterWord filterWord = new com.bytedance.sdk.openadsdk.FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    com.bytedance.sdk.openadsdk.FilterWord filterWordBg = bg(jSONArrayOptJSONArray.optJSONObject(i));
                    if (filterWordBg != null && filterWordBg.isValid()) {
                        filterWord.addOption(filterWordBg);
                    }
                }
            }
            return filterWord;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static org.json.JSONObject bg(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator<com.bytedance.sdk.openadsdk.FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(bg(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }
}
