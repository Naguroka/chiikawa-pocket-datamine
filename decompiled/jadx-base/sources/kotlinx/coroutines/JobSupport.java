package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlin.Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\n²\u0001³\u0001´\u0001µ\u0001¶\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0002J\u001e\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00112\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110KH\u0002J\u0012\u0010L\u001a\u00020H2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0014J\u000e\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\u0002J\u0013\u0010O\u001a\u0004\u0018\u00010\u000bH\u0084@ø\u0001\u0000¢\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u0004\u0018\u00010\u000bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010PJ\u0012\u0010R\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0017J\u0018\u0010R\u001a\u00020H2\u000e\u0010S\u001a\n\u0018\u00010Tj\u0004\u0018\u0001`UH\u0016J\u0010\u0010V\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u0011J\u0017\u0010W\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\bXJ\u0010\u0010Y\u001a\u00020H2\u0006\u0010S\u001a\u00020\u0011H\u0016J\u0014\u0010Z\u001a\u0004\u0018\u00010\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010[\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0011H\u0002J\b\u0010\\\u001a\u00020]H\u0014J\u0010\u0010^\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0011H\u0016J\u001a\u0010_\u001a\u00020H2\u0006\u00108\u001a\u00020?2\b\u0010`\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010a\u001a\u00020H2\u0006\u00108\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010f\u001a\u00020\u00112\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0002J&\u0010g\u001a\u00020h2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010]2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0011H\u0080\b¢\u0006\u0002\bjJ\u001c\u0010k\u001a\u0004\u0018\u00010\u000b2\u0006\u00108\u001a\u00020b2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010l\u001a\u0004\u0018\u00010d2\u0006\u00108\u001a\u00020?H\u0002J\n\u0010m\u001a\u00060Tj\u0002`UJ\f\u0010n\u001a\u00060Tj\u0002`UH\u0016J\u000f\u0010o\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\bpJ\b\u0010q\u001a\u0004\u0018\u00010\u0011J \u0010r\u001a\u0004\u0018\u00010\u00112\u0006\u00108\u001a\u00020b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110KH\u0002J\u0012\u0010s\u001a\u0004\u0018\u00010D2\u0006\u00108\u001a\u00020?H\u0002J\u0010\u0010t\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\u0011H\u0014J\u0015\u0010v\u001a\u00020H2\u0006\u0010u\u001a\u00020\u0011H\u0010¢\u0006\u0002\bwJ\u0012\u0010x\u001a\u00020H2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0004JA\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020\u00052\u0006\u0010|\u001a\u00020\u00052)\u0010}\u001a%\u0012\u0016\u0012\u0014\u0018\u00010\u0011¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020H0~j\u0003`\u0081\u0001J1\u0010y\u001a\u00020z2)\u0010}\u001a%\u0012\u0016\u0012\u0014\u0018\u00010\u0011¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020H0~j\u0003`\u0081\u0001J\u0012\u0010\u0082\u0001\u001a\u00020HH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010PJ\t\u0010\u0083\u0001\u001a\u00020\u0005H\u0002J\u0012\u0010\u0084\u0001\u001a\u00020HH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010PJ\"\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0015\u0010\u0087\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020H0~H\u0082\bJ\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0002J\u0019\u0010\u0089\u0001\u001a\u00020\u00052\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0003\b\u008a\u0001J\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0003\b\u008c\u0001J<\u0010\u008d\u0001\u001a\u00020F2)\u0010}\u001a%\u0012\u0016\u0012\u0014\u0018\u00010\u0011¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020H0~j\u0003`\u0081\u00012\u0006\u0010{\u001a\u00020\u0005H\u0002J\u000f\u0010\u008e\u0001\u001a\u00020]H\u0010¢\u0006\u0003\b\u008f\u0001J\u0019\u0010\u0090\u0001\u001a\u00020H2\u0006\u0010C\u001a\u00020D2\u0006\u0010S\u001a\u00020\u0011H\u0002J)\u0010\u0091\u0001\u001a\u00020H\"\u000b\b\u0000\u0010\u0092\u0001\u0018\u0001*\u00020F2\u0006\u0010C\u001a\u00020D2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0082\bJ!\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010\u0096\u0001\u001a\u00020H2\f\u0010\u0097\u0001\u001a\u0007\u0012\u0002\b\u00030\u0098\u00012\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010{\u001a\u00020H2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0014J\u0013\u0010\u0099\u0001\u001a\u00020H2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0014J\t\u0010\u009a\u0001\u001a\u00020HH\u0014J\u0010\u0010\u009b\u0001\u001a\u00020H2\u0007\u0010\u009c\u0001\u001a\u00020\u0003J\u0012\u0010\u009d\u0001\u001a\u00020H2\u0007\u00108\u001a\u00030\u009e\u0001H\u0002J\u0011\u0010\u009f\u0001\u001a\u00020H2\u0006\u00108\u001a\u00020FH\u0002J\"\u0010 \u0001\u001a\u00020H2\f\u0010\u0097\u0001\u001a\u0007\u0012\u0002\b\u00030\u0098\u00012\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\u0017\u0010¡\u0001\u001a\u00020H2\u0006\u0010E\u001a\u00020FH\u0000¢\u0006\u0003\b¢\u0001J\u0007\u0010£\u0001\u001a\u00020\u0005J\u0014\u0010¤\u0001\u001a\u00030¥\u00012\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0002J\u0013\u0010¦\u0001\u001a\u00020]2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0002J\t\u0010§\u0001\u001a\u00020]H\u0007J\t\u0010¨\u0001\u001a\u00020]H\u0016J\u001b\u0010©\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020?2\b\u0010`\u001a\u0004\u0018\u00010\u000bH\u0002J\u0019\u0010ª\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020?2\u0006\u0010I\u001a\u00020\u0011H\u0002J\u001f\u0010«\u0001\u001a\u0004\u0018\u00010\u000b2\b\u00108\u001a\u0004\u0018\u00010\u000b2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J\u001d\u0010¬\u0001\u001a\u0004\u0018\u00010\u000b2\u0006\u00108\u001a\u00020?2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J$\u0010\u00ad\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020b2\u0006\u0010N\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0082\u0010J\u0010\u0010®\u0001\u001a\u0004\u0018\u00010d*\u00030¯\u0001H\u0002J\u0017\u0010°\u0001\u001a\u00020H*\u00020D2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0002J\u001d\u0010±\u0001\u001a\u00060Tj\u0002`U*\u00020\u00112\n\b\u0002\u0010i\u001a\u0004\u0018\u00010]H\u0004R\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bX\u0082\u0004R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0015\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u001e\u0010\"\u001a\u0006\u0012\u0002\b\u00030#8DX\u0084\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0017\u0010*\u001a\u00020+8F¢\u0006\f\u0012\u0004\b,\u0010%\u001a\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R(\u00103\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\t8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00108\u001a\u0004\u0018\u00010\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0018\u0010>\u001a\u00020\u0005*\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006·\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "(Z)V", "_parentHandle", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/ChildHandle;", "_state", "", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "completionCause", "", "getCompletionCause", "()Ljava/lang/Throwable;", "completionCauseHandled", "getCompletionCauseHandled", "()Z", "handlesException", "getHandlesException$kotlinx_coroutines_core", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", com.ironsource.y8.h.W, "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onAwaitInternal", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwaitInternal$annotations", "()V", "getOnAwaitInternal", "()Lkotlinx/coroutines/selects/SelectClause1;", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin$annotations", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "parent", "getParent", "()Lkotlinx/coroutines/Job;", "value", "parentHandle", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "exceptionOrNull", "getExceptionOrNull", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "isCancelling", "Lkotlinx/coroutines/Incomplete;", "(Lkotlinx/coroutines/Incomplete;)Z", "addLastAtomic", "expect", "list", "Lkotlinx/coroutines/NodeList;", "node", "Lkotlinx/coroutines/JobNode;", "addSuppressedExceptions", "", "rootCause", "exceptions", "", "afterCompletion", "attachChild", "child", "awaitInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSuspend", "cancel", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelCoroutine", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelInternal", "cancelMakeCompleting", "cancelParent", "cancellationExceptionMessage", "", "childCancelled", "completeStateFinalization", "update", "continueCompleting", "Lkotlinx/coroutines/JobSupport$Finishing;", "lastChild", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "createCauseException", "defaultCancellationException", "Lkotlinx/coroutines/JobCancellationException;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "defaultCancellationException$kotlinx_coroutines_core", "finalizeFinishingState", "firstChild", "getCancellationException", "getChildJobCancellationCause", "getCompletedInternal", "getCompletedInternal$kotlinx_coroutines_core", "getCompletionExceptionOrNull", "getFinalRootCause", "getOrPromoteCancellingList", "handleJobException", "exception", "handleOnCompletionException", "handleOnCompletionException$kotlinx_coroutines_core", "initParentJob", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "joinInternal", "joinSuspend", "loopOnState", "", "block", "makeCancelling", "makeCompleting", "makeCompleting$kotlinx_coroutines_core", "makeCompletingOnce", "makeCompletingOnce$kotlinx_coroutines_core", "makeNode", "nameString", "nameString$kotlinx_coroutines_core", "notifyCancelling", "notifyHandlers", "T", "onAwaitInternalProcessResFunc", "ignoredParam", "result", "onAwaitInternalRegFunc", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "onCompletionInternal", "onStart", "parentCancelled", "parentJob", "promoteEmptyToNodeList", "Lkotlinx/coroutines/Empty;", "promoteSingleToNodeList", "registerSelectForOnJoin", "removeNode", "removeNode$kotlinx_coroutines_core", androidx.media3.extractor.text.ttml.TtmlNode.START, "startInternal", "", "stateString", "toDebugString", "toString", "tryFinalizeSimpleState", "tryMakeCancelling", "tryMakeCompleting", "tryMakeCompletingSlowPath", "tryWaitForChild", "nextChild", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "notifyCompletion", "toCancellationException", "AwaitContinuation", "ChildCompletion", "Finishing", "SelectOnAwaitCompletionHandler", "SelectOnJoinCompletionHandler", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class JobSupport implements kotlinx.coroutines.Job, kotlinx.coroutines.ChildJob, kotlinx.coroutines.ParentJob {

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _parentHandle;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _state;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.class, java.lang.Object.class, "_state");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _parentHandle$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.class, java.lang.Object.class, "_parentHandle");

    protected static /* synthetic */ void getOnAwaitInternal$annotations() {
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    protected void afterCompletion(java.lang.Object state) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public java.lang.String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: getHandlesException$kotlinx_coroutines_core */
    public boolean getHandlesException() {
        return true;
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    protected boolean handleJobException(java.lang.Throwable exception) {
        return false;
    }

    protected boolean isScopedCoroutine() {
        return false;
    }

    protected void onCancelling(java.lang.Throwable cause) {
    }

    protected void onCompletionInternal(java.lang.Object state) {
    }

    protected void onStart() {
    }

    public JobSupport(boolean z) {
        this._state = z ? kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE : kotlinx.coroutines.JobSupportKt.EMPTY_NEW;
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel((java.util.concurrent.CancellationException) null);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) kotlinx.coroutines.Job.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) kotlinx.coroutines.Job.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return kotlinx.coroutines.Job.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.Job.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public kotlinx.coroutines.Job plus(kotlinx.coroutines.Job job) {
        return kotlinx.coroutines.Job.DefaultImpls.plus((kotlinx.coroutines.Job) this, job);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return kotlinx.coroutines.Job.INSTANCE;
    }

    public final kotlinx.coroutines.ChildHandle getParentHandle$kotlinx_coroutines_core() {
        return (kotlinx.coroutines.ChildHandle) _parentHandle$FU.get(this);
    }

    public final void setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.ChildHandle childHandle) {
        _parentHandle$FU.set(this, childHandle);
    }

    @Override // kotlinx.coroutines.Job
    public kotlinx.coroutines.Job getParent() {
        kotlinx.coroutines.ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    protected final void initParentJob(kotlinx.coroutines.Job parent) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(getParentHandle$kotlinx_coroutines_core() == null)) {
                throw new java.lang.AssertionError();
            }
        }
        if (parent == null) {
            setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.NonDisposableHandle.INSTANCE);
            return;
        }
        parent.start();
        kotlinx.coroutines.ChildHandle childHandleAttachChild = parent.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(childHandleAttachChild);
        if (isCompleted()) {
            childHandleAttachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.NonDisposableHandle.INSTANCE);
        }
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof kotlinx.coroutines.internal.OpDescriptor)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(this);
        }
    }

    private final java.lang.Void loopOnState(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> block) {
        while (true) {
            block.invoke(getState$kotlinx_coroutines_core());
        }
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) && ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getIsActive();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.Incomplete);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) || ((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) && ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).isCancelling());
    }

    private final java.lang.Object finalizeFinishingState(kotlinx.coroutines.JobSupport.Finishing state, java.lang.Object proposedUpdate) throws java.lang.Throwable {
        boolean zIsCancelling;
        java.lang.Throwable finalRootCause;
        boolean z = true;
        boolean z2 = false;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(getState$kotlinx_coroutines_core() == state)) {
                throw new java.lang.AssertionError();
            }
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!state.isSealed())) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !state.isCompleting()) {
            throw new java.lang.AssertionError();
        }
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = proposedUpdate instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) proposedUpdate : null;
        java.lang.Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        synchronized (state) {
            zIsCancelling = state.isCancelling();
            java.util.List<java.lang.Throwable> listSealLocked = state.sealLocked(th);
            finalRootCause = getFinalRootCause(state, listSealLocked);
            if (finalRootCause != null) {
                addSuppressedExceptions(finalRootCause, listSealLocked);
            }
        }
        if (finalRootCause != null && finalRootCause != th) {
            proposedUpdate = new kotlinx.coroutines.CompletedExceptionally(finalRootCause, z2, 2, defaultConstructorMarker);
        }
        if (finalRootCause != null) {
            if (!cancelParent(finalRootCause) && !handleJobException(finalRootCause)) {
                z = false;
            }
            if (z) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(proposedUpdate, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((kotlinx.coroutines.CompletedExceptionally) proposedUpdate).makeHandled();
            }
        }
        if (!zIsCancelling) {
            onCancelling(finalRootCause);
        }
        onCompletionInternal(proposedUpdate);
        boolean zM = kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, state, kotlinx.coroutines.JobSupportKt.boxIncomplete(proposedUpdate));
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !zM) {
            throw new java.lang.AssertionError();
        }
        completeStateFinalization(state, proposedUpdate);
        return proposedUpdate;
    }

    private final java.lang.Throwable getFinalRootCause(kotlinx.coroutines.JobSupport.Finishing state, java.util.List<? extends java.lang.Throwable> exceptions) {
        java.lang.Object next;
        java.lang.Object obj = null;
        if (exceptions.isEmpty()) {
            if (state.isCancelling()) {
                return new kotlinx.coroutines.JobCancellationException(cancellationExceptionMessage(), null, this);
            }
            return null;
        }
        java.util.List<? extends java.lang.Throwable> list = exceptions;
        java.util.Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!(((java.lang.Throwable) next) instanceof java.util.concurrent.CancellationException)));
        java.lang.Throwable th = (java.lang.Throwable) next;
        if (th != null) {
            return th;
        }
        java.lang.Throwable th2 = exceptions.get(0);
        if (th2 instanceof kotlinx.coroutines.TimeoutCancellationException) {
            for (java.lang.Object obj2 : list) {
                java.lang.Throwable th3 = (java.lang.Throwable) obj2;
                if (th3 != th2 && (th3 instanceof kotlinx.coroutines.TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            java.lang.Throwable th4 = (java.lang.Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final void addSuppressedExceptions(java.lang.Throwable rootCause, java.util.List<? extends java.lang.Throwable> exceptions) {
        if (exceptions.size() <= 1) {
            return;
        }
        java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(exceptions.size()));
        java.lang.Throwable thUnwrapImpl = !kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() ? rootCause : kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(rootCause);
        for (java.lang.Throwable thUnwrapImpl2 : exceptions) {
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                thUnwrapImpl2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(thUnwrapImpl2);
            }
            if (thUnwrapImpl2 != rootCause && thUnwrapImpl2 != thUnwrapImpl && !(thUnwrapImpl2 instanceof java.util.concurrent.CancellationException) && setNewSetFromMap.add(thUnwrapImpl2)) {
                kotlin.ExceptionsKt.addSuppressed(rootCause, thUnwrapImpl2);
            }
        }
    }

    private final boolean tryFinalizeSimpleState(kotlinx.coroutines.Incomplete state, java.lang.Object update) throws java.lang.Throwable {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!((state instanceof kotlinx.coroutines.Empty) || (state instanceof kotlinx.coroutines.JobNode))) {
                throw new java.lang.AssertionError();
            }
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!(update instanceof kotlinx.coroutines.CompletedExceptionally))) {
            throw new java.lang.AssertionError();
        }
        if (!kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, state, kotlinx.coroutines.JobSupportKt.boxIncomplete(update))) {
            return false;
        }
        onCancelling(null);
        onCompletionInternal(update);
        completeStateFinalization(state, update);
        return true;
    }

    private final void completeStateFinalization(kotlinx.coroutines.Incomplete state, java.lang.Object update) throws java.lang.Throwable {
        kotlinx.coroutines.ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(kotlinx.coroutines.NonDisposableHandle.INSTANCE);
        }
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = update instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) update : null;
        java.lang.Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        if (state instanceof kotlinx.coroutines.JobNode) {
            try {
                ((kotlinx.coroutines.JobNode) state).invoke(th);
                return;
            } catch (java.lang.Throwable th2) {
                handleOnCompletionException$kotlinx_coroutines_core(new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + state + " for " + this, th2));
                return;
            }
        }
        kotlinx.coroutines.NodeList list = state.getList();
        if (list != null) {
            notifyCompletion(list, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    private final void notifyCancelling(kotlinx.coroutines.NodeList list, java.lang.Throwable cause) throws java.lang.Throwable {
        onCancelling(cause);
        kotlinx.coroutines.NodeList nodeList = list;
        java.lang.Object next = nodeList.getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        kotlinx.coroutines.CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode nextNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(nextNode, nodeList); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof kotlinx.coroutines.JobCancellingNode) {
                kotlinx.coroutines.JobNode jobNode = (kotlinx.coroutines.JobNode) nextNode;
                try {
                    jobNode.invoke(cause);
                } catch (java.lang.Throwable th) {
                    kotlinx.coroutines.CompletionHandlerException completionHandlerException2 = completionHandlerException;
                    if (completionHandlerException2 != null) {
                        kotlin.ExceptionsKt.addSuppressed(completionHandlerException2, th);
                        if (completionHandlerException2 == null) {
                            completionHandlerException = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        }
                    } else {
                        completionHandlerException = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                }
            }
        }
        kotlinx.coroutines.CompletionHandlerException completionHandlerException3 = completionHandlerException;
        if (completionHandlerException3 != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException3);
        }
        cancelParent(cause);
    }

    private final boolean cancelParent(java.lang.Throwable cause) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z = cause instanceof java.util.concurrent.CancellationException;
        kotlinx.coroutines.ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == kotlinx.coroutines.NonDisposableHandle.INSTANCE) {
            return z;
        }
        return parentHandle$kotlinx_coroutines_core.childCancelled(cause) || z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    private final /* synthetic */ <T extends kotlinx.coroutines.JobNode> void notifyHandlers(kotlinx.coroutines.NodeList list, java.lang.Throwable cause) throws java.lang.Throwable {
        kotlinx.coroutines.NodeList nodeList = list;
        java.lang.Object next = nodeList.getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        kotlinx.coroutines.CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode nextNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(nextNode, nodeList); nextNode = nextNode.getNextNode()) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (nextNode instanceof kotlinx.coroutines.internal.LockFreeLinkedListNode) {
                kotlinx.coroutines.JobNode jobNode = (kotlinx.coroutines.JobNode) nextNode;
                try {
                    jobNode.invoke(cause);
                } catch (java.lang.Throwable th) {
                    kotlinx.coroutines.CompletionHandlerException completionHandlerException2 = completionHandlerException;
                    if (completionHandlerException2 == null) {
                        completionHandlerException = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    } else {
                        kotlin.ExceptionsKt.addSuppressed(completionHandlerException2, th);
                        if (completionHandlerException2 == null) {
                            completionHandlerException = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th);
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        kotlinx.coroutines.CompletionHandlerException completionHandlerException3 = completionHandlerException;
        if (completionHandlerException3 != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException3);
        }
    }

    private final int startInternal(java.lang.Object state) {
        if (state instanceof kotlinx.coroutines.Empty) {
            if (((kotlinx.coroutines.Empty) state).getIsActive()) {
                return 0;
            }
            if (!kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, state, kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE)) {
                return -1;
            }
            onStart();
            return 1;
        }
        if (!(state instanceof kotlinx.coroutines.InactiveNodeList)) {
            return 0;
        }
        if (!kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, state, ((kotlinx.coroutines.InactiveNodeList) state).getList())) {
            return -1;
        }
        onStart();
        return 1;
    }

    @Override // kotlinx.coroutines.Job
    public final java.util.concurrent.CancellationException getCancellationException() {
        java.util.concurrent.CancellationException cancellationException;
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing)) {
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
                throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
            }
            return state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally ? toCancellationException$default(this, ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause, null, 1, null) : new kotlinx.coroutines.JobCancellationException(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this) + " has completed normally", null, this);
        }
        java.lang.Throwable rootCause = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getRootCause();
        if (rootCause == null || (cancellationException = toCancellationException(rootCause, kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this) + " is cancelling")) == null) {
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        return cancellationException;
    }

    public static /* synthetic */ java.util.concurrent.CancellationException toCancellationException$default(kotlinx.coroutines.JobSupport jobSupport, java.lang.Throwable th, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return jobSupport.toCancellationException(th, str);
    }

    protected final java.util.concurrent.CancellationException toCancellationException(java.lang.Throwable th, java.lang.String str) {
        java.util.concurrent.CancellationException cancellationException = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = cancellationExceptionMessage();
        }
        return new kotlinx.coroutines.JobCancellationException(str, th, this);
    }

    protected final java.lang.Throwable getCompletionCause() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) {
            java.lang.Throwable rootCause = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getRootCause();
            if (rootCause != null) {
                return rootCause;
            }
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            return ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        return null;
    }

    protected final boolean getCompletionCauseHandled() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) && ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).getHandled();
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        return invokeOnCompletion(false, true, handler);
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlinx.coroutines.JobNode jobNodeMakeNode = makeNode(handler, onCancelling);
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Empty) {
                kotlinx.coroutines.Empty empty = (kotlinx.coroutines.Empty) state$kotlinx_coroutines_core;
                if (empty.getIsActive()) {
                    if (kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, state$kotlinx_coroutines_core, jobNodeMakeNode)) {
                        return jobNodeMakeNode;
                    }
                } else {
                    promoteEmptyToNodeList(empty);
                }
            } else {
                java.lang.Throwable rootCause = null;
                if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
                    kotlinx.coroutines.NodeList list = ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getList();
                    if (list == null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        promoteSingleToNodeList((kotlinx.coroutines.JobNode) state$kotlinx_coroutines_core);
                    } else {
                        kotlinx.coroutines.DisposableHandle disposableHandle = kotlinx.coroutines.NonDisposableHandle.INSTANCE;
                        if (onCancelling && (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing)) {
                            synchronized (state$kotlinx_coroutines_core) {
                                rootCause = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getRootCause();
                                if (rootCause == null || ((handler instanceof kotlinx.coroutines.ChildHandleNode) && !((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).isCompleting())) {
                                    if (addLastAtomic(state$kotlinx_coroutines_core, list, jobNodeMakeNode)) {
                                        if (rootCause == null) {
                                            return jobNodeMakeNode;
                                        }
                                        disposableHandle = jobNodeMakeNode;
                                    }
                                }
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                        }
                        if (rootCause != null) {
                            if (invokeImmediately) {
                                handler.invoke(rootCause);
                            }
                            return disposableHandle;
                        }
                        if (addLastAtomic(state$kotlinx_coroutines_core, list, jobNodeMakeNode)) {
                            return jobNodeMakeNode;
                        }
                    }
                } else {
                    if (invokeImmediately) {
                        kotlinx.coroutines.CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core : null;
                        handler.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                    }
                    return kotlinx.coroutines.NonDisposableHandle.INSTANCE;
                }
            }
        }
    }

    private final kotlinx.coroutines.JobNode makeNode(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler, boolean onCancelling) {
        kotlinx.coroutines.InvokeOnCompletion invokeOnCompletion;
        if (onCancelling) {
            invokeOnCompletion = handler instanceof kotlinx.coroutines.JobCancellingNode ? (kotlinx.coroutines.JobCancellingNode) handler : null;
            if (invokeOnCompletion == null) {
                invokeOnCompletion = new kotlinx.coroutines.InvokeOnCancelling(handler);
            }
            invokeOnCompletion = invokeOnCompletion;
        } else {
            invokeOnCompletion = handler instanceof kotlinx.coroutines.JobNode ? (kotlinx.coroutines.JobNode) handler : null;
            if (invokeOnCompletion != null) {
                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!(invokeOnCompletion instanceof kotlinx.coroutines.JobCancellingNode))) {
                    throw new java.lang.AssertionError();
                }
            } else {
                invokeOnCompletion = new kotlinx.coroutines.InvokeOnCompletion(handler);
            }
        }
        invokeOnCompletion.setJob(this);
        return invokeOnCompletion;
    }

    private final boolean addLastAtomic(final java.lang.Object expect, kotlinx.coroutines.NodeList list, kotlinx.coroutines.JobNode node) {
        int iTryCondAddNext;
        kotlinx.coroutines.NodeList nodeList = list;
        final kotlinx.coroutines.JobNode jobNode = node;
        kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp condAddOp = new kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp(jobNode) { // from class: kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1
            @Override // kotlinx.coroutines.internal.AtomicOp
            public java.lang.Object prepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected) {
                if (this.getState$kotlinx_coroutines_core() == expect) {
                    return null;
                }
                return kotlinx.coroutines.internal.LockFreeLinkedListKt.getCONDITION_FALSE();
            }
        };
        do {
            iTryCondAddNext = nodeList.getPrevNode().tryCondAddNext(jobNode, nodeList, condAddOp);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    private final void promoteEmptyToNodeList(kotlinx.coroutines.Empty state) {
        kotlinx.coroutines.NodeList nodeList = new kotlinx.coroutines.NodeList();
        kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, state, state.getIsActive() ? nodeList : new kotlinx.coroutines.InactiveNodeList(nodeList));
    }

    private final void promoteSingleToNodeList(kotlinx.coroutines.JobNode state) {
        state.addOneIfEmpty(new kotlinx.coroutines.NodeList());
        kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, state, state.getNextNode());
    }

    @Override // kotlinx.coroutines.Job
    public final java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!joinInternal()) {
            kotlinx.coroutines.JobKt.ensureActive(continuation.getContext());
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object objJoinSuspend = joinSuspend(continuation);
        return objJoinSuspend == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoinSuspend : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
        kotlinx.coroutines.JobSupport$onJoin$1 jobSupport$onJoin$1 = kotlinx.coroutines.JobSupport$onJoin$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(jobSupport$onJoin$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new kotlinx.coroutines.selects.SelectClause0Impl(this, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onJoin$1, 3), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForOnJoin(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object ignoredParam) {
        if (!joinInternal()) {
            select.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
        } else {
            select.disposeOnCompletion(invokeOnCompletion(new kotlinx.coroutines.JobSupport.SelectOnJoinCompletionHandler(select)));
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnJoinCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class SelectOnJoinCompletionHandler extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.selects.SelectInstance<?> select;

        public SelectOnJoinCompletionHandler(kotlinx.coroutines.selects.SelectInstance<?> selectInstance) {
            this.select = selectInstance;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            invoke2(th);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable cause) {
            this.select.trySelect(kotlinx.coroutines.JobSupport.this, kotlin.Unit.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(java.lang.Throwable cause) {
        kotlinx.coroutines.JobCancellationException jobCancellationException;
        if (cause == null || (jobCancellationException = toCancellationException$default(this, cause, null, 1, null)) == null) {
            jobCancellationException = new kotlinx.coroutines.JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(jobCancellationException);
        return true;
    }

    public void cancelInternal(java.lang.Throwable cause) {
        cancelImpl$kotlinx_coroutines_core(cause);
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(kotlinx.coroutines.ParentJob parentJob) throws java.lang.Throwable {
        cancelImpl$kotlinx_coroutines_core(parentJob);
    }

    public boolean childCancelled(java.lang.Throwable cause) {
        if (cause instanceof java.util.concurrent.CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(cause) && getHandlesException();
    }

    public final boolean cancelCoroutine(java.lang.Throwable cause) {
        return cancelImpl$kotlinx_coroutines_core(cause);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(java.lang.Object cause) throws java.lang.Throwable {
        java.lang.Object objMakeCancelling = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
        if (getOnCancelComplete$kotlinx_coroutines_core() && (objMakeCancelling = cancelMakeCompleting(cause)) == kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        if (objMakeCancelling == kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY) {
            objMakeCancelling = makeCancelling(cause);
        }
        if (objMakeCancelling == kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY || objMakeCancelling == kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        if (objMakeCancelling == kotlinx.coroutines.JobSupportKt.TOO_LATE_TO_CANCEL) {
            return false;
        }
        afterCompletion(objMakeCancelling);
        return true;
    }

    public static /* synthetic */ kotlinx.coroutines.JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(kotlinx.coroutines.JobSupport jobSupport, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = jobSupport.cancellationExceptionMessage();
        }
        return new kotlinx.coroutines.JobCancellationException(str, th, jobSupport);
    }

    public final kotlinx.coroutines.JobCancellationException defaultCancellationException$kotlinx_coroutines_core(java.lang.String message, java.lang.Throwable cause) {
        if (message == null) {
            message = cancellationExceptionMessage();
        }
        return new kotlinx.coroutines.JobCancellationException(message, cause, this);
    }

    @Override // kotlinx.coroutines.ParentJob
    public java.util.concurrent.CancellationException getChildJobCancellationCause() {
        java.lang.Throwable rootCause;
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) {
            rootCause = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getRootCause();
        } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            rootCause = ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        } else {
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
                throw new java.lang.IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
            }
            rootCause = null;
        }
        java.util.concurrent.CancellationException cancellationException = rootCause instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) rootCause : null;
        return cancellationException == null ? new kotlinx.coroutines.JobCancellationException("Parent job is " + stateString(state$kotlinx_coroutines_core), rootCause, this) : cancellationException;
    }

    private final java.lang.Throwable createCauseException(java.lang.Object cause) {
        if (cause == null ? true : cause instanceof java.lang.Throwable) {
            java.lang.Throwable th = (java.lang.Throwable) cause;
            return th == null ? new kotlinx.coroutines.JobCancellationException(cancellationExceptionMessage(), null, this) : th;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(cause, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((kotlinx.coroutines.ParentJob) cause).getChildJobCancellationCause();
    }

    private final kotlinx.coroutines.NodeList getOrPromoteCancellingList(kotlinx.coroutines.Incomplete state) {
        kotlinx.coroutines.NodeList list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof kotlinx.coroutines.Empty) {
            return new kotlinx.coroutines.NodeList();
        }
        if (state instanceof kotlinx.coroutines.JobNode) {
            promoteSingleToNodeList((kotlinx.coroutines.JobNode) state);
            return null;
        }
        throw new java.lang.IllegalStateException(("State should have list: " + state).toString());
    }

    private final boolean tryMakeCancelling(kotlinx.coroutines.Incomplete state, java.lang.Throwable rootCause) throws java.lang.Throwable {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!(state instanceof kotlinx.coroutines.JobSupport.Finishing))) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !state.getIsActive()) {
            throw new java.lang.AssertionError();
        }
        kotlinx.coroutines.NodeList orPromoteCancellingList = getOrPromoteCancellingList(state);
        if (orPromoteCancellingList == null) {
            return false;
        }
        if (!kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, state, new kotlinx.coroutines.JobSupport.Finishing(orPromoteCancellingList, false, rootCause))) {
            return false;
        }
        notifyCancelling(orPromoteCancellingList, rootCause);
        return true;
    }

    private final java.lang.Object tryMakeCompleting(java.lang.Object state, java.lang.Object proposedUpdate) {
        if (!(state instanceof kotlinx.coroutines.Incomplete)) {
            return kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
        }
        if ((!(state instanceof kotlinx.coroutines.Empty) && !(state instanceof kotlinx.coroutines.JobNode)) || (state instanceof kotlinx.coroutines.ChildHandleNode) || (proposedUpdate instanceof kotlinx.coroutines.CompletedExceptionally)) {
            return tryMakeCompletingSlowPath((kotlinx.coroutines.Incomplete) state, proposedUpdate);
        }
        return tryFinalizeSimpleState((kotlinx.coroutines.Incomplete) state, proposedUpdate) ? proposedUpdate : kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.Object tryMakeCompletingSlowPath(kotlinx.coroutines.Incomplete state, java.lang.Object proposedUpdate) throws java.lang.Throwable {
        kotlinx.coroutines.NodeList orPromoteCancellingList = getOrPromoteCancellingList(state);
        if (orPromoteCancellingList == null) {
            return kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY;
        }
        kotlinx.coroutines.JobSupport.Finishing finishing = state instanceof kotlinx.coroutines.JobSupport.Finishing ? (kotlinx.coroutines.JobSupport.Finishing) state : null;
        if (finishing == null) {
            finishing = new kotlinx.coroutines.JobSupport.Finishing(orPromoteCancellingList, false, null);
        }
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        synchronized (finishing) {
            if (finishing.isCompleting()) {
                return kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
            }
            finishing.setCompleting(true);
            if (finishing != state && !kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, state, finishing)) {
                return kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY;
            }
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!finishing.isSealed())) {
                throw new java.lang.AssertionError();
            }
            boolean zIsCancelling = finishing.isCancelling();
            kotlinx.coroutines.CompletedExceptionally completedExceptionally = proposedUpdate instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) proposedUpdate : null;
            if (completedExceptionally != null) {
                finishing.addExceptionLocked(completedExceptionally.cause);
            }
            objectRef.element = java.lang.Boolean.valueOf(zIsCancelling ? false : true).booleanValue() ? finishing.getRootCause() : 0;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.lang.Throwable th = (java.lang.Throwable) objectRef.element;
            if (th != null) {
                notifyCancelling(orPromoteCancellingList, th);
            }
            kotlinx.coroutines.ChildHandleNode childHandleNodeFirstChild = firstChild(state);
            if (childHandleNodeFirstChild != null && tryWaitForChild(finishing, childHandleNodeFirstChild, proposedUpdate)) {
                return kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN;
            }
            return finalizeFinishingState(finishing, proposedUpdate);
        }
    }

    private final java.lang.Throwable getExceptionOrNull(java.lang.Object obj) {
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = obj instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    private final kotlinx.coroutines.ChildHandleNode firstChild(kotlinx.coroutines.Incomplete state) {
        kotlinx.coroutines.ChildHandleNode childHandleNode = state instanceof kotlinx.coroutines.ChildHandleNode ? (kotlinx.coroutines.ChildHandleNode) state : null;
        if (childHandleNode != null) {
            return childHandleNode;
        }
        kotlinx.coroutines.NodeList list = state.getList();
        if (list != null) {
            return nextChild(list);
        }
        return null;
    }

    private final boolean tryWaitForChild(kotlinx.coroutines.JobSupport.Finishing state, kotlinx.coroutines.ChildHandleNode child, java.lang.Object proposedUpdate) {
        while (kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(child.childJob, false, false, new kotlinx.coroutines.JobSupport.ChildCompletion(this, state, child, proposedUpdate), 1, null) == kotlinx.coroutines.NonDisposableHandle.INSTANCE) {
            child = nextChild(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void continueCompleting(kotlinx.coroutines.JobSupport.Finishing state, kotlinx.coroutines.ChildHandleNode lastChild, java.lang.Object proposedUpdate) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(getState$kotlinx_coroutines_core() == state)) {
                throw new java.lang.AssertionError();
            }
        }
        kotlinx.coroutines.ChildHandleNode childHandleNodeNextChild = nextChild(lastChild);
        if (childHandleNodeNextChild == null || !tryWaitForChild(state, childHandleNodeNextChild, proposedUpdate)) {
            afterCompletion(finalizeFinishingState(state, proposedUpdate));
        }
    }

    private final kotlinx.coroutines.ChildHandleNode nextChild(kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof kotlinx.coroutines.ChildHandleNode) {
                    return (kotlinx.coroutines.ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof kotlinx.coroutines.NodeList) {
                    return null;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.Job
    public final kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
        return kotlin.sequences.SequencesKt.sequence(new kotlinx.coroutines.JobSupport$children$1(this, null));
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob child) {
        kotlinx.coroutines.DisposableHandle disposableHandleInvokeOnCompletion$default = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(this, true, false, new kotlinx.coroutines.ChildHandleNode(child), 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(disposableHandleInvokeOnCompletion$default, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (kotlinx.coroutines.ChildHandle) disposableHandleInvokeOnCompletion$default;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(java.lang.Throwable exception) throws java.lang.Throwable {
        throw exception;
    }

    public java.lang.String toString() {
        return toDebugString() + '@' + kotlinx.coroutines.DebugStringsKt.getHexAddress(this);
    }

    public final java.lang.String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + stateString(getState$kotlinx_coroutines_core()) + '}';
    }

    public java.lang.String nameString$kotlinx_coroutines_core() {
        return kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this);
    }

    private final java.lang.String stateString(java.lang.Object state) {
        if (state instanceof kotlinx.coroutines.JobSupport.Finishing) {
            kotlinx.coroutines.JobSupport.Finishing finishing = (kotlinx.coroutines.JobSupport.Finishing) state;
            if (finishing.isCancelling()) {
                return "Cancelling";
            }
            return finishing.isCompleting() ? "Completing" : "Active";
        }
        if (state instanceof kotlinx.coroutines.Incomplete) {
            return ((kotlinx.coroutines.Incomplete) state).getIsActive() ? "Active" : "New";
        }
        return state instanceof kotlinx.coroutines.CompletedExceptionally ? "Cancelled" : "Completed";
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\tJ\u0018\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\t0&j\b\u0012\u0004\u0012\u00020\t`'H\u0002J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0)2\b\u0010*\u001a\u0004\u0018\u00010\tJ\b\u0010+\u001a\u00020,H\u0016R\u0011\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fX\u0082\u0004R\t\u0010\r\u001a\u00020\u000eX\u0082\u0004R\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fX\u0082\u0004R(\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006-"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "isCompleting", "", "rootCause", "", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "_exceptionsHolder", "Lkotlinx/atomicfu/AtomicRef;", "_isCompleting", "Lkotlinx/atomicfu/AtomicBoolean;", "_rootCause", "value", "exceptionsHolder", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "isActive", "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "(Ljava/lang/Throwable;)V", "addExceptionLocked", "", "exception", "allocateList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sealLocked", "", "proposedException", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Finishing implements kotlinx.coroutines.Incomplete {

        @kotlin.jvm.Volatile
        private volatile java.lang.Object _exceptionsHolder;

        @kotlin.jvm.Volatile
        private volatile int _isCompleting;

        @kotlin.jvm.Volatile
        private volatile java.lang.Object _rootCause;
        private final kotlinx.coroutines.NodeList list;
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isCompleting$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.Finishing.class, "_isCompleting");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _rootCause$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.Finishing.class, java.lang.Object.class, "_rootCause");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _exceptionsHolder$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.Finishing.class, java.lang.Object.class, "_exceptionsHolder");

        @Override // kotlinx.coroutines.Incomplete
        public kotlinx.coroutines.NodeList getList() {
            return this.list;
        }

        public Finishing(kotlinx.coroutines.NodeList nodeList, boolean z, java.lang.Throwable th) {
            this.list = nodeList;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        public final boolean isCompleting() {
            return _isCompleting$FU.get(this) != 0;
        }

        public final void setCompleting(boolean z) {
            _isCompleting$FU.set(this, z ? 1 : 0);
        }

        public final java.lang.Throwable getRootCause() {
            return (java.lang.Throwable) _rootCause$FU.get(this);
        }

        public final void setRootCause(java.lang.Throwable th) {
            _rootCause$FU.set(this, th);
        }

        private final java.lang.Object getExceptionsHolder() {
            return _exceptionsHolder$FU.get(this);
        }

        private final void setExceptionsHolder(java.lang.Object obj) {
            _exceptionsHolder$FU.set(this, obj);
        }

        public final boolean isSealed() {
            return getExceptionsHolder() == kotlinx.coroutines.JobSupportKt.SEALED;
        }

        public final boolean isCancelling() {
            return getRootCause() != null;
        }

        @Override // kotlinx.coroutines.Incomplete
        /* JADX INFO: renamed from: isActive */
        public boolean getIsActive() {
            return getRootCause() == null;
        }

        public final java.util.List<java.lang.Throwable> sealLocked(java.lang.Throwable proposedException) {
            java.util.ArrayList<java.lang.Throwable> arrayListAllocateList;
            java.lang.Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                arrayListAllocateList = allocateList();
            } else if (exceptionsHolder instanceof java.lang.Throwable) {
                java.util.ArrayList<java.lang.Throwable> arrayListAllocateList2 = allocateList();
                arrayListAllocateList2.add(exceptionsHolder);
                arrayListAllocateList = arrayListAllocateList2;
            } else {
                if (!(exceptionsHolder instanceof java.util.ArrayList)) {
                    throw new java.lang.IllegalStateException(("State is " + exceptionsHolder).toString());
                }
                arrayListAllocateList = (java.util.ArrayList) exceptionsHolder;
            }
            java.lang.Throwable rootCause = getRootCause();
            if (rootCause != null) {
                arrayListAllocateList.add(0, rootCause);
            }
            if (proposedException != null && !kotlin.jvm.internal.Intrinsics.areEqual(proposedException, rootCause)) {
                arrayListAllocateList.add(proposedException);
            }
            setExceptionsHolder(kotlinx.coroutines.JobSupportKt.SEALED);
            return arrayListAllocateList;
        }

        public final void addExceptionLocked(java.lang.Throwable exception) {
            java.lang.Throwable rootCause = getRootCause();
            if (rootCause == null) {
                setRootCause(exception);
                return;
            }
            if (exception == rootCause) {
                return;
            }
            java.lang.Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                setExceptionsHolder(exception);
                return;
            }
            if (!(exceptionsHolder instanceof java.lang.Throwable)) {
                if (!(exceptionsHolder instanceof java.util.ArrayList)) {
                    throw new java.lang.IllegalStateException(("State is " + exceptionsHolder).toString());
                }
                ((java.util.ArrayList) exceptionsHolder).add(exception);
            } else {
                if (exception == exceptionsHolder) {
                    return;
                }
                java.util.ArrayList<java.lang.Throwable> arrayListAllocateList = allocateList();
                arrayListAllocateList.add(exceptionsHolder);
                arrayListAllocateList.add(exception);
                setExceptionsHolder(arrayListAllocateList);
            }
        }

        private final java.util.ArrayList<java.lang.Throwable> allocateList() {
            return new java.util.ArrayList<>(4);
        }

        public java.lang.String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + isCompleting() + ", rootCause=" + getRootCause() + ", exceptions=" + getExceptionsHolder() + ", list=" + getList() + ']';
        }
    }

    private final boolean isCancelling(kotlinx.coroutines.Incomplete incomplete) {
        return (incomplete instanceof kotlinx.coroutines.JobSupport.Finishing) && ((kotlinx.coroutines.JobSupport.Finishing) incomplete).isCancelling();
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ChildCompletion extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.ChildHandleNode child;
        private final kotlinx.coroutines.JobSupport parent;
        private final java.lang.Object proposedUpdate;
        private final kotlinx.coroutines.JobSupport.Finishing state;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            invoke2(th);
            return kotlin.Unit.INSTANCE;
        }

        public ChildCompletion(kotlinx.coroutines.JobSupport jobSupport, kotlinx.coroutines.JobSupport.Finishing finishing, kotlinx.coroutines.ChildHandleNode childHandleNode, java.lang.Object obj) {
            this.parent = jobSupport;
            this.state = finishing;
            this.child = childHandleNode;
            this.proposedUpdate = obj;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable cause) {
            this.parent.continueCompleting(this.state, this.child, this.proposedUpdate);
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", "", "parent", "Lkotlinx/coroutines/Job;", "nameString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AwaitContinuation<T> extends kotlinx.coroutines.CancellableContinuationImpl<T> {
        private final kotlinx.coroutines.JobSupport job;

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        protected java.lang.String nameString() {
            return "AwaitContinuation";
        }

        public AwaitContinuation(kotlin.coroutines.Continuation<? super T> continuation, kotlinx.coroutines.JobSupport jobSupport) {
            super(continuation, 1);
            this.job = jobSupport;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job parent) {
            java.lang.Throwable rootCause;
            java.lang.Object state$kotlinx_coroutines_core = this.job.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) || (rootCause = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getRootCause()) == null) {
                return state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally ? ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause : parent.getCancellationException();
            }
            return rootCause;
        }
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.CompletedExceptionally;
    }

    public final java.lang.Throwable getCompletionExceptionOrNull() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete))) {
            throw new java.lang.IllegalStateException("This job has not completed yet".toString());
        }
        return getExceptionOrNull(state$kotlinx_coroutines_core);
    }

    public final java.lang.Object getCompletedInternal$kotlinx_coroutines_core() throws java.lang.Throwable {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete))) {
            throw new java.lang.IllegalStateException("This job has not completed yet".toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            throw ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        return kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
    }

    protected final java.lang.Object awaitInternal(kotlin.coroutines.Continuation<java.lang.Object> continuation) throws java.lang.Throwable {
        java.lang.Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
                    java.lang.Throwable th = ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
                    if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
                    }
                    throw th;
                }
                return kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return awaitSuspend(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object awaitSuspend(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        kotlinx.coroutines.JobSupport.AwaitContinuation awaitContinuation = new kotlinx.coroutines.JobSupport.AwaitContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), this);
        awaitContinuation.initCancellability();
        kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(awaitContinuation, invokeOnCompletion(new kotlinx.coroutines.ResumeAwaitOnCompletion(awaitContinuation)));
        java.lang.Object result = awaitContinuation.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    protected final kotlinx.coroutines.selects.SelectClause1<?> getOnAwaitInternal() {
        kotlinx.coroutines.JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = kotlinx.coroutines.JobSupport$onAwaitInternal$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$1, 3);
        kotlinx.coroutines.JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = kotlinx.coroutines.JobSupport$onAwaitInternal$2.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.SelectClause1Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$2, 3), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAwaitInternalRegFunc(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object ignoredParam) {
        java.lang.Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally)) {
                    state$kotlinx_coroutines_core = kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
                }
                select.selectInRegistrationPhase(state$kotlinx_coroutines_core);
                return;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        select.disposeOnCompletion(invokeOnCompletion(new kotlinx.coroutines.JobSupport.SelectOnAwaitCompletionHandler(select)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object onAwaitInternalProcessResFunc(java.lang.Object ignoredParam, java.lang.Object result) throws java.lang.Throwable {
        if (result instanceof kotlinx.coroutines.CompletedExceptionally) {
            throw ((kotlinx.coroutines.CompletedExceptionally) result).cause;
        }
        return result;
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnAwaitCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class SelectOnAwaitCompletionHandler extends kotlinx.coroutines.JobNode {
        private final kotlinx.coroutines.selects.SelectInstance<?> select;

        public SelectOnAwaitCompletionHandler(kotlinx.coroutines.selects.SelectInstance<?> selectInstance) {
            this.select = selectInstance;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            invoke2(th);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable cause) {
            java.lang.Object state$kotlinx_coroutines_core = kotlinx.coroutines.JobSupport.this.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally)) {
                state$kotlinx_coroutines_core = kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
            this.select.trySelect(kotlinx.coroutines.JobSupport.this, state$kotlinx_coroutines_core);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    private final void notifyCompletion(kotlinx.coroutines.NodeList nodeList, java.lang.Throwable th) throws java.lang.Throwable {
        kotlinx.coroutines.NodeList nodeList2 = nodeList;
        java.lang.Object next = nodeList2.getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        kotlinx.coroutines.CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode nextNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(nextNode, nodeList2); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof kotlinx.coroutines.JobNode) {
                kotlinx.coroutines.JobNode jobNode = (kotlinx.coroutines.JobNode) nextNode;
                try {
                    jobNode.invoke(th);
                } catch (java.lang.Throwable th2) {
                    kotlinx.coroutines.CompletionHandlerException completionHandlerException2 = completionHandlerException;
                    if (completionHandlerException2 != null) {
                        kotlin.ExceptionsKt.addSuppressed(completionHandlerException2, th2);
                        if (completionHandlerException2 == null) {
                            completionHandlerException = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        }
                    } else {
                        completionHandlerException = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                }
            }
        }
        kotlinx.coroutines.CompletionHandlerException completionHandlerException3 = completionHandlerException;
        if (completionHandlerException3 != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException3);
        }
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int iStartInternal;
        do {
            iStartInternal = startInternal(getState$kotlinx_coroutines_core());
            if (iStartInternal == 0) {
                return false;
            }
        } while (iStartInternal != 1);
        return true;
    }

    private final boolean joinInternal() {
        java.lang.Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                return false;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object joinSuspend(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl2, invokeOnCompletion(new kotlinx.coroutines.ResumeOnCompletion(cancellableContinuationImpl2)));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    public final void removeNode$kotlinx_coroutines_core(kotlinx.coroutines.JobNode node) {
        java.lang.Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobNode)) {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) || ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getList() == null) {
                    return;
                }
                node.mo2859remove();
                return;
            }
            if (state$kotlinx_coroutines_core != node) {
                return;
            }
        } while (!kotlin.UByte$$ExternalSyntheticBackport0.m(_state$FU, this, state$kotlinx_coroutines_core, kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE));
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(java.util.concurrent.CancellationException cause) {
        if (cause == null) {
            cause = new kotlinx.coroutines.JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cause);
    }

    private final java.lang.Object cancelMakeCompleting(java.lang.Object cause) {
        java.lang.Object objTryMakeCompleting;
        do {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) || ((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) && ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).isCompleting())) {
                return kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
            }
            objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new kotlinx.coroutines.CompletedExceptionally(createCauseException(cause), false, 2, null));
        } while (objTryMakeCompleting == kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY);
        return objTryMakeCompleting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.Object makeCancelling(java.lang.Object cause) throws java.lang.Throwable {
        java.lang.Object[] objArr = 0;
        java.lang.Throwable thCreateCauseException = null;
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing)) {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                    return kotlinx.coroutines.JobSupportKt.TOO_LATE_TO_CANCEL;
                }
                if (thCreateCauseException == null) {
                    thCreateCauseException = createCauseException(cause);
                }
                kotlinx.coroutines.Incomplete incomplete = (kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core;
                if (incomplete.getIsActive()) {
                    if (tryMakeCancelling(incomplete, thCreateCauseException)) {
                        return kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
                    }
                } else {
                    java.lang.Object objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new kotlinx.coroutines.CompletedExceptionally(thCreateCauseException, false, 2, objArr == true ? 1 : 0));
                    if (objTryMakeCompleting != kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY) {
                        if (objTryMakeCompleting != kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY) {
                            return objTryMakeCompleting;
                        }
                    } else {
                        throw new java.lang.IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                    }
                }
            } else {
                synchronized (state$kotlinx_coroutines_core) {
                    if (((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).isSealed()) {
                        return kotlinx.coroutines.JobSupportKt.TOO_LATE_TO_CANCEL;
                    }
                    boolean zIsCancelling = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).isCancelling();
                    if (cause != null || !zIsCancelling) {
                        if (thCreateCauseException == null) {
                            thCreateCauseException = createCauseException(cause);
                        }
                        ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).addExceptionLocked(thCreateCauseException);
                    }
                    java.lang.Throwable rootCause = zIsCancelling ^ true ? ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getRootCause() : null;
                    if (rootCause != null) {
                        notifyCancelling(((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getList(), rootCause);
                    }
                    return kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY;
                }
            }
        }
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(java.lang.Object proposedUpdate) {
        java.lang.Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), proposedUpdate);
            if (objTryMakeCompleting == kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY) {
                return false;
            }
            if (objTryMakeCompleting == kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
        } while (objTryMakeCompleting == kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY);
        afterCompletion(objTryMakeCompleting);
        return true;
    }

    public final java.lang.Object makeCompletingOnce$kotlinx_coroutines_core(java.lang.Object proposedUpdate) {
        java.lang.Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), proposedUpdate);
            if (objTryMakeCompleting == kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY) {
                throw new java.lang.IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, getExceptionOrNull(proposedUpdate));
            }
        } while (objTryMakeCompleting == kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY);
        return objTryMakeCompleting;
    }
}
