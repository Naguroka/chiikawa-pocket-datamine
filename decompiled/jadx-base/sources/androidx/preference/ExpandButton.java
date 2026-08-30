package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
final class ExpandButton extends androidx.preference.Preference {
    private long mId;

    ExpandButton(android.content.Context context, java.util.List<androidx.preference.Preference> list, long j) {
        super(context);
        initLayout();
        setSummary(list);
        this.mId = j + 1000000;
    }

    private void initLayout() {
        setLayoutResource(androidx.preference.R.layout.expand_button);
        setIcon(androidx.preference.R.drawable.ic_arrow_down_24dp);
        setTitle(androidx.preference.R.string.expand_button_title);
        setOrder(999);
    }

    private void setSummary(java.util.List<androidx.preference.Preference> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.CharSequence string = null;
        for (androidx.preference.Preference preference : list) {
            java.lang.CharSequence title = preference.getTitle();
            boolean z = preference instanceof androidx.preference.PreferenceGroup;
            if (z && !android.text.TextUtils.isEmpty(title)) {
                arrayList.add((androidx.preference.PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.getParent())) {
                if (z) {
                    arrayList.add((androidx.preference.PreferenceGroup) preference);
                }
            } else if (!android.text.TextUtils.isEmpty(title)) {
                string = string == null ? title : getContext().getString(androidx.preference.R.string.summary_collapsed_preference_list, string, title);
            }
        }
        setSummary(string);
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        preferenceViewHolder.setDividerAllowedAbove(false);
    }

    @Override // androidx.preference.Preference
    long getId() {
        return this.mId;
    }
}
