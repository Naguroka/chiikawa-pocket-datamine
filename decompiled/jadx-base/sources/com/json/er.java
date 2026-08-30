package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\"\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ironsource/er;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Runnable;", "runnable", "", "throwable", "", "afterExecute", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "report", "b", "log", "", "threadCount", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class er extends java.util.concurrent.ScheduledThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> report;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> log;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.er.a f2631a = new com.ironsource.er.a();

        a() {
            super(1);
        }

        public final void a(java.lang.Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            a(th);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.er.b f2632a = new com.ironsource.er.b();

        b() {
            super(1);
        }

        public final void a(java.lang.String it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
            a(str);
            return kotlin.Unit.INSTANCE;
        }
    }

    public er() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public er(int i, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> report, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> log) {
        super(i, new com.json.ek());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(report, "report");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "log");
        this.report = report;
        this.log = log;
    }

    public /* synthetic */ er(int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? com.json.fr.f2666a : i, (i2 & 2) != 0 ? com.ironsource.er.a.f2631a : function1, (i2 & 4) != 0 ? com.ironsource.er.b.f2632a : function2);
    }

    private final java.lang.String a(java.lang.String msg) {
        return com.json.er.class.getName() + " RuntimeException caught: " + msg;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(java.lang.Runnable runnable, java.lang.Throwable throwable) {
        kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> function1;
        java.lang.Throwable e;
        super.afterExecute(runnable, throwable);
        if (throwable != null) {
            this.log.invoke(a(throwable.toString()));
            this.report.invoke(throwable);
            return;
        }
        if ((runnable instanceof java.util.concurrent.Future) && ((java.util.concurrent.Future) runnable).isDone()) {
            try {
                ((java.util.concurrent.Future) runnable).get();
            } catch (java.lang.InterruptedException e2) {
                com.json.l9.d().a(e2);
                this.log.invoke(a(e2.toString()));
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.CancellationException e3) {
                e = e3;
                com.json.l9.d().a(e);
                this.log.invoke(a(e.toString()));
                function1 = this.report;
                function1.invoke(e);
            } catch (java.util.concurrent.ExecutionException e4) {
                com.json.l9.d().a(e4);
                this.log.invoke(a(e4.toString()));
                function1 = this.report;
                e = e4.getCause();
                function1.invoke(e);
            }
        }
    }
}
