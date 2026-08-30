package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0013\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\b\u0010\u0015R\u0017\u0010!\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010#\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b\"\u0010%R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b \u0010%R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b(\u0010%R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b\u001e\u0010%¨\u0006-"}, d2 = {"Lcom/ironsource/d4;", "", "Lorg/json/JSONObject;", "applicationEvents", "", com.ironsource.y8.h.W, "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Z", "k", "()Z", com.json.f4.f2643a, "b", "j", com.json.f4.b, "c", com.json.f4.c, "d", "I", "()I", com.json.f4.d, "e", "Ljava/lang/String;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "()Ljava/lang/String;", com.json.f4.e, "f", "eventsType", "g", com.json.f4.g, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, com.json.f4.h, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, com.json.f4.i, "Ljava/util/List;", "()Ljava/util/List;", "optOutEvents", "optInEvents", "m", com.json.f4.l, com.json.f4.m, "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean sendUltraEvents;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean sendEventsToggle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean eventsCompression;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int eventsCompressionLevel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final java.lang.String serverEventsURL;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final java.lang.String eventsType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int backupThreshold;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int maxNumberOfEvents;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int maxEventsPerBatch;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final java.util.List<java.lang.Integer> optOutEvents;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final java.util.List<java.lang.Integer> optInEvents;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final java.util.List<java.lang.Integer> triggerEvents;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final java.util.List<java.lang.Integer> nonConnectivityEvents;

    public d4(org.json.JSONObject applicationEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationEvents, "applicationEvents");
        this.sendUltraEvents = applicationEvents.optBoolean(com.json.f4.f2643a, false);
        this.sendEventsToggle = applicationEvents.optBoolean(com.json.f4.b, false);
        this.eventsCompression = applicationEvents.optBoolean(com.json.f4.c, false);
        this.eventsCompressionLevel = applicationEvents.optInt(com.json.f4.d, -1);
        java.lang.String strOptString = applicationEvents.optString(com.json.f4.e);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strOptString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.serverEventsURL = strOptString;
        java.lang.String strOptString2 = applicationEvents.optString(com.json.f4.f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strOptString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.eventsType = strOptString2;
        this.backupThreshold = applicationEvents.optInt(com.json.f4.g, -1);
        this.maxNumberOfEvents = applicationEvents.optInt(com.json.f4.h, -1);
        this.maxEventsPerBatch = applicationEvents.optInt(com.json.f4.i, 5000);
        this.optOutEvents = a(applicationEvents, com.json.f4.j);
        this.optInEvents = a(applicationEvents, com.json.f4.k);
        this.triggerEvents = a(applicationEvents, com.json.f4.l);
        this.nonConnectivityEvents = a(applicationEvents, com.json.f4.m);
    }

    private final java.util.List<java.lang.Integer> a(org.json.JSONObject applicationEvents, java.lang.String key) {
        org.json.JSONArray jSONArrayOptJSONArray = applicationEvents.optJSONArray(key);
        if (jSONArrayOptJSONArray == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(0, jSONArrayOptJSONArray.length());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(jSONArrayOptJSONArray.getInt(((kotlin.collections.IntIterator) it).nextInt())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBackupThreshold() {
        return this.backupThreshold;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEventsCompression() {
        return this.eventsCompression;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getEventsCompressionLevel() {
        return this.eventsCompressionLevel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final java.lang.String getEventsType() {
        return this.eventsType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxEventsPerBatch() {
        return this.maxEventsPerBatch;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxNumberOfEvents() {
        return this.maxNumberOfEvents;
    }

    public final java.util.List<java.lang.Integer> g() {
        return this.nonConnectivityEvents;
    }

    public final java.util.List<java.lang.Integer> h() {
        return this.optInEvents;
    }

    public final java.util.List<java.lang.Integer> i() {
        return this.optOutEvents;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getSendEventsToggle() {
        return this.sendEventsToggle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getSendUltraEvents() {
        return this.sendUltraEvents;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final java.lang.String getServerEventsURL() {
        return this.serverEventsURL;
    }

    public final java.util.List<java.lang.Integer> m() {
        return this.triggerEvents;
    }
}
