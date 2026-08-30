package androidx.lifecycle;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H'J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H'R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f8G@GX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "()V", "currentState", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "currentStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "<set-?>", "Ljava/util/concurrent/atomic/AtomicReference;", "internalScopeRef", "getInternalScopeRef", "()Ljava/util/concurrent/atomic/AtomicReference;", "setInternalScopeRef", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "addObserver", "", "observer", "Landroidx/lifecycle/LifecycleObserver;", "removeObserver", "Event", "State", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Lifecycle {
    private java.util.concurrent.atomic.AtomicReference<java.lang.Object> internalScopeRef = new java.util.concurrent.atomic.AtomicReference<>();

    public abstract void addObserver(androidx.lifecycle.LifecycleObserver observer);

    public abstract androidx.lifecycle.Lifecycle.State getCurrentState();

    public abstract void removeObserver(androidx.lifecycle.LifecycleObserver observer);

    public final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    public final void setInternalScopeRef(java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }

    public kotlinx.coroutines.flow.StateFlow<androidx.lifecycle.Lifecycle.State> getCurrentStateFlow() {
        final kotlinx.coroutines.flow.MutableStateFlow MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(getCurrentState());
        addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.lifecycle.Lifecycle$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                androidx.lifecycle.Lifecycle._get_currentStateFlow_$lambda$0(MutableStateFlow, lifecycleOwner, event);
            }
        });
        return kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_currentStateFlow_$lambda$0(kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableStateFlow, "$mutableStateFlow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        mutableStateFlow.setValue(event.getTargetState());
    }

    /* JADX INFO: compiled from: Lifecycle.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "(Ljava/lang/String;I)V", "targetState", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "Companion", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.lifecycle.Lifecycle.Event.Companion INSTANCE = new androidx.lifecycle.Lifecycle.Event.Companion(null);

        /* JADX INFO: compiled from: Lifecycle.kt */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_RESUME.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_ANY.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.Lifecycle.Event downFrom(androidx.lifecycle.Lifecycle.State state) {
            return INSTANCE.downFrom(state);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.Lifecycle.Event downTo(androidx.lifecycle.Lifecycle.State state) {
            return INSTANCE.downTo(state);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.Lifecycle.Event upFrom(androidx.lifecycle.Lifecycle.State state) {
            return INSTANCE.upFrom(state);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.Lifecycle.Event upTo(androidx.lifecycle.Lifecycle.State state) {
            return INSTANCE.upTo(state);
        }

        public final androidx.lifecycle.Lifecycle.State getTargetState() {
            switch (androidx.lifecycle.Lifecycle.Event.WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return androidx.lifecycle.Lifecycle.State.CREATED;
                case 3:
                case 4:
                    return androidx.lifecycle.Lifecycle.State.STARTED;
                case 5:
                    return androidx.lifecycle.Lifecycle.State.RESUMED;
                case 6:
                    return androidx.lifecycle.Lifecycle.State.DESTROYED;
                default:
                    throw new java.lang.IllegalArgumentException(this + " has no target state");
            }
        }

        /* JADX INFO: compiled from: Lifecycle.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event$Companion;", "", "()V", "downFrom", "Landroidx/lifecycle/Lifecycle$Event;", "state", "Landroidx/lifecycle/Lifecycle$State;", "downTo", "upFrom", "upTo", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: compiled from: Lifecycle.kt */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.lifecycle.Lifecycle.State.values().length];
                    try {
                        iArr[androidx.lifecycle.Lifecycle.State.CREATED.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.lifecycle.Lifecycle.State.STARTED.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[androidx.lifecycle.Lifecycle.State.RESUMED.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[androidx.lifecycle.Lifecycle.State.DESTROYED.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[androidx.lifecycle.Lifecycle.State.INITIALIZED.ordinal()] = 5;
                    } catch (java.lang.NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.Lifecycle.Event downFrom(androidx.lifecycle.Lifecycle.State state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
                int i = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return androidx.lifecycle.Lifecycle.Event.ON_DESTROY;
                }
                if (i == 2) {
                    return androidx.lifecycle.Lifecycle.Event.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return androidx.lifecycle.Lifecycle.Event.ON_PAUSE;
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.Lifecycle.Event downTo(androidx.lifecycle.Lifecycle.State state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
                int i = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return androidx.lifecycle.Lifecycle.Event.ON_STOP;
                }
                if (i == 2) {
                    return androidx.lifecycle.Lifecycle.Event.ON_PAUSE;
                }
                if (i != 4) {
                    return null;
                }
                return androidx.lifecycle.Lifecycle.Event.ON_DESTROY;
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.Lifecycle.Event upFrom(androidx.lifecycle.Lifecycle.State state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
                int i = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return androidx.lifecycle.Lifecycle.Event.ON_START;
                }
                if (i == 2) {
                    return androidx.lifecycle.Lifecycle.Event.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return androidx.lifecycle.Lifecycle.Event.ON_CREATE;
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.Lifecycle.Event upTo(androidx.lifecycle.Lifecycle.State state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
                int i = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return androidx.lifecycle.Lifecycle.Event.ON_CREATE;
                }
                if (i == 2) {
                    return androidx.lifecycle.Lifecycle.Event.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return androidx.lifecycle.Lifecycle.Event.ON_RESUME;
            }
        }
    }

    /* JADX INFO: compiled from: Lifecycle.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "(Ljava/lang/String;I)V", "isAtLeast", "", "state", "DESTROYED", "INITIALIZED", kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, "STARTED", "RESUMED", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(androidx.lifecycle.Lifecycle.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }
}
