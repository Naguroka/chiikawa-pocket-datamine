package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActionProvider {
    private static final java.lang.String TAG = "ActionProvider(support)";
    private final android.content.Context mContext;
    private androidx.core.view.ActionProvider.SubUiVisibilityListener mSubUiVisibilityListener;
    private androidx.core.view.ActionProvider.VisibilityListener mVisibilityListener;

    public interface SubUiVisibilityListener {
        void onSubUiVisibilityChanged(boolean z);
    }

    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract android.view.View onCreateActionView();

    public boolean onPerformDefaultAction() {
        return false;
    }

    public void onPrepareSubMenu(android.view.SubMenu subMenu) {
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public ActionProvider(android.content.Context context) {
        this.mContext = context;
    }

    public android.content.Context getContext() {
        return this.mContext;
    }

    public android.view.View onCreateActionView(android.view.MenuItem menuItem) {
        return onCreateActionView();
    }

    public void refreshVisibility() {
        if (this.mVisibilityListener == null || !overridesItemVisibility()) {
            return;
        }
        this.mVisibilityListener.onActionProviderVisibilityChanged(isVisible());
    }

    public void subUiVisibilityChanged(boolean z) {
        androidx.core.view.ActionProvider.SubUiVisibilityListener subUiVisibilityListener = this.mSubUiVisibilityListener;
        if (subUiVisibilityListener != null) {
            subUiVisibilityListener.onSubUiVisibilityChanged(z);
        }
    }

    public void setSubUiVisibilityListener(androidx.core.view.ActionProvider.SubUiVisibilityListener subUiVisibilityListener) {
        this.mSubUiVisibilityListener = subUiVisibilityListener;
    }

    public void setVisibilityListener(androidx.core.view.ActionProvider.VisibilityListener visibilityListener) {
        if (this.mVisibilityListener != null && visibilityListener != null) {
            android.util.Log.w(TAG, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.mVisibilityListener = visibilityListener;
    }

    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }
}
