package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackSelectionDialogBuilder {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final androidx.media3.ui.TrackSelectionDialogBuilder.DialogCallback callback;
    private final android.content.Context context;
    private boolean isDisabled;
    private com.google.common.collect.ImmutableMap<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> overrides;
    private boolean showDisableOption;
    private int themeResId;
    private final java.lang.CharSequence title;
    private java.util.Comparator<androidx.media3.common.Format> trackFormatComparator;
    private final java.util.List<androidx.media3.common.Tracks.Group> trackGroups;
    private androidx.media3.ui.TrackNameProvider trackNameProvider;

    public interface DialogCallback {
        void onTracksSelected(boolean z, java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> map);
    }

    public TrackSelectionDialogBuilder(android.content.Context context, java.lang.CharSequence charSequence, java.util.List<androidx.media3.common.Tracks.Group> list, androidx.media3.ui.TrackSelectionDialogBuilder.DialogCallback dialogCallback) {
        this.context = context;
        this.title = charSequence;
        this.trackGroups = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        this.callback = dialogCallback;
        this.overrides = com.google.common.collect.ImmutableMap.of();
    }

    public TrackSelectionDialogBuilder(android.content.Context context, java.lang.CharSequence charSequence, final androidx.media3.common.Player player, final int i) {
        this.context = context;
        this.title = charSequence;
        com.google.common.collect.ImmutableList<androidx.media3.common.Tracks.Group> groups = (player.isCommandAvailable(30) ? player.getCurrentTracks() : androidx.media3.common.Tracks.EMPTY).getGroups();
        this.trackGroups = new java.util.ArrayList();
        for (int i2 = 0; i2 < groups.size(); i2++) {
            androidx.media3.common.Tracks.Group group = groups.get(i2);
            if (group.getType() == i) {
                this.trackGroups.add(group);
            }
        }
        this.overrides = player.getTrackSelectionParameters().overrides;
        this.callback = new androidx.media3.ui.TrackSelectionDialogBuilder.DialogCallback() { // from class: androidx.media3.ui.TrackSelectionDialogBuilder$$ExternalSyntheticLambda0
            @Override // androidx.media3.ui.TrackSelectionDialogBuilder.DialogCallback
            public final void onTracksSelected(boolean z, java.util.Map map) {
                androidx.media3.ui.TrackSelectionDialogBuilder.lambda$new$0(player, i, z, map);
            }
        };
    }

    static /* synthetic */ void lambda$new$0(androidx.media3.common.Player player, int i, boolean z, java.util.Map map) {
        if (player.isCommandAvailable(29)) {
            androidx.media3.common.TrackSelectionParameters.Builder builderBuildUpon = player.getTrackSelectionParameters().buildUpon();
            builderBuildUpon.setTrackTypeDisabled(i, z);
            builderBuildUpon.clearOverridesOfType(i);
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                builderBuildUpon.addOverride((androidx.media3.common.TrackSelectionOverride) it.next());
            }
            player.setTrackSelectionParameters(builderBuildUpon.build());
        }
    }

    public androidx.media3.ui.TrackSelectionDialogBuilder setTheme(int i) {
        this.themeResId = i;
        return this;
    }

    public androidx.media3.ui.TrackSelectionDialogBuilder setIsDisabled(boolean z) {
        this.isDisabled = z;
        return this;
    }

    public androidx.media3.ui.TrackSelectionDialogBuilder setOverride(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
        java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> mapOf;
        if (trackSelectionOverride == null) {
            mapOf = java.util.Collections.emptyMap();
        } else {
            mapOf = com.google.common.collect.ImmutableMap.of(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
        }
        return setOverrides(mapOf);
    }

    public androidx.media3.ui.TrackSelectionDialogBuilder setOverrides(java.util.Map<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> map) {
        this.overrides = com.google.common.collect.ImmutableMap.copyOf((java.util.Map) map);
        return this;
    }

    public androidx.media3.ui.TrackSelectionDialogBuilder setAllowAdaptiveSelections(boolean z) {
        this.allowAdaptiveSelections = z;
        return this;
    }

    public androidx.media3.ui.TrackSelectionDialogBuilder setAllowMultipleOverrides(boolean z) {
        this.allowMultipleOverrides = z;
        return this;
    }

    public androidx.media3.ui.TrackSelectionDialogBuilder setShowDisableOption(boolean z) {
        this.showDisableOption = z;
        return this;
    }

    public void setTrackFormatComparator(java.util.Comparator<androidx.media3.common.Format> comparator) {
        this.trackFormatComparator = comparator;
    }

    public androidx.media3.ui.TrackSelectionDialogBuilder setTrackNameProvider(androidx.media3.ui.TrackNameProvider trackNameProvider) {
        this.trackNameProvider = trackNameProvider;
        return this;
    }

    public android.app.Dialog build() {
        android.app.Dialog dialogBuildForAndroidX = buildForAndroidX();
        return dialogBuildForAndroidX == null ? buildForPlatform() : dialogBuildForAndroidX;
    }

    private android.app.Dialog buildForPlatform() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this.context, this.themeResId);
        android.view.View viewInflate = android.view.LayoutInflater.from(builder.getContext()).inflate(androidx.media3.ui.R.layout.exo_track_selection_dialog, (android.view.ViewGroup) null);
        return builder.setTitle(this.title).setView(viewInflate).setPositiveButton(android.R.string.ok, setUpDialogView(viewInflate)).setNegativeButton(android.R.string.cancel, (android.content.DialogInterface.OnClickListener) null).create();
    }

    private android.app.Dialog buildForAndroidX() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("androidx.appcompat.app.AlertDialog$Builder");
            java.lang.Object objNewInstance = cls.getConstructor(android.content.Context.class, java.lang.Integer.TYPE).newInstance(this.context, java.lang.Integer.valueOf(this.themeResId));
            android.view.View viewInflate = android.view.LayoutInflater.from((android.content.Context) cls.getMethod("getContext", new java.lang.Class[0]).invoke(objNewInstance, new java.lang.Object[0])).inflate(androidx.media3.ui.R.layout.exo_track_selection_dialog, (android.view.ViewGroup) null);
            android.content.DialogInterface.OnClickListener upDialogView = setUpDialogView(viewInflate);
            cls.getMethod("setTitle", java.lang.CharSequence.class).invoke(objNewInstance, this.title);
            cls.getMethod("setView", android.view.View.class).invoke(objNewInstance, viewInflate);
            cls.getMethod("setPositiveButton", java.lang.Integer.TYPE, android.content.DialogInterface.OnClickListener.class).invoke(objNewInstance, java.lang.Integer.valueOf(android.R.string.ok), upDialogView);
            cls.getMethod("setNegativeButton", java.lang.Integer.TYPE, android.content.DialogInterface.OnClickListener.class).invoke(objNewInstance, java.lang.Integer.valueOf(android.R.string.cancel), null);
            return (android.app.Dialog) cls.getMethod("create", new java.lang.Class[0]).invoke(objNewInstance, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    private android.content.DialogInterface.OnClickListener setUpDialogView(android.view.View view) {
        final androidx.media3.ui.TrackSelectionView trackSelectionView = (androidx.media3.ui.TrackSelectionView) view.findViewById(androidx.media3.ui.R.id.exo_track_selection_view);
        trackSelectionView.setAllowMultipleOverrides(this.allowMultipleOverrides);
        trackSelectionView.setAllowAdaptiveSelections(this.allowAdaptiveSelections);
        trackSelectionView.setShowDisableOption(this.showDisableOption);
        androidx.media3.ui.TrackNameProvider trackNameProvider = this.trackNameProvider;
        if (trackNameProvider != null) {
            trackSelectionView.setTrackNameProvider(trackNameProvider);
        }
        trackSelectionView.init(this.trackGroups, this.isDisabled, this.overrides, this.trackFormatComparator, null);
        return new android.content.DialogInterface.OnClickListener() { // from class: androidx.media3.ui.TrackSelectionDialogBuilder$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                this.f$0.m462xc121951d(trackSelectionView, dialogInterface, i);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$setUpDialogView$1$androidx-media3-ui-TrackSelectionDialogBuilder, reason: not valid java name */
    /* synthetic */ void m462xc121951d(androidx.media3.ui.TrackSelectionView trackSelectionView, android.content.DialogInterface dialogInterface, int i) {
        this.callback.onTracksSelected(trackSelectionView.getIsDisabled(), trackSelectionView.getOverrides());
    }
}
