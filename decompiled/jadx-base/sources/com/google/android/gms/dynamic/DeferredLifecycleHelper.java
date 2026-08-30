package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DeferredLifecycleHelper<T extends com.google.android.gms.dynamic.LifecycleDelegate> {
    private com.google.android.gms.dynamic.LifecycleDelegate zaa;
    private android.os.Bundle zab;
    private java.util.LinkedList zac;
    private final com.google.android.gms.dynamic.OnDelegateCreatedListener zad = new com.google.android.gms.dynamic.zaa(this);

    public static void showGooglePlayUnavailableMessage(android.widget.FrameLayout frameLayout) {
        com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        android.content.Context context = frameLayout.getContext();
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        java.lang.String strZac = com.google.android.gms.common.internal.zac.zac(context, iIsGooglePlayServicesAvailable);
        java.lang.String strZab = com.google.android.gms.common.internal.zac.zab(context, iIsGooglePlayServicesAvailable);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        android.widget.TextView textView = new android.widget.TextView(frameLayout.getContext());
        textView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        textView.setText(strZac);
        linearLayout.addView(textView);
        android.content.Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            android.widget.Button button = new android.widget.Button(context);
            button.setId(android.R.id.button1);
            button.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            button.setText(strZab);
            linearLayout.addView(button);
            button.setOnClickListener(new com.google.android.gms.dynamic.zae(context, errorResolutionIntent));
        }
    }

    private final void zae(int i) {
        while (!this.zac.isEmpty() && ((com.google.android.gms.dynamic.zah) this.zac.getLast()).zaa() >= i) {
            this.zac.removeLast();
        }
    }

    private final void zaf(android.os.Bundle bundle, com.google.android.gms.dynamic.zah zahVar) {
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            zahVar.zab(lifecycleDelegate);
            return;
        }
        if (this.zac == null) {
            this.zac = new java.util.LinkedList();
        }
        this.zac.add(zahVar);
        if (bundle != null) {
            android.os.Bundle bundle2 = this.zab;
            if (bundle2 == null) {
                this.zab = (android.os.Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.zad);
    }

    protected abstract void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener<T> onDelegateCreatedListener);

    public T getDelegate() {
        return (T) this.zaa;
    }

    protected void handleGooglePlayUnavailable(android.widget.FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    public void onCreate(android.os.Bundle bundle) {
        zaf(bundle, new com.google.android.gms.dynamic.zac(this, bundle));
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(layoutInflater.getContext());
        zaf(bundle, new com.google.android.gms.dynamic.zad(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.zaa == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    public void onDestroy() {
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onDestroy();
        } else {
            zae(1);
        }
    }

    public void onDestroyView() {
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onDestroyView();
        } else {
            zae(2);
        }
    }

    public void onInflate(android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
        zaf(bundle2, new com.google.android.gms.dynamic.zab(this, activity, bundle, bundle2));
    }

    public void onLowMemory() {
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onLowMemory();
        }
    }

    public void onPause() {
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onPause();
        } else {
            zae(5);
        }
    }

    public void onResume() {
        zaf(null, new com.google.android.gms.dynamic.zag(this));
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onSaveInstanceState(bundle);
            return;
        }
        android.os.Bundle bundle2 = this.zab;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void onStart() {
        zaf(null, new com.google.android.gms.dynamic.zaf(this));
    }

    public void onStop() {
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onStop();
        } else {
            zae(4);
        }
    }
}
