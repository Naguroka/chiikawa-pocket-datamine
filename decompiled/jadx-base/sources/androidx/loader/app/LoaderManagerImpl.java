package androidx.loader.app;

/* JADX INFO: loaded from: classes.dex */
class LoaderManagerImpl extends androidx.loader.app.LoaderManager {
    static boolean DEBUG = false;
    static final java.lang.String TAG = "LoaderManager";
    private final androidx.lifecycle.LifecycleOwner mLifecycleOwner;
    private final androidx.loader.app.LoaderManagerImpl.LoaderViewModel mLoaderViewModel;

    public static class LoaderInfo<D> extends androidx.lifecycle.MutableLiveData<D> implements androidx.loader.content.Loader.OnLoadCompleteListener<D> {
        private final android.os.Bundle mArgs;
        private final int mId;
        private androidx.lifecycle.LifecycleOwner mLifecycleOwner;
        private final androidx.loader.content.Loader<D> mLoader;
        private androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> mObserver;
        private androidx.loader.content.Loader<D> mPriorLoader;

        LoaderInfo(int i, android.os.Bundle bundle, androidx.loader.content.Loader<D> loader, androidx.loader.content.Loader<D> loader2) {
            this.mId = i;
            this.mArgs = bundle;
            this.mLoader = loader;
            this.mPriorLoader = loader2;
            loader.registerListener(i, this);
        }

        androidx.loader.content.Loader<D> getLoader() {
            return this.mLoader;
        }

        @Override // androidx.lifecycle.LiveData
        protected void onActive() {
            if (androidx.loader.app.LoaderManagerImpl.DEBUG) {
                android.util.Log.v(androidx.loader.app.LoaderManagerImpl.TAG, "  Starting: " + this);
            }
            this.mLoader.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        protected void onInactive() {
            if (androidx.loader.app.LoaderManagerImpl.DEBUG) {
                android.util.Log.v(androidx.loader.app.LoaderManagerImpl.TAG, "  Stopping: " + this);
            }
            this.mLoader.stopLoading();
        }

        androidx.loader.content.Loader<D> setCallback(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.loader.app.LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
            androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> loaderObserver = new androidx.loader.app.LoaderManagerImpl.LoaderObserver<>(this.mLoader, loaderCallbacks);
            observe(lifecycleOwner, loaderObserver);
            androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> loaderObserver2 = this.mObserver;
            if (loaderObserver2 != null) {
                removeObserver(loaderObserver2);
            }
            this.mLifecycleOwner = lifecycleOwner;
            this.mObserver = loaderObserver;
            return this.mLoader;
        }

        void markForRedelivery() {
            androidx.lifecycle.LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> loaderObserver = this.mObserver;
            if (lifecycleOwner == null || loaderObserver == null) {
                return;
            }
            super.removeObserver(loaderObserver);
            observe(lifecycleOwner, loaderObserver);
        }

        boolean isCallbackWaitingForData() {
            androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> loaderObserver;
            return (!hasActiveObservers() || (loaderObserver = this.mObserver) == null || loaderObserver.hasDeliveredData()) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(androidx.lifecycle.Observer<? super D> observer) {
            super.removeObserver(observer);
            this.mLifecycleOwner = null;
            this.mObserver = null;
        }

        androidx.loader.content.Loader<D> destroy(boolean z) {
            if (androidx.loader.app.LoaderManagerImpl.DEBUG) {
                android.util.Log.v(androidx.loader.app.LoaderManagerImpl.TAG, "  Destroying: " + this);
            }
            this.mLoader.cancelLoad();
            this.mLoader.abandon();
            androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> loaderObserver = this.mObserver;
            if (loaderObserver != null) {
                removeObserver(loaderObserver);
                if (z) {
                    loaderObserver.reset();
                }
            }
            this.mLoader.unregisterListener(this);
            if ((loaderObserver != null && !loaderObserver.hasDeliveredData()) || z) {
                this.mLoader.reset();
                return this.mPriorLoader;
            }
            return this.mLoader;
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        public void onLoadComplete(androidx.loader.content.Loader<D> loader, D d) {
            if (androidx.loader.app.LoaderManagerImpl.DEBUG) {
                android.util.Log.v(androidx.loader.app.LoaderManagerImpl.TAG, "onLoadComplete: " + this);
            }
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                setValue(d);
                return;
            }
            if (androidx.loader.app.LoaderManagerImpl.DEBUG) {
                android.util.Log.w(androidx.loader.app.LoaderManagerImpl.TAG, "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d);
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D d) {
            super.setValue(d);
            androidx.loader.content.Loader<D> loader = this.mPriorLoader;
            if (loader != null) {
                loader.reset();
                this.mPriorLoader = null;
            }
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.mId);
            sb.append(" : ");
            androidx.core.util.DebugUtils.buildShortClassTag(this.mLoader, sb);
            sb.append("}}");
            return sb.toString();
        }

        public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.mId);
            printWriter.print(" mArgs=");
            printWriter.println(this.mArgs);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.mLoader);
            this.mLoader.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.mObserver != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.mObserver);
                this.mObserver.dump(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(getLoader().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }
    }

    static class LoaderObserver<D> implements androidx.lifecycle.Observer<D> {
        private final androidx.loader.app.LoaderManager.LoaderCallbacks<D> mCallback;
        private boolean mDeliveredData = false;
        private final androidx.loader.content.Loader<D> mLoader;

        LoaderObserver(androidx.loader.content.Loader<D> loader, androidx.loader.app.LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
            this.mLoader = loader;
            this.mCallback = loaderCallbacks;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(D d) {
            if (androidx.loader.app.LoaderManagerImpl.DEBUG) {
                android.util.Log.v(androidx.loader.app.LoaderManagerImpl.TAG, "  onLoadFinished in " + this.mLoader + ": " + this.mLoader.dataToString(d));
            }
            this.mCallback.onLoadFinished(this.mLoader, d);
            this.mDeliveredData = true;
        }

        boolean hasDeliveredData() {
            return this.mDeliveredData;
        }

        void reset() {
            if (this.mDeliveredData) {
                if (androidx.loader.app.LoaderManagerImpl.DEBUG) {
                    android.util.Log.v(androidx.loader.app.LoaderManagerImpl.TAG, "  Resetting: " + this.mLoader);
                }
                this.mCallback.onLoaderReset(this.mLoader);
            }
        }

        public java.lang.String toString() {
            return this.mCallback.toString();
        }

        public void dump(java.lang.String str, java.io.PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.mDeliveredData);
        }
    }

    static class LoaderViewModel extends androidx.lifecycle.ViewModel {
        private static final androidx.lifecycle.ViewModelProvider.Factory FACTORY = new androidx.lifecycle.ViewModelProvider.Factory() { // from class: androidx.loader.app.LoaderManagerImpl.LoaderViewModel.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> cls) {
                return new androidx.loader.app.LoaderManagerImpl.LoaderViewModel();
            }
        };
        private androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl.LoaderInfo> mLoaders = new androidx.collection.SparseArrayCompat<>();
        private boolean mCreatingLoader = false;

        LoaderViewModel() {
        }

        static androidx.loader.app.LoaderManagerImpl.LoaderViewModel getInstance(androidx.lifecycle.ViewModelStore viewModelStore) {
            return (androidx.loader.app.LoaderManagerImpl.LoaderViewModel) new androidx.lifecycle.ViewModelProvider(viewModelStore, FACTORY).get(androidx.loader.app.LoaderManagerImpl.LoaderViewModel.class);
        }

        void startCreatingLoader() {
            this.mCreatingLoader = true;
        }

        boolean isCreatingLoader() {
            return this.mCreatingLoader;
        }

        void finishCreatingLoader() {
            this.mCreatingLoader = false;
        }

        void putLoader(int i, androidx.loader.app.LoaderManagerImpl.LoaderInfo loaderInfo) {
            this.mLoaders.put(i, loaderInfo);
        }

        <D> androidx.loader.app.LoaderManagerImpl.LoaderInfo<D> getLoader(int i) {
            return this.mLoaders.get(i);
        }

        void removeLoader(int i) {
            this.mLoaders.remove(i);
        }

        boolean hasRunningLoaders() {
            int size = this.mLoaders.size();
            for (int i = 0; i < size; i++) {
                if (this.mLoaders.valueAt(i).isCallbackWaitingForData()) {
                    return true;
                }
            }
            return false;
        }

        void markForRedelivery() {
            int size = this.mLoaders.size();
            for (int i = 0; i < size; i++) {
                this.mLoaders.valueAt(i).markForRedelivery();
            }
        }

        @Override // androidx.lifecycle.ViewModel
        protected void onCleared() {
            super.onCleared();
            int size = this.mLoaders.size();
            for (int i = 0; i < size; i++) {
                this.mLoaders.valueAt(i).destroy(true);
            }
            this.mLoaders.clear();
        }

        public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
            if (this.mLoaders.size() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                java.lang.String str2 = str + "    ";
                for (int i = 0; i < this.mLoaders.size(); i++) {
                    androidx.loader.app.LoaderManagerImpl.LoaderInfo loaderInfoValueAt = this.mLoaders.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.mLoaders.keyAt(i));
                    printWriter.print(": ");
                    printWriter.println(loaderInfoValueAt.toString());
                    loaderInfoValueAt.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    LoaderManagerImpl(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.ViewModelStore viewModelStore) {
        this.mLifecycleOwner = lifecycleOwner;
        this.mLoaderViewModel = androidx.loader.app.LoaderManagerImpl.LoaderViewModel.getInstance(viewModelStore);
    }

    private <D> androidx.loader.content.Loader<D> createAndInstallLoader(int i, android.os.Bundle bundle, androidx.loader.app.LoaderManager.LoaderCallbacks<D> loaderCallbacks, androidx.loader.content.Loader<D> loader) {
        try {
            this.mLoaderViewModel.startCreatingLoader();
            androidx.loader.content.Loader<D> loaderOnCreateLoader = loaderCallbacks.onCreateLoader(i, bundle);
            if (loaderOnCreateLoader == null) {
                throw new java.lang.IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (loaderOnCreateLoader.getClass().isMemberClass() && !java.lang.reflect.Modifier.isStatic(loaderOnCreateLoader.getClass().getModifiers())) {
                throw new java.lang.IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + loaderOnCreateLoader);
            }
            androidx.loader.app.LoaderManagerImpl.LoaderInfo loaderInfo = new androidx.loader.app.LoaderManagerImpl.LoaderInfo(i, bundle, loaderOnCreateLoader, loader);
            if (DEBUG) {
                android.util.Log.v(TAG, "  Created new loader " + loaderInfo);
            }
            this.mLoaderViewModel.putLoader(i, loaderInfo);
            this.mLoaderViewModel.finishCreatingLoader();
            return loaderInfo.setCallback(this.mLifecycleOwner, loaderCallbacks);
        } catch (java.lang.Throwable th) {
            this.mLoaderViewModel.finishCreatingLoader();
            throw th;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> androidx.loader.content.Loader<D> initLoader(int i, android.os.Bundle bundle, androidx.loader.app.LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("initLoader must be called on the main thread");
        }
        androidx.loader.app.LoaderManagerImpl.LoaderInfo<D> loader = this.mLoaderViewModel.getLoader(i);
        if (DEBUG) {
            android.util.Log.v(TAG, "initLoader in " + this + ": args=" + bundle);
        }
        if (loader == null) {
            return createAndInstallLoader(i, bundle, loaderCallbacks, null);
        }
        if (DEBUG) {
            android.util.Log.v(TAG, "  Re-using existing loader " + loader);
        }
        return loader.setCallback(this.mLifecycleOwner, loaderCallbacks);
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> androidx.loader.content.Loader<D> restartLoader(int i, android.os.Bundle bundle, androidx.loader.app.LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("restartLoader must be called on the main thread");
        }
        if (DEBUG) {
            android.util.Log.v(TAG, "restartLoader in " + this + ": args=" + bundle);
        }
        androidx.loader.app.LoaderManagerImpl.LoaderInfo<D> loader = this.mLoaderViewModel.getLoader(i);
        return createAndInstallLoader(i, bundle, loaderCallbacks, loader != null ? loader.destroy(false) : null);
    }

    @Override // androidx.loader.app.LoaderManager
    public void destroyLoader(int i) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (DEBUG) {
            android.util.Log.v(TAG, "destroyLoader in " + this + " of " + i);
        }
        androidx.loader.app.LoaderManagerImpl.LoaderInfo loader = this.mLoaderViewModel.getLoader(i);
        if (loader != null) {
            loader.destroy(true);
            this.mLoaderViewModel.removeLoader(i);
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> androidx.loader.content.Loader<D> getLoader(int i) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        androidx.loader.app.LoaderManagerImpl.LoaderInfo<D> loader = this.mLoaderViewModel.getLoader(i);
        if (loader != null) {
            return loader.getLoader();
        }
        return null;
    }

    @Override // androidx.loader.app.LoaderManager
    public void markForRedelivery() {
        this.mLoaderViewModel.markForRedelivery();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.DebugUtils.buildShortClassTag(this.mLifecycleOwner, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.loader.app.LoaderManager
    @java.lang.Deprecated
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        this.mLoaderViewModel.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.LoaderManager
    public boolean hasRunningLoaders() {
        return this.mLoaderViewModel.hasRunningLoaders();
    }
}
