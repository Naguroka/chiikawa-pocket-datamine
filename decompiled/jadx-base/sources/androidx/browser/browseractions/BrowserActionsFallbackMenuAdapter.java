package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
class BrowserActionsFallbackMenuAdapter extends android.widget.BaseAdapter {
    private final android.content.Context mContext;
    private final java.util.List<androidx.browser.browseractions.BrowserActionItem> mMenuItems;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    BrowserActionsFallbackMenuAdapter(java.util.List<androidx.browser.browseractions.BrowserActionItem> list, android.content.Context context) {
        this.mMenuItems = list;
        this.mContext = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mMenuItems.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i) {
        return this.mMenuItems.get(i);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        final androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.ViewHolderItem viewHolderItem;
        androidx.browser.browseractions.BrowserActionItem browserActionItem = this.mMenuItems.get(i);
        if (view == null) {
            view = android.view.LayoutInflater.from(this.mContext).inflate(androidx.browser.R.layout.browser_actions_context_menu_row, (android.view.ViewGroup) null);
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(androidx.browser.R.id.browser_actions_menu_item_icon);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(androidx.browser.R.id.browser_actions_menu_item_text);
            if (imageView == null || textView == null) {
                throw new java.lang.IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
            viewHolderItem = new androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.ViewHolderItem(imageView, textView);
            view.setTag(viewHolderItem);
        } else {
            viewHolderItem = (androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.ViewHolderItem) view.getTag();
        }
        final java.lang.String title = browserActionItem.getTitle();
        viewHolderItem.mText.setText(title);
        if (browserActionItem.getIconId() != 0) {
            viewHolderItem.mIcon.setImageDrawable(androidx.core.content.res.ResourcesCompat.getDrawable(this.mContext.getResources(), browserActionItem.getIconId(), null));
        } else if (browserActionItem.getIconUri() != null) {
            final com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> listenableFutureLoadBitmap = androidx.browser.browseractions.BrowserServiceFileProvider.loadBitmap(this.mContext.getContentResolver(), browserActionItem.getIconUri());
            listenableFutureLoadBitmap.addListener(new java.lang.Runnable() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    android.graphics.Bitmap bitmap;
                    if (android.text.TextUtils.equals(title, viewHolderItem.mText.getText())) {
                        try {
                            bitmap = (android.graphics.Bitmap) listenableFutureLoadBitmap.get();
                        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            viewHolderItem.mIcon.setVisibility(0);
                            viewHolderItem.mIcon.setImageBitmap(bitmap);
                        } else {
                            viewHolderItem.mIcon.setVisibility(4);
                            viewHolderItem.mIcon.setImageBitmap(null);
                        }
                    }
                }
            }, new java.util.concurrent.Executor() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.2
                @Override // java.util.concurrent.Executor
                public void execute(java.lang.Runnable runnable) {
                    runnable.run();
                }
            });
        } else {
            viewHolderItem.mIcon.setImageBitmap(null);
            viewHolderItem.mIcon.setVisibility(4);
        }
        return view;
    }

    static class ViewHolderItem {
        final android.widget.ImageView mIcon;
        final android.widget.TextView mText;

        ViewHolderItem(android.widget.ImageView imageView, android.widget.TextView textView) {
            this.mIcon = imageView;
            this.mText = textView;
        }
    }
}
