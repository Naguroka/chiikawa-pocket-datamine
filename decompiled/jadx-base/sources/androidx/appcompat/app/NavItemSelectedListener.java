package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class NavItemSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
    private final androidx.appcompat.app.ActionBar.OnNavigationListener mListener;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
    }

    public NavItemSelectedListener(androidx.appcompat.app.ActionBar.OnNavigationListener onNavigationListener) {
        this.mListener = onNavigationListener;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
        androidx.appcompat.app.ActionBar.OnNavigationListener onNavigationListener = this.mListener;
        if (onNavigationListener != null) {
            onNavigationListener.onNavigationItemSelected(i, j);
        }
    }
}
