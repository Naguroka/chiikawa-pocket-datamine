package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016J:\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ironsource/ma;", "Lcom/ironsource/bf;", "Lcom/ironsource/bf$a;", "", "Lcom/ironsource/services/capping/Identifier;", "identifier", "Lcom/ironsource/i8;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/k8;", "cappingType", "Lcom/ironsource/ze;", "cappingConfig", "Lkotlin/Result;", "", "(Ljava/lang/String;Lcom/ironsource/k8;Lcom/ironsource/ze;)Ljava/lang/Object;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ironsource/ja;", "Ljava/util/concurrent/ConcurrentHashMap;", "deliveryConfigs", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ma implements com.json.bf, com.ironsource.bf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.ja> deliveryConfigs = new java.util.concurrent.ConcurrentHashMap<>();

    @Override // com.json.bf
    public com.json.i8 a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.json.ja jaVar = this.deliveryConfigs.get(identifier);
        return (jaVar == null || jaVar.getEnabled()) ? new com.json.i8(false, null, 2, null) : new com.json.i8(true, com.json.k8.Delivery);
    }

    @Override // com.ironsource.bf.a
    public java.lang.Object a(java.lang.String identifier, com.json.k8 cappingType, com.json.ze cappingConfig) {
        java.lang.Object objCreateFailure;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        java.lang.Object objA = cappingConfig.a();
        if (!kotlin.Result.m1308isSuccessimpl(objA)) {
            java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objA);
            if (thM1304exceptionOrNullimpl != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                objCreateFailure = kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl);
            }
            return kotlin.Result.m1301constructorimpl(objCreateFailure);
        }
        com.json.ja jaVar = (com.json.ja) objA;
        if (jaVar != null) {
            this.deliveryConfigs.put(identifier, jaVar);
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        objCreateFailure = kotlin.Unit.INSTANCE;
        return kotlin.Result.m1301constructorimpl(objCreateFailure);
    }

    @Override // com.ironsource.bf.a
    public void b(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
    }
}
