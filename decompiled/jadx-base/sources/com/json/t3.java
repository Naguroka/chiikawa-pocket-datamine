package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/ironsource/t3;", "Lcom/ironsource/cp;", "", "e", "", "b", "Lcom/ironsource/lifecycle/b;", "d", "Lcom/ironsource/lifecycle/b;", "lifeCycleObserver", "Lcom/ironsource/ik;", "Lcom/ironsource/ik;", "lifecycleListener", "<init>", "(Lcom/ironsource/lifecycle/b;)V", "f", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class t3 extends com.json.cp {
    private static final java.lang.String g = "AppLifecycleTrigger";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.lifecycle.b lifeCycleObserver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.json.ik lifecycleListener;

    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ironsource/t3$b", "Lcom/ironsource/ik;", "", "c", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "d", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.ik {
        b() {
        }

        @Override // com.json.ik
        public void a() {
            com.json.t3.this.a(false);
        }

        @Override // com.json.ik
        public void b() {
        }

        @Override // com.json.ik
        public void c() {
        }

        @Override // com.json.ik
        public void d() {
            com.json.t3.this.a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(com.json.lifecycle.b lifeCycleObserver) {
        super(false, 1, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifeCycleObserver, "lifeCycleObserver");
        this.lifeCycleObserver = lifeCycleObserver;
        com.ironsource.t3.b bVar = new com.ironsource.t3.b();
        this.lifecycleListener = bVar;
        lifeCycleObserver.a(bVar);
        a(lifeCycleObserver.e());
    }

    @Override // com.json.cp
    public java.lang.String b() {
        return g;
    }

    public final void e() {
        this.lifeCycleObserver.b(this.lifecycleListener);
    }
}
