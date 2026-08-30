package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00052\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/e9;", "", "Lcom/ironsource/e9$d;", "callback", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface e9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final com.json.e9.Companion INSTANCE = com.json.e9.Companion.f2610a;

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/e9$a;", "Lcom/ironsource/e9;", "Lcom/ironsource/e9$d;", "callback", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/me;", "b", "Lcom/ironsource/me;", "config", "Lcom/ironsource/tu;", "c", "Lcom/ironsource/tu;", "timer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isProcessing", "<init>", "(Lcom/ironsource/me;Lcom/ironsource/tu;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.e9 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final com.json.me config;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final com.json.tu timer;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final java.util.concurrent.atomic.AtomicBoolean isProcessing;

        /* JADX INFO: renamed from: com.ironsource.e9$a$a, reason: collision with other inner class name */
        @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/e9$a$a", "Lcom/ironsource/tu$a;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0232a implements com.ironsource.tu.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ironsource.e9.d f2609a;
            final /* synthetic */ com.ironsource.e9.a b;

            C0232a(com.ironsource.e9.d dVar, com.ironsource.e9.a aVar) {
                this.f2609a = dVar;
                this.b = aVar;
            }

            @Override // com.ironsource.tu.a
            public void a() {
                this.f2609a.a(new com.ironsource.qe.a(new com.ironsource.ne.a(this.b.config.getRecoveryStrategy())));
                this.b.isProcessing.set(false);
            }
        }

        public a(com.json.me config, com.json.tu timer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "timer");
            this.config = config;
            this.timer = timer;
            this.isProcessing = new java.util.concurrent.atomic.AtomicBoolean(false);
        }

        @Override // com.json.e9
        public synchronized void a() {
            this.timer.cancel();
            this.isProcessing.set(false);
        }

        @Override // com.json.e9
        public synchronized void a(com.ironsource.e9.d callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.isProcessing.compareAndSet(false, true)) {
                this.timer.a(new com.ironsource.e9.a.C0232a(callback, this));
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ironsource/e9$b;", "Lcom/ironsource/e9;", "Lcom/ironsource/e9$d;", "callback", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.e9 {
        public static final com.ironsource.e9.b b = new com.ironsource.e9.b();

        private b() {
        }

        @Override // com.json.e9
        public void a() {
        }

        @Override // com.json.e9
        public void a(com.ironsource.e9.d callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.e9$c, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/ironsource/e9$c;", "", "Lcom/ironsource/oe;", "featureFlag", "Lcom/ironsource/e9;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ com.json.e9.Companion f2610a = new com.json.e9.Companion();

        private Companion() {
        }

        public final com.json.e9 a() {
            return com.ironsource.e9.b.b;
        }

        @kotlin.jvm.JvmStatic
        public final com.json.e9 a(com.json.oe featureFlag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.c()) {
                return com.ironsource.e9.b.b;
            }
            com.json.le leVar = new com.json.le(featureFlag);
            com.ironsource.tu.b bVar = new com.ironsource.tu.b();
            bVar.b(leVar.getTimeoutInMills());
            bVar.a(leVar.getTimeoutInMills());
            return new com.ironsource.e9.a(leVar, new com.ironsource.tu.d().a(bVar));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/ironsource/e9$d;", "", "Lcom/ironsource/qe;", "result", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface d {
        void a(com.json.qe result);
    }

    @kotlin.jvm.JvmStatic
    static com.json.e9 a(com.json.oe oeVar) {
        return INSTANCE.a(oeVar);
    }

    void a();

    void a(com.ironsource.e9.d callback);
}
