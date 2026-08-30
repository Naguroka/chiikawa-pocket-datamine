package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\b\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Lcom/ironsource/vt;", "", "", "eventId", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "", "errorReason", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILjava/lang/Integer;Ljava/lang/String;)V", "Lorg/json/JSONArray;", "b", "c", "d", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class vt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.vt f3518a = new com.json.vt();

    private vt() {
    }

    private final org.json.JSONArray a() {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> concurrentHashMapD = com.json.hu.f2727a.d();
        if (concurrentHashMapD.containsKey(com.json.mediationsdk.metadata.a.f)) {
            return new org.json.JSONArray((java.util.Collection) concurrentHashMapD.get(com.json.mediationsdk.metadata.a.f));
        }
        return null;
    }

    private final void a(int eventId, java.lang.Integer errorCode, java.lang.String errorReason) throws org.json.JSONException {
        com.json.hu huVar = com.json.hu.f2727a;
        org.json.JSONObject jSONObjectA = huVar.a(false);
        if (errorCode != null) {
            jSONObjectA.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, errorCode.intValue());
            org.json.JSONArray jSONArrayA = a();
            if (jSONArrayA != null) {
                jSONObjectA.put(com.json.mediationsdk.metadata.a.f, jSONArrayA);
            }
        }
        if (errorReason != null) {
            jSONObjectA.put("reason", errorReason);
        }
        huVar.a(eventId, jSONObjectA);
    }

    static /* synthetic */ void a(com.json.vt vtVar, int i, java.lang.Integer num, java.lang.String str, int i2, java.lang.Object obj) throws org.json.JSONException {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        vtVar.a(i, num, str);
    }

    public final void a(int errorCode) throws org.json.JSONException {
        a(72, java.lang.Integer.valueOf(errorCode), null);
    }

    public final void a(java.lang.String errorReason) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        a(74, java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }

    public final void b() throws org.json.JSONException {
        a(this, 70, null, null, 6, null);
    }

    public final void c() throws org.json.JSONException {
        a(this, 71, null, null, 6, null);
    }

    public final void d() throws org.json.JSONException {
        a(this, 73, null, null, 6, null);
    }
}
