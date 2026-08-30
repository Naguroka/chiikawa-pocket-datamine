package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002Jo\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0004H\u0002JG\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0003\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/ironsource/wt;", "", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "appKey", "sdkVersion", "bundleId", "appName", com.ironsource.y8.i.W, "", com.ironsource.y8.i.b0, "initResponse", "isRewardedVideoManual", "generalProperties", "adaptersVersions", "metaData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/json/JSONObject;ZLorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "dataString", "", "testSuiteControllerUrl", "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "b", "(Landroid/content/Context;)Ljava/lang/String;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class wt {
    private final android.content.SharedPreferences a(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final java.lang.String a(java.lang.String appKey, java.lang.String sdkVersion, java.lang.String bundleId, java.lang.String appName, java.lang.String appVersion, java.lang.Boolean consent, org.json.JSONObject initResponse, boolean isRewardedVideoManual, org.json.JSONObject generalProperties, org.json.JSONObject adaptersVersions, org.json.JSONObject metaData) {
        java.lang.String string = new org.json.JSONObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceOS", com.json.y8.d), kotlin.TuplesKt.to("appKey", appKey), kotlin.TuplesKt.to("sdkVersion", sdkVersion), kotlin.TuplesKt.to("bundleId", bundleId), kotlin.TuplesKt.to("appName", appName), kotlin.TuplesKt.to(com.ironsource.y8.i.W, appVersion), kotlin.TuplesKt.to("initResponse", initResponse), kotlin.TuplesKt.to("isRvManual", java.lang.Boolean.valueOf(isRewardedVideoManual)), kotlin.TuplesKt.to("generalProperties", generalProperties), kotlin.TuplesKt.to("adaptersVersion", adaptersVersions), kotlin.TuplesKt.to("metaData", metaData), kotlin.TuplesKt.to("gdprConsent", consent))).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "JSONObject(\n            …ent))\n        .toString()");
        return string;
    }

    private final org.json.JSONObject a() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : com.json.hu.f2727a.d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new org.json.JSONArray((java.util.Collection) entry.getValue()));
        }
        return jSONObject;
    }

    private final void a(android.content.Context context, java.lang.String dataString) {
        android.content.SharedPreferences.Editor editorEdit = a(context).edit();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editorEdit, "getTestSuitePrefs(context).edit()");
        editorEdit.putString("dataString", dataString);
        editorEdit.apply();
    }

    public final void a(android.content.Context context, java.lang.String appKey, org.json.JSONObject initResponse, java.lang.String sdkVersion, java.lang.String testSuiteControllerUrl, java.lang.Boolean consent, boolean isRewardedVideoManual) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testSuiteControllerUrl, "testSuiteControllerUrl");
        com.json.hu huVar = com.json.hu.f2727a;
        a(context, a(appKey, sdkVersion, huVar.c(context), huVar.a(context), huVar.b(context), consent, initResponse, isRewardedVideoManual, huVar.b(), huVar.c(), a()));
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.json.mediationsdk.testSuite.TestSuiteActivity.class);
        intent.setFlags(com.google.android.gms.drive.DriveFile.MODE_READ_WRITE);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        context.startActivity(intent);
    }

    public final java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return a(context).getString("dataString", "");
    }
}
