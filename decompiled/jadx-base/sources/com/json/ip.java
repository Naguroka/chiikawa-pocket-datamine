package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016JB\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ironsource/ip;", "Lcom/ironsource/uf;", "Lcom/ironsource/uf$a;", "", "Lcom/ironsource/services/capping/PlacementName;", com.json.op.d, "Lcom/unity3d/mediation/LevelPlay$AdFormat;", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, "Lcom/ironsource/i8;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/k8;", "cappingType", "Lcom/ironsource/ze;", "cappingConfig", "Lkotlin/Result;", "", "(Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/k8;Lcom/ironsource/ze;)Ljava/lang/Object;", "b", "Lcom/ironsource/g8;", "Lcom/ironsource/g8;", "cappingService", "Lcom/ironsource/ma;", "Lcom/ironsource/ma;", "deliveryHandler", "<init>", "(Lcom/ironsource/g8;Lcom/ironsource/ma;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ip implements com.json.uf, com.ironsource.uf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.g8 cappingService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.ma deliveryHandler;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2768a;

        static {
            int[] iArr = new int[com.json.k8.values().length];
            try {
                iArr[com.json.k8.Delivery.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.json.k8.Pacing.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.json.k8.ShowCount.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f2768a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ip() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ip(com.json.g8 cappingService, com.json.ma deliveryHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deliveryHandler, "deliveryHandler");
        this.cappingService = cappingService;
        this.deliveryHandler = deliveryHandler;
    }

    public /* synthetic */ ip(com.json.g8 g8Var, com.json.ma maVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.json.g8(null, null, null, 7, null) : g8Var, (i & 2) != 0 ? new com.json.ma() : maVar);
    }

    @Override // com.json.uf
    public synchronized com.json.i8 a(java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        java.lang.String strA = new com.json.np(placementName, adFormat).a();
        com.json.i8 i8VarA = this.deliveryHandler.a(strA);
        if (i8VarA.d()) {
            return i8VarA;
        }
        return this.cappingService.a(strA);
    }

    @Override // com.ironsource.uf.a
    public synchronized java.lang.Object a(java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.json.k8 cappingType, com.json.ze cappingConfig) {
        java.lang.Object objA;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        java.lang.String strA = new com.json.np(placementName, adFormat).a();
        int i = com.ironsource.ip.a.f2768a[cappingType.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            objA = this.cappingService.a(strA, cappingType, cappingConfig);
        } else {
            objA = this.deliveryHandler.a(strA, cappingType, cappingConfig);
        }
        return objA;
    }

    @Override // com.ironsource.uf.a
    public synchronized void b(java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        java.lang.String strA = new com.json.np(placementName, adFormat).a();
        if (!this.deliveryHandler.a(strA).d()) {
            this.cappingService.b(strA);
        }
    }
}
