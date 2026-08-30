package androidx.loader.content;

/* JADX INFO: loaded from: classes.dex */
public class Loader<D> {
    android.content.Context mContext;
    int mId;
    androidx.loader.content.Loader.OnLoadCompleteListener<D> mListener;
    androidx.loader.content.Loader.OnLoadCanceledListener<D> mOnLoadCanceledListener;
    boolean mStarted = false;
    boolean mAbandoned = false;
    boolean mReset = true;
    boolean mContentChanged = false;
    boolean mProcessingChange = false;

    public interface OnLoadCanceledListener<D> {
        void onLoadCanceled(androidx.loader.content.Loader<D> loader);
    }

    public interface OnLoadCompleteListener<D> {
        void onLoadComplete(androidx.loader.content.Loader<D> loader, D d);
    }

    protected void onAbandon() {
    }

    protected boolean onCancelLoad() {
        return false;
    }

    protected void onForceLoad() {
    }

    protected void onReset() {
    }

    protected void onStartLoading() {
    }

    protected void onStopLoading() {
    }

    public final class ForceLoadContentObserver extends android.database.ContentObserver {
        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        public ForceLoadContentObserver() {
            super(new android.os.Handler());
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            androidx.loader.content.Loader.this.onContentChanged();
        }
    }

    public Loader(android.content.Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void deliverResult(D d) {
        androidx.loader.content.Loader.OnLoadCompleteListener<D> onLoadCompleteListener = this.mListener;
        if (onLoadCompleteListener != null) {
            onLoadCompleteListener.onLoadComplete(this, d);
        }
    }

    public void deliverCancellation() {
        androidx.loader.content.Loader.OnLoadCanceledListener<D> onLoadCanceledListener = this.mOnLoadCanceledListener;
        if (onLoadCanceledListener != null) {
            onLoadCanceledListener.onLoadCanceled(this);
        }
    }

    public android.content.Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public void registerListener(int i, androidx.loader.content.Loader.OnLoadCompleteListener<D> onLoadCompleteListener) {
        if (this.mListener != null) {
            throw new java.lang.IllegalStateException("There is already a listener registered");
        }
        this.mListener = onLoadCompleteListener;
        this.mId = i;
    }

    public void unregisterListener(androidx.loader.content.Loader.OnLoadCompleteListener<D> onLoadCompleteListener) {
        androidx.loader.content.Loader.OnLoadCompleteListener<D> onLoadCompleteListener2 = this.mListener;
        if (onLoadCompleteListener2 == null) {
            throw new java.lang.IllegalStateException("No listener register");
        }
        if (onLoadCompleteListener2 != onLoadCompleteListener) {
            throw new java.lang.IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    public void registerOnLoadCanceledListener(androidx.loader.content.Loader.OnLoadCanceledListener<D> onLoadCanceledListener) {
        if (this.mOnLoadCanceledListener != null) {
            throw new java.lang.IllegalStateException("There is already a listener registered");
        }
        this.mOnLoadCanceledListener = onLoadCanceledListener;
    }

    public void unregisterOnLoadCanceledListener(androidx.loader.content.Loader.OnLoadCanceledListener<D> onLoadCanceledListener) {
        androidx.loader.content.Loader.OnLoadCanceledListener<D> onLoadCanceledListener2 = this.mOnLoadCanceledListener;
        if (onLoadCanceledListener2 == null) {
            throw new java.lang.IllegalStateException("No listener register");
        }
        if (onLoadCanceledListener2 != onLoadCanceledListener) {
            throw new java.lang.IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mOnLoadCanceledListener = null;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void forceLoad() {
        onForceLoad();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public java.lang.String dataToString(D d) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        androidx.core.util.DebugUtils.buildShortClassTag(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        androidx.core.util.DebugUtils.buildShortClassTag(this, sb);
        sb.append(" id=");
        sb.append(this.mId);
        sb.append("}");
        return sb.toString();
    }

    @java.lang.Deprecated
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }
}
