package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0003\u0004J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/ironsource/sdk/controller/m;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface m {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/ironsource/sdk/controller/m$a;", "Lcom/ironsource/sdk/controller/m;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "funToCall", "b", "parameters", "c", "onSuccessCallback", "d", "onFailCallback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.sdk.controller.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String funToCall;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final java.lang.String parameters;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final java.lang.String onSuccessCallback;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final java.lang.String onFailCallback;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String funToCall) {
            this(funToCall, null, null, null, 14, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String funToCall, java.lang.String str) {
            this(funToCall, str, null, null, 12, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String funToCall, java.lang.String str, java.lang.String str2) {
            this(funToCall, str, str2, null, 8, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        public a(java.lang.String funToCall, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(funToCall, "funToCall");
            this.funToCall = funToCall;
            this.parameters = str;
            this.onSuccessCallback = str2;
            this.onFailCallback = str3;
        }

        public /* synthetic */ a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }

        @Override // com.json.sdk.controller.m
        public java.lang.String a() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("SSA_CORE.SDKController.runFunction('" + this.funToCall);
            java.lang.String str = this.parameters;
            if (!(str == null || str.length() == 0)) {
                sb.append("?parameters=" + this.parameters);
            }
            java.lang.String str2 = this.onSuccessCallback;
            if (!(str2 == null || str2.length() == 0)) {
                sb.append("','" + this.onSuccessCallback);
            }
            java.lang.String str3 = this.onFailCallback;
            if (!(str3 == null || str3.length() == 0)) {
                sb.append("','" + this.onFailCallback);
            }
            sb.append("');");
            java.lang.String string = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/ironsource/sdk/controller/m$b;", "Lcom/ironsource/sdk/controller/m;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "I", "debugMode", "b", "Ljava/lang/String;", "script", "jsMethod", "<init>", "(Lcom/ironsource/sdk/controller/m;I)V", "(Ljava/lang/String;I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.sdk.controller.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int debugMode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private java.lang.String script;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(com.json.sdk.controller.m jsMethod, int i) {
            this(jsMethod.a(), i);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsMethod, "jsMethod");
        }

        public b(java.lang.String script, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(script, "script");
            this.script = script;
            this.debugMode = i;
        }

        @Override // com.json.sdk.controller.m
        public java.lang.String a() {
            java.lang.String str = "try{" + this.script + "}catch(e){" + ((this.debugMode != com.ironsource.zg.d.MODE_0.a() && (this.debugMode < com.ironsource.zg.d.MODE_1.a() || this.debugMode > com.ironsource.zg.d.MODE_3.a())) ? "empty" : "console.log(\"JS exception: \" + JSON.stringify(e));") + "}";
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        …}\")\n          .toString()");
            return str;
        }
    }

    java.lang.String a();
}
