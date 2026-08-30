package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0006\u0010\u0007\u001a\u00020\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/ironsource/w;", "Lcom/ironsource/bt;", "Lorg/json/JSONObject;", "Lcom/ironsource/zs;", "Lcom/ironsource/u;", "historyEvent", "", "b", "record", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/at;", com.ironsource.y8.a.t, "", "", "", "Lcom/ironsource/e2;", "Ljava/util/Map;", "adUnitsHistory", "", "I", "_currentlyLoadedAds", "()I", "currentlyLoadedAds", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class w implements com.json.bt<org.json.JSONObject>, com.json.zs<com.json.u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.Map<java.lang.String, com.json.e2> adUnitsHistory = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int _currentlyLoadedAds;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3521a;

        static {
            int[] iArr = new int[com.json.ys.values().length];
            try {
                iArr[com.json.ys.LoadRequest.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.json.ys.LoadSuccess.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.json.ys.ShowSuccess.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.json.ys.ShowFailed.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.json.ys.Destroyed.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            f3521a = iArr;
        }
    }

    private final void b(com.json.u historyEvent) {
        int i;
        int i2;
        int i3 = com.ironsource.w.a.f3521a[historyEvent.getRecordType().ordinal()];
        if (i3 == 2) {
            i = this._currentlyLoadedAds + 1;
        } else if ((i3 != 3 && i3 != 4 && i3 != 5) || (i2 = this._currentlyLoadedAds) <= 0) {
            return;
        } else {
            i = i2 - 1;
        }
        this._currentlyLoadedAds = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int get_currentlyLoadedAds() {
        return this._currentlyLoadedAds;
    }

    @Override // com.json.zs
    public void a(com.json.u record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "record");
        java.lang.String adUnitId = record.getAdUnitId();
        java.util.Map<java.lang.String, com.json.e2> map = this.adUnitsHistory;
        com.json.e2 e2Var = map.get(adUnitId);
        if (e2Var == null) {
            e2Var = new com.json.e2();
            map.put(adUnitId, e2Var);
        }
        e2Var.a(record.a(new com.json.v()));
        b(record);
    }

    @Override // com.json.te
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject a(com.json.at mode) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, com.json.e2> entry : this.adUnitsHistory.entrySet()) {
            java.lang.String key = entry.getKey();
            org.json.JSONObject jSONObjectA = entry.getValue().a(mode);
            if (jSONObjectA.length() > 0) {
                jSONObject.put(key, jSONObjectA);
            }
        }
        return jSONObject;
    }

    public final boolean b() {
        return !this.adUnitsHistory.isEmpty();
    }
}
