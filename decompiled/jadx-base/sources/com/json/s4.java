package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/ironsource/s4;", "", "", "instanceId", "Lcom/ironsource/mediationsdk/demandOnly/p;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface s4 {

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/s4$a;", "Lcom/ironsource/s4;", "", "instanceId", "Lcom/ironsource/mediationsdk/demandOnly/p;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lorg/json/JSONObject;", "Lorg/json/JSONObject;", com.json.mediationsdk.d.k, "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.s4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final org.json.JSONObject instances;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public a(org.json.JSONObject jSONObject) {
            this.instances = jSONObject;
        }

        public /* synthetic */ a(org.json.JSONObject jSONObject, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new org.json.JSONObject() : jSONObject);
        }

        @Override // com.json.s4
        public com.json.mediationsdk.demandOnly.p a(java.lang.String instanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            org.json.JSONObject jSONObject = this.instances;
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(instanceId) : null;
            java.lang.String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("plumbus") : null;
            return strOptString != null ? new com.ironsource.mediationsdk.demandOnly.p.a(strOptString) : new com.ironsource.mediationsdk.demandOnly.p.b();
        }
    }

    com.json.mediationsdk.demandOnly.p a(java.lang.String instanceId);
}
