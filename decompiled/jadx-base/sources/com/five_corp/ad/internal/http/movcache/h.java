package com.five_corp.ad.internal.http.movcache;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements com.five_corp.ad.internal.cache.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Handler f1931a;
    public final com.five_corp.ad.internal.storage.e b;
    public final com.five_corp.ad.internal.http.connection.c c;
    public final int d;
    public int e;
    public java.util.ArrayList f;
    public final java.util.ArrayList g;
    public java.lang.Object h = null;

    public h(com.five_corp.ad.internal.storage.e eVar, com.five_corp.ad.internal.http.connection.b bVar) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("MovieResourceCacheDownloadManager");
        handlerThread.start();
        this.f1931a = new android.os.Handler(handlerThread.getLooper());
        this.b = eVar;
        this.c = bVar;
        this.d = 2;
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.e = 250000;
    }

    public static com.five_corp.ad.internal.util.f a(com.five_corp.ad.internal.http.movcache.h hVar, com.five_corp.ad.internal.http.a aVar) {
        hVar.getClass();
        com.five_corp.ad.internal.context.l lVar = (com.five_corp.ad.internal.context.l) aVar.b.get();
        com.five_corp.ad.internal.ad.a aVar2 = lVar != null ? lVar.b : (com.five_corp.ad.internal.ad.a) aVar.f1906a.get();
        if (aVar2 == null || !aVar.a() || aVar2.b != com.five_corp.ad.CreativeType.MOVIE || aVar2.I == 3) {
            return new com.five_corp.ad.internal.util.f(true, null, java.lang.Boolean.FALSE);
        }
        com.five_corp.ad.internal.ad.w wVar = aVar2.n;
        com.five_corp.ad.internal.cache.o oVarA = hVar.b.a(wVar);
        if (oVarA.d()) {
            return new com.five_corp.ad.internal.util.f(true, null, java.lang.Boolean.FALSE);
        }
        com.five_corp.ad.internal.util.f fVarB = oVarA.b();
        if (fVarB.f2085a) {
            return (!aVar2.b() || ((long) ((java.lang.Integer) fVarB.c).intValue()) < aVar2.h.b) ? hVar.a(wVar, oVarA, new com.five_corp.ad.internal.http.movcache.j(aVar)) : new com.five_corp.ad.internal.util.f(true, null, java.lang.Boolean.FALSE);
        }
        return new com.five_corp.ad.internal.util.f(false, fVarB.b, null);
    }

    public final void b() {
        for (com.five_corp.ad.internal.http.movcache.n nVar : this.f) {
            synchronized (nVar.g) {
                if (nVar.m == 5) {
                    nVar.m = 1;
                    nVar.q++;
                }
            }
        }
    }

    public final void c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.five_corp.ad.internal.http.movcache.n nVar : this.f) {
            if (nVar.h()) {
                arrayList.add(nVar);
            }
        }
        this.f = arrayList;
        while (this.g.size() < this.d) {
            com.five_corp.ad.internal.http.movcache.n nVar2 = null;
            for (com.five_corp.ad.internal.http.movcache.n nVar3 : this.f) {
                if (nVar3.i()) {
                    if (nVar2 != null) {
                        if (com.five_corp.ad.internal.http.b.a(nVar3.f()) - com.five_corp.ad.internal.http.b.a(nVar2.f()) > 0) {
                        }
                    }
                    nVar2 = nVar3;
                }
            }
            if (nVar2 == null) {
                break;
            }
            synchronized (nVar2.g) {
                if (nVar2.m == 1) {
                    int i = nVar2.k;
                    boolean z = nVar2.p;
                    com.five_corp.ad.internal.http.client.a aVar = new com.five_corp.ad.internal.http.client.a(nVar2.f1935a, nVar2, nVar2.c);
                    synchronized (nVar2.g) {
                        nVar2.m = 2;
                        nVar2.h = aVar;
                    }
                    aVar.b(i, z ? 0 : nVar2.e);
                    this.g.add(nVar2);
                }
            }
        }
        if (this.g.isEmpty()) {
            a();
        }
    }

    public static void a(com.five_corp.ad.internal.http.movcache.h hVar) {
        hVar.h = null;
        for (com.five_corp.ad.internal.http.movcache.n nVar : hVar.f) {
            if (nVar.f() == 3 && nVar.h() && nVar.i()) {
                for (com.five_corp.ad.internal.http.movcache.n nVar2 : hVar.g) {
                    if (nVar2.f() != 3) {
                        synchronized (nVar2.g) {
                            if (nVar2.m == 2) {
                                nVar2.h.a();
                            }
                        }
                    }
                }
                break;
            }
        }
        hVar.b();
        hVar.c();
    }

    public final void a() {
        boolean z;
        long jMin = Long.MAX_VALUE;
        for (com.five_corp.ad.internal.http.movcache.n nVar : this.f) {
            if (nVar.h()) {
                synchronized (nVar.g) {
                    z = nVar.m == 5;
                }
                if (z) {
                    jMin = java.lang.Math.min(jMin, nVar.e());
                }
            }
        }
        if (jMin != Long.MAX_VALUE) {
            java.lang.Object obj = new java.lang.Object();
            this.h = obj;
            this.f1931a.postDelayed(new com.five_corp.ad.internal.http.movcache.g(this, obj), jMin);
        }
    }

    @Override // com.five_corp.ad.internal.cache.y
    public final void a(com.five_corp.ad.internal.cache.x xVar) {
        this.e = xVar.b.e;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 ??, still in use, count: 1, list:
          (r10v0 ?? I:java.lang.Object) from 0x0056: INVOKE (r12v13 ?? I:java.util.ArrayList), (r10v0 ?? I:java.lang.Object) VIRTUAL call: java.util.ArrayList.add(java.lang.Object):boolean A[MD:(E):boolean (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final com.five_corp.ad.internal.util.f a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 ??, still in use, count: 1, list:
          (r10v0 ?? I:java.lang.Object) from 0x0056: INVOKE (r12v13 ?? I:java.util.ArrayList), (r10v0 ?? I:java.lang.Object) VIRTUAL call: java.util.ArrayList.add(java.lang.Object):boolean A[MD:(E):boolean (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
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
}
