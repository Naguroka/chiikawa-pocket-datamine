package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0003B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/ironsource/km;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Lorg/json/JSONObject;", "c", com.ironsource.sdk.controller.f.b.c, com.ironsource.sdk.controller.f.b.g, "params", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "Lorg/json/JSONObject;", "f", "()Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class km {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final com.json.km.Companion INSTANCE = new com.json.km.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String adId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String command;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final org.json.JSONObject params;

    /* JADX INFO: renamed from: com.ironsource.km$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/km$a;", "", "", "jsonStr", "Lcom/ironsource/km;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.json.km a(java.lang.String jsonStr) throws org.json.JSONException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonStr);
            java.lang.String adId = jSONObject.getString(com.ironsource.sdk.controller.f.b.c);
            java.lang.String command = jSONObject.getString(com.ironsource.sdk.controller.f.b.g);
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adId, "adId");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(command, "command");
            return new com.json.km(adId, command, jSONObjectOptJSONObject);
        }
    }

    public km(java.lang.String adId, java.lang.String command, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        this.adId = adId;
        this.command = command;
        this.params = jSONObject;
    }

    public static /* synthetic */ com.json.km a(com.json.km kmVar, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = kmVar.adId;
        }
        if ((i & 2) != 0) {
            str2 = kmVar.command;
        }
        if ((i & 4) != 0) {
            jSONObject = kmVar.params;
        }
        return kmVar.a(str, str2, jSONObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.json.km a(java.lang.String str) throws org.json.JSONException {
        return INSTANCE.a(str);
    }

    public final com.json.km a(java.lang.String adId, java.lang.String command, org.json.JSONObject params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        return new com.json.km(adId, command, params);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getAdId() {
        return this.adId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getCommand() {
        return this.command;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final org.json.JSONObject getParams() {
        return this.params;
    }

    public final java.lang.String d() {
        return this.adId;
    }

    public final java.lang.String e() {
        return this.command;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.km)) {
            return false;
        }
        com.json.km kmVar = (com.json.km) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.adId, kmVar.adId) && kotlin.jvm.internal.Intrinsics.areEqual(this.command, kmVar.command) && kotlin.jvm.internal.Intrinsics.areEqual(this.params, kmVar.params);
    }

    public final org.json.JSONObject f() {
        return this.params;
    }

    public int hashCode() {
        int iHashCode = ((this.adId.hashCode() * 31) + this.command.hashCode()) * 31;
        org.json.JSONObject jSONObject = this.params;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public java.lang.String toString() {
        return "MessageToNative(adId=" + this.adId + ", command=" + this.command + ", params=" + this.params + ')';
    }
}
