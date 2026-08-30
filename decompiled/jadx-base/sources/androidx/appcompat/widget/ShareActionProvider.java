package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ShareActionProvider extends androidx.core.view.ActionProvider {
    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final java.lang.String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    final android.content.Context mContext;
    private int mMaxShownActivityCount;
    private androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
    private final androidx.appcompat.widget.ShareActionProvider.ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener;
    androidx.appcompat.widget.ShareActionProvider.OnShareTargetSelectedListener mOnShareTargetSelectedListener;
    java.lang.String mShareHistoryFileName;

    public interface OnShareTargetSelectedListener {
        boolean onShareTargetSelected(androidx.appcompat.widget.ShareActionProvider shareActionProvider, android.content.Intent intent);
    }

    @Override // androidx.core.view.ActionProvider
    public boolean hasSubMenu() {
        return true;
    }

    public ShareActionProvider(android.content.Context context) {
        super(context);
        this.mMaxShownActivityCount = 4;
        this.mOnMenuItemClickListener = new androidx.appcompat.widget.ShareActionProvider.ShareMenuItemOnMenuItemClickListener();
        this.mShareHistoryFileName = DEFAULT_SHARE_HISTORY_FILE_NAME;
        this.mContext = context;
    }

    public void setOnShareTargetSelectedListener(androidx.appcompat.widget.ShareActionProvider.OnShareTargetSelectedListener onShareTargetSelectedListener) {
        this.mOnShareTargetSelectedListener = onShareTargetSelectedListener;
        setActivityChooserPolicyIfNeeded();
    }

    @Override // androidx.core.view.ActionProvider
    public android.view.View onCreateActionView() {
        androidx.appcompat.widget.ActivityChooserView activityChooserView = new androidx.appcompat.widget.ActivityChooserView(this.mContext);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(androidx.appcompat.widget.ActivityChooserModel.get(this.mContext, this.mShareHistoryFileName));
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.mContext.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(this.mContext, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(androidx.appcompat.R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(androidx.appcompat.R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    @Override // androidx.core.view.ActionProvider
    public void onPrepareSubMenu(android.view.SubMenu subMenu) {
        subMenu.clear();
        androidx.appcompat.widget.ActivityChooserModel activityChooserModel = androidx.appcompat.widget.ActivityChooserModel.get(this.mContext, this.mShareHistoryFileName);
        android.content.pm.PackageManager packageManager = this.mContext.getPackageManager();
        int activityCount = activityChooserModel.getActivityCount();
        int iMin = java.lang.Math.min(activityCount, this.mMaxShownActivityCount);
        for (int i = 0; i < iMin; i++) {
            android.content.pm.ResolveInfo activity = activityChooserModel.getActivity(i);
            subMenu.add(0, i, i, activity.loadLabel(packageManager)).setIcon(activity.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
        }
        if (iMin < activityCount) {
            android.view.SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.mContext.getString(androidx.appcompat.R.string.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < activityCount; i2++) {
                android.content.pm.ResolveInfo activity2 = activityChooserModel.getActivity(i2);
                subMenuAddSubMenu.add(0, i2, i2, activity2.loadLabel(packageManager)).setIcon(activity2.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
            }
        }
    }

    public void setShareHistoryFileName(java.lang.String str) {
        this.mShareHistoryFileName = str;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareIntent(android.content.Intent intent) {
        if (intent != null) {
            java.lang.String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                updateIntent(intent);
            }
        }
        androidx.appcompat.widget.ActivityChooserModel.get(this.mContext, this.mShareHistoryFileName).setIntent(intent);
    }

    private class ShareMenuItemOnMenuItemClickListener implements android.view.MenuItem.OnMenuItemClickListener {
        ShareMenuItemOnMenuItemClickListener() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            android.content.Intent intentChooseActivity = androidx.appcompat.widget.ActivityChooserModel.get(androidx.appcompat.widget.ShareActionProvider.this.mContext, androidx.appcompat.widget.ShareActionProvider.this.mShareHistoryFileName).chooseActivity(menuItem.getItemId());
            if (intentChooseActivity == null) {
                return true;
            }
            java.lang.String action = intentChooseActivity.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                androidx.appcompat.widget.ShareActionProvider.this.updateIntent(intentChooseActivity);
            }
            androidx.appcompat.widget.ShareActionProvider.this.mContext.startActivity(intentChooseActivity);
            return true;
        }
    }

    private void setActivityChooserPolicyIfNeeded() {
        if (this.mOnShareTargetSelectedListener == null) {
            return;
        }
        if (this.mOnChooseActivityListener == null) {
            this.mOnChooseActivityListener = new androidx.appcompat.widget.ShareActionProvider.ShareActivityChooserModelPolicy();
        }
        androidx.appcompat.widget.ActivityChooserModel.get(this.mContext, this.mShareHistoryFileName).setOnChooseActivityListener(this.mOnChooseActivityListener);
    }

    private class ShareActivityChooserModelPolicy implements androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener {
        ShareActivityChooserModelPolicy() {
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener
        public boolean onChooseActivity(androidx.appcompat.widget.ActivityChooserModel activityChooserModel, android.content.Intent intent) {
            if (androidx.appcompat.widget.ShareActionProvider.this.mOnShareTargetSelectedListener == null) {
                return false;
            }
            androidx.appcompat.widget.ShareActionProvider.this.mOnShareTargetSelectedListener.onShareTargetSelected(androidx.appcompat.widget.ShareActionProvider.this, intent);
            return false;
        }
    }

    void updateIntent(android.content.Intent intent) {
        intent.addFlags(134742016);
    }
}
