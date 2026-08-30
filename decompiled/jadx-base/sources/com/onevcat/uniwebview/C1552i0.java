package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1552i0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3729a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1552i0(java.lang.String str) {
        super(0);
        this.f3729a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        com.onevcat.uniwebview.C1536d c1536d = com.onevcat.uniwebview.C1536d.b;
        java.lang.String name = this.f3729a;
        c1536d.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.A handler = (com.onevcat.uniwebview.A) c1536d.f3713a.get(name);
        if (handler != null) {
            com.onevcat.uniwebview.InterfaceC1601y.f3771a.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
            java.lang.String handlerId = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(handlerId, "randomUUID().toString()");
            com.onevcat.uniwebview.C1598x.b.put(handlerId, handler);
            handler.g = handlerId;
            com.onevcat.uniwebview.C1604z c1604z = com.onevcat.uniwebview.UniWebViewAuthenticationActivity.Companion;
            android.app.Activity context = handler.b;
            if (handlerId == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("handlerId");
                handlerId = null;
            }
            c1604z.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerId, "handlerId");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.onevcat.uniwebview.UniWebViewAuthenticationActivity.class);
            intent.putExtra(com.onevcat.uniwebview.UniWebViewProxyActivity.HANDLER_ID, handlerId);
            context.startActivity(intent);
        }
        return kotlin.Unit.INSTANCE;
    }
}
