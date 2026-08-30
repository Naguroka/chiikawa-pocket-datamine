package com.unity3d.ads.core.extensions;

/* JADX INFO: compiled from: JSONObjectExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"toBuiltInMap", "", "", "", "Lorg/json/JSONObject;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JSONObjectExtensionsKt {
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    public static final java.util.Map<java.lang.String, java.lang.Object> toBuiltInMap(org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(itKeys, "keys()");
        kotlin.sequences.Sequence sequenceAsSequence = kotlin.sequences.SequencesKt.asSequence(itKeys);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : sequenceAsSequence) {
            java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
            java.lang.Object objOpt = jSONObject.opt((java.lang.String) obj);
            if (objOpt != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objOpt, "opt(value)");
                if (!((kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.valueOf(objOpt), com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN) || kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.valueOf(objOpt), "null")) ? false : true)) {
                    objOpt = null;
                }
            } else {
                objOpt = null;
            }
            linkedHashMap2.put(obj, objOpt);
        }
        return linkedHashMap;
    }
}
