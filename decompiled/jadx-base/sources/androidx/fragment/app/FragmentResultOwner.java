package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public interface FragmentResultOwner {
    void clearFragmentResult(java.lang.String str);

    void clearFragmentResultListener(java.lang.String str);

    void setFragmentResult(java.lang.String str, android.os.Bundle bundle);

    void setFragmentResultListener(java.lang.String str, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.fragment.app.FragmentResultListener fragmentResultListener);
}
