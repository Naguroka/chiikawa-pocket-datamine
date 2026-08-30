package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
class BrowserActionsFallbackMenuUi implements android.widget.AdapterView.OnItemClickListener {
    private static final java.lang.String TAG = "BrowserActionskMenuUi";
    private androidx.browser.browseractions.BrowserActionsFallbackMenuDialog mBrowserActionsDialog;
    final android.content.Context mContext;
    private final java.util.List<androidx.browser.browseractions.BrowserActionItem> mMenuItems;
    androidx.browser.browseractions.BrowserActionsFallbackMenuUi.BrowserActionsFallMenuUiListener mMenuUiListener;
    final android.net.Uri mUri;

    interface BrowserActionsFallMenuUiListener {
        void onMenuShown(android.view.View view);
    }

    BrowserActionsFallbackMenuUi(android.content.Context context, android.net.Uri uri, java.util.List<androidx.browser.browseractions.BrowserActionItem> list) {
        this.mContext = context;
        this.mUri = uri;
        this.mMenuItems = buildFallbackMenuItemList(list);
    }

    void setMenuUiListener(androidx.browser.browseractions.BrowserActionsFallbackMenuUi.BrowserActionsFallMenuUiListener browserActionsFallMenuUiListener) {
        this.mMenuUiListener = browserActionsFallMenuUiListener;
    }

    private java.util.List<androidx.browser.browseractions.BrowserActionItem> buildFallbackMenuItemList(java.util.List<androidx.browser.browseractions.BrowserActionItem> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new androidx.browser.browseractions.BrowserActionItem(this.mContext.getString(androidx.browser.R.string.fallback_menu_item_open_in_browser), buildOpenInBrowserAction()));
        arrayList.add(new androidx.browser.browseractions.BrowserActionItem(this.mContext.getString(androidx.browser.R.string.fallback_menu_item_copy_link), buildCopyAction()));
        arrayList.add(new androidx.browser.browseractions.BrowserActionItem(this.mContext.getString(androidx.browser.R.string.fallback_menu_item_share_link), buildShareAction()));
        arrayList.addAll(list);
        return arrayList;
    }

    private android.app.PendingIntent buildOpenInBrowserAction() {
        return android.app.PendingIntent.getActivity(this.mContext, 0, new android.content.Intent("android.intent.action.VIEW", this.mUri), 67108864);
    }

    private android.app.PendingIntent buildShareAction() {
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.mUri.toString());
        intent.setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE);
        return android.app.PendingIntent.getActivity(this.mContext, 0, intent, 67108864);
    }

    private java.lang.Runnable buildCopyAction() {
        return new java.lang.Runnable() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuUi.1
            @Override // java.lang.Runnable
            public void run() {
                ((android.content.ClipboardManager) androidx.browser.browseractions.BrowserActionsFallbackMenuUi.this.mContext.getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("url", androidx.browser.browseractions.BrowserActionsFallbackMenuUi.this.mUri.toString()));
                android.widget.Toast.makeText(androidx.browser.browseractions.BrowserActionsFallbackMenuUi.this.mContext, androidx.browser.browseractions.BrowserActionsFallbackMenuUi.this.mContext.getString(androidx.browser.R.string.copy_toast_msg), 0).show();
            }
        };
    }

    public void displayMenu() {
        final android.view.View viewInflate = android.view.LayoutInflater.from(this.mContext).inflate(androidx.browser.R.layout.browser_actions_context_menu_page, (android.view.ViewGroup) null);
        androidx.browser.browseractions.BrowserActionsFallbackMenuDialog browserActionsFallbackMenuDialog = new androidx.browser.browseractions.BrowserActionsFallbackMenuDialog(this.mContext, initMenuView(viewInflate));
        this.mBrowserActionsDialog = browserActionsFallbackMenuDialog;
        browserActionsFallbackMenuDialog.setContentView(viewInflate);
        if (this.mMenuUiListener != null) {
            this.mBrowserActionsDialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuUi.2
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(android.content.DialogInterface dialogInterface) {
                    if (androidx.browser.browseractions.BrowserActionsFallbackMenuUi.this.mMenuUiListener == null) {
                        android.util.Log.e(androidx.browser.browseractions.BrowserActionsFallbackMenuUi.TAG, "Cannot trigger menu item listener, it is null");
                    } else {
                        androidx.browser.browseractions.BrowserActionsFallbackMenuUi.this.mMenuUiListener.onMenuShown(viewInflate);
                    }
                }
            });
        }
        this.mBrowserActionsDialog.show();
    }

    private androidx.browser.browseractions.BrowserActionsFallbackMenuView initMenuView(android.view.View view) {
        androidx.browser.browseractions.BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (androidx.browser.browseractions.BrowserActionsFallbackMenuView) view.findViewById(androidx.browser.R.id.browser_actions_menu_view);
        final android.widget.TextView textView = (android.widget.TextView) view.findViewById(androidx.browser.R.id.browser_actions_header_text);
        textView.setText(this.mUri.toString());
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuUi.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                if (androidx.core.widget.TextViewCompat.getMaxLines(textView) == Integer.MAX_VALUE) {
                    textView.setMaxLines(1);
                    textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                } else {
                    textView.setMaxLines(Integer.MAX_VALUE);
                    textView.setEllipsize(null);
                }
            }
        });
        android.widget.ListView listView = (android.widget.ListView) view.findViewById(androidx.browser.R.id.browser_actions_menu_items);
        listView.setAdapter((android.widget.ListAdapter) new androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter(this.mMenuItems, this.mContext));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
        androidx.browser.browseractions.BrowserActionItem browserActionItem = this.mMenuItems.get(i);
        if (browserActionItem.getAction() != null) {
            try {
                browserActionItem.getAction().send();
            } catch (android.app.PendingIntent.CanceledException e) {
                android.util.Log.e(TAG, "Failed to send custom item action", e);
            }
        } else if (browserActionItem.getRunnableAction() != null) {
            browserActionItem.getRunnableAction().run();
        }
        androidx.browser.browseractions.BrowserActionsFallbackMenuDialog browserActionsFallbackMenuDialog = this.mBrowserActionsDialog;
        if (browserActionsFallbackMenuDialog == null) {
            android.util.Log.e(TAG, "Cannot dismiss dialog, it has already been dismissed.");
        } else {
            browserActionsFallbackMenuDialog.dismiss();
        }
    }
}
