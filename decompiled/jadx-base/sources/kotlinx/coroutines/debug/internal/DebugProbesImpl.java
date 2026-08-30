package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001}B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u00101\u001a\b\u0012\u0004\u0012\u0002H302\"\u0004\b\u0000\u001032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H3022\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0010\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u000209H\u0001J\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;J\u0011\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010>¢\u0006\u0002\u0010?J9\u0010@\u001a\b\u0012\u0004\u0012\u0002HA0;\"\b\b\u0000\u0010A*\u00020\u00012\u001e\b\u0004\u0010B\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u0002HA0CH\u0082\bJ\u0010\u0010E\u001a\u00020\u00142\u0006\u00108\u001a\u000209H\u0002J\f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0;J\"\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040;2\u0006\u0010I\u001a\u00020<2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;J\u000e\u0010K\u001a\u00020)2\u0006\u0010I\u001a\u00020<J.\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040;2\u0006\u0010M\u001a\u00020)2\b\u0010N\u001a\u0004\u0018\u00010'2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002J=\u0010O\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020Q0P2\u0006\u0010R\u001a\u00020Q2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040>2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002¢\u0006\u0002\u0010TJ1\u0010U\u001a\u00020Q2\u0006\u0010V\u001a\u00020Q2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040>2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002¢\u0006\u0002\u0010WJ\u0016\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002J\u0015\u0010Y\u001a\u00020)2\u0006\u0010Z\u001a\u00020*H\u0000¢\u0006\u0002\b[J\r\u0010\\\u001a\u00020\u0014H\u0000¢\u0006\u0002\b]J\u001e\u0010^\u001a\u00020\u00142\u0006\u00108\u001a\u0002092\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002J\u0014\u0010`\u001a\u00020\u00142\n\u0010a\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J'\u0010b\u001a\b\u0012\u0004\u0012\u0002H302\"\u0004\b\u0000\u001032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H302H\u0000¢\u0006\u0002\bcJ\u0019\u0010d\u001a\u00020\u00142\n\u00105\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0002\beJ\u0019\u0010f\u001a\u00020\u00142\n\u00105\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0002\bgJ%\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00040;\"\b\b\u0000\u00103*\u00020i2\u0006\u0010j\u001a\u0002H3H\u0002¢\u0006\u0002\u0010kJ\b\u0010l\u001a\u00020\u0014H\u0002J\b\u0010m\u001a\u00020\u0014H\u0002J\r\u0010n\u001a\u00020\u0014H\u0000¢\u0006\u0002\boJ\u0018\u0010p\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00072\u0006\u0010M\u001a\u00020)H\u0002J\u001c\u0010q\u001a\u00020\u00142\n\u00105\u001a\u0006\u0012\u0002\b\u0003022\u0006\u0010M\u001a\u00020)H\u0002J(\u0010q\u001a\u00020\u00142\n\u0010a\u001a\u0006\u0012\u0002\b\u00030\u000b2\n\u00105\u001a\u0006\u0012\u0002\b\u0003022\u0006\u0010M\u001a\u00020)H\u0002J4\u0010r\u001a\u00020\u0014*\u00020*2\u0012\u0010s\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\b0t2\n\u0010u\u001a\u00060vj\u0002`w2\u0006\u0010x\u001a\u00020)H\u0002J\u0010\u0010y\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0016\u0010a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u0006\u0012\u0002\b\u000302H\u0002J\u0013\u0010a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u0007H\u0082\u0010J\u000f\u0010z\u001a\u0004\u0018\u00010\u0007*\u00020\u0007H\u0082\u0010J\u0012\u0010{\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00040;H\u0002J\f\u0010|\u001a\u00020)*\u00020\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\t\u0010\u001d\u001a\u00020\u001eX\u0082\u0004R\u0011\u0010\u001f\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\t\u0010$\u001a\u00020%X\u0082\u0004R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020)*\u00020*8BX\u0082\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010/\u001a\u00020\u000f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006~"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "()V", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "callerInfoCache", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "capturedCoroutines", "", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "getCapturedCoroutines", "()Ljava/util/Set;", "capturedCoroutinesMap", "", "dateFormat", "Ljava/text/SimpleDateFormat;", "dynamicAttach", "Lkotlin/Function1;", "", "enableCreationStackTraces", "getEnableCreationStackTraces$kotlinx_coroutines_core", "()Z", "setEnableCreationStackTraces$kotlinx_coroutines_core", "(Z)V", "ignoreCoroutinesWithEmptyContext", "getIgnoreCoroutinesWithEmptyContext", "setIgnoreCoroutinesWithEmptyContext", "installations", "Lkotlinx/atomicfu/AtomicInt;", "isInstalled", "isInstalled$kotlinx_coroutines_debug", "sanitizeStackTraces", "getSanitizeStackTraces$kotlinx_coroutines_core", "setSanitizeStackTraces$kotlinx_coroutines_core", "sequenceNumber", "Lkotlinx/atomicfu/AtomicLong;", "weakRefCleanerThread", "Ljava/lang/Thread;", "debugString", "", "Lkotlinx/coroutines/Job;", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "getDebugString", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "createOwner", "Lkotlin/coroutines/Continuation;", "T", "completion", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "dumpCoroutines", "out", "Ljava/io/PrintStream;", "dumpCoroutinesInfo", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "dumpCoroutinesInfoAsJsonAndReferences", "", "()[Ljava/lang/Object;", "dumpCoroutinesInfoImpl", "R", "create", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext;", "dumpCoroutinesSynchronized", "dumpDebuggerInfo", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "enhanceStackTraceWithThreadDump", "info", "coroutineTrace", "enhanceStackTraceWithThreadDumpAsJson", "enhanceStackTraceWithThreadDumpImpl", "state", "thread", "findContinuationStartIndex", "Lkotlin/Pair;", "", "indexOfResumeWith", "actualTrace", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "findIndexOfFrame", "frameIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "getDynamicAttach", "hierarchyToString", "job", "hierarchyToString$kotlinx_coroutines_core", "install", "install$kotlinx_coroutines_core", "printStackTrace", "frames", "probeCoroutineCompleted", "owner", "probeCoroutineCreated", "probeCoroutineCreated$kotlinx_coroutines_core", "probeCoroutineResumed", "probeCoroutineResumed$kotlinx_coroutines_core", "probeCoroutineSuspended", "probeCoroutineSuspended$kotlinx_coroutines_core", "sanitizeStackTrace", "", "throwable", "(Ljava/lang/Throwable;)Ljava/util/List;", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "uninstall", "uninstall$kotlinx_coroutines_core", "updateRunningState", "updateState", "build", "map", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "indent", "isFinished", "realCaller", "toStackTraceFrame", "toStringRepr", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DebugProbesImpl {
    private static final java.lang.StackTraceElement ARTIFICIAL_FRAME;
    public static final kotlinx.coroutines.debug.internal.DebugProbesImpl INSTANCE;
    private static final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> callerInfoCache;
    private static final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, java.lang.Boolean> capturedCoroutinesMap;
    private static final java.text.SimpleDateFormat dateFormat;
    private static final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> dynamicAttach;
    private static boolean enableCreationStackTraces;
    private static boolean ignoreCoroutinesWithEmptyContext;
    private static final kotlinx.coroutines.debug.internal.DebugProbesImpl$Installations$kotlinx$VolatileWrapper installations$kotlinx$VolatileWrapper;
    private static boolean sanitizeStackTraces;
    private static final kotlinx.coroutines.debug.internal.DebugProbesImpl$SequenceNumber$kotlinx$VolatileWrapper sequenceNumber$kotlinx$VolatileWrapper;
    private static java.lang.Thread weakRefCleanerThread;

    private static /* synthetic */ void getDebugString$annotations(kotlinx.coroutines.Job job) {
    }

    public final boolean isInstalled$kotlinx_coroutines_debug() {
        return kotlinx.coroutines.debug.internal.DebugProbesImpl$Installations$kotlinx$VolatileWrapper.installations$FU.get(installations$kotlinx$VolatileWrapper) > 0;
    }

    private DebugProbesImpl() {
    }

    static {
        kotlinx.coroutines.debug.internal.DebugProbesImpl debugProbesImpl = new kotlinx.coroutines.debug.internal.DebugProbesImpl();
        INSTANCE = debugProbesImpl;
        ARTIFICIAL_FRAME = new _COROUTINE.ArtificialStackFrames().coroutineCreation();
        dateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap<>(false, 1, null);
        sanitizeStackTraces = true;
        enableCreationStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = debugProbesImpl.getDynamicAttach();
        callerInfoCache = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap<>(true);
        installations$kotlinx$VolatileWrapper = new kotlinx.coroutines.debug.internal.DebugProbesImpl$Installations$kotlinx$VolatileWrapper(null);
        sequenceNumber$kotlinx$VolatileWrapper = new kotlinx.coroutines.debug.internal.DebugProbesImpl$SequenceNumber$kotlinx$VolatileWrapper(null);
    }

    private final java.util.Set<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>> getCapturedCoroutines() {
        return capturedCoroutinesMap.keySet();
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return sanitizeStackTraces;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean z) {
        sanitizeStackTraces = z;
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
        return enableCreationStackTraces;
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean z) {
        enableCreationStackTraces = z;
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return ignoreCoroutinesWithEmptyContext;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean z) {
        ignoreCoroutinesWithEmptyContext = z;
    }

    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getDynamicAttach() {
        java.lang.Object objM1301constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.debug.internal.DebugProbesImpl debugProbesImpl = this;
            java.lang.Object objNewInstance = java.lang.Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(objNewInstance, 1));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m1307isFailureimpl(objM1301constructorimpl)) {
            objM1301constructorimpl = null;
        }
        return (kotlin.jvm.functions.Function1) objM1301constructorimpl;
    }

    public final void install$kotlinx_coroutines_core() {
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1;
        if (kotlinx.coroutines.debug.internal.DebugProbesImpl$Installations$kotlinx$VolatileWrapper.installations$FU.incrementAndGet(installations$kotlinx$VolatileWrapper) > 1) {
            return;
        }
        startWeakRefCleanerThread();
        if (kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (function1 = dynamicAttach) == null) {
            return;
        }
        function1.invoke(true);
    }

    public final void uninstall$kotlinx_coroutines_core() throws java.lang.InterruptedException {
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new java.lang.IllegalStateException("Agent was not installed".toString());
        }
        if (kotlinx.coroutines.debug.internal.DebugProbesImpl$Installations$kotlinx$VolatileWrapper.installations$FU.decrementAndGet(installations$kotlinx$VolatileWrapper) != 0) {
            return;
        }
        stopWeakRefCleanerThread();
        capturedCoroutinesMap.clear();
        callerInfoCache.clear();
        if (kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (function1 = dynamicAttach) == null) {
            return;
        }
        function1.invoke(false);
    }

    private final void startWeakRefCleanerThread() {
        weakRefCleanerThread = kotlin.concurrent.ThreadsKt.thread$default(false, true, null, "Coroutines Debugger Cleaner", 0, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl.startWeakRefCleanerThread.1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache.runWeakRefQueueCleaningLoopUntilInterrupted();
            }
        }, 21, null);
    }

    private final void stopWeakRefCleanerThread() throws java.lang.InterruptedException {
        java.lang.Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    public final java.lang.String hierarchyToString$kotlinx_coroutines_core(kotlinx.coroutines.Job job) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new java.lang.IllegalStateException("Debug probes are not installed".toString());
        }
        java.util.Set<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : capturedCoroutines) {
            if (((kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) obj).delegate.get$context().get(kotlinx.coroutines.Job.INSTANCE) != null) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner> arrayList2 = arrayList;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner coroutineOwner : arrayList2) {
            linkedHashMap.put(kotlinx.coroutines.JobKt.getJob(coroutineOwner.delegate.get$context()), coroutineOwner.info);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        INSTANCE.build(job, linkedHashMap, sb, "");
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final void build(kotlinx.coroutines.Job job, java.util.Map<kotlinx.coroutines.Job, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> map, java.lang.StringBuilder sb, java.lang.String str) {
        kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl = map.get(job);
        if (debugCoroutineInfoImpl == null) {
            if (!(job instanceof kotlinx.coroutines.internal.ScopeCoroutine)) {
                sb.append(str + getDebugString(job) + '\n');
                str = str + '\t';
            }
        } else {
            sb.append(str + getDebugString(job) + ", continuation is " + debugCoroutineInfoImpl.get_state() + " at line " + ((java.lang.StackTraceElement) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core())) + '\n');
            str = str + '\t';
        }
        java.util.Iterator<kotlinx.coroutines.Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            build(it.next(), map, sb, str);
        }
    }

    private final java.lang.String getDebugString(kotlinx.coroutines.Job job) {
        return job instanceof kotlinx.coroutines.JobSupport ? ((kotlinx.coroutines.JobSupport) job).toDebugString() : job.toString();
    }

    private final <R> java.util.List<R> dumpCoroutinesInfoImpl(final kotlin.jvm.functions.Function2<? super kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, ? super kotlin.coroutines.CoroutineContext, ? extends R> create) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new java.lang.IllegalStateException("Debug probes are not installed".toString());
        }
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.sortedWith(kotlin.collections.CollectionsKt.asSequence(getCapturedCoroutines()), new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new kotlin.jvm.functions.Function1<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, R>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfoImpl.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final R invoke(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                kotlin.coroutines.CoroutineContext context;
                if (kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                    return null;
                }
                return create.invoke(coroutineOwner, context);
            }
        }));
    }

    public final java.lang.Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        java.lang.String name;
        java.util.List<kotlinx.coroutines.debug.internal.DebugCoroutineInfo> listDumpCoroutinesInfo = dumpCoroutinesInfo();
        int size = listDumpCoroutinesInfo.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        for (kotlinx.coroutines.debug.internal.DebugCoroutineInfo debugCoroutineInfo : listDumpCoroutinesInfo) {
            kotlin.coroutines.CoroutineContext context = debugCoroutineInfo.getContext();
            kotlinx.coroutines.CoroutineName coroutineName = (kotlinx.coroutines.CoroutineName) context.get(kotlinx.coroutines.CoroutineName.INSTANCE);
            java.lang.Long lValueOf = null;
            java.lang.String stringRepr = (coroutineName == null || (name = coroutineName.getName()) == null) ? null : toStringRepr(name);
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = (kotlinx.coroutines.CoroutineDispatcher) context.get(kotlinx.coroutines.CoroutineDispatcher.INSTANCE);
            java.lang.String stringRepr2 = coroutineDispatcher != null ? toStringRepr(coroutineDispatcher) : null;
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("\n                {\n                    \"name\": ").append(stringRepr).append(",\n                    \"id\": ");
            kotlinx.coroutines.CoroutineId coroutineId = (kotlinx.coroutines.CoroutineId) context.get(kotlinx.coroutines.CoroutineId.INSTANCE);
            if (coroutineId != null) {
                lValueOf = java.lang.Long.valueOf(coroutineId.getId());
            }
            arrayList3.add(kotlin.text.StringsKt.trimIndent(sbAppend.append(lValueOf).append(",\n                    \"dispatcher\": ").append(stringRepr2).append(",\n                    \"sequenceNumber\": ").append(debugCoroutineInfo.getSequenceNumber()).append(",\n                    \"state\": \"").append(debugCoroutineInfo.getState()).append("\"\n                } \n                ").toString()));
            arrayList2.add(debugCoroutineInfo.getLastObservedFrame());
            arrayList.add(debugCoroutineInfo.getLastObservedThread());
        }
        return new java.lang.Object[]{com.ironsource.y8.i.d + kotlin.collections.CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, null, 63, null) + ']', arrayList.toArray(new java.lang.Thread[0]), arrayList2.toArray(new kotlin.coroutines.jvm.internal.CoroutineStackFrame[0]), listDumpCoroutinesInfo.toArray(new kotlinx.coroutines.debug.internal.DebugCoroutineInfo[0])};
    }

    public final java.lang.String enhanceStackTraceWithThreadDumpAsJson(kotlinx.coroutines.debug.internal.DebugCoroutineInfo info) {
        java.util.List<java.lang.StackTraceElement> listEnhanceStackTraceWithThreadDump = enhanceStackTraceWithThreadDump(info, info.lastObservedStackTrace());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.StackTraceElement stackTraceElement : listEnhanceStackTraceWithThreadDump) {
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("\n                {\n                    \"declaringClass\": \"").append(stackTraceElement.getClassName()).append("\",\n                    \"methodName\": \"").append(stackTraceElement.getMethodName()).append("\",\n                    \"fileName\": ");
            java.lang.String fileName = stackTraceElement.getFileName();
            arrayList.add(kotlin.text.StringsKt.trimIndent(sbAppend.append(fileName != null ? toStringRepr(fileName) : null).append(",\n                    \"lineNumber\": ").append(stackTraceElement.getLineNumber()).append("\n                }\n                ").toString()));
        }
        return com.ironsource.y8.i.d + kotlin.collections.CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null) + ']';
    }

    private final java.lang.String toStringRepr(java.lang.Object obj) {
        return kotlinx.coroutines.debug.internal.DebugProbesImplKt.repr(obj.toString());
    }

    public final void dumpCoroutines(java.io.PrintStream out) {
        synchronized (out) {
            INSTANCE.dumpCoroutinesSynchronized(out);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFinished(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
        kotlinx.coroutines.Job job;
        kotlin.coroutines.CoroutineContext context = coroutineOwner.info.getContext();
        if (context == null || (job = (kotlinx.coroutines.Job) context.get(kotlinx.coroutines.Job.INSTANCE)) == null || !job.isCompleted()) {
            return false;
        }
        capturedCoroutinesMap.remove(coroutineOwner);
        return true;
    }

    private final void dumpCoroutinesSynchronized(java.io.PrintStream out) {
        java.lang.String str;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new java.lang.IllegalStateException("Debug probes are not installed".toString());
        }
        out.print("Coroutines dump " + dateFormat.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        for (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner coroutineOwner : kotlin.sequences.SequencesKt.sortedWith(kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(getCapturedCoroutines()), new kotlin.jvm.functions.Function1<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, java.lang.Boolean>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesSynchronized.2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwner2) {
                return java.lang.Boolean.valueOf(!kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.isFinished(coroutineOwner2));
            }
        }), new java.util.Comparator() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) t).info.sequenceNumber), java.lang.Long.valueOf(((kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) t2).info.sequenceNumber));
            }
        })) {
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl = coroutineOwner.info;
            java.util.List<java.lang.StackTraceElement> listLastObservedStackTrace$kotlinx_coroutines_core = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
            kotlinx.coroutines.debug.internal.DebugProbesImpl debugProbesImpl = INSTANCE;
            java.util.List<java.lang.StackTraceElement> listEnhanceStackTraceWithThreadDumpImpl = debugProbesImpl.enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfoImpl.get_state(), debugCoroutineInfoImpl.lastObservedThread, listLastObservedStackTrace$kotlinx_coroutines_core);
            if (kotlin.jvm.internal.Intrinsics.areEqual(debugCoroutineInfoImpl.get_state(), kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING) && listEnhanceStackTraceWithThreadDumpImpl == listLastObservedStackTrace$kotlinx_coroutines_core) {
                str = debugCoroutineInfoImpl.get_state() + " (Last suspension stacktrace, not an actual stacktrace)";
            } else {
                str = debugCoroutineInfoImpl.get_state();
            }
            out.print("\n\nCoroutine " + coroutineOwner.delegate + ", state: " + str);
            if (listLastObservedStackTrace$kotlinx_coroutines_core.isEmpty()) {
                out.print("\n\tat " + ARTIFICIAL_FRAME);
                debugProbesImpl.printStackTrace(out, debugCoroutineInfoImpl.getCreationStackTrace());
            } else {
                debugProbesImpl.printStackTrace(out, listEnhanceStackTraceWithThreadDumpImpl);
            }
        }
    }

    private final void printStackTrace(java.io.PrintStream out, java.util.List<java.lang.StackTraceElement> frames) {
        java.util.Iterator<T> it = frames.iterator();
        while (it.hasNext()) {
            out.print("\n\tat " + ((java.lang.StackTraceElement) it.next()));
        }
    }

    public final java.util.List<java.lang.StackTraceElement> enhanceStackTraceWithThreadDump(kotlinx.coroutines.debug.internal.DebugCoroutineInfo info, java.util.List<java.lang.StackTraceElement> coroutineTrace) {
        return enhanceStackTraceWithThreadDumpImpl(info.getState(), info.getLastObservedThread(), coroutineTrace);
    }

    private final java.util.List<java.lang.StackTraceElement> enhanceStackTraceWithThreadDumpImpl(java.lang.String state, java.lang.Thread thread, java.util.List<java.lang.StackTraceElement> coroutineTrace) {
        java.lang.Object objM1301constructorimpl;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING) || thread == null) {
            return coroutineTrace;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.debug.internal.DebugProbesImpl debugProbesImpl = this;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(thread.getStackTrace());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m1307isFailureimpl(objM1301constructorimpl)) {
            objM1301constructorimpl = null;
        }
        java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) objM1301constructorimpl;
        if (stackTraceElementArr == null) {
            return coroutineTrace;
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getMethodName(), "resumeWith") && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i++;
        }
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairFindContinuationStartIndex = findContinuationStartIndex(i, stackTraceElementArr, coroutineTrace);
        int iIntValue = pairFindContinuationStartIndex.component1().intValue();
        int iIntValue2 = pairFindContinuationStartIndex.component2().intValue();
        if (iIntValue == -1) {
            return coroutineTrace;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList((((coroutineTrace.size() + i) - iIntValue) - 1) - iIntValue2);
        int i2 = i - iIntValue2;
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(stackTraceElementArr[i3]);
        }
        int size = coroutineTrace.size();
        for (int i4 = iIntValue + 1; i4 < size; i4++) {
            arrayList.add(coroutineTrace.get(i4));
        }
        return arrayList;
    }

    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> findContinuationStartIndex(int indexOfResumeWith, java.lang.StackTraceElement[] actualTrace, java.util.List<java.lang.StackTraceElement> coroutineTrace) {
        for (int i = 0; i < 3; i++) {
            int iFindIndexOfFrame = INSTANCE.findIndexOfFrame((indexOfResumeWith - 1) - i, actualTrace, coroutineTrace);
            if (iFindIndexOfFrame != -1) {
                return kotlin.TuplesKt.to(java.lang.Integer.valueOf(iFindIndexOfFrame), java.lang.Integer.valueOf(i));
            }
        }
        return kotlin.TuplesKt.to(-1, 0);
    }

    private final int findIndexOfFrame(int frameIndex, java.lang.StackTraceElement[] actualTrace, java.util.List<java.lang.StackTraceElement> coroutineTrace) {
        java.lang.StackTraceElement stackTraceElement = (java.lang.StackTraceElement) kotlin.collections.ArraysKt.getOrNull(actualTrace, frameIndex);
        if (stackTraceElement == null) {
            return -1;
        }
        int i = 0;
        for (java.lang.StackTraceElement stackTraceElement2 : coroutineTrace) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(kotlin.coroutines.Continuation<?> frame) {
        updateState(frame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(kotlin.coroutines.Continuation<?> frame) {
        updateState(frame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.SUSPENDED);
    }

    private final void updateState(kotlin.coroutines.Continuation<?> frame, java.lang.String state) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            if (ignoreCoroutinesWithEmptyContext && frame.get$context() == kotlin.coroutines.EmptyCoroutineContext.INSTANCE) {
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING)) {
                kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame = frame instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame ? (kotlin.coroutines.jvm.internal.CoroutineStackFrame) frame : null;
                if (coroutineStackFrame == null) {
                    return;
                }
                updateRunningState(coroutineStackFrame, state);
                return;
            }
            kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwnerOwner = owner(frame);
            if (coroutineOwnerOwner == null) {
                return;
            }
            updateState(coroutineOwnerOwner, frame, state);
        }
    }

    private final void updateRunningState(kotlin.coroutines.jvm.internal.CoroutineStackFrame frame, java.lang.String state) {
        boolean z;
        if (isInstalled$kotlinx_coroutines_debug()) {
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> concurrentWeakMap = callerInfoCache;
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImplRemove = concurrentWeakMap.remove(frame);
            if (debugCoroutineInfoImplRemove != null) {
                z = false;
            } else {
                kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwnerOwner = owner(frame);
                if (coroutineOwnerOwner == null || (debugCoroutineInfoImplRemove = coroutineOwnerOwner.info) == null) {
                    return;
                }
                kotlin.coroutines.jvm.internal.CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = debugCoroutineInfoImplRemove.getLastObservedFrame$kotlinx_coroutines_core();
                kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrameRealCaller = lastObservedFrame$kotlinx_coroutines_core != null ? realCaller(lastObservedFrame$kotlinx_coroutines_core) : null;
                if (coroutineStackFrameRealCaller != null) {
                    concurrentWeakMap.remove(coroutineStackFrameRealCaller);
                }
                z = true;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(frame, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            debugCoroutineInfoImplRemove.updateState$kotlinx_coroutines_core(state, (kotlin.coroutines.Continuation) frame, z);
            kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrameRealCaller2 = realCaller(frame);
            if (coroutineStackFrameRealCaller2 == null) {
                return;
            }
            concurrentWeakMap.put(coroutineStackFrameRealCaller2, debugCoroutineInfoImplRemove);
        }
    }

    private final kotlin.coroutines.jvm.internal.CoroutineStackFrame realCaller(kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.getStackTraceElement() == null);
        return coroutineStackFrame;
    }

    private final void updateState(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner, kotlin.coroutines.Continuation<?> frame, java.lang.String state) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            owner.info.updateState$kotlinx_coroutines_core(state, frame, true);
        }
    }

    private final kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner(kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame = continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame ? (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation : null;
        if (coroutineStackFrame != null) {
            return owner(coroutineStackFrame);
        }
        return null;
    }

    private final kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner(kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner)) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        }
        return (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) coroutineStackFrame;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> kotlin.coroutines.Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(kotlin.coroutines.Continuation<? super T> completion) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return completion;
        }
        if (!(ignoreCoroutinesWithEmptyContext && completion.get$context() == kotlin.coroutines.EmptyCoroutineContext.INSTANCE) && owner(completion) == null) {
            return createOwner(completion, enableCreationStackTraces ? toStackTraceFrame(sanitizeStackTrace(new java.lang.Exception())) : null);
        }
        return completion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> kotlin.coroutines.Continuation<T> createOwner(kotlin.coroutines.Continuation<? super T> completion, kotlinx.coroutines.debug.internal.StackTraceFrame frame) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return completion;
        }
        kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwner = new kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<>(completion, new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl(completion.get$context(), frame, kotlinx.coroutines.debug.internal.DebugProbesImpl$SequenceNumber$kotlinx$VolatileWrapper.sequenceNumber$FU.incrementAndGet(sequenceNumber$kotlinx$VolatileWrapper)));
        kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, java.lang.Boolean> concurrentWeakMap = capturedCoroutinesMap;
        concurrentWeakMap.put(coroutineOwner, true);
        if (!isInstalled$kotlinx_coroutines_debug()) {
            concurrentWeakMap.clear();
        }
        return coroutineOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void probeCoroutineCompleted(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner) {
        kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrameRealCaller;
        capturedCoroutinesMap.remove(owner);
        kotlin.coroutines.jvm.internal.CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = owner.info.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null || (coroutineStackFrameRealCaller = realCaller(lastObservedFrame$kotlinx_coroutines_core)) == null) {
            return;
        }
        callerInfoCache.remove(coroutineStackFrameRealCaller);
    }

    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001d\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001e\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "info", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getFrame", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CoroutineOwner<T> implements kotlin.coroutines.Continuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
        public final kotlin.coroutines.Continuation<T> delegate;
        public final kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl info;

        @Override // kotlin.coroutines.Continuation
        /* JADX INFO: renamed from: getContext */
        public kotlin.coroutines.CoroutineContext get$context() {
            return this.delegate.get$context();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CoroutineOwner(kotlin.coroutines.Continuation<? super T> continuation, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl) {
            this.delegate = continuation;
            this.info = debugCoroutineInfoImpl;
        }

        private final kotlinx.coroutines.debug.internal.StackTraceFrame getFrame() {
            return this.info.getCreationStackBottom();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            kotlinx.coroutines.debug.internal.StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public java.lang.StackTraceElement getStackTraceElement() {
            kotlinx.coroutines.debug.internal.StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getStackTraceElement();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(java.lang.Object result) {
            kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.probeCoroutineCompleted(this);
            this.delegate.resumeWith(result);
        }

        public java.lang.String toString() {
            return this.delegate.toString();
        }
    }

    private final <T extends java.lang.Throwable> java.util.List<java.lang.StackTraceElement> sanitizeStackTrace(T throwable) {
        java.lang.StackTraceElement[] stackTrace = throwable.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (kotlin.jvm.internal.Intrinsics.areEqual(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i = length2;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length2 = i2;
            }
        }
        int i3 = i + 1;
        if (!sanitizeStackTraces) {
            int i4 = length - i3;
            java.util.ArrayList arrayList = new java.util.ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(stackTrace[i5 + i3]);
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList((length - i3) + 1);
        while (i3 < length) {
            if (isInternalMethod(stackTrace[i3])) {
                java.util.ArrayList arrayList3 = arrayList2;
                arrayList3.add(stackTrace[i3]);
                int i6 = i3 + 1;
                while (i6 < length && isInternalMethod(stackTrace[i6])) {
                    i6++;
                }
                int i7 = i6 - 1;
                int i8 = i7;
                while (i8 > i3 && stackTrace[i8].getFileName() == null) {
                    i8--;
                }
                if (i8 > i3 && i8 < i7) {
                    arrayList3.add(stackTrace[i8]);
                }
                arrayList3.add(stackTrace[i7]);
                i3 = i6;
            } else {
                arrayList2.add(stackTrace[i3]);
                i3++;
            }
        }
        return arrayList2;
    }

    private final boolean isInternalMethod(java.lang.StackTraceElement stackTraceElement) {
        return kotlin.text.StringsKt.startsWith$default(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, (java.lang.Object) null);
    }

    public final java.util.List<kotlinx.coroutines.debug.internal.DebugCoroutineInfo> dumpCoroutinesInfo() {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new java.lang.IllegalStateException("Debug probes are not installed".toString());
        }
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.sortedWith(kotlin.collections.CollectionsKt.asSequence(getCapturedCoroutines()), new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new kotlin.jvm.functions.Function1<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, kotlinx.coroutines.debug.internal.DebugCoroutineInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
            @Override // kotlin.jvm.functions.Function1
            public final kotlinx.coroutines.debug.internal.DebugCoroutineInfo invoke(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                kotlin.coroutines.CoroutineContext context;
                if (kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                    return null;
                }
                return new kotlinx.coroutines.debug.internal.DebugCoroutineInfo(coroutineOwner.info, context);
            }
        }));
    }

    public final java.util.List<kotlinx.coroutines.debug.internal.DebuggerInfo> dumpDebuggerInfo() {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new java.lang.IllegalStateException("Debug probes are not installed".toString());
        }
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.sortedWith(kotlin.collections.CollectionsKt.asSequence(getCapturedCoroutines()), new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new kotlin.jvm.functions.Function1<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, kotlinx.coroutines.debug.internal.DebuggerInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
            @Override // kotlin.jvm.functions.Function1
            public final kotlinx.coroutines.debug.internal.DebuggerInfo invoke(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                kotlin.coroutines.CoroutineContext context;
                if (kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                    return null;
                }
                return new kotlinx.coroutines.debug.internal.DebuggerInfo(coroutineOwner.info, context);
            }
        }));
    }

    private final kotlinx.coroutines.debug.internal.StackTraceFrame toStackTraceFrame(java.util.List<java.lang.StackTraceElement> list) {
        kotlinx.coroutines.debug.internal.StackTraceFrame stackTraceFrame = null;
        if (!list.isEmpty()) {
            java.util.ListIterator<java.lang.StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                stackTraceFrame = new kotlinx.coroutines.debug.internal.StackTraceFrame(stackTraceFrame, listIterator.previous());
            }
        }
        return new kotlinx.coroutines.debug.internal.StackTraceFrame(stackTraceFrame, ARTIFICIAL_FRAME);
    }
}
