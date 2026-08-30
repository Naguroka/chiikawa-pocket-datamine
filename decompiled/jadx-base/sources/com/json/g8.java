package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016J:\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/ironsource/g8;", "Lcom/ironsource/bf;", "Lcom/ironsource/bf$a;", "", "Lcom/ironsource/services/capping/Identifier;", "identifier", "Lcom/ironsource/i8;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/k8;", "cappingType", "Lcom/ironsource/ze;", "cappingConfig", "Lkotlin/Result;", "", "(Ljava/lang/String;Lcom/ironsource/k8;Lcom/ironsource/ze;)Ljava/lang/Object;", "b", "Lcom/ironsource/vo;", "Lcom/ironsource/vo;", "pacingHandler", "Lcom/ironsource/ht;", "Lcom/ironsource/ht;", "showCountHandler", "Lcom/ironsource/n9;", "currentTimeProvider", "Lcom/ironsource/tf;", "pacingDataRepository", "Lcom/ironsource/zh;", "showCountDataRepository", "<init>", "(Lcom/ironsource/n9;Lcom/ironsource/tf;Lcom/ironsource/zh;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class g8 implements com.json.bf, com.ironsource.bf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.vo pacingHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.ht showCountHandler;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2680a;

        static {
            int[] iArr = new int[com.json.k8.values().length];
            try {
                iArr[com.json.k8.Pacing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.json.k8.ShowCount.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.json.k8.Delivery.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f2680a = iArr;
        }
    }

    public g8() {
        this(null, null, null, 7, null);
    }

    public g8(com.json.n9 currentTimeProvider, com.json.tf pacingDataRepository, com.json.zh showCountDataRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pacingDataRepository, "pacingDataRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showCountDataRepository, "showCountDataRepository");
        this.pacingHandler = new com.json.vo(currentTimeProvider, pacingDataRepository);
        this.showCountHandler = new com.json.ht(currentTimeProvider, showCountDataRepository);
    }

    public /* synthetic */ g8(com.json.n9 n9Var, com.json.tf tfVar, com.json.zh zhVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        n9Var = (i & 1) != 0 ? new com.ironsource.n9.a() : n9Var;
        if ((i & 2) != 0) {
            android.content.Context applicationContext = com.json.environment.ContextProvider.getInstance().getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
            tfVar = new com.json.wo(new com.json.ct(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i & 4) != 0) {
            android.content.Context applicationContext2 = com.json.environment.ContextProvider.getInstance().getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "getInstance().applicationContext");
            zhVar = new com.json.ft(new com.json.ct(applicationContext2, "capping_service", null, 4, null));
        }
        this(n9Var, tfVar, zhVar);
    }

    @Override // com.json.bf
    public synchronized com.json.i8 a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.json.i8 i8VarA = this.pacingHandler.a(identifier);
        if (i8VarA.d()) {
            return i8VarA;
        }
        return this.showCountHandler.a(identifier);
    }

    @Override // com.ironsource.bf.a
    public synchronized java.lang.Object a(java.lang.String identifier, com.json.k8 cappingType, com.json.ze cappingConfig) {
        java.lang.Object objA;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        int i = com.ironsource.g8.a.f2680a[cappingType.ordinal()];
        if (i == 1) {
            objA = this.pacingHandler.a(identifier, cappingType, cappingConfig);
        } else if (i == 2) {
            objA = this.showCountHandler.a(identifier, cappingType, cappingConfig);
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objA = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
        }
        return objA;
    }

    @Override // com.ironsource.bf.a
    public synchronized void b(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.pacingHandler.b(identifier);
        this.showCountHandler.b(identifier);
    }
}
