package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public class TrackSelectionView extends android.widget.LinearLayout {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final androidx.media3.ui.TrackSelectionView.ComponentListener componentListener;
    private final android.widget.CheckedTextView defaultView;
    private final android.widget.CheckedTextView disableView;
    private final android.view.LayoutInflater inflater;
    private boolean isDisabled;
    private androidx.media3.ui.TrackSelectionView.TrackSelectionListener listener;
    private final java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> overrides;
    private final int selectableItemBackgroundResourceId;
    private final java.util.List<androidx.media3.common.Tracks.Group> trackGroups;
    private java.util.Comparator<androidx.media3.ui.TrackSelectionView.TrackInfo> trackInfoComparator;
    private androidx.media3.ui.TrackNameProvider trackNameProvider;
    private android.widget.CheckedTextView[][] trackViews;

    public interface TrackSelectionListener {
        void onTrackSelectionChanged(boolean z, java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> map);
    }

    public static java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> filterOverrides(java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> map, java.util.List<androidx.media3.common.Tracks.Group> list, boolean z) {
        java.util.HashMap map2 = new java.util.HashMap();
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.common.TrackSelectionOverride trackSelectionOverride = map.get(list.get(i).getMediaTrackGroup());
            if (trackSelectionOverride != null && (z || map2.isEmpty())) {
                map2.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            }
        }
        return map2;
    }

    public TrackSelectionView(android.content.Context context) {
        this(context, null);
    }

    public TrackSelectionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.selectableItemBackgroundResourceId = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        this.inflater = layoutInflaterFrom;
        androidx.media3.ui.TrackSelectionView.ComponentListener componentListener = new androidx.media3.ui.TrackSelectionView.ComponentListener();
        this.componentListener = componentListener;
        this.trackNameProvider = new androidx.media3.ui.DefaultTrackNameProvider(getResources());
        this.trackGroups = new java.util.ArrayList();
        this.overrides = new java.util.HashMap();
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (android.view.ViewGroup) this, false);
        this.disableView = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(androidx.media3.ui.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(componentListener);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(androidx.media3.ui.R.layout.exo_list_divider, (android.view.ViewGroup) this, false));
        android.widget.CheckedTextView checkedTextView2 = (android.widget.CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (android.view.ViewGroup) this, false);
        this.defaultView = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(androidx.media3.ui.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(componentListener);
        addView(checkedTextView2);
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.allowAdaptiveSelections != z) {
            this.allowAdaptiveSelections = z;
            updateViews();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.allowMultipleOverrides != z) {
            this.allowMultipleOverrides = z;
            if (!z && this.overrides.size() > 1) {
                java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> mapFilterOverrides = filterOverrides(this.overrides, this.trackGroups, false);
                this.overrides.clear();
                this.overrides.putAll(mapFilterOverrides);
            }
            updateViews();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.disableView.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(androidx.media3.ui.TrackNameProvider trackNameProvider) {
        this.trackNameProvider = (androidx.media3.ui.TrackNameProvider) androidx.media3.common.util.Assertions.checkNotNull(trackNameProvider);
        updateViews();
    }

    public void init(java.util.List<androidx.media3.common.Tracks.Group> list, boolean z, java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> map, final java.util.Comparator<androidx.media3.common.Format> comparator, androidx.media3.ui.TrackSelectionView.TrackSelectionListener trackSelectionListener) {
        this.isDisabled = z;
        this.trackInfoComparator = comparator == null ? null : new java.util.Comparator() { // from class: androidx.media3.ui.TrackSelectionView$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return comparator.compare(((androidx.media3.ui.TrackSelectionView.TrackInfo) obj).getFormat(), ((androidx.media3.ui.TrackSelectionView.TrackInfo) obj2).getFormat());
            }
        };
        this.listener = trackSelectionListener;
        this.trackGroups.clear();
        this.trackGroups.addAll(list);
        this.overrides.clear();
        this.overrides.putAll(filterOverrides(map, list, this.allowMultipleOverrides));
        updateViews();
    }

    public boolean getIsDisabled() {
        return this.isDisabled;
    }

    public java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> getOverrides() {
        return this.overrides;
    }

    private void updateViews() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.trackGroups.isEmpty()) {
            this.disableView.setEnabled(false);
            this.defaultView.setEnabled(false);
            return;
        }
        this.disableView.setEnabled(true);
        this.defaultView.setEnabled(true);
        this.trackViews = new android.widget.CheckedTextView[this.trackGroups.size()][];
        boolean zShouldEnableMultiGroupSelection = shouldEnableMultiGroupSelection();
        for (int i = 0; i < this.trackGroups.size(); i++) {
            androidx.media3.common.Tracks.Group group = this.trackGroups.get(i);
            boolean zShouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(group);
            this.trackViews[i] = new android.widget.CheckedTextView[group.length];
            int i2 = group.length;
            androidx.media3.ui.TrackSelectionView.TrackInfo[] trackInfoArr = new androidx.media3.ui.TrackSelectionView.TrackInfo[i2];
            for (int i3 = 0; i3 < group.length; i3++) {
                trackInfoArr[i3] = new androidx.media3.ui.TrackSelectionView.TrackInfo(group, i3);
            }
            java.util.Comparator<androidx.media3.ui.TrackSelectionView.TrackInfo> comparator = this.trackInfoComparator;
            if (comparator != null) {
                java.util.Arrays.sort(trackInfoArr, comparator);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 == 0) {
                    addView(this.inflater.inflate(androidx.media3.ui.R.layout.exo_list_divider, (android.view.ViewGroup) this, false));
                }
                android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) this.inflater.inflate((zShouldEnableAdaptiveSelection || zShouldEnableMultiGroupSelection) ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (android.view.ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.selectableItemBackgroundResourceId);
                checkedTextView.setText(this.trackNameProvider.getTrackName(trackInfoArr[i4].getFormat()));
                checkedTextView.setTag(trackInfoArr[i4]);
                if (group.isTrackSupported(i4)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.componentListener);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.trackViews[i][i4] = checkedTextView;
                addView(checkedTextView);
            }
        }
        updateViewStates();
    }

    private void updateViewStates() {
        this.disableView.setChecked(this.isDisabled);
        this.defaultView.setChecked(!this.isDisabled && this.overrides.size() == 0);
        for (int i = 0; i < this.trackViews.length; i++) {
            androidx.media3.common.TrackSelectionOverride trackSelectionOverride = this.overrides.get(this.trackGroups.get(i).getMediaTrackGroup());
            int i2 = 0;
            while (true) {
                android.widget.CheckedTextView[] checkedTextViewArr = this.trackViews[i];
                if (i2 < checkedTextViewArr.length) {
                    if (trackSelectionOverride != null) {
                        this.trackViews[i][i2].setChecked(trackSelectionOverride.trackIndices.contains(java.lang.Integer.valueOf(((androidx.media3.ui.TrackSelectionView.TrackInfo) androidx.media3.common.util.Assertions.checkNotNull(checkedTextViewArr[i2].getTag())).trackIndex)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(android.view.View view) {
        if (view == this.disableView) {
            onDisableViewClicked();
        } else if (view == this.defaultView) {
            onDefaultViewClicked();
        } else {
            onTrackViewClicked(view);
        }
        updateViewStates();
        androidx.media3.ui.TrackSelectionView.TrackSelectionListener trackSelectionListener = this.listener;
        if (trackSelectionListener != null) {
            trackSelectionListener.onTrackSelectionChanged(getIsDisabled(), getOverrides());
        }
    }

    private void onDisableViewClicked() {
        this.isDisabled = true;
        this.overrides.clear();
    }

    private void onDefaultViewClicked() {
        this.isDisabled = false;
        this.overrides.clear();
    }

    private void onTrackViewClicked(android.view.View view) {
        this.isDisabled = false;
        androidx.media3.ui.TrackSelectionView.TrackInfo trackInfo = (androidx.media3.ui.TrackSelectionView.TrackInfo) androidx.media3.common.util.Assertions.checkNotNull(view.getTag());
        androidx.media3.common.TrackGroup mediaTrackGroup = trackInfo.trackGroup.getMediaTrackGroup();
        int i = trackInfo.trackIndex;
        androidx.media3.common.TrackSelectionOverride trackSelectionOverride = this.overrides.get(mediaTrackGroup);
        if (trackSelectionOverride == null) {
            if (!this.allowMultipleOverrides && this.overrides.size() > 0) {
                this.overrides.clear();
            }
            this.overrides.put(mediaTrackGroup, new androidx.media3.common.TrackSelectionOverride(mediaTrackGroup, com.google.common.collect.ImmutableList.of(java.lang.Integer.valueOf(i))));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(trackSelectionOverride.trackIndices);
        boolean zIsChecked = ((android.widget.CheckedTextView) view).isChecked();
        boolean zShouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(trackInfo.trackGroup);
        boolean z = zShouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection();
        if (zIsChecked && z) {
            arrayList.remove(java.lang.Integer.valueOf(i));
            if (arrayList.isEmpty()) {
                this.overrides.remove(mediaTrackGroup);
                return;
            } else {
                this.overrides.put(mediaTrackGroup, new androidx.media3.common.TrackSelectionOverride(mediaTrackGroup, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (zShouldEnableAdaptiveSelection) {
            arrayList.add(java.lang.Integer.valueOf(i));
            this.overrides.put(mediaTrackGroup, new androidx.media3.common.TrackSelectionOverride(mediaTrackGroup, arrayList));
        } else {
            this.overrides.put(mediaTrackGroup, new androidx.media3.common.TrackSelectionOverride(mediaTrackGroup, com.google.common.collect.ImmutableList.of(java.lang.Integer.valueOf(i))));
        }
    }

    private boolean shouldEnableAdaptiveSelection(androidx.media3.common.Tracks.Group group) {
        return this.allowAdaptiveSelections && group.isAdaptiveSupported();
    }

    private boolean shouldEnableMultiGroupSelection() {
        return this.allowMultipleOverrides && this.trackGroups.size() > 1;
    }

    private class ComponentListener implements android.view.View.OnClickListener {
        private ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            androidx.media3.ui.TrackSelectionView.this.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TrackInfo {
        public final androidx.media3.common.Tracks.Group trackGroup;
        public final int trackIndex;

        public TrackInfo(androidx.media3.common.Tracks.Group group, int i) {
            this.trackGroup = group;
            this.trackIndex = i;
        }

        public androidx.media3.common.Format getFormat() {
            return this.trackGroup.getTrackFormat(this.trackIndex);
        }
    }
}
