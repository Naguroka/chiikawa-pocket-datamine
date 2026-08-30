package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u000245B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!H\u0010¢\u0006\u0002\b\"J\u0012\u0010#\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u001e\u0010&\u001a\u00020'2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010)\u001a\u0004\u0018\u00010\rH\u0014J\u0016\u0010*\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0002J\u0019\u0010,\u001a\u00020'2\u0006\u0010)\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020/H\u0016J&\u00100\u001a\b\u0012\u0004\u0012\u00020'012\u0006\u0010)\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0011\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0012j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\r`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00008F¢\u0006\f\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/BufferedChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "capacity", "", "(I)V", "getCapacity", "()I", "isClosedForSend", "", "()Z", "lastConflatedElement", "", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "onSendInternalResult", "Ljava/util/HashMap;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/collections/HashMap;", "subscribers", "", "value", "getValue$annotations", "()V", "getValue", "()Ljava/lang/Object;", "valueOrNull", "getValueOrNull$annotations", "getValueOrNull", "cancelImpl", "cause", "", "cancelImpl$kotlinx_coroutines_core", "close", "openSubscription", "Lkotlinx/coroutines/channels/ReceiveChannel;", "registerSelectForSend", "", "select", "element", "removeSubscriber", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "SubscriberBuffered", "SubscriberConflated", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BroadcastChannelImpl<E> extends kotlinx.coroutines.channels.BufferedChannel<E> implements kotlinx.coroutines.channels.BroadcastChannel<E> {
    private final int capacity;
    private java.lang.Object lastConflatedElement;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final java.util.HashMap<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object> onSendInternalResult;
    private java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> subscribers;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$send$1, reason: invalid class name */
    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {230}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.channels.BroadcastChannelImpl<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = broadcastChannelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.send(null, this);
        }
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void getValueOrNull$annotations() {
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public BroadcastChannelImpl(int i) {
        super(0, null);
        this.capacity = i;
        if (!(i >= 1 || i == -1)) {
            throw new java.lang.IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + i + " was specified").toString());
        }
        this.lock = new java.util.concurrent.locks.ReentrantLock();
        this.subscribers = kotlin.collections.CollectionsKt.emptyList();
        this.lastConflatedElement = kotlinx.coroutines.channels.BroadcastChannelKt.NO_ELEMENT;
        this.onSendInternalResult = new java.util.HashMap<>();
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.channels.BufferedChannel subscriberConflated = this.capacity == -1 ? new kotlinx.coroutines.channels.BroadcastChannelImpl.SubscriberConflated() : new kotlinx.coroutines.channels.BroadcastChannelImpl.SubscriberBuffered();
            if (!isClosedForSend() || this.lastConflatedElement != kotlinx.coroutines.channels.BroadcastChannelKt.NO_ELEMENT) {
                if (this.lastConflatedElement != kotlinx.coroutines.channels.BroadcastChannelKt.NO_ELEMENT) {
                    subscriberConflated.mo2805trySendJP2dKIU(getValue());
                }
                this.subscribers = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlinx.coroutines.channels.BufferedChannel>) this.subscribers, subscriberConflated);
                return subscriberConflated;
            }
            subscriberConflated.close(getCloseCause());
            return subscriberConflated;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSubscriber(kotlinx.coroutines.channels.ReceiveChannel<? extends E> s) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> list = this.subscribers;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kotlinx.coroutines.channels.BufferedChannel bufferedChannel = (java.lang.Object) it.next();
                if (bufferedChannel != s) {
                    arrayList.add(bufferedChannel);
                }
            }
            this.subscribers = arrayList;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:28:0x0080). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = (kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.BroadcastChannelImpl r4 = (kotlinx.coroutines.channels.BroadcastChannelImpl) r4
            kotlin.ResultKt.throwOnFailure(r8)
            goto L80
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.lock
            java.util.concurrent.locks.Lock r8 = (java.util.concurrent.locks.Lock) r8
            r8.lock()
            boolean r2 = r6.isClosedForSend()     // Catch: java.lang.Throwable -> L9e
            if (r2 != 0) goto L99
            int r2 = r6.capacity     // Catch: java.lang.Throwable -> L9e
            r4 = -1
            if (r2 != r4) goto L53
            r6.lastConflatedElement = r7     // Catch: java.lang.Throwable -> L9e
        L53:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r2 = r6.subscribers     // Catch: java.lang.Throwable -> L9e
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L62:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r7.next()
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2
            r0.L$0 = r4
            r0.L$1 = r8
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r2 = r2.sendBroadcast$kotlinx_coroutines_core(r8, r0)
            if (r2 != r1) goto L7d
            return r1
        L7d:
            r5 = r2
            r2 = r8
            r8 = r5
        L80:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L94
            boolean r8 = r4.isClosedForSend()
            if (r8 != 0) goto L8f
            goto L94
        L8f:
            java.lang.Throwable r7 = r4.getSendException()
            throw r7
        L94:
            r8 = r2
            goto L62
        L96:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L99:
            java.lang.Throwable r7 = r6.getSendException()     // Catch: java.lang.Throwable -> L9e
            throw r7     // Catch: java.lang.Throwable -> L9e
        L9e:
            r7 = move-exception
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.send(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU, reason: not valid java name */
    public java.lang.Object mo2805trySendJP2dKIU(E element) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                java.lang.Object objMo2805trySendJP2dKIU = super.mo2805trySendJP2dKIU(element);
                reentrantLock.unlock();
                return objMo2805trySendJP2dKIU;
            }
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> list = this.subscribers;
            boolean z = false;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((kotlinx.coroutines.channels.BufferedChannel) it.next()).shouldSendSuspend$kotlinx_coroutines_core()) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                java.lang.Object objM2829failurePtdJZtk = kotlinx.coroutines.channels.ChannelResult.INSTANCE.m2829failurePtdJZtk();
                reentrantLock.unlock();
                return objM2829failurePtdJZtk;
            }
            if (this.capacity == -1) {
                this.lastConflatedElement = element;
            }
            java.util.Iterator<T> it2 = this.subscribers.iterator();
            while (it2.hasNext()) {
                ((kotlinx.coroutines.channels.BufferedChannel) it2.next()).mo2805trySendJP2dKIU(element);
            }
            java.lang.Object objM2830successJP2dKIU = kotlinx.coroutines.channels.ChannelResult.INSTANCE.m2830successJP2dKIU(kotlin.Unit.INSTANCE);
            reentrantLock.unlock();
            return objM2830successJP2dKIU;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object element) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            java.lang.Object objRemove = this.onSendInternalResult.remove(select);
            if (objRemove != null) {
                select.selectInRegistrationPhase(objRemove);
                reentrantLock.unlock();
            } else {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                reentrantLock.unlock();
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(select.getContext()), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass2(this, element, select, null), 1, null);
            }
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2, reason: invalid class name */
    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.Object $element;
        final /* synthetic */ kotlinx.coroutines.selects.SelectInstance<?> $select;
        int label;
        final /* synthetic */ kotlinx.coroutines.channels.BroadcastChannelImpl<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl, java.lang.Object obj, kotlinx.coroutines.selects.SelectInstance<?> selectInstance, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = broadcastChannelImpl;
            this.$element = obj;
            this.$select = selectInstance;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass2(this.this$0, this.$element, this.$select, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            boolean z;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl = this.this$0;
                    java.lang.Object obj2 = this.$element;
                    this.label = 1;
                    if (broadcastChannelImpl.send((E) obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                z = true;
            } catch (java.lang.Throwable th) {
                if (!this.this$0.isClosedForSend() || (!(th instanceof kotlinx.coroutines.channels.ClosedSendChannelException) && this.this$0.getSendException() != th)) {
                    throw th;
                }
                z = false;
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock = ((kotlinx.coroutines.channels.BroadcastChannelImpl) this.this$0).lock;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl2 = this.this$0;
            kotlinx.coroutines.selects.SelectInstance<?> selectInstance = this.$select;
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = reentrantLock;
            reentrantLock2.lock();
            try {
                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                    if (!(((kotlinx.coroutines.channels.BroadcastChannelImpl) broadcastChannelImpl2).onSendInternalResult.get(selectInstance) == null)) {
                        throw new java.lang.AssertionError();
                    }
                }
                ((kotlinx.coroutines.channels.BroadcastChannelImpl) broadcastChannelImpl2).onSendInternalResult.put(selectInstance, z ? kotlin.Unit.INSTANCE : kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
                kotlin.jvm.internal.Intrinsics.checkNotNull(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                if (((kotlinx.coroutines.selects.SelectImplementation) selectInstance).trySelectDetailed(broadcastChannelImpl2, kotlin.Unit.INSTANCE) != kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER) {
                    ((kotlinx.coroutines.channels.BroadcastChannelImpl) broadcastChannelImpl2).onSendInternalResult.remove(selectInstance);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                reentrantLock2.unlock();
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable cause) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            java.util.Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((kotlinx.coroutines.channels.BufferedChannel) it.next()).close(cause);
            }
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> list = this.subscribers;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                kotlinx.coroutines.channels.BufferedChannel bufferedChannel = (java.lang.Object) it2.next();
                if (bufferedChannel.hasElements$kotlinx_coroutines_core()) {
                    arrayList.add(bufferedChannel);
                }
            }
            this.subscribers = arrayList;
            return super.close(cause);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable cause) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            java.util.Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((kotlinx.coroutines.channels.BufferedChannel) it.next()).cancelImpl$kotlinx_coroutines_core(cause);
            }
            this.lastConflatedElement = kotlinx.coroutines.channels.BroadcastChannelKt.NO_ELEMENT;
            return super.cancelImpl$kotlinx_coroutines_core(cause);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.isClosedForSend();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered;", "Lkotlinx/coroutines/channels/BufferedChannel;", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "cancelImpl", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class SubscriberBuffered extends kotlinx.coroutines.channels.BufferedChannel<E> {
        /* JADX WARN: Multi-variable type inference failed */
        public SubscriberBuffered() {
            super(kotlinx.coroutines.channels.BroadcastChannelImpl.this.getCapacity(), null, 2, 0 == true ? 1 : 0);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: cancelImpl, reason: merged with bridge method [inline-methods] */
        public boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable cause) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = ((kotlinx.coroutines.channels.BroadcastChannelImpl) kotlinx.coroutines.channels.BroadcastChannelImpl.this).lock;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl = kotlinx.coroutines.channels.BroadcastChannelImpl.this;
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = reentrantLock;
            reentrantLock2.lock();
            try {
                broadcastChannelImpl.removeSubscriber(this);
                return super.cancelImpl$kotlinx_coroutines_core(cause);
            } finally {
                reentrantLock2.unlock();
            }
        }
    }

    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberConflated;", "Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "cancelImpl", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class SubscriberConflated extends kotlinx.coroutines.channels.ConflatedBufferedChannel<E> {
        public SubscriberConflated() {
            super(1, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST, null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: cancelImpl, reason: merged with bridge method [inline-methods] */
        public boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable cause) {
            kotlinx.coroutines.channels.BroadcastChannelImpl.this.removeSubscriber(this);
            return super.cancelImpl$kotlinx_coroutines_core(cause);
        }
    }

    public final E getValue() throws java.lang.Throwable {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isClosedForSend()) {
                if (this.lastConflatedElement == kotlinx.coroutines.channels.BroadcastChannelKt.NO_ELEMENT) {
                    throw new java.lang.IllegalStateException("No value".toString());
                }
                E e = (E) this.lastConflatedElement;
                reentrantLock.unlock();
                return e;
            }
            java.lang.Throwable closeCause = getCloseCause();
            if (closeCause == null) {
                throw new java.lang.IllegalStateException("This broadcast channel is closed");
            }
            throw closeCause;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final E getValueOrNull() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            E e = null;
            if (!isClosedForReceive() && this.lastConflatedElement != kotlinx.coroutines.channels.BroadcastChannelKt.NO_ELEMENT) {
                e = (E) this.lastConflatedElement;
            }
            return e;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public java.lang.String toString() {
        return (this.lastConflatedElement != kotlinx.coroutines.channels.BroadcastChannelKt.NO_ELEMENT ? "CONFLATED_ELEMENT=" + this.lastConflatedElement + "; " : "") + "BROADCAST=<" + super.toString() + ">; SUBSCRIBERS=" + kotlin.collections.CollectionsKt.joinToString$default(this.subscribers, ";", "<", ">", 0, null, null, 56, null);
    }
}
