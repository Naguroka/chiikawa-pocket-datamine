package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0012\u0018\u00002\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/ironsource/pt;", "Lcom/ironsource/bp;", "", "c", "Lcom/ironsource/pt$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "", "e", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "J", "timeout", "timePassed", "d", "resumeTimeStamp", "pausedTimeStamp", "com/ironsource/pt$b", "f", "Lcom/ironsource/pt$b;", "safeTask", "()J", "remainingTime", "Ljava/lang/Runnable;", "task", "<init>", "(Landroid/os/Handler;Ljava/lang/Runnable;J)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pt implements com.json.bp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final android.os.Handler handler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long timeout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long timePassed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long resumeTimeStamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long pausedTimeStamp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final com.ironsource.pt.b safeTask;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/pt$a;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "remainingTime", "timePassed", "", "toString", "", "hashCode", "other", "", "equals", "J", "c", "()J", "d", "<init>", "(JJ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long remainingTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long timePassed;

        public a(long j, long j2) {
            this.remainingTime = j;
            this.timePassed = j2;
        }

        public static /* synthetic */ com.ironsource.pt.a a(com.ironsource.pt.a aVar, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = aVar.remainingTime;
            }
            if ((i & 2) != 0) {
                j2 = aVar.timePassed;
            }
            return aVar.a(j, j2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getRemainingTime() {
            return this.remainingTime;
        }

        public final com.ironsource.pt.a a(long remainingTime, long timePassed) {
            return new com.ironsource.pt.a(remainingTime, timePassed);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTimePassed() {
            return this.timePassed;
        }

        public final long c() {
            return this.remainingTime;
        }

        public final long d() {
            return this.timePassed;
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.ironsource.pt.a)) {
                return false;
            }
            com.ironsource.pt.a aVar = (com.ironsource.pt.a) other;
            return this.remainingTime == aVar.remainingTime && this.timePassed == aVar.timePassed;
        }

        public int hashCode() {
            return (java.lang.Long.hashCode(this.remainingTime) * 31) + java.lang.Long.hashCode(this.timePassed);
        }

        public java.lang.String toString() {
            return "Status(remainingTime=" + this.remainingTime + ", timePassed=" + this.timePassed + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/pt$b", "Lcom/ironsource/dr;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends com.json.dr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f3172a;

        b(java.lang.Runnable runnable) {
            this.f3172a = runnable;
        }

        @Override // com.json.dr
        public void a() {
            this.f3172a.run();
        }
    }

    public pt(android.os.Handler handler, java.lang.Runnable task, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        this.handler = handler;
        this.timeout = j;
        this.safeTask = new com.ironsource.pt.b(task);
        this.pausedTimeStamp = c();
        a();
    }

    private final long c() {
        return java.lang.System.currentTimeMillis();
    }

    private final long d() {
        return this.timeout - this.timePassed;
    }

    @Override // com.json.bp
    public com.ironsource.pt.a a() {
        if (e()) {
            this.resumeTimeStamp = c();
            this.pausedTimeStamp = 0L;
            this.handler.postDelayed(this.safeTask, d());
        }
        return new com.ironsource.pt.a(d(), this.timePassed);
    }

    @Override // com.json.bp
    public com.ironsource.pt.a b() {
        if (!e()) {
            long jC = c();
            this.pausedTimeStamp = jC;
            this.timePassed += jC - this.resumeTimeStamp;
            this.handler.removeCallbacks(this.safeTask);
        }
        return new com.ironsource.pt.a(d(), this.timePassed);
    }

    public final boolean e() {
        return this.pausedTimeStamp > 0;
    }
}
