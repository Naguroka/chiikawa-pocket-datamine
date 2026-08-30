package androidx.datastore.core;

/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer;", "T", "", "()V", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataMigrationInitializer<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.datastore.core.DataMigrationInitializer.Companion INSTANCE = new androidx.datastore.core.DataMigrationInitializer.Companion(null);

    /* JADX INFO: compiled from: DataMigrationInitializer.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JV\u0010\u0003\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\b\u0001\u0010\u00062\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u000e0\r¢\u0006\u0002\u0010\u000fJ6\u0010\u0010\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00062\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u000e0\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005H\u0082@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer$Companion;", "", "()V", "getInitializer", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "T", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "migrations", "", "Landroidx/datastore/core/DataMigration;", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "runMigrations", "(Ljava/util/List;Landroidx/datastore/core/InitializerApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> kotlin.jvm.functions.Function2<androidx.datastore.core.InitializerApi<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getInitializer(java.util.List<? extends androidx.datastore.core.DataMigration<T>> migrations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1(migrations, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x0076  */
        /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:43:0x0088 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0070->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX WARN: Type inference failed for: r9v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008d -> B:25:0x0070). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0090 -> B:25:0x0070). Please report as a decompilation issue!!! */
        public final <T> java.lang.Object runMigrations(java.util.List<? extends androidx.datastore.core.DataMigration<T>> list, androidx.datastore.core.InitializerApi<T> initializerApi, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            java.util.List list2;
            kotlin.jvm.internal.Ref.ObjectRef objectRef;
            java.util.Iterator<T> it;
            java.lang.Throwable th;
            kotlin.jvm.functions.Function1 function1;
            if (continuation instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) continuation;
                if ((dataMigrationInitializer$Companion$runMigrations$1.label & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.label -= Integer.MIN_VALUE;
                } else {
                    dataMigrationInitializer$Companion$runMigrations$1 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1(this, continuation);
                }
            } else {
                dataMigrationInitializer$Companion$runMigrations$1 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1(this, continuation);
            }
            java.lang.Object obj = dataMigrationInitializer$Companion$runMigrations$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = dataMigrationInitializer$Companion$runMigrations$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> dataMigrationInitializer$Companion$runMigrations$2 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2<>(list, arrayList, null);
                dataMigrationInitializer$Companion$runMigrations$1.L$0 = arrayList;
                dataMigrationInitializer$Companion$runMigrations$1.label = 1;
                if (initializerApi.updateData(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = arrayList;
            } else {
                if (i == 1) {
                    list2 = (java.util.List) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) dataMigrationInitializer$Companion$runMigrations$1.L$1;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable 
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:297)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                        */
                    /*
                        this = this;
                        boolean r0 = r9 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                        if (r0 == 0) goto L14
                        r0 = r9
                        androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r9 = r0.label
                        int r9 = r9 - r2
                        r0.label = r9
                        goto L19
                    L14:
                        androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                        r0.<init>(r6, r9)
                    L19:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L47
                        if (r2 == r4) goto L3f
                        if (r2 != r3) goto L37
                        java.lang.Object r7 = r0.L$1
                        java.util.Iterator r7 = (java.util.Iterator) r7
                        java.lang.Object r8 = r0.L$0
                        kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                        kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L35
                        goto L70
                    L35:
                        r9 = move-exception
                        goto L89
                    L37:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L3f:
                        java.lang.Object r7 = r0.L$0
                        java.util.List r7 = (java.util.List) r7
                        kotlin.ResultKt.throwOnFailure(r9)
                        goto L65
                    L47:
                        kotlin.ResultKt.throwOnFailure(r9)
                        java.util.ArrayList r9 = new java.util.ArrayList
                        r9.<init>()
                        java.util.List r9 = (java.util.List) r9
                        androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r2 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                        r5 = 0
                        r2.<init>(r7, r9, r5)
                        kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
                        r0.L$0 = r9
                        r0.label = r4
                        java.lang.Object r7 = r8.updateData(r2, r0)
                        if (r7 != r1) goto L64
                        return r1
                    L64:
                        r7 = r9
                    L65:
                        kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                        r8.<init>()
                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                        java.util.Iterator r7 = r7.iterator()
                    L70:
                        boolean r9 = r7.hasNext()
                        if (r9 == 0) goto L9b
                        java.lang.Object r9 = r7.next()
                        kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                        r0.L$0 = r8     // Catch: java.lang.Throwable -> L35
                        r0.L$1 = r7     // Catch: java.lang.Throwable -> L35
                        r0.label = r3     // Catch: java.lang.Throwable -> L35
                        java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L35
                        if (r9 != r1) goto L70
                        return r1
                    L89:
                        T r2 = r8.element
                        if (r2 != 0) goto L90
                        r8.element = r9
                        goto L70
                    L90:
                        T r2 = r8.element
                        kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                        java.lang.Throwable r2 = (java.lang.Throwable) r2
                        kotlin.ExceptionsKt.addSuppressed(r2, r9)
                        goto L70
                    L9b:
                        T r7 = r8.element
                        java.lang.Throwable r7 = (java.lang.Throwable) r7
                        if (r7 != 0) goto La4
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    La4:
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations(java.util.List, androidx.datastore.core.InitializerApi, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }
        }
