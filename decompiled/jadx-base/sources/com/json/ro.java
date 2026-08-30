package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ironsource/ro;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "duration", "", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "", "reason", "Lcom/ironsource/b2;", "Lcom/ironsource/b2;", "eventsWrapper", "<init>", "(Lcom/ironsource/b2;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.b2 eventsWrapper;

    public ro(com.json.b2 eventsWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsWrapper, "eventsWrapper");
        this.eventsWrapper = eventsWrapper;
    }

    public final void a() {
        this.eventsWrapper.a(com.json.y1.OPERATIONAL_LOAD_AD, new java.util.HashMap());
    }

    public final void a(long duration) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(duration));
        this.eventsWrapper.a(com.json.y1.OPERATIONAL_LOAD_SUCCESS, map);
    }

    public final void a(long duration, int errorCode, java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(errorCode));
        map.put("reason", reason);
        map.put("duration", java.lang.Long.valueOf(duration));
        this.eventsWrapper.a(com.json.y1.OPERATIONAL_LOAD_FAILED, map);
    }
}
