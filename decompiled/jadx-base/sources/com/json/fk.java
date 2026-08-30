package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0019B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0017\u0010\u001cB!\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ironsource/fk;", "Landroid/webkit/WebView;", "Lcom/ironsource/rk;", "", "script", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/oo;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "keyCode", "Landroid/view/KeyEvent;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "onKeyDown", "Lcom/ironsource/qk;", "Lcom/ironsource/qk;", "javascriptEngine", "b", "Lcom/ironsource/oo;", "changeListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/ironsource/qk;)V", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class fk extends android.webkit.WebView implements com.json.rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.json.qk javascriptEngine;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private com.json.oo changeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(android.content.Context context, android.util.AttributeSet attrs, int i) {
        super(context, attrs, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fk(android.content.Context context, com.json.qk javascriptEngine) {
        this(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.javascriptEngine = javascriptEngine;
    }

    public /* synthetic */ fk(android.content.Context context, com.json.qk qkVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new com.ironsource.qk.a(0, 1, null) : qkVar);
    }

    public final void a(com.json.oo listener) {
        this.changeListener = listener;
    }

    @Override // com.json.rk
    public void a(java.lang.String script) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(script, "script");
        com.json.qk qkVar = this.javascriptEngine;
        com.json.qk qkVar2 = null;
        if (qkVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
            qkVar = null;
        }
        if (!qkVar.a()) {
            com.json.qk qkVar3 = this.javascriptEngine;
            if (qkVar3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
                qkVar3 = null;
            }
            qkVar3.a(this);
        }
        com.json.qk qkVar4 = this.javascriptEngine;
        if (qkVar4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
        } else {
            qkVar2 = qkVar4;
        }
        qkVar2.a(script);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (keyCode == 4) {
            com.json.oo ooVar = this.changeListener;
            if (ooVar != null && ooVar.onBackButtonPressed()) {
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
