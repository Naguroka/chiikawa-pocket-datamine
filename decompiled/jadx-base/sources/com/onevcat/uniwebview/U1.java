package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class U1 {
    public static com.onevcat.uniwebview.E a(com.onevcat.uniwebview.D params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        com.onevcat.uniwebview.UniWebViewNativeChannel uniWebViewNativeChannel = com.onevcat.uniwebview.UniWebViewInterface.channel;
        if (uniWebViewNativeChannel == null) {
            com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
            java.lang.String message = "Unity method channel does not exist when invoking. Check implementation. Method: " + params;
            c1560l.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
            return null;
        }
        com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message2 = "invokeChannelMethod: " + params.f3650a + ", " + params.b + ", " + params.c;
        c1560l2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
        c1560l2.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, message2);
        java.lang.String strInvokeChannelMethod = uniWebViewNativeChannel.invokeChannelMethod(params.f3650a, params.b, params.c);
        if (strInvokeChannelMethod == null) {
            return null;
        }
        return new com.onevcat.uniwebview.E(strInvokeChannelMethod);
    }

    public static final void b(kotlin.jvm.functions.Function0 runner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runner, "$runner");
        runner.invoke();
    }

    public static java.lang.Object c(java.lang.String str, kotlin.jvm.functions.Function1 function1) {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        a(str, new com.onevcat.uniwebview.N0(objectRef, function1, countDownLatch));
        try {
            countDownLatch.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception e) {
            com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
            java.lang.String message = "Exception detected: " + e.getMessage();
            c1560l.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
        }
        return objectRef.element;
    }

    public static final void b(java.lang.String name, kotlin.jvm.functions.Function1 runner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "$name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runner, "$runner");
        com.onevcat.uniwebview.C1539e c1539e = com.onevcat.uniwebview.C1539e.b;
        c1539e.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.N n = (com.onevcat.uniwebview.N) c1539e.f3717a.get(name);
        if (n != null) {
            runner.invoke(n);
            return;
        }
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Did not find the correct web view container for name: " + name + ". Has it been already destroyed or not yet added?";
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
    }

    public static java.lang.Object c(kotlin.jvm.functions.Function0 function0) {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        a(new com.onevcat.uniwebview.M0(objectRef, function0, countDownLatch));
        try {
            countDownLatch.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception e) {
            com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
            java.lang.String message = "Exception detected: " + e.getMessage();
            c1560l.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
        }
        return objectRef.element;
    }

    public static void a(final java.lang.String str, final kotlin.jvm.functions.Function1 function1) {
        com.unity3d.player.UnityPlayer.currentActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.onevcat.uniwebview.U1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.onevcat.uniwebview.U1.b(str, function1);
            }
        });
    }

    public static void a(final kotlin.jvm.functions.Function0 function0) {
        com.unity3d.player.UnityPlayer.currentActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.onevcat.uniwebview.U1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.onevcat.uniwebview.U1.b(function0);
            }
        });
    }
}
