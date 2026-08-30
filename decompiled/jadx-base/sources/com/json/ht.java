package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\n\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0003j\u0002`\u000bH\u0016J:\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\u0010\u0004\u001a\u00060\u0003j\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0003j\u0002`\u000bH\u0016R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u001b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\n\u0010\u001d\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/ironsource/ht;", "Lcom/ironsource/bf;", "Lcom/ironsource/bf$a;", "", "identifier", "Lcom/ironsource/ht$a;", "c", "Lcom/ironsource/et;", "config", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/services/capping/Identifier;", "Lcom/ironsource/i8;", "Lcom/ironsource/k8;", "cappingType", "Lcom/ironsource/ze;", "cappingConfig", "Lkotlin/Result;", "", "(Ljava/lang/String;Lcom/ironsource/k8;Lcom/ironsource/ze;)Ljava/lang/Object;", "b", "Lcom/ironsource/n9;", "Lcom/ironsource/n9;", "currentTimeProvider", "Lcom/ironsource/zh;", "Lcom/ironsource/zh;", "serviceDataRepository", "", "Ljava/util/Map;", "()Ljava/util/Map;", com.json.pg.p, "<init>", "(Lcom/ironsource/n9;Lcom/ironsource/zh;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ht implements com.json.bf, com.ironsource.bf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.n9 currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.zh serviceDataRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.json.et> configs;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0003\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0003\u0010\u0015R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0003\u0010\u0019R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u0003\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ironsource/ht$a;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", "c", "()Ljava/lang/Long;", "currentNumberOfShows", "currentTime", "currentTimeThreshold", "(IJLjava/lang/Long;)Lcom/ironsource/ht$a;", "", "toString", "hashCode", "other", "", "equals", "I", "d", "()I", "(I)V", "J", "e", "()J", "(J)V", "Ljava/lang/Long;", "f", "(Ljava/lang/Long;)V", "<init>", "(IJLjava/lang/Long;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int currentNumberOfShows;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private long currentTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private java.lang.Long currentTimeThreshold;

        public a(int i, long j, java.lang.Long l) {
            this.currentNumberOfShows = i;
            this.currentTime = j;
            this.currentTimeThreshold = l;
        }

        public static /* synthetic */ com.ironsource.ht.a a(com.ironsource.ht.a aVar, int i, long j, java.lang.Long l, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.currentNumberOfShows;
            }
            if ((i2 & 2) != 0) {
                j = aVar.currentTime;
            }
            if ((i2 & 4) != 0) {
                l = aVar.currentTimeThreshold;
            }
            return aVar.a(i, j, l);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCurrentNumberOfShows() {
            return this.currentNumberOfShows;
        }

        public final com.ironsource.ht.a a(int currentNumberOfShows, long currentTime, java.lang.Long currentTimeThreshold) {
            return new com.ironsource.ht.a(currentNumberOfShows, currentTime, currentTimeThreshold);
        }

        public final void a(int i) {
            this.currentNumberOfShows = i;
        }

        public final void a(long j) {
            this.currentTime = j;
        }

        public final void a(java.lang.Long l) {
            this.currentTimeThreshold = l;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getCurrentTime() {
            return this.currentTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final java.lang.Long getCurrentTimeThreshold() {
            return this.currentTimeThreshold;
        }

        public final int d() {
            return this.currentNumberOfShows;
        }

        public final long e() {
            return this.currentTime;
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.ironsource.ht.a)) {
                return false;
            }
            com.ironsource.ht.a aVar = (com.ironsource.ht.a) other;
            return this.currentNumberOfShows == aVar.currentNumberOfShows && this.currentTime == aVar.currentTime && kotlin.jvm.internal.Intrinsics.areEqual(this.currentTimeThreshold, aVar.currentTimeThreshold);
        }

        public final java.lang.Long f() {
            return this.currentTimeThreshold;
        }

        public int hashCode() {
            int iHashCode = ((java.lang.Integer.hashCode(this.currentNumberOfShows) * 31) + java.lang.Long.hashCode(this.currentTime)) * 31;
            java.lang.Long l = this.currentTimeThreshold;
            return iHashCode + (l == null ? 0 : l.hashCode());
        }

        public java.lang.String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.currentNumberOfShows + ", currentTime=" + this.currentTime + ", currentTimeThreshold=" + this.currentTimeThreshold + ')';
        }
    }

    public ht(com.json.n9 currentTimeProvider, com.json.zh serviceDataRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceDataRepository, "serviceDataRepository");
        this.currentTimeProvider = currentTimeProvider;
        this.serviceDataRepository = serviceDataRepository;
        this.configs = new java.util.LinkedHashMap();
    }

    private final boolean a(com.json.et config, java.lang.String identifier) {
        com.ironsource.ht.a aVarC = c(identifier);
        java.lang.Long lF = aVarC.f();
        if (lF != null) {
            return aVarC.d() >= config.getMaxImpressions() && this.currentTimeProvider.a() < lF.longValue();
        }
        return false;
    }

    private final com.ironsource.ht.a c(java.lang.String identifier) {
        return new com.ironsource.ht.a(this.serviceDataRepository.a(identifier), this.currentTimeProvider.a(), this.serviceDataRepository.b(identifier));
    }

    @Override // com.json.bf
    public com.json.i8 a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.json.et etVar = this.configs.get(identifier);
        if (etVar != null && a(etVar, identifier)) {
            return new com.json.i8(true, com.json.k8.ShowCount);
        }
        return new com.json.i8(false, null, 2, null);
    }

    @Override // com.ironsource.bf.a
    public java.lang.Object a(java.lang.String identifier, com.json.k8 cappingType, com.json.ze cappingConfig) {
        java.lang.Object objCreateFailure;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        java.lang.Object objC = cappingConfig.c();
        if (!kotlin.Result.m1308isSuccessimpl(objC)) {
            java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objC);
            if (thM1304exceptionOrNullimpl != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                objCreateFailure = kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl);
            }
            return kotlin.Result.m1301constructorimpl(objCreateFailure);
        }
        com.json.et etVar = (com.json.et) objC;
        if (etVar != null) {
            this.configs.put(identifier, etVar);
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        objCreateFailure = kotlin.Unit.INSTANCE;
        return kotlin.Result.m1301constructorimpl(objCreateFailure);
    }

    public final java.util.Map<java.lang.String, com.json.et> a() {
        return this.configs;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    @Override // com.ironsource.bf.a
    public void b(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.json.et etVar = this.configs.get(identifier);
        if (etVar == null) {
            return;
        }
        com.ironsource.ht.a aVarC = c(identifier);
        if (aVarC.d() != 0) {
            long jE = aVarC.e();
            java.lang.Long lF = aVarC.f();
            if (jE >= (lF != null ? lF.longValue() : 0L)) {
                this.serviceDataRepository.a(aVarC.e() + com.json.j8.a(etVar.getUnit(), null, 1, null), identifier);
                aVarC.a(0);
            }
        } else {
            this.serviceDataRepository.a(aVarC.e() + com.json.j8.a(etVar.getUnit(), null, 1, null), identifier);
            aVarC.a(0);
        }
        aVarC.a(aVarC.d() + 1);
        this.serviceDataRepository.a(aVarC.d(), identifier);
    }
}
