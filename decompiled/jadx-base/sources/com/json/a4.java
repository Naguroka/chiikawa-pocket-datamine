package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R+\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006¨\u0006!"}, d2 = {"Lcom/ironsource/a4;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "f", "()Z", "isCrashReporterEnabled", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "b", "Ljava/util/HashSet;", "()Ljava/util/HashSet;", "keyParamsToIncludeInReporter", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", com.json.c4.c, com.json.c4.d, "e", "isANRIncluded", "", "I", "()I", "defaultAnrTimeout", "g", "isIgnoreDebugger", "Lorg/json/JSONObject;", "applicationCrashReporterSettings", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isCrashReporterEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.HashSet<java.lang.String> keyParamsToIncludeInReporter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.lang.String reporterURL;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final java.lang.String reporterKeyword;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isANRIncluded;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int defaultAnrTimeout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isIgnoreDebugger;

    public a4(org.json.JSONObject applicationCrashReporterSettings) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationCrashReporterSettings, "applicationCrashReporterSettings");
        this.isCrashReporterEnabled = applicationCrashReporterSettings.optBoolean("enabled", false);
        java.util.List<java.lang.String> listB = com.json.hk.b(applicationCrashReporterSettings.optJSONArray(com.json.c4.b));
        this.keyParamsToIncludeInReporter = listB != null ? kotlin.collections.CollectionsKt.toHashSet(listB) : null;
        java.lang.String strOptString = applicationCrashReporterSettings.optString(com.json.c4.c);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strOptString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.reporterURL = strOptString;
        java.lang.String strOptString2 = applicationCrashReporterSettings.optString(com.json.c4.d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strOptString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.reporterKeyword = strOptString2;
        this.isANRIncluded = applicationCrashReporterSettings.optBoolean(com.json.c4.e, false);
        this.defaultAnrTimeout = applicationCrashReporterSettings.optInt("timeout", 5000);
        this.isIgnoreDebugger = applicationCrashReporterSettings.optBoolean(com.json.c4.g, false);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDefaultAnrTimeout() {
        return this.defaultAnrTimeout;
    }

    public final java.util.HashSet<java.lang.String> b() {
        return this.keyParamsToIncludeInReporter;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final java.lang.String getReporterKeyword() {
        return this.reporterKeyword;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final java.lang.String getReporterURL() {
        return this.reporterURL;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsANRIncluded() {
        return this.isANRIncluded;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsCrashReporterEnabled() {
        return this.isCrashReporterEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsIgnoreDebugger() {
        return this.isIgnoreDebugger;
    }
}
