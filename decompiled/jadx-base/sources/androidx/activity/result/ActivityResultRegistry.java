package androidx.activity.result;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final java.lang.String LOG_TAG = "ActivityResultRegistry";
    private java.util.Random mRandom = new java.util.Random();
    private final java.util.Map<java.lang.Integer, java.lang.String> mRcToKey = new java.util.HashMap();
    final java.util.Map<java.lang.String, java.lang.Integer> mKeyToRc = new java.util.HashMap();
    private final java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.LifecycleContainer> mKeyToLifecycleContainers = new java.util.HashMap();
    java.util.ArrayList<java.lang.String> mLaunchedKeys = new java.util.ArrayList<>();
    final transient java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.CallbackAndContract<?>> mKeyToCallback = new java.util.HashMap();
    final java.util.Map<java.lang.String, java.lang.Object> mParsedPendingResults = new java.util.HashMap();
    final android.os.Bundle mPendingResults = new android.os.Bundle();

    public abstract <I, O> void onLaunch(int i, androidx.activity.result.contract.ActivityResultContract<I, O> activityResultContract, I i2, androidx.core.app.ActivityOptionsCompat activityOptionsCompat);

    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> register(final java.lang.String str, androidx.lifecycle.LifecycleOwner lifecycleOwner, final androidx.activity.result.contract.ActivityResultContract<I, O> activityResultContract, final androidx.activity.result.ActivityResultCallback<O> activityResultCallback) {
        androidx.lifecycle.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
            throw new java.lang.IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
        }
        registerKey(str);
        androidx.activity.result.ActivityResultRegistry.LifecycleContainer lifecycleContainer = this.mKeyToLifecycleContainers.get(str);
        if (lifecycleContainer == null) {
            lifecycleContainer = new androidx.activity.result.ActivityResultRegistry.LifecycleContainer(lifecycle);
        }
        lifecycleContainer.addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                if (androidx.lifecycle.Lifecycle.Event.ON_START.equals(event)) {
                    androidx.activity.result.ActivityResultRegistry.this.mKeyToCallback.put(str, new androidx.activity.result.ActivityResultRegistry.CallbackAndContract<>(activityResultCallback, activityResultContract));
                    if (androidx.activity.result.ActivityResultRegistry.this.mParsedPendingResults.containsKey(str)) {
                        java.lang.Object obj = androidx.activity.result.ActivityResultRegistry.this.mParsedPendingResults.get(str);
                        androidx.activity.result.ActivityResultRegistry.this.mParsedPendingResults.remove(str);
                        activityResultCallback.onActivityResult(obj);
                    }
                    androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) androidx.activity.result.ActivityResultRegistry.this.mPendingResults.getParcelable(str);
                    if (activityResult != null) {
                        androidx.activity.result.ActivityResultRegistry.this.mPendingResults.remove(str);
                        activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
                        return;
                    }
                    return;
                }
                if (androidx.lifecycle.Lifecycle.Event.ON_STOP.equals(event)) {
                    androidx.activity.result.ActivityResultRegistry.this.mKeyToCallback.remove(str);
                } else if (androidx.lifecycle.Lifecycle.Event.ON_DESTROY.equals(event)) {
                    androidx.activity.result.ActivityResultRegistry.this.unregister(str);
                }
            }
        });
        this.mKeyToLifecycleContainers.put(str, lifecycleContainer);
        return new androidx.activity.result.ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.2
            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i, androidx.core.app.ActivityOptionsCompat activityOptionsCompat) throws java.lang.Exception {
                java.lang.Integer num = androidx.activity.result.ActivityResultRegistry.this.mKeyToRc.get(str);
                if (num == null) {
                    throw new java.lang.IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                }
                androidx.activity.result.ActivityResultRegistry.this.mLaunchedKeys.add(str);
                try {
                    androidx.activity.result.ActivityResultRegistry.this.onLaunch(num.intValue(), activityResultContract, i, activityOptionsCompat);
                } catch (java.lang.Exception e) {
                    androidx.activity.result.ActivityResultRegistry.this.mLaunchedKeys.remove(str);
                    throw e;
                }
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                androidx.activity.result.ActivityResultRegistry.this.unregister(str);
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public androidx.activity.result.contract.ActivityResultContract<I, ?> getContract() {
                return activityResultContract;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> register(final java.lang.String str, final androidx.activity.result.contract.ActivityResultContract<I, O> activityResultContract, androidx.activity.result.ActivityResultCallback<O> activityResultCallback) {
        registerKey(str);
        this.mKeyToCallback.put(str, new androidx.activity.result.ActivityResultRegistry.CallbackAndContract<>(activityResultCallback, activityResultContract));
        if (this.mParsedPendingResults.containsKey(str)) {
            java.lang.Object obj = this.mParsedPendingResults.get(str);
            this.mParsedPendingResults.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) this.mPendingResults.getParcelable(str);
        if (activityResult != null) {
            this.mPendingResults.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new androidx.activity.result.ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.3
            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i, androidx.core.app.ActivityOptionsCompat activityOptionsCompat) throws java.lang.Exception {
                java.lang.Integer num = androidx.activity.result.ActivityResultRegistry.this.mKeyToRc.get(str);
                if (num == null) {
                    throw new java.lang.IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                }
                androidx.activity.result.ActivityResultRegistry.this.mLaunchedKeys.add(str);
                try {
                    androidx.activity.result.ActivityResultRegistry.this.onLaunch(num.intValue(), activityResultContract, i, activityOptionsCompat);
                } catch (java.lang.Exception e) {
                    androidx.activity.result.ActivityResultRegistry.this.mLaunchedKeys.remove(str);
                    throw e;
                }
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                androidx.activity.result.ActivityResultRegistry.this.unregister(str);
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public androidx.activity.result.contract.ActivityResultContract<I, ?> getContract() {
                return activityResultContract;
            }
        };
    }

    final void unregister(java.lang.String str) {
        java.lang.Integer numRemove;
        if (!this.mLaunchedKeys.contains(str) && (numRemove = this.mKeyToRc.remove(str)) != null) {
            this.mRcToKey.remove(numRemove);
        }
        this.mKeyToCallback.remove(str);
        if (this.mParsedPendingResults.containsKey(str)) {
            android.util.Log.w(LOG_TAG, "Dropping pending result for request " + str + ": " + this.mParsedPendingResults.get(str));
            this.mParsedPendingResults.remove(str);
        }
        if (this.mPendingResults.containsKey(str)) {
            android.util.Log.w(LOG_TAG, "Dropping pending result for request " + str + ": " + this.mPendingResults.getParcelable(str));
            this.mPendingResults.remove(str);
        }
        androidx.activity.result.ActivityResultRegistry.LifecycleContainer lifecycleContainer = this.mKeyToLifecycleContainers.get(str);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
            this.mKeyToLifecycleContainers.remove(str);
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new java.util.ArrayList<>(this.mKeyToRc.values()));
        bundle.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new java.util.ArrayList<>(this.mKeyToRc.keySet()));
        bundle.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new java.util.ArrayList<>(this.mLaunchedKeys));
        bundle.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, (android.os.Bundle) this.mPendingResults.clone());
        bundle.putSerializable(KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT, this.mRandom);
    }

    public final void onRestoreInstanceState(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.mLaunchedKeys = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
        this.mRandom = (java.util.Random) bundle.getSerializable(KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT);
        this.mPendingResults.putAll(bundle.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS));
        for (int i = 0; i < stringArrayList.size(); i++) {
            java.lang.String str = stringArrayList.get(i);
            if (this.mKeyToRc.containsKey(str)) {
                java.lang.Integer numRemove = this.mKeyToRc.remove(str);
                if (!this.mPendingResults.containsKey(str)) {
                    this.mRcToKey.remove(numRemove);
                }
            }
            bindRcKey(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    public final boolean dispatchResult(int i, int i2, android.content.Intent intent) {
        java.lang.String str = this.mRcToKey.get(java.lang.Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        doDispatch(str, i2, intent, this.mKeyToCallback.get(str));
        return true;
    }

    public final <O> boolean dispatchResult(int i, O o) {
        java.lang.String str = this.mRcToKey.get(java.lang.Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        androidx.activity.result.ActivityResultRegistry.CallbackAndContract<?> callbackAndContract = this.mKeyToCallback.get(str);
        if (callbackAndContract == null || callbackAndContract.mCallback == null) {
            this.mPendingResults.remove(str);
            this.mParsedPendingResults.put(str, o);
            return true;
        }
        androidx.activity.result.ActivityResultCallback<?> activityResultCallback = callbackAndContract.mCallback;
        if (!this.mLaunchedKeys.remove(str)) {
            return true;
        }
        activityResultCallback.onActivityResult(o);
        return true;
    }

    private <O> void doDispatch(java.lang.String str, int i, android.content.Intent intent, androidx.activity.result.ActivityResultRegistry.CallbackAndContract<O> callbackAndContract) {
        if (callbackAndContract != null && callbackAndContract.mCallback != null && this.mLaunchedKeys.contains(str)) {
            callbackAndContract.mCallback.onActivityResult(callbackAndContract.mContract.parseResult(i, intent));
            this.mLaunchedKeys.remove(str);
        } else {
            this.mParsedPendingResults.remove(str);
            this.mPendingResults.putParcelable(str, new androidx.activity.result.ActivityResult(i, intent));
        }
    }

    private void registerKey(java.lang.String str) {
        if (this.mKeyToRc.get(str) != null) {
            return;
        }
        bindRcKey(generateRandomNumber(), str);
    }

    private int generateRandomNumber() {
        int iNextInt = this.mRandom.nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            if (!this.mRcToKey.containsKey(java.lang.Integer.valueOf(i))) {
                return i;
            }
            iNextInt = this.mRandom.nextInt(2147418112);
        }
    }

    private void bindRcKey(int i, java.lang.String str) {
        this.mRcToKey.put(java.lang.Integer.valueOf(i), str);
        this.mKeyToRc.put(str, java.lang.Integer.valueOf(i));
    }

    private static class CallbackAndContract<O> {
        final androidx.activity.result.ActivityResultCallback<O> mCallback;
        final androidx.activity.result.contract.ActivityResultContract<?, O> mContract;

        CallbackAndContract(androidx.activity.result.ActivityResultCallback<O> activityResultCallback, androidx.activity.result.contract.ActivityResultContract<?, O> activityResultContract) {
            this.mCallback = activityResultCallback;
            this.mContract = activityResultContract;
        }
    }

    private static class LifecycleContainer {
        final androidx.lifecycle.Lifecycle mLifecycle;
        private final java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> mObservers = new java.util.ArrayList<>();

        LifecycleContainer(androidx.lifecycle.Lifecycle lifecycle) {
            this.mLifecycle = lifecycle;
        }

        void addObserver(androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver) {
            this.mLifecycle.addObserver(lifecycleEventObserver);
            this.mObservers.add(lifecycleEventObserver);
        }

        void clearObservers() {
            java.util.Iterator<androidx.lifecycle.LifecycleEventObserver> it = this.mObservers.iterator();
            while (it.hasNext()) {
                this.mLifecycle.removeObserver(it.next());
            }
            this.mObservers.clear();
        }
    }
}
