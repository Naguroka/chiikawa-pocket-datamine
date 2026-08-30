package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0002*+B\u001d\b\u0016\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0011\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0004H\u0087\u0002J\u001e\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u0016H\u0007¢\u0006\u0002\u0010\u001bJ1\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u0002H\u0016H\u0002¢\u0006\u0002\u0010\u001eJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00160 \"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u0016H\u0007¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040#H\u0007J\u001d\u0010$\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0017J\b\u0010\r\u001a\u00020\u000eH\u0007J&\u0010%\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u0001H\u0016H\u0087\u0002¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u000eH\u0007R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "initialState", "", "", "(Ljava/util/Map;)V", "()V", "flows", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "liveDatas", "Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "regular", "savedStateProvider", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProviders", "clearSavedStateProvider", "", com.ironsource.y8.h.W, "contains", "", "get", "T", "(Ljava/lang/String;)Ljava/lang/Object;", "getLiveData", "Landroidx/lifecycle/MutableLiveData;", "initialValue", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "getLiveDataInternal", "hasInitialValue", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "getStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "keys", "", "remove", "set", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "setSavedStateProvider", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandle {
    private static final java.lang.String KEYS = "keys";
    private static final java.lang.String VALUES = "values";
    private final java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> flows;
    private final java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?>> liveDatas;
    private final java.util.Map<java.lang.String, java.lang.Object> regular;
    private final androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider;
    private final java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> savedStateProviders;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.lifecycle.SavedStateHandle.Companion INSTANCE = new androidx.lifecycle.SavedStateHandle.Companion(null);
    private static final java.lang.Class<? extends java.lang.Object>[] ACCEPTABLE_CLASSES = {java.lang.Boolean.TYPE, boolean[].class, java.lang.Double.TYPE, double[].class, java.lang.Integer.TYPE, int[].class, java.lang.Long.TYPE, long[].class, java.lang.String.class, java.lang.String[].class, android.os.Binder.class, android.os.Bundle.class, java.lang.Byte.TYPE, byte[].class, java.lang.Character.TYPE, char[].class, java.lang.CharSequence.class, java.lang.CharSequence[].class, java.util.ArrayList.class, java.lang.Float.TYPE, float[].class, android.os.Parcelable.class, android.os.Parcelable[].class, java.io.Serializable.class, java.lang.Short.TYPE, short[].class, android.util.SparseArray.class, android.util.Size.class, android.util.SizeF.class};

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.SavedStateHandle createHandle(android.os.Bundle bundle, android.os.Bundle bundle2) {
        return INSTANCE.createHandle(bundle, bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.os.Bundle savedStateProvider$lambda$0(androidx.lifecycle.SavedStateHandle this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (java.util.Map.Entry entry : kotlin.collections.MapsKt.toMap(this$0.savedStateProviders).entrySet()) {
            this$0.set((java.lang.String) entry.getKey(), ((androidx.savedstate.SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        java.util.Set<java.lang.String> setKeySet = this$0.regular.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(setKeySet.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        for (java.lang.String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.regular.get(str));
        }
        return androidx.core.os.BundleKt.bundleOf(kotlin.TuplesKt.to("keys", arrayList), kotlin.TuplesKt.to(VALUES, arrayList2));
    }

    public SavedStateHandle(java.util.Map<java.lang.String, ? extends java.lang.Object> initialState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialState, "initialState");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new java.util.LinkedHashMap();
        this.liveDatas = new java.util.LinkedHashMap();
        this.flows = new java.util.LinkedHashMap();
        this.savedStateProvider = new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final android.os.Bundle saveState() {
                return androidx.lifecycle.SavedStateHandle.savedStateProvider$lambda$0(this.f$0);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    public SavedStateHandle() {
        this.regular = new java.util.LinkedHashMap();
        this.savedStateProviders = new java.util.LinkedHashMap();
        this.liveDatas = new java.util.LinkedHashMap();
        this.flows = new java.util.LinkedHashMap();
        this.savedStateProvider = new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final android.os.Bundle saveState() {
                return androidx.lifecycle.SavedStateHandle.savedStateProvider$lambda$0(this.f$0);
            }
        };
    }

    /* JADX INFO: renamed from: savedStateProvider, reason: from getter */
    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider getSavedStateProvider() {
        return this.savedStateProvider;
    }

    public final boolean contains(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return this.regular.containsKey(key);
    }

    public final <T> androidx.lifecycle.MutableLiveData<T> getLiveData(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        androidx.lifecycle.MutableLiveData<T> liveDataInternal = getLiveDataInternal(key, false, null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    public final <T> androidx.lifecycle.MutableLiveData<T> getLiveData(java.lang.String key, T initialValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return getLiveDataInternal(key, true, initialValue);
    }

    private final <T> androidx.lifecycle.MutableLiveData<T> getLiveDataInternal(java.lang.String key, boolean hasInitialValue, T initialValue) {
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveData;
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(key);
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveData3 = savingStateLiveData2 instanceof androidx.lifecycle.MutableLiveData ? savingStateLiveData2 : null;
        if (savingStateLiveData3 != null) {
            return savingStateLiveData3;
        }
        if (this.regular.containsKey(key)) {
            savingStateLiveData = new androidx.lifecycle.SavedStateHandle.SavingStateLiveData<>(this, key, this.regular.get(key));
        } else if (hasInitialValue) {
            this.regular.put(key, initialValue);
            savingStateLiveData = new androidx.lifecycle.SavedStateHandle.SavingStateLiveData<>(this, key, initialValue);
        } else {
            savingStateLiveData = new androidx.lifecycle.SavedStateHandle.SavingStateLiveData<>(this, key);
        }
        this.liveDatas.put(key, savingStateLiveData);
        return savingStateLiveData;
    }

    public final <T> kotlinx.coroutines.flow.StateFlow<T> getStateFlow(java.lang.String key, T initialValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> map = this.flows;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object> MutableStateFlow = map.get(key);
        if (MutableStateFlow == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(this.regular.get(key));
            this.flows.put(key, MutableStateFlow);
            map.put(key, MutableStateFlow);
        }
        kotlinx.coroutines.flow.StateFlow<T> stateFlowAsStateFlow = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlin.jvm.internal.Intrinsics.checkNotNull(stateFlowAsStateFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return stateFlowAsStateFlow;
    }

    public final java.util.Set<java.lang.String> keys() {
        return kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus((java.util.Set) this.regular.keySet(), (java.lang.Iterable) this.savedStateProviders.keySet()), (java.lang.Iterable) this.liveDatas.keySet());
    }

    public final <T> T get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (T) this.regular.get(key);
        } catch (java.lang.ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    public final <T> void set(java.lang.String key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        if (!INSTANCE.validateValue(value)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't put value with type ");
            kotlin.jvm.internal.Intrinsics.checkNotNull(value);
            throw new java.lang.IllegalArgumentException(sb.append(value.getClass()).append(" into saved state").toString());
        }
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(key);
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof androidx.lifecycle.MutableLiveData ? savingStateLiveData : null;
        if (savingStateLiveData2 != null) {
            savingStateLiveData2.setValue(value);
        } else {
            this.regular.put(key, value);
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object> mutableStateFlow = this.flows.get(key);
        if (mutableStateFlow == null) {
            return;
        }
        mutableStateFlow.setValue(value);
    }

    public final <T> T remove(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this.regular.remove(key);
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveDataRemove = this.liveDatas.remove(key);
        if (savingStateLiveDataRemove != null) {
            savingStateLiveDataRemove.detach();
        }
        this.flows.remove(key);
        return t;
    }

    public final void setSavedStateProvider(java.lang.String key, androidx.savedstate.SavedStateRegistry.SavedStateProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
        this.savedStateProviders.put(key, provider);
    }

    public final void clearSavedStateProvider(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.savedStateProviders.remove(key);
    }

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bB\u0019\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "handle", "Landroidx/lifecycle/SavedStateHandle;", com.ironsource.y8.h.W, "", "value", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "detach", "", "setValue", "(Ljava/lang/Object;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SavingStateLiveData<T> extends androidx.lifecycle.MutableLiveData<T> {
        private androidx.lifecycle.SavedStateHandle handle;
        private java.lang.String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(androidx.lifecycle.SavedStateHandle savedStateHandle, java.lang.String key, T t) {
            super(t);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }

        public SavingStateLiveData(androidx.lifecycle.SavedStateHandle savedStateHandle, java.lang.String key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T value) {
            androidx.lifecycle.SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, value);
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = (kotlinx.coroutines.flow.MutableStateFlow) savedStateHandle.flows.get(this.key);
                if (mutableStateFlow != null) {
                    mutableStateFlow.setValue(value);
                }
            }
            super.setValue(value);
        }

        public final void detach() {
            this.handle = null;
        }
    }

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0007R \u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "()V", "ACCEPTABLE_CLASSES", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "KEYS", "", "VALUES", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "defaultState", "validateValue", "", "value", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.lifecycle.SavedStateHandle createHandle(android.os.Bundle restoredState, android.os.Bundle defaultState) {
            if (restoredState == null) {
                if (defaultState == null) {
                    return new androidx.lifecycle.SavedStateHandle();
                }
                java.util.HashMap map = new java.util.HashMap();
                for (java.lang.String key : defaultState.keySet()) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                    map.put(key, defaultState.get(key));
                }
                return new androidx.lifecycle.SavedStateHandle(map);
            }
            java.lang.ClassLoader classLoader = androidx.lifecycle.SavedStateHandle.class.getClassLoader();
            kotlin.jvm.internal.Intrinsics.checkNotNull(classLoader);
            restoredState.setClassLoader(classLoader);
            java.util.ArrayList parcelableArrayList = restoredState.getParcelableArrayList("keys");
            java.util.ArrayList parcelableArrayList2 = restoredState.getParcelableArrayList(androidx.lifecycle.SavedStateHandle.VALUES);
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new java.lang.IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                java.lang.Object obj = parcelableArrayList.get(i);
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((java.lang.String) obj, parcelableArrayList2.get(i));
            }
            return new androidx.lifecycle.SavedStateHandle(linkedHashMap);
        }

        public final boolean validateValue(java.lang.Object value) {
            if (value == null) {
                return true;
            }
            for (java.lang.Class cls : androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
                if (cls.isInstance(value)) {
                    return true;
                }
            }
            return false;
        }
    }
}
