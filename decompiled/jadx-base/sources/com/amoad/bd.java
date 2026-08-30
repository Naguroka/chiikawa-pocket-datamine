package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.String f271a;
    final long b;

    /* JADX INFO: renamed from: com.amoad.bd$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f272a;

        static {
            int[] iArr = new int[com.amoad.bd.a.values().length];
            f272a = iArr;
            try {
                iArr[com.amoad.bd.a.MilliSeconds.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f272a[com.amoad.bd.a.Percents.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    enum a {
        MilliSeconds(1),
        Percents(2);

        private final int c;

        a(int i) {
            this.c = i;
        }

        static com.amoad.bd.a a(int i) {
            for (com.amoad.bd.a aVar : values()) {
                if (aVar.c == i) {
                    return aVar;
                }
            }
            throw new java.lang.IllegalArgumentException();
        }
    }

    bd(java.lang.String str, long j) {
        this.f271a = str;
        this.b = j;
    }

    private static long a(long j, long j2, com.amoad.bd.a aVar) {
        int i = com.amoad.bd.AnonymousClass1.f272a[aVar.ordinal()];
        if (i == 1) {
            return j2;
        }
        if (i == 2) {
            return (j * j2) / 100;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static java.util.List<com.amoad.bd> a(org.json.JSONObject jSONObject, long j) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!jSONObject.isNull(androidx.media3.extractor.text.ttml.TtmlNode.START)) {
            arrayList.add(new com.amoad.bd(jSONObject.getString(androidx.media3.extractor.text.ttml.TtmlNode.START), a(j, 0L, com.amoad.bd.a.Percents)));
        }
        if (!jSONObject.isNull("firstQuartile")) {
            arrayList.add(new com.amoad.bd(jSONObject.getString("firstQuartile"), a(j, 25L, com.amoad.bd.a.Percents)));
        }
        if (!jSONObject.isNull("midpoint")) {
            arrayList.add(new com.amoad.bd(jSONObject.getString("midpoint"), a(j, 50L, com.amoad.bd.a.Percents)));
        }
        if (!jSONObject.isNull("thirdQuartile")) {
            arrayList.add(new com.amoad.bd(jSONObject.getString("thirdQuartile"), a(j, 75L, com.amoad.bd.a.Percents)));
        }
        if (!jSONObject.isNull("complete")) {
            arrayList.add(new com.amoad.bd(jSONObject.getString("complete"), a(j, 100L, com.amoad.bd.a.Percents)));
        }
        if (jSONObject.optJSONArray("progress") != null) {
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("progress");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                org.json.JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (!jSONObject2.optString("url").isEmpty() && !jSONObject2.isNull(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET) && !jSONObject2.isNull("offsetType")) {
                    arrayList.add(new com.amoad.bd(jSONObject2.getString("url"), a(j, jSONObject2.getLong(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET), com.amoad.bd.a.a(jSONObject2.getInt("offsetType")))));
                }
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
