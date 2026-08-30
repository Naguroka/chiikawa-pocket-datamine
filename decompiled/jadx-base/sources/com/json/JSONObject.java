package com.json;

/* JADX INFO: renamed from: com.ironsource.nh, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0004"}, d2 = {"Lorg/json/JSONObject;", "", com.ironsource.y8.h.W, "b", "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class JSONObject {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String b(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.String strOptString = jSONObject.optString(str);
        if (strOptString.length() == 0) {
            return null;
        }
        return strOptString;
    }
}
