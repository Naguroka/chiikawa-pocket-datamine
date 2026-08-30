package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ironsource/t6;", "Landroid/widget/FrameLayout;", "Lcom/ironsource/kv;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/kv;", "getViewBinder", "()Lcom/ironsource/kv;", "viewBinder", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class t6 extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.kv viewBinder;

    @kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/ironsource/t6$a", "Lcom/ironsource/kv;", "Landroid/view/View;", "view", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "Lcom/ironsource/t2;", "adTools", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.kv {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(android.view.View this_apply) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this_apply.setEnabled(false);
            this_apply.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.json.t2 adTools, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.getEventSender().getTroubleshoot().a(false, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.json.t6 this$0, android.view.View view, android.view.View this_apply) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this$0.removeView(view);
            this_apply.setEnabled(true);
            this_apply.setClickable(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(com.json.t2 adTools, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.getEventSender().getTroubleshoot().a(true, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final com.json.t2 adTools, final long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.d(new java.lang.Runnable() { // from class: com.ironsource.t6$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.t6.a.d(adTools, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(com.json.t2 adTools, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.getEventSender().getTroubleshoot().a(j);
        }

        @Override // com.json.kv
        public void a(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams, final com.json.t2 adTools) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
            final android.view.View childAt = com.json.t6.this.getChildAt(0);
            final long jE = com.json.im.INSTANCE.d().d().e();
            if (jE <= 0) {
                com.json.t6.this.removeView(childAt);
                com.json.t6.this.addView(view, layoutParams);
                adTools.d(new java.lang.Runnable() { // from class: com.ironsource.t6$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ironsource.t6.a.a(adTools, jE);
                    }
                });
                return;
            }
            adTools.d(new java.lang.Runnable() { // from class: com.ironsource.t6$a$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.t6.a.b(adTools, jE);
                }
            });
            view.setAlpha(0.0f);
            com.json.t6.this.addView(view, layoutParams);
            if (childAt != null) {
                final com.json.t6 t6Var = com.json.t6.this;
                childAt.animate().alpha(0.0f).setDuration(jE).withStartAction(new java.lang.Runnable() { // from class: com.ironsource.t6$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ironsource.t6.a.a(childAt);
                    }
                }).withEndAction(new java.lang.Runnable() { // from class: com.ironsource.t6$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ironsource.t6.a.a(t6Var, childAt, childAt);
                    }
                }).start();
            }
            view.animate().alpha(1.0f).setDuration(jE).withEndAction(new java.lang.Runnable() { // from class: com.ironsource.t6$a$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.t6.a.c(adTools, jE);
                }
            }).start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.viewBinder = new com.ironsource.t6.a();
    }

    public final com.json.kv getViewBinder() {
        return this.viewBinder;
    }
}
