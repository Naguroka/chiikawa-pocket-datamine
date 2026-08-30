package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/ironsource/l8;", "Lcom/ironsource/qc;", "", "c", "e", "d", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lorg/json/JSONObject;", "data", "flagData", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class l8 implements com.json.qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final org.json.JSONObject data;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/l8$a;", "", "", "b", "Z", "DEFAULT_ENABLED", "", "c", "Ljava/lang/String;", "FLAG_NAME", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.l8.a f2877a = new com.ironsource.l8.a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final boolean DEFAULT_ENABLED = false;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final java.lang.String FLAG_NAME = "curlError";

        private a() {
        }
    }

    public l8(org.json.JSONObject jSONObject) {
        this.data = jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    @Override // com.json.qc
    public boolean c() {
        return this.data.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.data.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.data.optBoolean("reportController", true);
    }
}
