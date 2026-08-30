package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J%\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ironsource/ie;", "Lcom/ironsource/qt;", "Lcom/ironsource/qt$a;", "scheduleTask", "Ljava/lang/Runnable;", "task", "Lcom/ironsource/dr;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/time/Duration;", "delay", "(Ljava/lang/Runnable;J)Lcom/ironsource/qt$a;", "Lcom/ironsource/ie$a;", "Lcom/ironsource/ie$a;", "handler", "<init>", "(Lcom/ironsource/ie$a;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ie implements com.json.qt {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.ironsource.ie.a handler;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/ie$a;", "", "Ljava/lang/Runnable;", "runnable", "", "delay", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(java.lang.Runnable runnable, long delay);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/ie$b", "Lcom/ironsource/dr;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends com.json.dr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.qt.a f2738a;
        final /* synthetic */ java.lang.Runnable b;

        b(com.ironsource.qt.a aVar, java.lang.Runnable runnable) {
            this.f2738a = aVar;
            this.b = runnable;
        }

        @Override // com.json.dr
        public void a() {
            if (this.f2738a.getCancelled()) {
                return;
            }
            this.b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ie() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ie(com.ironsource.ie.a handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
    }

    public /* synthetic */ ie(com.ironsource.ie.a aVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.json.Handler.a(new android.os.Handler(android.os.Looper.getMainLooper())) : aVar);
    }

    private final com.json.dr a(com.ironsource.qt.a scheduleTask, java.lang.Runnable task) {
        return new com.ironsource.ie.b(scheduleTask, task);
    }

    @Override // com.json.qt
    public com.ironsource.qt.a a(java.lang.Runnable task, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        com.ironsource.qt.a aVar = new com.ironsource.qt.a();
        this.handler.a(a(aVar, task), kotlin.time.Duration.m2646getInWholeMillisecondsimpl(delay));
        return aVar;
    }
}
