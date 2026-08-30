package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/ironsource/sdk/controller/f;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface f {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0003B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ironsource/sdk/controller/f$a;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lorg/json/JSONObject;", "b", com.ironsource.sdk.controller.f.b.MSG_ID, "params", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lorg/json/JSONObject;", "d", "()Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final com.ironsource.sdk.controller.f.a.Companion INSTANCE = new com.ironsource.sdk.controller.f.a.Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String msgId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final org.json.JSONObject params;

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name and from kotlin metadata */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/sdk/controller/f$a$a;", "", "", "jsonStr", "Lcom/ironsource/sdk/controller/f$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @kotlin.jvm.JvmStatic
            public final com.ironsource.sdk.controller.f.a a(java.lang.String jsonStr) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
                org.json.JSONObject jSONObject = new org.json.JSONObject(jsonStr);
                java.lang.String id = jSONObject.getString(com.ironsource.sdk.controller.f.b.MSG_ID);
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "id");
                return new com.ironsource.sdk.controller.f.a(id, jSONObjectOptJSONObject);
            }
        }

        public a(java.lang.String msgId, org.json.JSONObject jSONObject) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msgId, "msgId");
            this.msgId = msgId;
            this.params = jSONObject;
        }

        public static /* synthetic */ com.ironsource.sdk.controller.f.a a(com.ironsource.sdk.controller.f.a aVar, java.lang.String str, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = aVar.msgId;
            }
            if ((i & 2) != 0) {
                jSONObject = aVar.params;
            }
            return aVar.a(str, jSONObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.ironsource.sdk.controller.f.a a(java.lang.String str) throws org.json.JSONException {
            return INSTANCE.a(str);
        }

        public final com.ironsource.sdk.controller.f.a a(java.lang.String msgId, org.json.JSONObject params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msgId, "msgId");
            return new com.ironsource.sdk.controller.f.a(msgId, params);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.lang.String getMsgId() {
            return this.msgId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final org.json.JSONObject getParams() {
            return this.params;
        }

        public final java.lang.String c() {
            return this.msgId;
        }

        public final org.json.JSONObject d() {
            return this.params;
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.ironsource.sdk.controller.f.a)) {
                return false;
            }
            com.ironsource.sdk.controller.f.a aVar = (com.ironsource.sdk.controller.f.a) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.msgId, aVar.msgId) && kotlin.jvm.internal.Intrinsics.areEqual(this.params, aVar.params);
        }

        public int hashCode() {
            int iHashCode = this.msgId.hashCode() * 31;
            org.json.JSONObject jSONObject = this.params;
            return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public java.lang.String toString() {
            return "CallbackToNative(msgId=" + this.msgId + ", params=" + this.params + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ironsource/sdk/controller/f$b;", "", "", "b", "Ljava/lang/String;", "MSG_ID", "c", "AD_ID", "d", "PARAMS", "e", "SUCCESS", "f", "REASON", "g", "COMMAND", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.sdk.controller.f.b f3315a = new com.ironsource.sdk.controller.f.b();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final java.lang.String MSG_ID = "msgId";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final java.lang.String AD_ID = "adId";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final java.lang.String PARAMS = "params";

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final java.lang.String SUCCESS = "success";

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final java.lang.String REASON = "reason";

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final java.lang.String COMMAND = "command";

        private b() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\t\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/sdk/controller/f$c;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "other", "", "equals", "", "hashCode", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Lorg/json/JSONObject;", "c", com.ironsource.sdk.controller.f.b.AD_ID, com.ironsource.sdk.controller.f.b.COMMAND, "params", "toString", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "Lorg/json/JSONObject;", "g", "()Lorg/json/JSONObject;", "f", "(Ljava/lang/String;)V", com.ironsource.sdk.controller.f.b.MSG_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String adId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final java.lang.String command;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final org.json.JSONObject params;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private java.lang.String msgId;

        public c(java.lang.String adId, java.lang.String command, org.json.JSONObject params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
            this.adId = adId;
            this.command = command;
            this.params = params;
            java.lang.String string = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            this.msgId = string;
        }

        public static /* synthetic */ com.ironsource.sdk.controller.f.c a(com.ironsource.sdk.controller.f.c cVar, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cVar.adId;
            }
            if ((i & 2) != 0) {
                str2 = cVar.command;
            }
            if ((i & 4) != 0) {
                jSONObject = cVar.params;
            }
            return cVar.a(str, str2, jSONObject);
        }

        public final com.ironsource.sdk.controller.f.c a(java.lang.String adId, java.lang.String command, org.json.JSONObject params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
            return new com.ironsource.sdk.controller.f.c(adId, command, params);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.lang.String getAdId() {
            return this.adId;
        }

        public final void a(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.msgId = str;
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
            com.ironsource.sdk.controller.f.c cVar = other instanceof com.ironsource.sdk.controller.f.c ? (com.ironsource.sdk.controller.f.c) other : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(this.msgId, cVar.msgId) && kotlin.jvm.internal.Intrinsics.areEqual(this.adId, cVar.adId) && kotlin.jvm.internal.Intrinsics.areEqual(this.command, cVar.command) && kotlin.jvm.internal.Intrinsics.areEqual(this.params.toString(), cVar.params.toString());
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final java.lang.String getMsgId() {
            return this.msgId;
        }

        public final org.json.JSONObject g() {
            return this.params;
        }

        public final java.lang.String h() {
            java.lang.String string = new org.json.JSONObject().put(com.ironsource.sdk.controller.f.b.MSG_ID, this.msgId).put(com.ironsource.sdk.controller.f.b.AD_ID, this.adId).put("params", this.params).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "JSONObject()\n          .…ms)\n          .toString()");
            return string;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public java.lang.String toString() {
            return "MessageToController(adId=" + this.adId + ", command=" + this.command + ", params=" + this.params + ')';
        }
    }
}
