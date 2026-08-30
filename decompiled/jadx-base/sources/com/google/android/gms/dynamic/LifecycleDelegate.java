package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface LifecycleDelegate {
    void onCreate(android.os.Bundle bundle);

    android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onInflate(android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2);

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(android.os.Bundle bundle);

    void onStart();

    void onStop();
}
