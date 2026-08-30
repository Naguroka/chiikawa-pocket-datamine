package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends androidx.fragment.app.FragmentActivity implements androidx.appcompat.app.AppCompatCallback, androidx.core.app.TaskStackBuilder.SupportParentable, androidx.appcompat.app.ActionBarDrawerToggle.DelegateProvider {
    private static final java.lang.String DELEGATE_TAG = "androidx:appcompat";
    private androidx.appcompat.app.AppCompatDelegate mDelegate;
    private android.content.res.Resources mResources;

    protected void onLocalesChanged(androidx.core.os.LocaleListCompat localeListCompat) {
    }

    protected void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(androidx.core.app.TaskStackBuilder taskStackBuilder) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(androidx.appcompat.view.ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(androidx.appcompat.view.ActionMode actionMode) {
    }

    @java.lang.Deprecated
    public void onSupportContentChanged() {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public androidx.appcompat.view.ActionMode onWindowStartingSupportActionMode(androidx.appcompat.view.ActionMode.Callback callback) {
        return null;
    }

    @java.lang.Deprecated
    public void setSupportProgress(int i) {
    }

    @java.lang.Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @java.lang.Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @java.lang.Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public AppCompatActivity() {
        initDelegate();
    }

    public AppCompatActivity(int i) {
        super(i);
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().registerSavedStateProvider(DELEGATE_TAG, new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.appcompat.app.AppCompatActivity.1
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public android.os.Bundle saveState() {
                android.os.Bundle bundle = new android.os.Bundle();
                androidx.appcompat.app.AppCompatActivity.this.getDelegate().onSaveInstanceState(bundle);
                return bundle;
            }
        });
        addOnContextAvailableListener(new androidx.activity.contextaware.OnContextAvailableListener() { // from class: androidx.appcompat.app.AppCompatActivity.2
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(android.content.Context context) {
                androidx.appcompat.app.AppCompatDelegate delegate = androidx.appcompat.app.AppCompatActivity.this.getDelegate();
                delegate.installViewFactory();
                delegate.onCreate(androidx.appcompat.app.AppCompatActivity.this.getSavedStateRegistry().consumeRestoredStateForKey(androidx.appcompat.app.AppCompatActivity.DELEGATE_TAG));
            }
        });
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(getDelegate().attachBaseContext2(context));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().setTheme(i);
    }

    @Override // android.app.Activity
    protected void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().onPostCreate(bundle);
    }

    public androidx.appcompat.app.ActionBar getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    public void setSupportActionBar(androidx.appcompat.widget.Toolbar toolbar) {
        getDelegate().setSupportActionBar(toolbar);
    }

    @Override // android.app.Activity
    public android.view.MenuInflater getMenuInflater() {
        return getDelegate().getMenuInflater();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().setContentView(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view) {
        initViewTreeOwners();
        getDelegate().setContentView(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().setContentView(view, layoutParams);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().addContentView(view, layoutParams);
    }

    private void initViewTreeOwners() {
        androidx.lifecycle.ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        androidx.lifecycle.ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(getWindow().getDecorView(), this);
        androidx.activity.ViewTreeOnBackPressedDispatcherOwner.set(getWindow().getDecorView(), this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().onPostResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().onStart();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    @Override // android.app.Activity
    public <T extends android.view.View> T findViewById(int i) {
        return (T) getDelegate().findViewById(i);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.getDisplayOptions() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().onDestroy();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(java.lang.CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().setTitle(charSequence);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().requestWindowFeature(i);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    public androidx.appcompat.view.ActionMode startSupportActionMode(androidx.appcompat.view.ActionMode.Callback callback) {
        return getDelegate().startSupportActionMode(callback);
    }

    public void onCreateSupportNavigateUpTaskStack(androidx.core.app.TaskStackBuilder taskStackBuilder) {
        taskStackBuilder.addParentStack(this);
    }

    public boolean onSupportNavigateUp() {
        android.content.Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            androidx.core.app.TaskStackBuilder taskStackBuilderCreate = androidx.core.app.TaskStackBuilder.create(this);
            onCreateSupportNavigateUpTaskStack(taskStackBuilderCreate);
            onPrepareSupportNavigateUpTaskStack(taskStackBuilderCreate);
            taskStackBuilderCreate.startActivities();
            try {
                androidx.core.app.ActivityCompat.finishAffinity(this);
                return true;
            } catch (java.lang.IllegalStateException unused) {
                finish();
                return true;
            }
        }
        supportNavigateUpTo(supportParentActivityIntent);
        return true;
    }

    @Override // androidx.core.app.TaskStackBuilder.SupportParentable
    public android.content.Intent getSupportParentActivityIntent() {
        return androidx.core.app.NavUtils.getParentActivityIntent(this);
    }

    public boolean supportShouldUpRecreateTask(android.content.Intent intent) {
        return androidx.core.app.NavUtils.shouldUpRecreateTask(this, intent);
    }

    public void supportNavigateUpTo(android.content.Intent intent) {
        androidx.core.app.NavUtils.navigateUpTo(this, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Override // androidx.appcompat.app.ActionBarDrawerToggle.DelegateProvider
    public androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return getDelegate().getDrawerToggleDelegate();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, android.view.Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, android.view.Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public androidx.appcompat.app.AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = androidx.appcompat.app.AppCompatDelegate.create(this, this);
        }
        return this.mDelegate;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.onMenuKeyEvent(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        if (this.mResources == null && androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()) {
            this.mResources = new androidx.appcompat.widget.VectorEnabledTintResources(this, super.getResources());
        }
        android.content.res.Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    private boolean performMenuItemShortcut(android.view.KeyEvent keyEvent) {
        android.view.Window window;
        return (android.os.Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || android.view.KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || android.view.KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.openOptionsMenu()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.closeOptionsMenu()) {
                super.closeOptionsMenu();
            }
        }
    }
}
