package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteActionCompat implements androidx.versionedparcelable.VersionedParcelable {
    public android.app.PendingIntent mActionIntent;
    public java.lang.CharSequence mContentDescription;
    public boolean mEnabled;
    public androidx.core.graphics.drawable.IconCompat mIcon;
    public boolean mShouldShowIcon;
    public java.lang.CharSequence mTitle;

    public RemoteActionCompat(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.app.PendingIntent pendingIntent) {
        this.mIcon = (androidx.core.graphics.drawable.IconCompat) androidx.core.util.Preconditions.checkNotNull(iconCompat);
        this.mTitle = (java.lang.CharSequence) androidx.core.util.Preconditions.checkNotNull(charSequence);
        this.mContentDescription = (java.lang.CharSequence) androidx.core.util.Preconditions.checkNotNull(charSequence2);
        this.mActionIntent = (android.app.PendingIntent) androidx.core.util.Preconditions.checkNotNull(pendingIntent);
        this.mEnabled = true;
        this.mShouldShowIcon = true;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(androidx.core.app.RemoteActionCompat remoteActionCompat) {
        androidx.core.util.Preconditions.checkNotNull(remoteActionCompat);
        this.mIcon = remoteActionCompat.mIcon;
        this.mTitle = remoteActionCompat.mTitle;
        this.mContentDescription = remoteActionCompat.mContentDescription;
        this.mActionIntent = remoteActionCompat.mActionIntent;
        this.mEnabled = remoteActionCompat.mEnabled;
        this.mShouldShowIcon = remoteActionCompat.mShouldShowIcon;
    }

    public static androidx.core.app.RemoteActionCompat createFromRemoteAction(android.app.RemoteAction remoteAction) {
        androidx.core.util.Preconditions.checkNotNull(remoteAction);
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat(androidx.core.graphics.drawable.IconCompat.createFromIcon(androidx.core.app.RemoteActionCompat.Api26Impl.getIcon(remoteAction)), androidx.core.app.RemoteActionCompat.Api26Impl.getTitle(remoteAction), androidx.core.app.RemoteActionCompat.Api26Impl.getContentDescription(remoteAction), androidx.core.app.RemoteActionCompat.Api26Impl.getActionIntent(remoteAction));
        remoteActionCompat.setEnabled(androidx.core.app.RemoteActionCompat.Api26Impl.isEnabled(remoteAction));
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.setShouldShowIcon(androidx.core.app.RemoteActionCompat.Api28Impl.shouldShowIcon(remoteAction));
        }
        return remoteActionCompat;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setShouldShowIcon(boolean z) {
        this.mShouldShowIcon = z;
    }

    public boolean shouldShowIcon() {
        return this.mShouldShowIcon;
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
        return this.mIcon;
    }

    public java.lang.CharSequence getTitle() {
        return this.mTitle;
    }

    public java.lang.CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    public android.app.PendingIntent getActionIntent() {
        return this.mActionIntent;
    }

    public android.app.RemoteAction toRemoteAction() {
        android.app.RemoteAction remoteActionCreateRemoteAction = androidx.core.app.RemoteActionCompat.Api26Impl.createRemoteAction(this.mIcon.toIcon(), this.mTitle, this.mContentDescription, this.mActionIntent);
        androidx.core.app.RemoteActionCompat.Api26Impl.setEnabled(remoteActionCreateRemoteAction, isEnabled());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.app.RemoteActionCompat.Api28Impl.setShouldShowIcon(remoteActionCreateRemoteAction, shouldShowIcon());
        }
        return remoteActionCreateRemoteAction;
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static boolean shouldShowIcon(android.app.RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }

        static void setShouldShowIcon(android.app.RemoteAction remoteAction, boolean z) {
            remoteAction.setShouldShowIcon(z);
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static java.lang.CharSequence getContentDescription(android.app.RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        static android.app.PendingIntent getActionIntent(android.app.RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        static java.lang.CharSequence getTitle(android.app.RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        static android.graphics.drawable.Icon getIcon(android.app.RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        static boolean isEnabled(android.app.RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        static android.app.RemoteAction createRemoteAction(android.graphics.drawable.Icon icon, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.app.PendingIntent pendingIntent) {
            return new android.app.RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        static void setEnabled(android.app.RemoteAction remoteAction, boolean z) {
            remoteAction.setEnabled(z);
        }
    }
}
