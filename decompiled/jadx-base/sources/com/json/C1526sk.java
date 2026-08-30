package com.json;

/* JADX INFO: renamed from: com.ironsource.sk, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0000\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a$\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\t¨\u0006\u000b"}, d2 = {"Lorg/json/JSONObject;", "lhs", "rhs", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lorg/json/JSONArray;", "", "depth", "", "I", "DEPTH_LIMIT", "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class C1526sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f3411a = 100;

    private static final boolean a(java.lang.Object obj, java.lang.Object obj2, int i) {
        if ((obj instanceof org.json.JSONObject) && (obj2 instanceof org.json.JSONObject)) {
            return a((org.json.JSONObject) obj, (org.json.JSONObject) obj2, i + 1);
        }
        if ((obj instanceof org.json.JSONArray) && (obj2 instanceof org.json.JSONArray)) {
            return a((org.json.JSONArray) obj, (org.json.JSONArray) obj2, i + 1);
        }
        if ((obj instanceof java.lang.Number) && (obj2 instanceof java.lang.Number)) {
            return ((java.lang.Number) obj).doubleValue() == ((java.lang.Number) obj2).doubleValue();
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
    }

    public static final boolean a(org.json.JSONArray lhs, org.json.JSONArray rhs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lhs, "lhs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    private static final boolean a(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, int i) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() != jSONArray2.length() || i > 100) {
            return false;
        }
        java.lang.Iterable iterableUntil = kotlin.ranges.RangesKt.until(0, jSONArray.length());
        if ((iterableUntil instanceof java.util.Collection) && ((java.util.Collection) iterableUntil).isEmpty()) {
            return true;
        }
        java.util.Iterator it = iterableUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it).nextInt();
            if (!a(jSONArray.get(iNextInt), jSONArray2.get(iNextInt), i)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean a(org.json.JSONObject lhs, org.json.JSONObject rhs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lhs, "lhs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    private static final boolean a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i > 100) {
            return false;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(itKeys, "lhs.keys()");
        for (java.lang.String str : kotlin.sequences.SequencesKt.asSequence(itKeys)) {
            if (!(jSONObject2.has(str) && a(jSONObject.get(str), jSONObject2.get(str), i))) {
                return false;
            }
        }
        return true;
    }
}
