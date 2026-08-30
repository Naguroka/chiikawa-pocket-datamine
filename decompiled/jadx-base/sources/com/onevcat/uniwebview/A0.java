package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class A0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3644a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(java.lang.String str, int i, int i2, int i3, int i4) {
        super(0);
        this.f3644a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        android.app.Activity activity = com.unity3d.player.UnityPlayer.currentActivity;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "activity");
        java.lang.String name = this.f3644a;
        com.onevcat.uniwebview.N container = new com.onevcat.uniwebview.N(activity, name, new com.onevcat.uniwebview.C1542f(), null);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        activity.addContentView(container.e, layoutParams);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0f);
        container.r.addView(container.q);
        container.r.addView(container.p, layoutParams2);
        container.e.addView(container.r, layoutParams);
        com.onevcat.uniwebview.C1539e c1539e = com.onevcat.uniwebview.C1539e.b;
        c1539e.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, com.onevcat.uniwebview.AbstractC1575q.a("Adding web view container to manager: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        c1539e.f3717a.put(name, container);
        if (com.onevcat.uniwebview.AbstractC1590v.e) {
            com.onevcat.uniwebview.X frameLayout = container.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            container.o = new com.onevcat.uniwebview.C1530b(frameLayout, activity);
        }
        container.a(this.b, this.c, this.d, this.e);
        return kotlin.Unit.INSTANCE;
    }
}
