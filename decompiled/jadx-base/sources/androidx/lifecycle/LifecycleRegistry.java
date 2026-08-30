package androidx.lifecycle;

/* JADX INFO: compiled from: LifecycleRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 :2\u00020\u0001:\u0002:;B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\"H\u0016J\u0010\u0010*\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u0010+\u001a\u00020\n2\u0006\u0010)\u001a\u00020\"H\u0002J\u0010\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020.H\u0003J\u0010\u0010/\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020(2\u0006\u0010\r\u001a\u00020\nH\u0017J\u0010\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020\nH\u0002J\b\u00106\u001a\u00020(H\u0002J\u0010\u00107\u001a\u00020(2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u00108\u001a\u00020(2\u0006\u0010)\u001a\u00020\"H\u0016J\b\u00109\u001a\u00020(H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\n0%j\b\u0012\u0004\u0012\u00020\n`&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;)V", "enforceMainThread", "", "(Landroidx/lifecycle/LifecycleOwner;Z)V", "_currentStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/lifecycle/Lifecycle$State;", "addingObserverCounter", "", "state", "currentState", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "setCurrentState", "(Landroidx/lifecycle/Lifecycle$State;)V", "currentStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "handlingEvent", "isSynced", "()Z", "lifecycleOwner", "Ljava/lang/ref/WeakReference;", "newEventOccurred", "observerCount", "getObserverCount", "()I", "observerMap", "Landroidx/arch/core/internal/FastSafeIterableMap;", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "parentStates", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "addObserver", "", "observer", "backwardPass", "calculateTargetState", "enforceMainThreadIfNeeded", "methodName", "", "forwardPass", "handleLifecycleEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "markState", "moveToState", "next", "popParentState", "pushParentState", "removeObserver", "sync", "Companion", "ObserverWithState", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class LifecycleRegistry extends androidx.lifecycle.Lifecycle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.lifecycle.LifecycleRegistry.Companion INSTANCE = new androidx.lifecycle.LifecycleRegistry.Companion(null);
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.lifecycle.Lifecycle.State> _currentStateFlow;
    private int addingObserverCounter;
    private final boolean enforceMainThread;
    private boolean handlingEvent;
    private final java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> lifecycleOwner;
    private boolean newEventOccurred;
    private androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> observerMap;
    private java.util.ArrayList<androidx.lifecycle.Lifecycle.State> parentStates;
    private androidx.lifecycle.Lifecycle.State state;

    public /* synthetic */ LifecycleRegistry(androidx.lifecycle.LifecycleOwner lifecycleOwner, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, z);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.LifecycleRegistry createUnsafe(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        return INSTANCE.createUnsafe(lifecycleOwner);
    }

    private LifecycleRegistry(androidx.lifecycle.LifecycleOwner lifecycleOwner, boolean z) {
        this.enforceMainThread = z;
        this.observerMap = new androidx.arch.core.internal.FastSafeIterableMap<>();
        this.state = androidx.lifecycle.Lifecycle.State.INITIALIZED;
        this.parentStates = new java.util.ArrayList<>();
        this.lifecycleOwner = new java.lang.ref.WeakReference<>(lifecycleOwner);
        this._currentStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(androidx.lifecycle.Lifecycle.State.INITIALIZED);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleRegistry(androidx.lifecycle.LifecycleOwner provider) {
        this(provider, true);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @kotlin.Deprecated(message = "Override [currentState].")
    public void markState(androidx.lifecycle.Lifecycle.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        enforceMainThreadIfNeeded("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    /* JADX INFO: renamed from: getCurrentState, reason: from getter */
    public androidx.lifecycle.Lifecycle.State getState() {
        return this.state;
    }

    public void setCurrentState(androidx.lifecycle.Lifecycle.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public kotlinx.coroutines.flow.StateFlow<androidx.lifecycle.Lifecycle.State> getCurrentStateFlow() {
        return kotlinx.coroutines.flow.FlowKt.asStateFlow(this._currentStateFlow);
    }

    public void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    private final void moveToState(androidx.lifecycle.Lifecycle.State next) {
        androidx.lifecycle.Lifecycle.State state = this.state;
        if (state == next) {
            return;
        }
        if (!((state == androidx.lifecycle.Lifecycle.State.INITIALIZED && next == androidx.lifecycle.Lifecycle.State.DESTROYED) ? false : true)) {
            throw new java.lang.IllegalStateException(("no event down from " + this.state + " in component " + this.lifecycleOwner.get()).toString());
        }
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        sync();
        this.handlingEvent = false;
        if (this.state == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            this.observerMap = new androidx.arch.core.internal.FastSafeIterableMap<>();
        }
    }

    private final boolean isSynced() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> entryEldest = this.observerMap.eldest();
        kotlin.jvm.internal.Intrinsics.checkNotNull(entryEldest);
        androidx.lifecycle.Lifecycle.State state = entryEldest.getValue().getState();
        java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> entryNewest = this.observerMap.newest();
        kotlin.jvm.internal.Intrinsics.checkNotNull(entryNewest);
        androidx.lifecycle.Lifecycle.State state2 = entryNewest.getValue().getState();
        return state == state2 && this.state == state2;
    }

    private final androidx.lifecycle.Lifecycle.State calculateTargetState(androidx.lifecycle.LifecycleObserver observer) {
        androidx.lifecycle.LifecycleRegistry.ObserverWithState value;
        java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> entryCeil = this.observerMap.ceil(observer);
        androidx.lifecycle.Lifecycle.State state = null;
        androidx.lifecycle.Lifecycle.State state2 = (entryCeil == null || (value = entryCeil.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            java.util.ArrayList<androidx.lifecycle.Lifecycle.State> arrayList = this.parentStates;
            state = arrayList.get(arrayList.size() - 1);
        }
        androidx.lifecycle.LifecycleRegistry.Companion companion = INSTANCE;
        return companion.min$lifecycle_runtime_release(companion.min$lifecycle_runtime_release(this.state, state2), state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(androidx.lifecycle.LifecycleObserver observer) {
        androidx.lifecycle.LifecycleOwner lifecycleOwner;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        enforceMainThreadIfNeeded("addObserver");
        androidx.lifecycle.LifecycleRegistry.ObserverWithState observerWithState = new androidx.lifecycle.LifecycleRegistry.ObserverWithState(observer, this.state == androidx.lifecycle.Lifecycle.State.DESTROYED ? androidx.lifecycle.Lifecycle.State.DESTROYED : androidx.lifecycle.Lifecycle.State.INITIALIZED);
        if (this.observerMap.putIfAbsent(observer, observerWithState) == null && (lifecycleOwner = this.lifecycleOwner.get()) != null) {
            boolean z = this.addingObserverCounter != 0 || this.handlingEvent;
            androidx.lifecycle.Lifecycle.State stateCalculateTargetState = calculateTargetState(observer);
            this.addingObserverCounter++;
            while (observerWithState.getState().compareTo(stateCalculateTargetState) < 0 && this.observerMap.contains(observer)) {
                pushParentState(observerWithState.getState());
                androidx.lifecycle.Lifecycle.Event eventUpFrom = androidx.lifecycle.Lifecycle.Event.INSTANCE.upFrom(observerWithState.getState());
                if (eventUpFrom == null) {
                    throw new java.lang.IllegalStateException("no event up from " + observerWithState.getState());
                }
                observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                popParentState();
                stateCalculateTargetState = calculateTargetState(observer);
            }
            if (!z) {
                sync();
            }
            this.addingObserverCounter--;
        }
    }

    private final void popParentState() {
        java.util.ArrayList<androidx.lifecycle.Lifecycle.State> arrayList = this.parentStates;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void pushParentState(androidx.lifecycle.Lifecycle.State state) {
        this.parentStates.add(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(androidx.lifecycle.LifecycleObserver observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        enforceMainThreadIfNeeded("removeObserver");
        this.observerMap.remove(observer);
    }

    public int getObserverCount() {
        enforceMainThreadIfNeeded("getObserverCount");
        return this.observerMap.size();
    }

    private final void forwardPass(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState>.IteratorWithAdditions iteratorWithAdditions = this.observerMap.iteratorWithAdditions();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iteratorWithAdditions, "observerMap.iteratorWithAdditions()");
        androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState>.IteratorWithAdditions iteratorWithAdditions2 = iteratorWithAdditions;
        while (iteratorWithAdditions2.hasNext() && !this.newEventOccurred) {
            java.util.Map.Entry next = iteratorWithAdditions2.next();
            androidx.lifecycle.LifecycleObserver lifecycleObserver = (androidx.lifecycle.LifecycleObserver) next.getKey();
            androidx.lifecycle.LifecycleRegistry.ObserverWithState observerWithState = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) next.getValue();
            while (observerWithState.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(lifecycleObserver)) {
                pushParentState(observerWithState.getState());
                androidx.lifecycle.Lifecycle.Event eventUpFrom = androidx.lifecycle.Lifecycle.Event.INSTANCE.upFrom(observerWithState.getState());
                if (eventUpFrom == null) {
                    throw new java.lang.IllegalStateException("no event up from " + observerWithState.getState());
                }
                observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                popParentState();
            }
        }
    }

    private final void backwardPass(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        java.util.Iterator<java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState>> itDescendingIterator = this.observerMap.descendingIterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> next = itDescendingIterator.next();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "next()");
            androidx.lifecycle.LifecycleObserver key = next.getKey();
            androidx.lifecycle.LifecycleRegistry.ObserverWithState value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                androidx.lifecycle.Lifecycle.Event eventDownFrom = androidx.lifecycle.Lifecycle.Event.INSTANCE.downFrom(value.getState());
                if (eventDownFrom == null) {
                    throw new java.lang.IllegalStateException("no event down from " + value.getState());
                }
                pushParentState(eventDownFrom.getTargetState());
                value.dispatchEvent(lifecycleOwner, eventDownFrom);
                popParentState();
            }
        }
    }

    private final void sync() {
        androidx.lifecycle.LifecycleOwner lifecycleOwner = this.lifecycleOwner.get();
        if (lifecycleOwner == null) {
            throw new java.lang.IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!isSynced()) {
            this.newEventOccurred = false;
            androidx.lifecycle.Lifecycle.State state = this.state;
            java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> entryEldest = this.observerMap.eldest();
            kotlin.jvm.internal.Intrinsics.checkNotNull(entryEldest);
            if (state.compareTo(entryEldest.getValue().getState()) < 0) {
                backwardPass(lifecycleOwner);
            }
            java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> entryNewest = this.observerMap.newest();
            if (!this.newEventOccurred && entryNewest != null && this.state.compareTo(entryNewest.getValue().getState()) > 0) {
                forwardPass(lifecycleOwner);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getState());
    }

    private final void enforceMainThreadIfNeeded(java.lang.String methodName) {
        if (this.enforceMainThread && !androidx.arch.core.executor.ArchTaskExecutor.getInstance().isMainThread()) {
            throw new java.lang.IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
        }
    }

    /* JADX INFO: compiled from: LifecycleRegistry.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "observer", "Landroidx/lifecycle/LifecycleObserver;", "initialState", "Landroidx/lifecycle/Lifecycle$State;", "(Landroidx/lifecycle/LifecycleObserver;Landroidx/lifecycle/Lifecycle$State;)V", "lifecycleObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "getLifecycleObserver", "()Landroidx/lifecycle/LifecycleEventObserver;", "setLifecycleObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "state", "getState", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "dispatchEvent", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ObserverWithState {
        private androidx.lifecycle.LifecycleEventObserver lifecycleObserver;
        private androidx.lifecycle.Lifecycle.State state;

        public ObserverWithState(androidx.lifecycle.LifecycleObserver lifecycleObserver, androidx.lifecycle.Lifecycle.State initialState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialState, "initialState");
            kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycleObserver);
            this.lifecycleObserver = androidx.lifecycle.Lifecycling.lifecycleEventObserver(lifecycleObserver);
            this.state = initialState;
        }

        public final androidx.lifecycle.Lifecycle.State getState() {
            return this.state;
        }

        public final void setState(androidx.lifecycle.Lifecycle.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "<set-?>");
            this.state = state;
        }

        public final androidx.lifecycle.LifecycleEventObserver getLifecycleObserver() {
            return this.lifecycleObserver;
        }

        public final void setLifecycleObserver(androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleEventObserver, "<set-?>");
            this.lifecycleObserver = lifecycleEventObserver;
        }

        public final void dispatchEvent(androidx.lifecycle.LifecycleOwner owner, androidx.lifecycle.Lifecycle.Event event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            androidx.lifecycle.Lifecycle.State targetState = event.getTargetState();
            this.state = androidx.lifecycle.LifecycleRegistry.INSTANCE.min$lifecycle_runtime_release(this.state, targetState);
            androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver = this.lifecycleObserver;
            kotlin.jvm.internal.Intrinsics.checkNotNull(owner);
            lifecycleEventObserver.onStateChanged(owner, event);
            this.state = targetState;
        }
    }

    /* JADX INFO: compiled from: LifecycleRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "()V", "createUnsafe", "Landroidx/lifecycle/LifecycleRegistry;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "min", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "min$lifecycle_runtime_release", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.lifecycle.LifecycleRegistry createUnsafe(androidx.lifecycle.LifecycleOwner owner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
            return new androidx.lifecycle.LifecycleRegistry(owner, false, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.lifecycle.Lifecycle.State min$lifecycle_runtime_release(androidx.lifecycle.Lifecycle.State state1, androidx.lifecycle.Lifecycle.State state2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state1, "state1");
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }
    }
}
