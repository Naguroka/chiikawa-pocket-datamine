package androidx.loader.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class LoaderManager {

    public interface LoaderCallbacks<D> {
        androidx.loader.content.Loader<D> onCreateLoader(int i, android.os.Bundle bundle);

        void onLoadFinished(androidx.loader.content.Loader<D> loader, D d);

        void onLoaderReset(androidx.loader.content.Loader<D> loader);
    }

    public abstract void destroyLoader(int i);

    @java.lang.Deprecated
    public abstract void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    public abstract <D> androidx.loader.content.Loader<D> getLoader(int i);

    public boolean hasRunningLoaders() {
        return false;
    }

    public abstract <D> androidx.loader.content.Loader<D> initLoader(int i, android.os.Bundle bundle, androidx.loader.app.LoaderManager.LoaderCallbacks<D> loaderCallbacks);

    public abstract void markForRedelivery();

    public abstract <D> androidx.loader.content.Loader<D> restartLoader(int i, android.os.Bundle bundle, androidx.loader.app.LoaderManager.LoaderCallbacks<D> loaderCallbacks);

    public static <T extends androidx.lifecycle.LifecycleOwner & androidx.lifecycle.ViewModelStoreOwner> androidx.loader.app.LoaderManager getInstance(T t) {
        return new androidx.loader.app.LoaderManagerImpl(t, t.getViewModelStore());
    }

    public static void enableDebugLogging(boolean z) {
        androidx.loader.app.LoaderManagerImpl.DEBUG = z;
    }
}
