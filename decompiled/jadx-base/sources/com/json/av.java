package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\tH\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0006\u0010\f\u001a\u00020\u0004R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ironsource/av;", "Lcom/ironsource/dp;", "", "trigger", "", "b", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/pt$a;", "countDownStatus", "", "Lcom/ironsource/cp;", "pauseableTrigger", "c", "Lcom/ironsource/l1;", "Lcom/ironsource/l1;", "adTools", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "task", "", "J", "timeout", "", "d", "Ljava/util/List;", "pauseTriggers", "Lcom/ironsource/pt;", "e", "Lcom/ironsource/pt;", "taskCountdown", "<init>", "(Lcom/ironsource/l1;Ljava/lang/Runnable;JLjava/util/List;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class av implements com.json.dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.l1 adTools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.Runnable task;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long timeout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final java.util.List<com.json.cp> pauseTriggers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.pt taskCountdown;

    /* JADX WARN: Multi-variable type inference failed */
    public av(com.json.l1 adTools, java.lang.Runnable task, long j, java.util.List<? extends com.json.cp> pauseTriggers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pauseTriggers, "pauseTriggers");
        this.adTools = adTools;
        this.task = task;
        this.timeout = j;
        this.pauseTriggers = pauseTriggers;
        this.taskCountdown = new com.json.pt(adTools.a(), new java.lang.Runnable() { // from class: com.ironsource.av$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.json.av.b(this.f$0);
            }
        }, j);
        for (com.json.cp cpVar : pauseTriggers) {
            cpVar.a(this);
            if (cpVar.getIsPaused()) {
                a(cpVar.b());
            }
        }
        if (a()) {
            com.ironsource.pt.a aVarB = this.taskCountdown.b();
            java.util.List<com.json.cp> list = this.pauseTriggers;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((com.json.cp) obj).getIsPaused()) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                long pausedTimeStamp = ((com.json.cp) next).getPausedTimeStamp();
                do {
                    java.lang.Object next2 = it.next();
                    long pausedTimeStamp2 = ((com.json.cp) next2).getPausedTimeStamp();
                    if (pausedTimeStamp > pausedTimeStamp2) {
                        next = next2;
                        pausedTimeStamp = pausedTimeStamp2;
                    }
                } while (it.hasNext());
            }
            a(((com.json.cp) next).b(), aVarB);
        }
    }

    public /* synthetic */ av(com.json.l1 l1Var, java.lang.Runnable runnable, long j, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(l1Var, runnable, j, (i & 8) != 0 ? new java.util.ArrayList() : list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.av this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.util.Iterator<com.json.cp> it = this$0.pauseTriggers.iterator();
        while (it.hasNext()) {
            it.next().a((com.json.dp) null);
        }
        this$0.taskCountdown.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.av this$0, com.json.cp pauseableTrigger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pauseableTrigger, "$pauseableTrigger");
        this$0.a(pauseableTrigger.b());
        if (!this$0.a() || this$0.taskCountdown.e()) {
            return;
        }
        this$0.a(pauseableTrigger.b(), this$0.taskCountdown.b());
    }

    private final void a(java.lang.String trigger) {
        this.adTools.getEventSender().getTroubleshoot().d(trigger);
    }

    private final void a(java.lang.String trigger, com.ironsource.pt.a countDownStatus) {
        this.adTools.getEventSender().getTroubleshoot().a(trigger, this.timeout, countDownStatus.c(), countDownStatus.d());
    }

    private final boolean a() {
        java.util.List<com.json.cp> list = this.pauseTriggers;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((com.json.cp) it.next()).getIsPaused()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void b() {
        c();
        this.task.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.av this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.json.av this$0, com.json.cp pauseableTrigger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pauseableTrigger, "$pauseableTrigger");
        this$0.b(pauseableTrigger.b());
        if (this$0.a() || !this$0.taskCountdown.e()) {
            return;
        }
        this$0.b(pauseableTrigger.b(), this$0.taskCountdown.a());
    }

    private final void b(java.lang.String trigger) {
        this.adTools.getEventSender().getTroubleshoot().e(trigger);
    }

    private final void b(java.lang.String trigger, com.ironsource.pt.a countDownStatus) {
        this.adTools.getEventSender().getTroubleshoot().b(trigger, this.timeout, countDownStatus.c(), countDownStatus.d());
    }

    @Override // com.json.dp
    public void a(final com.json.cp pauseableTrigger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pauseableTrigger, "pauseableTrigger");
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.av$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.json.av.a(this.f$0, pauseableTrigger);
            }
        });
    }

    @Override // com.json.dp
    public void b(final com.json.cp pauseableTrigger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pauseableTrigger, "pauseableTrigger");
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.av$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.av.b(this.f$0, pauseableTrigger);
            }
        });
    }

    public final void c() {
        this.adTools.d(new java.lang.Runnable() { // from class: com.ironsource.av$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.json.av.a(this.f$0);
            }
        });
    }
}
