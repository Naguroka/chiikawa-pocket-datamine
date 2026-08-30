package com.json.lifecycle;

/* JADX INFO: loaded from: classes5.dex */
public class a extends android.app.Fragment {
    private static final java.lang.String b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.lifecycle.a.InterfaceC0237a f2889a;

    /* JADX INFO: renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    interface InterfaceC0237a {
        void a(android.app.Activity activity);

        void b(android.app.Activity activity);

        void onResume(android.app.Activity activity);
    }

    static com.json.lifecycle.a a(android.app.Activity activity) {
        return (com.json.lifecycle.a) activity.getFragmentManager().findFragmentByTag(b);
    }

    private void a(com.json.lifecycle.a.InterfaceC0237a interfaceC0237a) {
        if (interfaceC0237a != null) {
            interfaceC0237a.b(getActivity());
        }
    }

    static void b(android.app.Activity activity) {
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new com.json.lifecycle.a(), b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void b(com.json.lifecycle.a.InterfaceC0237a interfaceC0237a) {
        if (interfaceC0237a != null) {
            interfaceC0237a.onResume(getActivity());
        }
    }

    private void c(com.json.lifecycle.a.InterfaceC0237a interfaceC0237a) {
        if (interfaceC0237a != null) {
            interfaceC0237a.a(getActivity());
        }
    }

    void d(com.json.lifecycle.a.InterfaceC0237a interfaceC0237a) {
        this.f2889a = interfaceC0237a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f2889a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f2889a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f2889a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f2889a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }
}
