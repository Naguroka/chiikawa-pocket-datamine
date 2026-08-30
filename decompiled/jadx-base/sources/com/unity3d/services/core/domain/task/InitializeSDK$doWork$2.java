package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeSDK.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", i = {0, 1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10}, l = {44, 49, 51, 56, 58, 62, 65, 80, 83, 91, 94, 97}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "configuration", "resetResult", "$this$withContext", "configuration", "$this$withContext", "configResult", "configuration", "$this$withContext", "configResult", "configuration", "loadCacheResult", "configResult", "configResult", "loadWebResult", "configResult", "configResult"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$2", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$1", "L$1", "L$2", "L$1", "L$1"})
final class InitializeSDK$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$2(com.unity3d.services.core.domain.task.InitializeSDK initializeSDK, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeSDK$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.services.core.domain.task.InitializeSDK$doWork$2 initializeSDK$doWork$2 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$2(this.this$0, continuation);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeSDK$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0299 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:102:0x02a4 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d6 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:115:0x0307 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x0312 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x032f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0336  */
    /* JADX WARN: Code duplicated, block: B:126:0x033c  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0125 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:55:0x0162 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0169 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x017e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0185 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0193 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b8 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x01f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x01f7 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x020e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0215 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0223 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x022e A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0238 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x027e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x0285 A[Catch: all -> 0x031e, CancellationException -> 0x034b, TryCatch #2 {CancellationException -> 0x034b, all -> 0x031e, blocks: (B:6:0x0014, B:116:0x0308, B:9:0x0025, B:113:0x02e9, B:12:0x0030, B:108:0x02d0, B:110:0x02d6, B:15:0x0043, B:101:0x029a, B:104:0x02aa, B:18:0x004e, B:96:0x027f, B:98:0x0285, B:22:0x005e, B:82:0x020f, B:84:0x0215, B:85:0x0222, B:25:0x0076, B:77:0x01f1, B:79:0x01f7, B:86:0x0223, B:88:0x022e, B:90:0x0238, B:92:0x023e, B:93:0x025b, B:102:0x02a4, B:117:0x0312, B:118:0x031d, B:28:0x0092, B:74:0x01ce, B:31:0x00a3, B:69:0x01b2, B:71:0x01b8, B:34:0x00b3, B:61:0x017f, B:63:0x0185, B:64:0x0192, B:37:0x00c9, B:56:0x0163, B:58:0x0169, B:65:0x0193, B:40:0x00df, B:47:0x011f, B:49:0x0125, B:50:0x0139, B:53:0x0145, B:43:0x00f2), top: B:131:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objM1301constructorimpl;
        java.lang.Throwable thM1304exceptionOrNullimpl;
        com.unity3d.services.core.domain.task.InitializeSDK initializeSDK;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object value;
        java.lang.Throwable thM1304exceptionOrNullimpl2;
        com.unity3d.services.core.configuration.Configuration configuration;
        com.unity3d.services.core.configuration.Configuration configuration2;
        java.lang.Object value2;
        com.unity3d.services.core.configuration.Configuration configuration3;
        java.lang.Object obj2;
        java.lang.Object obj3;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        com.unity3d.services.core.domain.task.InitializeSDK initializeSDK2;
        java.lang.Object value3;
        com.unity3d.services.core.configuration.Configuration configuration4;
        com.unity3d.services.core.configuration.ErrorState errorState;
        java.lang.Throwable thM1304exceptionOrNullimpl3;
        java.lang.Throwable thM1304exceptionOrNullimpl4;
        com.unity3d.services.core.domain.task.InitializationException initializationExceptionOrThrow;
        java.lang.Object value4;
        com.unity3d.services.core.configuration.Configuration configuration5;
        java.lang.Object obj4;
        com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult loadCacheResult;
        java.lang.String webViewData;
        java.lang.Object value5;
        com.unity3d.services.core.configuration.ErrorState errorState2;
        java.lang.Throwable thM1304exceptionOrNullimpl5;
        java.lang.Throwable thM1304exceptionOrNullimpl6;
        java.lang.Object obj5;
        com.unity3d.services.core.domain.task.InitializationException initializationExceptionOrThrow2;
        java.lang.Object value6;
        java.lang.Object obj6;
        com.unity3d.services.core.domain.task.InitializeSDK initializeSDK3;
        com.unity3d.services.core.domain.task.InitializationException initializationExceptionOrThrow3;
        java.lang.Object value7;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScope coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    initializeSDK = this.this$0;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().didInitStart();
                    com.unity3d.services.core.lifecycle.CachedLifecycle.register();
                    com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                    com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage configFileFromLocalStorage = initializeSDK.configFileFromLocalStorage;
                    com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params params = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params(null, 1, null);
                    this.L$0 = coroutineScope3;
                    this.L$1 = initializeSDK;
                    this.label = 1;
                    java.lang.Object obj7 = configFileFromLocalStorage.mo1219invokegIAlus(params, this);
                    if (obj7 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope = coroutineScope3;
                    value = obj7;
                    thM1304exceptionOrNullimpl2 = kotlin.Result.m1304exceptionOrNullimpl(value);
                    if (thM1304exceptionOrNullimpl2 != null) {
                        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + thM1304exceptionOrNullimpl2.getMessage());
                    }
                    configuration = new com.unity3d.services.core.configuration.Configuration();
                    if (kotlin.Result.m1307isFailureimpl(value)) {
                        value = configuration;
                    }
                    configuration2 = (com.unity3d.services.core.configuration.Configuration) value;
                    com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset = initializeSDK.initializeStateReset;
                    com.unity3d.services.core.domain.task.InitializeStateReset.Params params2 = new com.unity3d.services.core.domain.task.InitializeStateReset.Params(configuration2);
                    this.L$0 = coroutineScope;
                    this.L$1 = initializeSDK;
                    this.L$2 = configuration2;
                    this.label = 2;
                    value2 = initializeStateReset.mo1219invokegIAlus(params2, this);
                    if (value2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    configuration3 = configuration2;
                    obj2 = value2;
                    if (!kotlin.Result.m1307isFailureimpl(obj2)) {
                        com.unity3d.services.core.domain.task.InitializeStateConfig initializeStateConfig = initializeSDK.initializeStateConfig;
                        com.unity3d.services.core.domain.task.InitializeStateConfig.Params params3 = new com.unity3d.services.core.domain.task.InitializeStateConfig.Params(configuration3);
                        this.L$0 = coroutineScope;
                        this.L$1 = initializeSDK;
                        this.L$2 = configuration3;
                        this.label = 4;
                        obj3 = initializeStateConfig.mo1219invokegIAlus(params3, this);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope2 = coroutineScope;
                        initializeSDK2 = initializeSDK;
                        value3 = obj3;
                        configuration4 = configuration3;
                        if (kotlin.Result.m1307isFailureimpl(value3)) {
                            initializationExceptionOrThrow = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value3);
                            this.L$0 = coroutineScope2;
                            this.L$1 = initializeSDK2;
                            this.L$2 = value3;
                            this.L$3 = configuration4;
                            this.label = 5;
                            if (initializeSDK2.handleInitializationException(initializationExceptionOrThrow, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache = initializeSDK2.initializeStateLoadCache;
                        kotlin.ResultKt.throwOnFailure(value3);
                        com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params4 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params((com.unity3d.services.core.configuration.Configuration) value3);
                        this.L$0 = coroutineScope2;
                        this.L$1 = initializeSDK2;
                        this.L$2 = value3;
                        this.L$3 = configuration4;
                        this.label = 6;
                        value4 = initializeStateLoadCache.mo1219invokegIAlus(params4, this);
                        if (value4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        configuration5 = configuration4;
                        obj4 = value4;
                        if (kotlin.Result.m1307isFailureimpl(obj4)) {
                            errorState2 = com.unity3d.services.core.configuration.ErrorState.LoadCache;
                            thM1304exceptionOrNullimpl5 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                            this.L$0 = obj4;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 7;
                            if (initializeSDK2.m1223executeErrorStateBWLJW6A(errorState2, thM1304exceptionOrNullimpl5, configuration5, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            thM1304exceptionOrNullimpl6 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                            if (thM1304exceptionOrNullimpl6 == null) {
                                throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.LoadCache.toString());
                            }
                            throw thM1304exceptionOrNullimpl6;
                        }
                        kotlin.ResultKt.throwOnFailure(obj4);
                        loadCacheResult = (com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult) obj4;
                        if (loadCacheResult.getHasHashMismatch()) {
                            if (!configuration5.getExperiments().isWebViewAsyncDownloadEnabled() && loadCacheResult.getWebViewData() != null) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, new kotlinx.coroutines.CoroutineName("LaunchLoadWeb"), null, new com.unity3d.services.core.domain.task.InitializeSDK$doWork$2$1$webViewData$1(initializeSDK2, value3, null), 2, null);
                                webViewData = loadCacheResult.getWebViewData();
                            } else {
                                com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb = initializeSDK2.initializeStateLoadWeb;
                                kotlin.ResultKt.throwOnFailure(value3);
                                com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params5 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params((com.unity3d.services.core.configuration.Configuration) value3);
                                this.L$0 = initializeSDK2;
                                this.L$1 = value3;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 8;
                                value5 = initializeStateLoadWeb.mo1219invokegIAlus(params5, this);
                                if (value5 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj5 = value5;
                                if (kotlin.Result.m1307isFailureimpl(obj5)) {
                                    initializationExceptionOrThrow2 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                                    this.L$0 = initializeSDK2;
                                    this.L$1 = value3;
                                    this.L$2 = obj5;
                                    this.label = 9;
                                    if (initializeSDK2.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                kotlin.ResultKt.throwOnFailure(obj5);
                                webViewData = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                            }
                        } else {
                            webViewData = loadCacheResult.getWebViewData();
                            if (webViewData == null) {
                                throw new java.lang.IllegalStateException("WebView is missing.".toString());
                            }
                        }
                        com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate = initializeSDK2.initializeStateCreate;
                        kotlin.ResultKt.throwOnFailure(value3);
                        com.unity3d.services.core.domain.task.InitializeStateCreate.Params params6 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params((com.unity3d.services.core.configuration.Configuration) value3, webViewData);
                        this.L$0 = initializeSDK2;
                        this.L$1 = value3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 10;
                        value6 = initializeStateCreate.mo1219invokegIAlus(params6, this);
                        if (value6 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj6 = value3;
                        initializeSDK3 = initializeSDK2;
                        if (kotlin.Result.m1307isFailureimpl(value6)) {
                            initializationExceptionOrThrow3 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                            this.L$0 = initializeSDK3;
                            this.L$1 = obj6;
                            this.label = 11;
                            if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete = initializeSDK3.initializeStateComplete;
                        kotlin.ResultKt.throwOnFailure(obj6);
                        com.unity3d.services.core.domain.task.InitializeStateComplete.Params params7 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj6);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 12;
                        value7 = initializeStateComplete.mo1219invokegIAlus(params7, this);
                        if (value7 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlin.ResultKt.throwOnFailure(value7);
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
                        if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                        } else {
                            thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                            if (thM1304exceptionOrNullimpl != null) {
                                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                            }
                        }
                        return kotlin.Result.m1300boximpl(objM1301constructorimpl);
                    }
                    errorState = com.unity3d.services.core.configuration.ErrorState.ResetWebApp;
                    thM1304exceptionOrNullimpl3 = kotlin.Result.m1304exceptionOrNullimpl(obj2);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (initializeSDK.m1223executeErrorStateBWLJW6A(errorState, thM1304exceptionOrNullimpl3, configuration3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    thM1304exceptionOrNullimpl4 = kotlin.Result.m1304exceptionOrNullimpl(obj2);
                    if (thM1304exceptionOrNullimpl4 == null) {
                        throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.ResetWebApp.toString());
                    }
                    throw thM1304exceptionOrNullimpl4;
                case 1:
                    initializeSDK = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$1;
                    coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    value = ((kotlin.Result) obj).getValue();
                    thM1304exceptionOrNullimpl2 = kotlin.Result.m1304exceptionOrNullimpl(value);
                    if (thM1304exceptionOrNullimpl2 != null) {
                        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + thM1304exceptionOrNullimpl2.getMessage());
                    }
                    configuration = new com.unity3d.services.core.configuration.Configuration();
                    if (kotlin.Result.m1307isFailureimpl(value)) {
                        value = configuration;
                    }
                    configuration2 = (com.unity3d.services.core.configuration.Configuration) value;
                    com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset2 = initializeSDK.initializeStateReset;
                    com.unity3d.services.core.domain.task.InitializeStateReset.Params params8 = new com.unity3d.services.core.domain.task.InitializeStateReset.Params(configuration2);
                    this.L$0 = coroutineScope;
                    this.L$1 = initializeSDK;
                    this.L$2 = configuration2;
                    this.label = 2;
                    value2 = initializeStateReset2.mo1219invokegIAlus(params8, this);
                    if (value2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    configuration3 = configuration2;
                    obj2 = value2;
                    if (!kotlin.Result.m1307isFailureimpl(obj2)) {
                        com.unity3d.services.core.domain.task.InitializeStateConfig initializeStateConfig2 = initializeSDK.initializeStateConfig;
                        com.unity3d.services.core.domain.task.InitializeStateConfig.Params params9 = new com.unity3d.services.core.domain.task.InitializeStateConfig.Params(configuration3);
                        this.L$0 = coroutineScope;
                        this.L$1 = initializeSDK;
                        this.L$2 = configuration3;
                        this.label = 4;
                        obj3 = initializeStateConfig2.mo1219invokegIAlus(params9, this);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope2 = coroutineScope;
                        initializeSDK2 = initializeSDK;
                        value3 = obj3;
                        configuration4 = configuration3;
                        if (kotlin.Result.m1307isFailureimpl(value3)) {
                            initializationExceptionOrThrow = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value3);
                            this.L$0 = coroutineScope2;
                            this.L$1 = initializeSDK2;
                            this.L$2 = value3;
                            this.L$3 = configuration4;
                            this.label = 5;
                            if (initializeSDK2.handleInitializationException(initializationExceptionOrThrow, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache2 = initializeSDK2.initializeStateLoadCache;
                        kotlin.ResultKt.throwOnFailure(value3);
                        com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params10 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params((com.unity3d.services.core.configuration.Configuration) value3);
                        this.L$0 = coroutineScope2;
                        this.L$1 = initializeSDK2;
                        this.L$2 = value3;
                        this.L$3 = configuration4;
                        this.label = 6;
                        value4 = initializeStateLoadCache2.mo1219invokegIAlus(params10, this);
                        if (value4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        configuration5 = configuration4;
                        obj4 = value4;
                        if (kotlin.Result.m1307isFailureimpl(obj4)) {
                            errorState2 = com.unity3d.services.core.configuration.ErrorState.LoadCache;
                            thM1304exceptionOrNullimpl5 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                            this.L$0 = obj4;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 7;
                            if (initializeSDK2.m1223executeErrorStateBWLJW6A(errorState2, thM1304exceptionOrNullimpl5, configuration5, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            thM1304exceptionOrNullimpl6 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                            if (thM1304exceptionOrNullimpl6 == null) {
                                throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.LoadCache.toString());
                            }
                            throw thM1304exceptionOrNullimpl6;
                        }
                        kotlin.ResultKt.throwOnFailure(obj4);
                        loadCacheResult = (com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult) obj4;
                        if (loadCacheResult.getHasHashMismatch()) {
                            if (!configuration5.getExperiments().isWebViewAsyncDownloadEnabled()) {
                            }
                            com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb2 = initializeSDK2.initializeStateLoadWeb;
                            kotlin.ResultKt.throwOnFailure(value3);
                            com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params11 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params((com.unity3d.services.core.configuration.Configuration) value3);
                            this.L$0 = initializeSDK2;
                            this.L$1 = value3;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 8;
                            value5 = initializeStateLoadWeb2.mo1219invokegIAlus(params11, this);
                            if (value5 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj5 = value5;
                            if (kotlin.Result.m1307isFailureimpl(obj5)) {
                                initializationExceptionOrThrow2 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                                this.L$0 = initializeSDK2;
                                this.L$1 = value3;
                                this.L$2 = obj5;
                                this.label = 9;
                                if (initializeSDK2.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            kotlin.ResultKt.throwOnFailure(obj5);
                            webViewData = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                            break;
                        } else {
                            webViewData = loadCacheResult.getWebViewData();
                            if (webViewData == null) {
                                throw new java.lang.IllegalStateException("WebView is missing.".toString());
                            }
                        }
                        com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate2 = initializeSDK2.initializeStateCreate;
                        kotlin.ResultKt.throwOnFailure(value3);
                        com.unity3d.services.core.domain.task.InitializeStateCreate.Params params12 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params((com.unity3d.services.core.configuration.Configuration) value3, webViewData);
                        this.L$0 = initializeSDK2;
                        this.L$1 = value3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 10;
                        value6 = initializeStateCreate2.mo1219invokegIAlus(params12, this);
                        if (value6 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj6 = value3;
                        initializeSDK3 = initializeSDK2;
                        if (kotlin.Result.m1307isFailureimpl(value6)) {
                            initializationExceptionOrThrow3 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                            this.L$0 = initializeSDK3;
                            this.L$1 = obj6;
                            this.label = 11;
                            if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete2 = initializeSDK3.initializeStateComplete;
                        kotlin.ResultKt.throwOnFailure(obj6);
                        com.unity3d.services.core.domain.task.InitializeStateComplete.Params params13 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj6);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 12;
                        value7 = initializeStateComplete2.mo1219invokegIAlus(params13, this);
                        if (value7 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlin.ResultKt.throwOnFailure(value7);
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
                        if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                        } else {
                            thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                            if (thM1304exceptionOrNullimpl != null) {
                                kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                            }
                        }
                        return kotlin.Result.m1300boximpl(objM1301constructorimpl);
                    }
                    errorState = com.unity3d.services.core.configuration.ErrorState.ResetWebApp;
                    thM1304exceptionOrNullimpl3 = kotlin.Result.m1304exceptionOrNullimpl(obj2);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (initializeSDK.m1223executeErrorStateBWLJW6A(errorState, thM1304exceptionOrNullimpl3, configuration3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    thM1304exceptionOrNullimpl4 = kotlin.Result.m1304exceptionOrNullimpl(obj2);
                    if (thM1304exceptionOrNullimpl4 == null) {
                        throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.ResetWebApp.toString());
                    }
                    throw thM1304exceptionOrNullimpl4;
                case 2:
                    configuration2 = (com.unity3d.services.core.configuration.Configuration) this.L$2;
                    initializeSDK = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$1;
                    coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    value2 = ((kotlin.Result) obj).getValue();
                    configuration3 = configuration2;
                    obj2 = value2;
                    if (!kotlin.Result.m1307isFailureimpl(obj2)) {
                        com.unity3d.services.core.domain.task.InitializeStateConfig initializeStateConfig3 = initializeSDK.initializeStateConfig;
                        com.unity3d.services.core.domain.task.InitializeStateConfig.Params params14 = new com.unity3d.services.core.domain.task.InitializeStateConfig.Params(configuration3);
                        this.L$0 = coroutineScope;
                        this.L$1 = initializeSDK;
                        this.L$2 = configuration3;
                        this.label = 4;
                        obj3 = initializeStateConfig3.mo1219invokegIAlus(params14, this);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope2 = coroutineScope;
                        initializeSDK2 = initializeSDK;
                        value3 = obj3;
                        configuration4 = configuration3;
                        if (kotlin.Result.m1307isFailureimpl(value3)) {
                            initializationExceptionOrThrow = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value3);
                            this.L$0 = coroutineScope2;
                            this.L$1 = initializeSDK2;
                            this.L$2 = value3;
                            this.L$3 = configuration4;
                            this.label = 5;
                            if (initializeSDK2.handleInitializationException(initializationExceptionOrThrow, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache3 = initializeSDK2.initializeStateLoadCache;
                        kotlin.ResultKt.throwOnFailure(value3);
                        com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params15 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params((com.unity3d.services.core.configuration.Configuration) value3);
                        this.L$0 = coroutineScope2;
                        this.L$1 = initializeSDK2;
                        this.L$2 = value3;
                        this.L$3 = configuration4;
                        this.label = 6;
                        value4 = initializeStateLoadCache3.mo1219invokegIAlus(params15, this);
                        if (value4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        configuration5 = configuration4;
                        obj4 = value4;
                        if (kotlin.Result.m1307isFailureimpl(obj4)) {
                            errorState2 = com.unity3d.services.core.configuration.ErrorState.LoadCache;
                            thM1304exceptionOrNullimpl5 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                            this.L$0 = obj4;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 7;
                            if (initializeSDK2.m1223executeErrorStateBWLJW6A(errorState2, thM1304exceptionOrNullimpl5, configuration5, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            thM1304exceptionOrNullimpl6 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                            if (thM1304exceptionOrNullimpl6 == null) {
                                throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.LoadCache.toString());
                            }
                            throw thM1304exceptionOrNullimpl6;
                        }
                        kotlin.ResultKt.throwOnFailure(obj4);
                        loadCacheResult = (com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult) obj4;
                        if (loadCacheResult.getHasHashMismatch()) {
                            if (!configuration5.getExperiments().isWebViewAsyncDownloadEnabled()) {
                            }
                            com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb3 = initializeSDK2.initializeStateLoadWeb;
                            kotlin.ResultKt.throwOnFailure(value3);
                            com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params16 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params((com.unity3d.services.core.configuration.Configuration) value3);
                            this.L$0 = initializeSDK2;
                            this.L$1 = value3;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 8;
                            value5 = initializeStateLoadWeb3.mo1219invokegIAlus(params16, this);
                            if (value5 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj5 = value5;
                            if (kotlin.Result.m1307isFailureimpl(obj5)) {
                                initializationExceptionOrThrow2 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                                this.L$0 = initializeSDK2;
                                this.L$1 = value3;
                                this.L$2 = obj5;
                                this.label = 9;
                                if (initializeSDK2.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            kotlin.ResultKt.throwOnFailure(obj5);
                            webViewData = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                            break;
                        } else {
                            webViewData = loadCacheResult.getWebViewData();
                            if (webViewData == null) {
                                throw new java.lang.IllegalStateException("WebView is missing.".toString());
                            }
                        }
                        com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate3 = initializeSDK2.initializeStateCreate;
                        kotlin.ResultKt.throwOnFailure(value3);
                        com.unity3d.services.core.domain.task.InitializeStateCreate.Params params17 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params((com.unity3d.services.core.configuration.Configuration) value3, webViewData);
                        this.L$0 = initializeSDK2;
                        this.L$1 = value3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 10;
                        value6 = initializeStateCreate3.mo1219invokegIAlus(params17, this);
                        if (value6 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj6 = value3;
                        initializeSDK3 = initializeSDK2;
                        if (kotlin.Result.m1307isFailureimpl(value6)) {
                            initializationExceptionOrThrow3 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                            this.L$0 = initializeSDK3;
                            this.L$1 = obj6;
                            this.label = 11;
                            if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete3 = initializeSDK3.initializeStateComplete;
                        kotlin.ResultKt.throwOnFailure(obj6);
                        com.unity3d.services.core.domain.task.InitializeStateComplete.Params params18 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj6);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 12;
                        value7 = initializeStateComplete3.mo1219invokegIAlus(params18, this);
                        if (value7 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlin.ResultKt.throwOnFailure(value7);
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
                        if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                            kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                        } else {
                            thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                            if (thM1304exceptionOrNullimpl != null) {
                                kotlin.Result.Companion companion7 = kotlin.Result.INSTANCE;
                                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                            }
                        }
                        return kotlin.Result.m1300boximpl(objM1301constructorimpl);
                    }
                    errorState = com.unity3d.services.core.configuration.ErrorState.ResetWebApp;
                    thM1304exceptionOrNullimpl3 = kotlin.Result.m1304exceptionOrNullimpl(obj2);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (initializeSDK.m1223executeErrorStateBWLJW6A(errorState, thM1304exceptionOrNullimpl3, configuration3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    thM1304exceptionOrNullimpl4 = kotlin.Result.m1304exceptionOrNullimpl(obj2);
                    if (thM1304exceptionOrNullimpl4 == null) {
                        throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.ResetWebApp.toString());
                    }
                    throw thM1304exceptionOrNullimpl4;
                case 3:
                    obj2 = this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    ((kotlin.Result) obj).getValue();
                    thM1304exceptionOrNullimpl4 = kotlin.Result.m1304exceptionOrNullimpl(obj2);
                    if (thM1304exceptionOrNullimpl4 == null) {
                        throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.ResetWebApp.toString());
                    }
                    throw thM1304exceptionOrNullimpl4;
                case 4:
                    configuration4 = (com.unity3d.services.core.configuration.Configuration) this.L$2;
                    com.unity3d.services.core.domain.task.InitializeSDK initializeSDK4 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$1;
                    kotlinx.coroutines.CoroutineScope coroutineScope4 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    coroutineScope2 = coroutineScope4;
                    initializeSDK2 = initializeSDK4;
                    value3 = ((kotlin.Result) obj).getValue();
                    if (kotlin.Result.m1307isFailureimpl(value3)) {
                        initializationExceptionOrThrow = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value3);
                        this.L$0 = coroutineScope2;
                        this.L$1 = initializeSDK2;
                        this.L$2 = value3;
                        this.L$3 = configuration4;
                        this.label = 5;
                        if (initializeSDK2.handleInitializationException(initializationExceptionOrThrow, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache4 = initializeSDK2.initializeStateLoadCache;
                    kotlin.ResultKt.throwOnFailure(value3);
                    com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params19 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params((com.unity3d.services.core.configuration.Configuration) value3);
                    this.L$0 = coroutineScope2;
                    this.L$1 = initializeSDK2;
                    this.L$2 = value3;
                    this.L$3 = configuration4;
                    this.label = 6;
                    value4 = initializeStateLoadCache4.mo1219invokegIAlus(params19, this);
                    if (value4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    configuration5 = configuration4;
                    obj4 = value4;
                    if (kotlin.Result.m1307isFailureimpl(obj4)) {
                        errorState2 = com.unity3d.services.core.configuration.ErrorState.LoadCache;
                        thM1304exceptionOrNullimpl5 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 7;
                        if (initializeSDK2.m1223executeErrorStateBWLJW6A(errorState2, thM1304exceptionOrNullimpl5, configuration5, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        thM1304exceptionOrNullimpl6 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                        if (thM1304exceptionOrNullimpl6 == null) {
                            throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.LoadCache.toString());
                        }
                        throw thM1304exceptionOrNullimpl6;
                    }
                    kotlin.ResultKt.throwOnFailure(obj4);
                    loadCacheResult = (com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult) obj4;
                    if (loadCacheResult.getHasHashMismatch()) {
                        if (!configuration5.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb4 = initializeSDK2.initializeStateLoadWeb;
                        kotlin.ResultKt.throwOnFailure(value3);
                        com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params110 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params((com.unity3d.services.core.configuration.Configuration) value3);
                        this.L$0 = initializeSDK2;
                        this.L$1 = value3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        value5 = initializeStateLoadWeb4.mo1219invokegIAlus(params110, this);
                        if (value5 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj5 = value5;
                        if (kotlin.Result.m1307isFailureimpl(obj5)) {
                            initializationExceptionOrThrow2 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                            this.L$0 = initializeSDK2;
                            this.L$1 = value3;
                            this.L$2 = obj5;
                            this.label = 9;
                            if (initializeSDK2.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        kotlin.ResultKt.throwOnFailure(obj5);
                        webViewData = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                        break;
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new java.lang.IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate4 = initializeSDK2.initializeStateCreate;
                    kotlin.ResultKt.throwOnFailure(value3);
                    com.unity3d.services.core.domain.task.InitializeStateCreate.Params params111 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params((com.unity3d.services.core.configuration.Configuration) value3, webViewData);
                    this.L$0 = initializeSDK2;
                    this.L$1 = value3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 10;
                    value6 = initializeStateCreate4.mo1219invokegIAlus(params111, this);
                    if (value6 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj6 = value3;
                    initializeSDK3 = initializeSDK2;
                    if (kotlin.Result.m1307isFailureimpl(value6)) {
                        initializationExceptionOrThrow3 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj6;
                        this.label = 11;
                        if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete4 = initializeSDK3.initializeStateComplete;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    com.unity3d.services.core.domain.task.InitializeStateComplete.Params params112 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 12;
                    value7 = initializeStateComplete4.mo1219invokegIAlus(params112, this);
                    if (value7 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlin.ResultKt.throwOnFailure(value7);
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
                    if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                        kotlin.Result.Companion companion8 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                    } else {
                        thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                        if (thM1304exceptionOrNullimpl != null) {
                            kotlin.Result.Companion companion9 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                        }
                    }
                    return kotlin.Result.m1300boximpl(objM1301constructorimpl);
                case 5:
                    configuration4 = (com.unity3d.services.core.configuration.Configuration) this.L$3;
                    value3 = this.L$2;
                    initializeSDK2 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$1;
                    coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache5 = initializeSDK2.initializeStateLoadCache;
                    kotlin.ResultKt.throwOnFailure(value3);
                    com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params113 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params((com.unity3d.services.core.configuration.Configuration) value3);
                    this.L$0 = coroutineScope2;
                    this.L$1 = initializeSDK2;
                    this.L$2 = value3;
                    this.L$3 = configuration4;
                    this.label = 6;
                    value4 = initializeStateLoadCache5.mo1219invokegIAlus(params113, this);
                    if (value4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    configuration5 = configuration4;
                    obj4 = value4;
                    if (kotlin.Result.m1307isFailureimpl(obj4)) {
                        errorState2 = com.unity3d.services.core.configuration.ErrorState.LoadCache;
                        thM1304exceptionOrNullimpl5 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 7;
                        if (initializeSDK2.m1223executeErrorStateBWLJW6A(errorState2, thM1304exceptionOrNullimpl5, configuration5, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        thM1304exceptionOrNullimpl6 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                        if (thM1304exceptionOrNullimpl6 == null) {
                            throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.LoadCache.toString());
                        }
                        throw thM1304exceptionOrNullimpl6;
                    }
                    kotlin.ResultKt.throwOnFailure(obj4);
                    loadCacheResult = (com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult) obj4;
                    if (loadCacheResult.getHasHashMismatch()) {
                        if (!configuration5.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb5 = initializeSDK2.initializeStateLoadWeb;
                        kotlin.ResultKt.throwOnFailure(value3);
                        com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params114 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params((com.unity3d.services.core.configuration.Configuration) value3);
                        this.L$0 = initializeSDK2;
                        this.L$1 = value3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        value5 = initializeStateLoadWeb5.mo1219invokegIAlus(params114, this);
                        if (value5 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj5 = value5;
                        if (kotlin.Result.m1307isFailureimpl(obj5)) {
                            initializationExceptionOrThrow2 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                            this.L$0 = initializeSDK2;
                            this.L$1 = value3;
                            this.L$2 = obj5;
                            this.label = 9;
                            if (initializeSDK2.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        kotlin.ResultKt.throwOnFailure(obj5);
                        webViewData = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                        break;
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new java.lang.IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate5 = initializeSDK2.initializeStateCreate;
                    kotlin.ResultKt.throwOnFailure(value3);
                    com.unity3d.services.core.domain.task.InitializeStateCreate.Params params115 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params((com.unity3d.services.core.configuration.Configuration) value3, webViewData);
                    this.L$0 = initializeSDK2;
                    this.L$1 = value3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 10;
                    value6 = initializeStateCreate5.mo1219invokegIAlus(params115, this);
                    if (value6 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj6 = value3;
                    initializeSDK3 = initializeSDK2;
                    if (kotlin.Result.m1307isFailureimpl(value6)) {
                        initializationExceptionOrThrow3 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj6;
                        this.label = 11;
                        if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete5 = initializeSDK3.initializeStateComplete;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    com.unity3d.services.core.domain.task.InitializeStateComplete.Params params116 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 12;
                    value7 = initializeStateComplete5.mo1219invokegIAlus(params116, this);
                    if (value7 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlin.ResultKt.throwOnFailure(value7);
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
                    if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                        kotlin.Result.Companion companion10 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                    } else {
                        thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                        if (thM1304exceptionOrNullimpl != null) {
                            kotlin.Result.Companion companion11 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                        }
                    }
                    return kotlin.Result.m1300boximpl(objM1301constructorimpl);
                case 6:
                    configuration4 = (com.unity3d.services.core.configuration.Configuration) this.L$3;
                    value3 = this.L$2;
                    initializeSDK2 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$1;
                    coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    value4 = ((kotlin.Result) obj).getValue();
                    configuration5 = configuration4;
                    obj4 = value4;
                    if (kotlin.Result.m1307isFailureimpl(obj4)) {
                        errorState2 = com.unity3d.services.core.configuration.ErrorState.LoadCache;
                        thM1304exceptionOrNullimpl5 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                        this.L$0 = obj4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 7;
                        if (initializeSDK2.m1223executeErrorStateBWLJW6A(errorState2, thM1304exceptionOrNullimpl5, configuration5, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        thM1304exceptionOrNullimpl6 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                        if (thM1304exceptionOrNullimpl6 == null) {
                            throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.LoadCache.toString());
                        }
                        throw thM1304exceptionOrNullimpl6;
                    }
                    kotlin.ResultKt.throwOnFailure(obj4);
                    loadCacheResult = (com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult) obj4;
                    if (loadCacheResult.getHasHashMismatch()) {
                        if (!configuration5.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb6 = initializeSDK2.initializeStateLoadWeb;
                        kotlin.ResultKt.throwOnFailure(value3);
                        com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params117 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params((com.unity3d.services.core.configuration.Configuration) value3);
                        this.L$0 = initializeSDK2;
                        this.L$1 = value3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        value5 = initializeStateLoadWeb6.mo1219invokegIAlus(params117, this);
                        if (value5 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj5 = value5;
                        if (kotlin.Result.m1307isFailureimpl(obj5)) {
                            initializationExceptionOrThrow2 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                            this.L$0 = initializeSDK2;
                            this.L$1 = value3;
                            this.L$2 = obj5;
                            this.label = 9;
                            if (initializeSDK2.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        kotlin.ResultKt.throwOnFailure(obj5);
                        webViewData = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                        break;
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new java.lang.IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate6 = initializeSDK2.initializeStateCreate;
                    kotlin.ResultKt.throwOnFailure(value3);
                    com.unity3d.services.core.domain.task.InitializeStateCreate.Params params118 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params((com.unity3d.services.core.configuration.Configuration) value3, webViewData);
                    this.L$0 = initializeSDK2;
                    this.L$1 = value3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 10;
                    value6 = initializeStateCreate6.mo1219invokegIAlus(params118, this);
                    if (value6 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj6 = value3;
                    initializeSDK3 = initializeSDK2;
                    if (kotlin.Result.m1307isFailureimpl(value6)) {
                        initializationExceptionOrThrow3 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj6;
                        this.label = 11;
                        if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete6 = initializeSDK3.initializeStateComplete;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    com.unity3d.services.core.domain.task.InitializeStateComplete.Params params119 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 12;
                    value7 = initializeStateComplete6.mo1219invokegIAlus(params119, this);
                    if (value7 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlin.ResultKt.throwOnFailure(value7);
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
                    if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                        kotlin.Result.Companion companion12 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                    } else {
                        thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                        if (thM1304exceptionOrNullimpl != null) {
                            kotlin.Result.Companion companion13 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                        }
                    }
                    return kotlin.Result.m1300boximpl(objM1301constructorimpl);
                case 7:
                    obj4 = this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    ((kotlin.Result) obj).getValue();
                    thM1304exceptionOrNullimpl6 = kotlin.Result.m1304exceptionOrNullimpl(obj4);
                    if (thM1304exceptionOrNullimpl6 == null) {
                        throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.LoadCache.toString());
                    }
                    throw thM1304exceptionOrNullimpl6;
                case 8:
                    java.lang.Object obj8 = this.L$1;
                    com.unity3d.services.core.domain.task.InitializeSDK initializeSDK5 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    value5 = ((kotlin.Result) obj).getValue();
                    initializeSDK2 = initializeSDK5;
                    value3 = obj8;
                    obj5 = value5;
                    if (kotlin.Result.m1307isFailureimpl(obj5)) {
                        initializationExceptionOrThrow2 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                        this.L$0 = initializeSDK2;
                        this.L$1 = value3;
                        this.L$2 = obj5;
                        this.label = 9;
                        if (initializeSDK2.handleInitializationException(initializationExceptionOrThrow2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    kotlin.ResultKt.throwOnFailure(obj5);
                    webViewData = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                    com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate7 = initializeSDK2.initializeStateCreate;
                    kotlin.ResultKt.throwOnFailure(value3);
                    com.unity3d.services.core.domain.task.InitializeStateCreate.Params params1110 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params((com.unity3d.services.core.configuration.Configuration) value3, webViewData);
                    this.L$0 = initializeSDK2;
                    this.L$1 = value3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 10;
                    value6 = initializeStateCreate7.mo1219invokegIAlus(params1110, this);
                    if (value6 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj6 = value3;
                    initializeSDK3 = initializeSDK2;
                    if (kotlin.Result.m1307isFailureimpl(value6)) {
                        initializationExceptionOrThrow3 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj6;
                        this.label = 11;
                        if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete7 = initializeSDK3.initializeStateComplete;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    com.unity3d.services.core.domain.task.InitializeStateComplete.Params params1111 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 12;
                    value7 = initializeStateComplete7.mo1219invokegIAlus(params1111, this);
                    if (value7 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlin.ResultKt.throwOnFailure(value7);
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
                    if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                        kotlin.Result.Companion companion14 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                    } else {
                        thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                        if (thM1304exceptionOrNullimpl != null) {
                            kotlin.Result.Companion companion15 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                        }
                    }
                    return kotlin.Result.m1300boximpl(objM1301constructorimpl);
                case 9:
                    obj5 = this.L$2;
                    value3 = this.L$1;
                    initializeSDK2 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.ResultKt.throwOnFailure(obj5);
                    webViewData = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                    com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate8 = initializeSDK2.initializeStateCreate;
                    kotlin.ResultKt.throwOnFailure(value3);
                    com.unity3d.services.core.domain.task.InitializeStateCreate.Params params1112 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params((com.unity3d.services.core.configuration.Configuration) value3, webViewData);
                    this.L$0 = initializeSDK2;
                    this.L$1 = value3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 10;
                    value6 = initializeStateCreate8.mo1219invokegIAlus(params1112, this);
                    if (value6 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj6 = value3;
                    initializeSDK3 = initializeSDK2;
                    if (kotlin.Result.m1307isFailureimpl(value6)) {
                        initializationExceptionOrThrow3 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj6;
                        this.label = 11;
                        if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete8 = initializeSDK3.initializeStateComplete;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    com.unity3d.services.core.domain.task.InitializeStateComplete.Params params1113 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 12;
                    value7 = initializeStateComplete8.mo1219invokegIAlus(params1113, this);
                    if (value7 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlin.ResultKt.throwOnFailure(value7);
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
                    if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                        kotlin.Result.Companion companion16 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                    } else {
                        thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                        if (thM1304exceptionOrNullimpl != null) {
                            kotlin.Result.Companion companion17 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                        }
                    }
                    return kotlin.Result.m1300boximpl(objM1301constructorimpl);
                case 10:
                    obj6 = this.L$1;
                    initializeSDK3 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    value6 = ((kotlin.Result) obj).getValue();
                    if (kotlin.Result.m1307isFailureimpl(value6)) {
                        initializationExceptionOrThrow3 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(value6);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj6;
                        this.label = 11;
                        if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete9 = initializeSDK3.initializeStateComplete;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    com.unity3d.services.core.domain.task.InitializeStateComplete.Params params1114 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 12;
                    value7 = initializeStateComplete9.mo1219invokegIAlus(params1114, this);
                    if (value7 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlin.ResultKt.throwOnFailure(value7);
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
                    if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                        kotlin.Result.Companion companion18 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                    } else {
                        thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                        if (thM1304exceptionOrNullimpl != null) {
                            kotlin.Result.Companion companion19 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                        }
                    }
                    return kotlin.Result.m1300boximpl(objM1301constructorimpl);
                case 11:
                    obj6 = this.L$1;
                    initializeSDK3 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete10 = initializeSDK3.initializeStateComplete;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    com.unity3d.services.core.domain.task.InitializeStateComplete.Params params1115 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 12;
                    value7 = initializeStateComplete10.mo1219invokegIAlus(params1115, this);
                    if (value7 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlin.ResultKt.throwOnFailure(value7);
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
                    if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                        kotlin.Result.Companion companion110 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                    } else {
                        thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                        if (thM1304exceptionOrNullimpl != null) {
                            kotlin.Result.Companion companion111 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                        }
                    }
                    return kotlin.Result.m1300boximpl(objM1301constructorimpl);
                case 12:
                    kotlin.ResultKt.throwOnFailure(obj);
                    value7 = ((kotlin.Result) obj).getValue();
                    kotlin.ResultKt.throwOnFailure(value7);
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
                    if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                        kotlin.Result.Companion companion112 = kotlin.Result.INSTANCE;
                        objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
                    } else {
                        thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                        if (thM1304exceptionOrNullimpl != null) {
                            kotlin.Result.Companion companion113 = kotlin.Result.INSTANCE;
                            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                        }
                    }
                    return kotlin.Result.m1300boximpl(objM1301constructorimpl);
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion20 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }
}
