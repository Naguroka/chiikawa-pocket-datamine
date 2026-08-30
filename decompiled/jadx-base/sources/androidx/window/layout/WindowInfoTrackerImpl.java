package androidx.window.layout;

/* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/WindowInfoTracker;", "windowMetricsCalculator", "Landroidx/window/layout/WindowMetricsCalculator;", "windowBackend", "Landroidx/window/layout/WindowBackend;", "(Landroidx/window/layout/WindowMetricsCalculator;Landroidx/window/layout/WindowBackend;)V", "windowLayoutInfo", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/layout/WindowLayoutInfo;", "activity", "Landroid/app/Activity;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WindowInfoTrackerImpl implements androidx.window.layout.WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    private final androidx.window.layout.WindowBackend windowBackend;
    private final androidx.window.layout.WindowMetricsCalculator windowMetricsCalculator;

    public WindowInfoTrackerImpl(androidx.window.layout.WindowMetricsCalculator windowMetricsCalculator, androidx.window.layout.WindowBackend windowBackend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    /* JADX INFO: renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1, reason: invalid class name */
    /* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/window/layout/WindowLayoutInfo;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {0, 0, 1, 1}, l = {54, 55}, m = "invokeSuspend", n = {"$this$flow", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "$this$flow", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super androidx.window.layout.WindowLayoutInfo>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ android.app.Activity $activity;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(android.app.Activity activity, kotlin.coroutines.Continuation<? super androidx.window.layout.WindowInfoTrackerImpl.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.window.layout.WindowInfoTrackerImpl.AnonymousClass1 anonymousClass1 = androidx.window.layout.WindowInfoTrackerImpl.this.new AnonymousClass1(this.$activity, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super androidx.window.layout.WindowLayoutInfo> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.window.layout.WindowInfoTrackerImpl.AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0075 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0076  */
        /* JADX WARN: Code duplicated, block: B:23:0x0081 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:17:0x0064, B:21:0x0079, B:23:0x0081), top: B:35:0x0064 }] */
        /* JADX WARN: Code duplicated, block: B:25:0x0098 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0099  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0099 -> B:35:0x0064). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L39
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r9.L$2
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> La9
                r10 = r5
                goto L63
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.L$2
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> La9
                r6 = r5
                r5 = r9
                goto L79
            L39:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                r4 = 4
                r5 = 10
                r6 = 0
                kotlinx.coroutines.channels.Channel r1 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r5, r1, r6, r4, r6)
                androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0 r4 = new androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0
                r4.<init>()
                androidx.window.layout.WindowInfoTrackerImpl r5 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
                android.app.Activity r6 = r9.$activity
                androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0 r7 = new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0
                r7.<init>()
                r5.registerLayoutChangeCallback(r6, r7, r4)
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La9
            L63:
                r5 = r9
            L64:
                r6 = r5
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch: java.lang.Throwable -> La7
                r5.L$0 = r10     // Catch: java.lang.Throwable -> La7
                r5.L$1 = r4     // Catch: java.lang.Throwable -> La7
                r5.L$2 = r1     // Catch: java.lang.Throwable -> La7
                r5.label = r3     // Catch: java.lang.Throwable -> La7
                java.lang.Object r6 = r1.hasNext(r6)     // Catch: java.lang.Throwable -> La7
                if (r6 != r0) goto L76
                return r0
            L76:
                r8 = r6
                r6 = r10
                r10 = r8
            L79:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La7
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La7
                if (r10 == 0) goto L9b
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> La7
                androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> La7
                r7 = r5
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7     // Catch: java.lang.Throwable -> La7
                r5.L$0 = r6     // Catch: java.lang.Throwable -> La7
                r5.L$1 = r4     // Catch: java.lang.Throwable -> La7
                r5.L$2 = r1     // Catch: java.lang.Throwable -> La7
                r5.label = r2     // Catch: java.lang.Throwable -> La7
                java.lang.Object r10 = r6.emit(r10, r7)     // Catch: java.lang.Throwable -> La7
                if (r10 != r0) goto L99
                return r0
            L99:
                r10 = r6
                goto L64
            L9b:
                androidx.window.layout.WindowInfoTrackerImpl r10 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r10 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r10)
                r10.unregisterLayoutChangeCallback(r4)
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            La7:
                r10 = move-exception
                goto Lab
            La9:
                r10 = move-exception
                r5 = r9
            Lab:
                androidx.window.layout.WindowInfoTrackerImpl r0 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
                r0.unregisterLayoutChangeCallback(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m478invokeSuspend$lambda0(kotlinx.coroutines.channels.Channel channel, androidx.window.layout.WindowLayoutInfo info) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(info, "info");
            channel.mo2805trySendJP2dKIU(info);
        }
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public kotlinx.coroutines.flow.Flow<androidx.window.layout.WindowLayoutInfo> windowLayoutInfo(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        return kotlinx.coroutines.flow.FlowKt.flow(new androidx.window.layout.WindowInfoTrackerImpl.AnonymousClass1(activity, null));
    }
}
