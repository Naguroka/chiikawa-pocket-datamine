package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/onevcat/uniwebview/UniWebViewProxyActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lcom/onevcat/uniwebview/y;", "handler", "Lcom/onevcat/uniwebview/y;", "Companion", "com/onevcat/uniwebview/W1", "uniwebview_release"}, k = 1, mv = {1, 6, 0})
public class UniWebViewProxyActivity extends android.app.Activity {
    public static final com.onevcat.uniwebview.W1 Companion = new com.onevcat.uniwebview.W1();
    public static final java.lang.String HANDLER_ID = "com.uniwebview.UniWebViewProxyActivity.handlerId";
    private com.onevcat.uniwebview.InterfaceC1601y handler;

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        com.onevcat.uniwebview.InterfaceC1601y interfaceC1601y = this.handler;
        if (interfaceC1601y != null) {
            interfaceC1601y.a(this, requestCode, resultCode, data);
        }
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle savedInstanceState) {
        com.onevcat.uniwebview.InterfaceC1601y interfaceC1601y;
        super.onCreate(savedInstanceState);
        java.lang.String stringExtra = getIntent().getStringExtra(HANDLER_ID);
        com.onevcat.uniwebview.InterfaceC1601y.f3771a.getClass();
        java.util.LinkedHashMap linkedHashMap = com.onevcat.uniwebview.C1598x.b;
        com.onevcat.uniwebview.InterfaceC1601y interfaceC1601y2 = (com.onevcat.uniwebview.InterfaceC1601y) linkedHashMap.get(stringExtra);
        if (interfaceC1601y2 != null) {
            this.handler = interfaceC1601y2;
            interfaceC1601y2.a(this);
            return;
        }
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "No handler found for this activity: " + this + ". Usually this means a wrong implementation of the browser that does not start the callback URI intent in the desired way. Trying to recover by force dismiss and go back to the normal flow...If you know the browser you are using when seeing this, please report back to the developer.";
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                interfaceC1601y = null;
                break;
            }
            interfaceC1601y = (com.onevcat.uniwebview.InterfaceC1601y) ((java.util.Map.Entry) it.next()).getValue();
        } while (interfaceC1601y == null);
        if (interfaceC1601y != null) {
            com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
            java.lang.String message2 = "handler is null for " + this + ". Forwarding intent to the first handler: " + interfaceC1601y;
            c1560l2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
            c1560l2.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, message2);
            interfaceC1601y.a(getIntent());
            interfaceC1601y.a();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.onevcat.uniwebview.InterfaceC1601y interfaceC1601y = this.handler;
        if (interfaceC1601y != null) {
            interfaceC1601y.b();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.onevcat.uniwebview.InterfaceC1601y interfaceC1601y = this.handler;
        if (interfaceC1601y != null) {
            interfaceC1601y.a(intent);
        }
    }
}
