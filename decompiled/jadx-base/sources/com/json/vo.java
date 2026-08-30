package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0005j\u0002`\tH\u0016J:\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0006\u001a\u00060\u0005j\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00102\n\u0010\u0006\u001a\u00060\u0005j\u0002`\tH\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\b\u0010\u001c\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/ironsource/vo;", "Lcom/ironsource/bf;", "Lcom/ironsource/bf$a;", "Lcom/ironsource/uo;", "config", "", "identifier", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/services/capping/Identifier;", "Lcom/ironsource/i8;", "Lcom/ironsource/k8;", "cappingType", "Lcom/ironsource/ze;", "cappingConfig", "Lkotlin/Result;", "", "(Ljava/lang/String;Lcom/ironsource/k8;Lcom/ironsource/ze;)Ljava/lang/Object;", "b", "Lcom/ironsource/n9;", "Lcom/ironsource/n9;", "currentTimeProvider", "Lcom/ironsource/tf;", "Lcom/ironsource/tf;", "repository", "", "c", "Ljava/util/Map;", "()Ljava/util/Map;", com.json.pg.p, "<init>", "(Lcom/ironsource/n9;Lcom/ironsource/tf;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class vo implements com.json.bf, com.ironsource.bf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.n9 currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.tf repository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.json.uo> configs;

    public vo(com.json.n9 currentTimeProvider, com.json.tf repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "repository");
        this.currentTimeProvider = currentTimeProvider;
        this.repository = repository;
        this.configs = new java.util.LinkedHashMap();
    }

    private final boolean a(com.json.uo config, java.lang.String identifier) {
        java.lang.Long lA = this.repository.a(identifier);
        if (lA == null) {
            return false;
        }
        lA.longValue();
        return this.currentTimeProvider.a() - lA.longValue() < config.getTimeInterval();
    }

    @Override // com.json.bf
    public com.json.i8 a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.json.uo uoVar = this.configs.get(identifier);
        if (uoVar != null && a(uoVar, identifier)) {
            return new com.json.i8(true, com.json.k8.Pacing);
        }
        return new com.json.i8(false, null, 2, null);
    }

    @Override // com.ironsource.bf.a
    public java.lang.Object a(java.lang.String identifier, com.json.k8 cappingType, com.json.ze cappingConfig) {
        java.lang.Object objCreateFailure;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        java.lang.Object objB = cappingConfig.b();
        if (!kotlin.Result.m1308isSuccessimpl(objB)) {
            java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objB);
            if (thM1304exceptionOrNullimpl != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                objCreateFailure = kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl);
            }
            return kotlin.Result.m1301constructorimpl(objCreateFailure);
        }
        com.json.uo uoVar = (com.json.uo) objB;
        if (uoVar != null) {
            this.configs.put(identifier, uoVar);
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        objCreateFailure = kotlin.Unit.INSTANCE;
        return kotlin.Result.m1301constructorimpl(objCreateFailure);
    }

    public final java.util.Map<java.lang.String, com.json.uo> a() {
        return this.configs;
    }

    @Override // com.ironsource.bf.a
    public void b(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.configs.get(identifier) == null) {
            return;
        }
        this.repository.a(this.currentTimeProvider.a(), identifier);
    }
}
