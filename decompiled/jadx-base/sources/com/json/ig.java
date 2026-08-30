package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/ironsource/ig;", "T", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface ig<T> {

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\rR$\u0010\f\u001a\u0004\u0018\u00018\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/ironsource/ig$a;", "ListenerType", "Lcom/ironsource/ig;", "Ljava/lang/Runnable;", "runnable", "", "predicate", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "instanceId", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static class a<ListenerType> implements com.json.ig<ListenerType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private ListenerType listener;

        /* JADX INFO: renamed from: com.ironsource.ig$a$a, reason: collision with other inner class name */
        @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/ig$a$a", "Lcom/ironsource/dr;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0236a extends com.json.dr {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.Runnable f2741a;

            C0236a(java.lang.Runnable runnable) {
                this.f2741a = runnable;
            }

            @Override // com.json.dr
            public void a() {
                this.f2741a.run();
            }
        }

        public static /* synthetic */ void a(com.ironsource.ig.a aVar, java.lang.Runnable runnable, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.a(runnable, z);
        }

        public final ListenerType a() {
            return this.listener;
        }

        @Override // com.json.ig
        public void a(ListenerType listener) {
            this.listener = listener;
        }

        public final void a(java.lang.Runnable runnable, boolean predicate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (predicate) {
                com.json.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.json.environment.thread.IronSourceThreadManager.INSTANCE, new com.ironsource.ig.a.C0236a(runnable), 0L, 2, null);
            }
        }

        public final void a(java.lang.String instanceId, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            com.json.mediationsdk.logger.IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }

        public final void b(ListenerType listenertype) {
            this.listener = listenertype;
        }
    }

    void a(T listener);
}
