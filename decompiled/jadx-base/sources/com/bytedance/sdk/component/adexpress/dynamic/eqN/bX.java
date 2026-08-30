package com.bytedance.sdk.component.adexpress.dynamic.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    private org.json.JSONObject IL;
    private java.util.HashMap<java.lang.String, java.lang.Object> bg = new java.util.HashMap<>();

    public bX(org.json.JSONObject jSONObject) {
        this.IL = jSONObject;
    }

    public java.lang.Object bg(java.lang.String str) {
        if (this.bg.containsKey(str)) {
            return this.bg.get(str);
        }
        return null;
    }

    public boolean IL(java.lang.String str) {
        return this.bg.containsKey(str);
    }

    public void bg() {
        java.util.Iterator<java.lang.String> itKeys = this.IL.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.Object objOpt = this.IL.opt(next);
            int i = 0;
            if (android.text.TextUtils.equals("image", next)) {
                if (objOpt instanceof org.json.JSONArray) {
                    while (true) {
                        org.json.JSONArray jSONArray = (org.json.JSONArray) objOpt;
                        if (i < jSONArray.length()) {
                            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject != null) {
                                java.util.Iterator<java.lang.String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    java.lang.String next2 = itKeys2.next();
                                    this.bg.put(next + "." + i + "." + next2, jSONObjectOptJSONObject.opt(next2));
                                }
                            }
                            i++;
                        }
                    }
                }
            } else if (android.text.TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof java.lang.String) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) objOpt);
                        java.util.Iterator<java.lang.String> itKeys3 = jSONObject.keys();
                        while (itKeys3.hasNext()) {
                            java.lang.String next3 = itKeys3.next();
                            java.lang.Object objOpt2 = jSONObject.opt(next3);
                            if ((objOpt2 instanceof org.json.JSONArray) && !android.text.TextUtils.equals(next3, "short_phrase") && !android.text.TextUtils.equals(next3, "long_phrase")) {
                                for (int i2 = 0; i2 < ((org.json.JSONArray) objOpt2).length(); i2++) {
                                    this.bg.put(next + "." + next3 + "." + i2, ((org.json.JSONArray) objOpt2).opt(i2));
                                }
                            } else if ((objOpt2 instanceof org.json.JSONObject) && android.text.TextUtils.equals(next3, com.google.firebase.analytics.FirebaseAnalytics.Param.COUPON)) {
                                java.util.Iterator<java.lang.String> itKeys4 = ((org.json.JSONObject) objOpt2).keys();
                                while (itKeys4.hasNext()) {
                                    java.lang.String next4 = itKeys4.next();
                                    this.bg.put(next + "." + next3 + "." + next4, ((org.json.JSONObject) objOpt2).opt(next4));
                                }
                            } else if ((objOpt2 instanceof org.json.JSONObject) && android.text.TextUtils.equals(next3, "live_room_data")) {
                                bg(next, next3, objOpt2);
                            } else {
                                this.bg.put(next + "." + next3, objOpt2);
                            }
                        }
                    } catch (org.json.JSONException unused) {
                    }
                }
            } else if (!(objOpt instanceof org.json.JSONObject)) {
                this.bg.put(next, objOpt);
                if (objOpt instanceof java.lang.String) {
                    this.bg.put(next, objOpt);
                }
            } else if (objOpt != null) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) objOpt;
                java.util.Iterator<java.lang.String> itKeys5 = jSONObject2.keys();
                while (itKeys5.hasNext()) {
                    java.lang.String next5 = itKeys5.next();
                    this.bg.put(next + "." + next5, jSONObject2.opt(next5));
                }
            }
        }
    }

    private void bg(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof org.json.JSONArray) && android.text.TextUtils.equals(next, "product_infos")) {
                int i = 0;
                while (true) {
                    org.json.JSONArray jSONArray = (org.json.JSONArray) objOpt;
                    if (i < jSONArray.length()) {
                        org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        java.util.Iterator<java.lang.String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            java.lang.String next2 = itKeys2.next();
                            this.bg.put(str + "." + str2 + "." + next + "." + i + "." + next2, jSONObjectOptJSONObject.opt(next2));
                        }
                        i++;
                    }
                }
            } else {
                this.bg.put(str + "." + str2 + "." + next, objOpt);
            }
        }
    }
}
