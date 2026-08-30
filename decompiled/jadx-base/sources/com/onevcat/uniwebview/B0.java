package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class B0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.onevcat.uniwebview.B0 f3646a = new com.onevcat.uniwebview.B0();

    public B0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        android.app.Activity activity = com.unity3d.player.UnityPlayer.currentActivity;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "currentActivity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Checking CustomTabsService resolve info.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.DEBUG;
        c1560l.a(enumC1557k, "Checking CustomTabsService resolve info.");
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = activity.getPackageManager().queryIntentServices(new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "activity.packageManager.…ervices(serviceIntent, 0)");
        java.lang.String message = "Resolved information: " + listQueryIntentServices;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(enumC1557k, message);
        return java.lang.Boolean.valueOf(((android.content.pm.ResolveInfo) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) listQueryIntentServices)) != null);
    }
}
