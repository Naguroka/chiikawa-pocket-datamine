package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ironsource/st;", "", "Ljava/lang/Runnable;", "action", "", "delay", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/er;", "b", "Lkotlin/Lazy;", "()Lcom/ironsource/er;", "longBlockingTasksExecutorService", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class st {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.st f3417a = new com.json.st();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final kotlin.Lazy longBlockingTasksExecutorService = kotlin.LazyKt.lazy(com.ironsource.st.a.f3418a);

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/er;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/er;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.er> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.st.a f3418a = new com.ironsource.st.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.er invoke() {
            return new com.json.er(16, null, null, 6, null);
        }
    }

    private st() {
    }

    private final com.json.er a() {
        return (com.json.er) longBlockingTasksExecutorService.getValue();
    }

    public static /* synthetic */ void a(com.json.st stVar, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        stVar.a(runnable, j);
    }

    public final void a(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, null);
    }

    public final void a(java.lang.Runnable action, long delay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        a().schedule(action, delay, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
