package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ironsource/s3;", "Lcom/ironsource/k4;", "Lcom/ironsource/ik;", "observer", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class s3 implements com.json.k4 {

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/s3$a;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "", "other", "", "equals", "", "hashCode", "Lcom/ironsource/ik;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ik;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/ironsource/ik;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    static final class a implements androidx.lifecycle.LifecycleEventObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.json.ik listener;

        /* JADX INFO: renamed from: com.ironsource.s3$a$a, reason: collision with other inner class name */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C0243a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3264a;

            static {
                int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                f3264a = iArr;
            }
        }

        public a(com.json.ik listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            this.listener = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(androidx.lifecycle.Lifecycle.Event event, com.ironsource.s3.a this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "$event");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            int i = com.ironsource.s3.a.C0243a.f3264a[event.ordinal()];
            if (i == 1) {
                this$0.listener.c();
                return;
            }
            if (i == 2) {
                this$0.listener.a();
            } else if (i == 3) {
                this$0.listener.d();
            } else {
                if (i != 4) {
                    return;
                }
                this$0.listener.b();
            }
        }

        public boolean equals(java.lang.Object other) {
            com.json.ik ikVar = this.listener;
            com.ironsource.s3.a aVar = other instanceof com.ironsource.s3.a ? (com.ironsource.s3.a) other : null;
            return kotlin.jvm.internal.Intrinsics.areEqual(ikVar, aVar != null ? aVar.listener : null);
        }

        public int hashCode() {
            return this.listener.hashCode();
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(androidx.lifecycle.LifecycleOwner source, final androidx.lifecycle.Lifecycle.Event event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            com.json.environment.thread.IronSourceThreadManager.postMediationBackgroundTask$default(com.json.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.s3$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.s3.a.a(event, this);
                }
            }, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.json.ik observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "$observer");
        androidx.lifecycle.ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(new com.ironsource.s3.a(observer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.json.ik observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "$observer");
        androidx.lifecycle.ProcessLifecycleOwner.INSTANCE.get().getLifecycle().removeObserver(new com.ironsource.s3.a(observer));
    }

    @Override // com.json.k4
    public void a(final com.json.ik observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.json.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.json.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.s3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.s3.c(observer);
            }
        }, 0L, 2, null);
    }

    @Override // com.json.k4
    public void b(final com.json.ik observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.json.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.json.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.s3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.s3.d(observer);
            }
        }, 0L, 2, null);
    }
}
