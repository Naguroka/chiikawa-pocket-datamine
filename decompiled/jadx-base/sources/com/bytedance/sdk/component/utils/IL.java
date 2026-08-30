package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private static com.bytedance.sdk.component.utils.IL.bg bg;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.IL$IL, reason: collision with other inner class name */
    public interface InterfaceC0117IL {
        void bg();

        void bg(java.lang.Throwable th);
    }

    public interface bg {
        java.util.concurrent.ExecutorService getAsyncStartActivityThreadPool();

        boolean isEnableAsyncStartActivity();
    }

    public static void bg(com.bytedance.sdk.component.utils.IL.bg bgVar) {
        bg = bgVar;
    }

    public static boolean bg(android.content.Context context, android.content.Intent intent, com.bytedance.sdk.component.utils.IL.InterfaceC0117IL interfaceC0117IL) {
        return bg(context, intent, interfaceC0117IL, false);
    }

    public static boolean bg(final android.content.Context context, final android.content.Intent intent, final com.bytedance.sdk.component.utils.IL.InterfaceC0117IL interfaceC0117IL, boolean z) {
        com.bytedance.sdk.component.utils.IL.bg bgVar;
        java.util.concurrent.ExecutorService asyncStartActivityThreadPool;
        if (z && (bgVar = bg) != null && bgVar.isEnableAsyncStartActivity() && (asyncStartActivityThreadPool = bg.getAsyncStartActivityThreadPool()) != null) {
            asyncStartActivityThreadPool.execute(new com.bytedance.sdk.component.Kg.Kg("startAct") { // from class: com.bytedance.sdk.component.utils.IL.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.IL.bX(context, intent, interfaceC0117IL);
                }
            });
            return true;
        }
        return bX(context, intent, interfaceC0117IL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean bX(android.content.Context context, android.content.Intent intent, com.bytedance.sdk.component.utils.IL.InterfaceC0117IL interfaceC0117IL) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof android.app.Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0117IL == null) {
                    return true;
                }
                interfaceC0117IL.bg();
                return true;
            } catch (java.lang.Throwable th) {
                if (interfaceC0117IL != null) {
                    interfaceC0117IL.bg(th);
                }
            }
        }
        return false;
    }

    public static android.app.Activity bg(android.view.View view) {
        android.view.View viewFindViewById;
        android.content.Context context;
        if (view == null) {
            return null;
        }
        android.content.Context context2 = view.getContext();
        if (context2 instanceof android.app.Activity) {
            return (android.app.Activity) context2;
        }
        android.view.View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(android.R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
            if (baseContext instanceof android.app.Activity) {
                return (android.app.Activity) baseContext;
            }
        }
        return null;
    }
}
